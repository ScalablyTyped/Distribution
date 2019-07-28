package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the base for all event objects and identifies the source of the event. */
trait EventObject extends js.Object {
  /** refers to the object that fired the event. */
  var Source: XInterface
}

object EventObject {
  @scala.inline
  def apply(Source: XInterface): EventObject = {
    val __obj = js.Dynamic.literal(Source = Source)
  
    __obj.asInstanceOf[EventObject]
  }
}

