package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginId extends StObject {
  
  var LoginId: js.UndefOr[String] = js.undefined
}
object LoginId {
  
  inline def apply(): LoginId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginId] (val x: Self) extends AnyVal {
    
    inline def setLoginId(value: String): Self = StObject.set(x, "LoginId", value.asInstanceOf[js.Any])
    
    inline def setLoginIdUndefined: Self = StObject.set(x, "LoginId", js.undefined)
  }
}
