package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
trait ParagraphTarget extends js.Object {
  var Paragraph: scala.Double
  var Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
}

object ParagraphTarget {
  @scala.inline
  def apply(Paragraph: scala.Double, Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape): ParagraphTarget = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph, Shape = Shape)
  
    __obj.asInstanceOf[ParagraphTarget]
  }
}

