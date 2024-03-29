package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProtectionResponse extends StObject {
  
  /**
    * The unique identifier (ID) for the Protection object that is created.
    */
  var ProtectionId: js.UndefOr[typings.awsSdk.clientsShieldMod.ProtectionId] = js.undefined
}
object CreateProtectionResponse {
  
  inline def apply(): CreateProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProtectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProtectionResponse] (val x: Self) extends AnyVal {
    
    inline def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
    
    inline def setProtectionIdUndefined: Self = StObject.set(x, "ProtectionId", js.undefined)
  }
}
