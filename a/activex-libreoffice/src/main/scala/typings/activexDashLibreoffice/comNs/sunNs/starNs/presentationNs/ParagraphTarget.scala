package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
trait ParagraphTarget extends js.Object {
  var Paragraph: Double
  var Shape: XShape
}

object ParagraphTarget {
  @scala.inline
  def apply(Paragraph: Double, Shape: XShape): ParagraphTarget = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph, Shape = Shape)
  
    __obj.asInstanceOf[ParagraphTarget]
  }
}

