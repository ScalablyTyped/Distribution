package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSample extends StObject {
  
  /**
    * A value that determines whether the profile job is run on the entire dataset or a specified number of rows. This value must be one of the following:   FULL_DATASET - The profile job is run on the entire dataset.   CUSTOM_ROWS - The profile job is run on the number of rows specified in the Size parameter.  
    */
  var Mode: js.UndefOr[SampleMode] = js.undefined
  
  /**
    * The Size parameter is only required when the mode is CUSTOM_ROWS. The profile job is run on the specified number of rows. The maximum value for size is Long.MAX_VALUE. Long.MAX_VALUE = 9223372036854775807
    */
  var Size: js.UndefOr[JobSize] = js.undefined
}
object JobSample {
  
  inline def apply(): JobSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSample]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobSample] (val x: Self) extends AnyVal {
    
    inline def setMode(value: SampleMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setSize(value: JobSize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
