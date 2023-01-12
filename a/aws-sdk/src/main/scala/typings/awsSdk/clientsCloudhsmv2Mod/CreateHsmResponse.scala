package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmResponse extends StObject {
  
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Hsm] = js.undefined
}
object CreateHsmResponse {
  
  inline def apply(): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHsmResponse] (val x: Self) extends AnyVal {
    
    inline def setHsm(value: Hsm): Self = StObject.set(x, "Hsm", value.asInstanceOf[js.Any])
    
    inline def setHsmUndefined: Self = StObject.set(x, "Hsm", js.undefined)
  }
}
