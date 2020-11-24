package typings.activexLibreoffice.com_.sun.star.task

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlRecord extends js.Object {
  
  var Url: String = js.native
  
  var UserList: SafeArray[UserRecord] = js.native
}
object UrlRecord {
  
  @scala.inline
  def apply(Url: String, UserList: SafeArray[UserRecord]): UrlRecord = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any], UserList = UserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlRecord]
  }
  
  @scala.inline
  implicit class UrlRecordOps[Self <: UrlRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserList(value: SafeArray[UserRecord]): Self = this.set("UserList", value.asInstanceOf[js.Any])
  }
}
