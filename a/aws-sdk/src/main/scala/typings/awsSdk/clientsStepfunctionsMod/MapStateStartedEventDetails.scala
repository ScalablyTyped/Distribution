package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStateStartedEventDetails extends StObject {
  
  /**
    * The size of the array for Map state iterations.
    */
  var length: js.UndefOr[UnsignedInteger] = js.undefined
}
object MapStateStartedEventDetails {
  
  inline def apply(): MapStateStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStateStartedEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapStateStartedEventDetails] (val x: Self) extends AnyVal {
    
    inline def setLength(value: UnsignedInteger): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
