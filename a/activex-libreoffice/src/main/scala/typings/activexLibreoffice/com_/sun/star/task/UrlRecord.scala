package typings.activexLibreoffice.com_.sun.star.task

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlRecord extends StObject {
  
  var Url: String
  
  var UserList: SafeArray[UserRecord]
}
object UrlRecord {
  
  inline def apply(Url: String, UserList: SafeArray[UserRecord]): UrlRecord = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any], UserList = UserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlRecord] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUserList(value: SafeArray[UserRecord]): Self = StObject.set(x, "UserList", value.asInstanceOf[js.Any])
  }
}
