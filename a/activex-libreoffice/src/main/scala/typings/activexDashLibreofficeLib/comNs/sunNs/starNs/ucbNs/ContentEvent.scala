package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A structure for content events. */
trait ContentEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * The action.
    *
    * The value can be one of the {@link ContentAction} constants.
    */
  var Action: scala.Double
  /**
    * The content to that the action is related (e.g., the content that was just physically destroyed, the content that was just inserted into a folder
    * content).
    *
    * This member must be filled as follows:
    *
    * {{table here, see documentation}}
    */
  var Content: XContent
  /**
    * A content identifier, which must be filled according to the action notified (e.g., the id of the folder content into which another content was
    * inserted).
    *
    * This member must be filled as follows:
    *
    * {{table here, see documentation}}
    */
  var Id: XContentIdentifier
}

object ContentEvent {
  @scala.inline
  def apply(
    Action: scala.Double,
    Content: XContent,
    Id: XContentIdentifier,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ContentEvent = {
    val __obj = js.Dynamic.literal(Action = Action, Content = Content, Id = Id, Source = Source)
  
    __obj.asInstanceOf[ContentEvent]
  }
}

