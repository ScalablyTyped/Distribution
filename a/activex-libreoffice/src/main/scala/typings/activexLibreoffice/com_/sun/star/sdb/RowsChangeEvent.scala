package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** indicates which rows have changed and the type of change action on the row set. */
trait RowsChangeEvent
  extends StObject
     with RowChangeEvent {
  
  var Bookmarks: SafeArray[Any]
}
object RowsChangeEvent {
  
  inline def apply(Action: Double, Bookmarks: SafeArray[Any], Rows: Double, Source: XInterface): RowsChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Bookmarks = Bookmarks.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowsChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setBookmarks(value: SafeArray[Any]): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
  }
}
