package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is fired if a database record is going to be deleted.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait DatabaseDeleteEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var Bookmarks: stdLib.SafeArray[_]
}

object DatabaseDeleteEvent {
  @scala.inline
  def apply(
    Bookmarks: stdLib.SafeArray[_],
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): DatabaseDeleteEvent = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, Source = Source)
  
    __obj.asInstanceOf[DatabaseDeleteEvent]
  }
}

