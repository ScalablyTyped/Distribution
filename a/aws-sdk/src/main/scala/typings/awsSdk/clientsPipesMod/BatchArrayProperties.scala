package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchArrayProperties extends StObject {
  
  /**
    * The size of the array, if this is an array batch job.
    */
  var Size: js.UndefOr[BatchArraySize] = js.undefined
}
object BatchArrayProperties {
  
  inline def apply(): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchArrayProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchArrayProperties] (val x: Self) extends AnyVal {
    
    inline def setSize(value: BatchArraySize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
