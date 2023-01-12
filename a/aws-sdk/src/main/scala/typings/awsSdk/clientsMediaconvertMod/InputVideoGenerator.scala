package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputVideoGenerator extends StObject {
  
  /**
    * Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for that many milliseconds. Required when you include Video generator.
    */
  var Duration: js.UndefOr[integerMin50Max86400000] = js.undefined
}
object InputVideoGenerator {
  
  inline def apply(): InputVideoGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputVideoGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputVideoGenerator] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: integerMin50Max86400000): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
  }
}
