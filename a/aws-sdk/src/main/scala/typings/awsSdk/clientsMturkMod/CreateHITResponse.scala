package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHITResponse extends StObject {
  
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[typings.awsSdk.clientsMturkMod.HIT] = js.undefined
}
object CreateHITResponse {
  
  inline def apply(): CreateHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHITResponse] (val x: Self) extends AnyVal {
    
    inline def setHIT(value: HIT): Self = StObject.set(x, "HIT", value.asInstanceOf[js.Any])
    
    inline def setHITUndefined: Self = StObject.set(x, "HIT", js.undefined)
  }
}
