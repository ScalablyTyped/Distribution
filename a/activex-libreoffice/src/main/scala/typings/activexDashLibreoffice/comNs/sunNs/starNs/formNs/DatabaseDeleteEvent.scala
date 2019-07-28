package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is fired if a database record is going to be deleted.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait DatabaseDeleteEvent extends EventObject {
  var Bookmarks: SafeArray[_]
}

object DatabaseDeleteEvent {
  @scala.inline
  def apply(Bookmarks: SafeArray[_], Source: XInterface): DatabaseDeleteEvent = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, Source = Source)
  
    __obj.asInstanceOf[DatabaseDeleteEvent]
  }
}

