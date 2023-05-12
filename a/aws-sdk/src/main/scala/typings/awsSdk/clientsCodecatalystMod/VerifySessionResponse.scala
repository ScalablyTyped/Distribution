package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifySessionResponse extends StObject {
  
  /**
    * The system-generated unique ID of the user in Amazon CodeCatalyst.
    */
  var identity: js.UndefOr[VerifySessionResponseIdentityString] = js.undefined
}
object VerifySessionResponse {
  
  inline def apply(): VerifySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifySessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifySessionResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: VerifySessionResponseIdentityString): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
