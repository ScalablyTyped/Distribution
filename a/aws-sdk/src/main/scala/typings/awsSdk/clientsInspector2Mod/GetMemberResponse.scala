package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberResponse extends StObject {
  
  /**
    * Details of the retrieved member account.
    */
  var member: js.UndefOr[Member] = js.undefined
}
object GetMemberResponse {
  
  inline def apply(): GetMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMemberResponse] (val x: Self) extends AnyVal {
    
    inline def setMember(value: Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
  }
}
