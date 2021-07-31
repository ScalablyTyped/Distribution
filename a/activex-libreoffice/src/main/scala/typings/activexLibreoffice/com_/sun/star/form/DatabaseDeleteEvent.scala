package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is fired if a database record is going to be deleted.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait DatabaseDeleteEvent
  extends StObject
     with EventObject {
  
  var Bookmarks: SafeArray[js.Any]
}
object DatabaseDeleteEvent {
  
  @scala.inline
  def apply(Bookmarks: SafeArray[js.Any], Source: XInterface): DatabaseDeleteEvent = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseDeleteEvent]
  }
  
  @scala.inline
  implicit class DatabaseDeleteEventMutableBuilder[Self <: DatabaseDeleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarks(value: SafeArray[js.Any]): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
  }
}
