package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a mail merge event.
  *
  * This type of event is being send by the mail merge service right before the merging of the next document to be processed. This allows for example to
  * modify the document specifically before it gets merged.
  * @see com.sun.star.text.MailMerge
  * @since OOo 1.1.2
  */
trait MailMergeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** The model of the document to be processed next. */
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
}

object MailMergeEvent {
  @scala.inline
  def apply(
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): MailMergeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[MailMergeEvent]
  }
}

