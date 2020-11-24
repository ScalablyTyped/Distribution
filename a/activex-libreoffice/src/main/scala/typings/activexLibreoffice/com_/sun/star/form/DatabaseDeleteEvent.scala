package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is fired if a database record is going to be deleted.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
@js.native
trait DatabaseDeleteEvent extends EventObject {
  
  var Bookmarks: SafeArray[_] = js.native
}
object DatabaseDeleteEvent {
  
  @scala.inline
  def apply(Bookmarks: SafeArray[_], Source: XInterface): DatabaseDeleteEvent = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseDeleteEvent]
  }
  
  @scala.inline
  implicit class DatabaseDeleteEventOps[Self <: DatabaseDeleteEvent] (val x: Self) extends AnyVal {
    
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
    def setBookmarks(value: SafeArray[_]): Self = this.set("Bookmarks", value.asInstanceOf[js.Any])
  }
}
