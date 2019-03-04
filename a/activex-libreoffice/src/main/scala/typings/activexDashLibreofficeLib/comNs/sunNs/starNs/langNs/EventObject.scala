package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the base for all event objects and identifies the source of the event. */
trait EventObject extends js.Object {
  /** refers to the object that fired the event. */
  var Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object EventObject {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): EventObject = {
    val __obj = js.Dynamic.literal(Source = Source)
  
    __obj.asInstanceOf[EventObject]
  }
}

