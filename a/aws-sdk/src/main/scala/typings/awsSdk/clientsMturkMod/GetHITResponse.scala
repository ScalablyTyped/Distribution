package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHITResponse extends StObject {
  
  /**
    *  Contains the requested HIT data.
    */
  var HIT: js.UndefOr[typings.awsSdk.clientsMturkMod.HIT] = js.undefined
}
object GetHITResponse {
  
  inline def apply(): GetHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHITResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHITResponse] (val x: Self) extends AnyVal {
    
    inline def setHIT(value: HIT): Self = StObject.set(x, "HIT", value.asInstanceOf[js.Any])
    
    inline def setHITUndefined: Self = StObject.set(x, "HIT", js.undefined)
  }
}
