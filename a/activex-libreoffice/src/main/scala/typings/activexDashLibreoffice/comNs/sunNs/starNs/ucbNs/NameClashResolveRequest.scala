package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This request is used to indicate a name clash.
  *
  * For example, when copying a file there might be another file in the target folder that has the same file name as the source file.
  *
  * If this exception is passed to an {@link com.sun.star.task.XInteractionHandler} an {@link XInteractionSupplyName} and an {@link
  * XInteractionReplaceExistingData} should be supplied with the {@link com.sun.star.task.XInteractionRequest} . On return the {@link
  * XInteractionSupplyName} , if selected, will contain a new name supposed to resolve the name clash. The {@link XInteractionReplaceExistingData} will be
  * selected if the clashing resource shall be overwritten.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait NameClashResolveRequest extends ClassifiedInteractionRequest {
  /** contains the clashing name. */
  var ClashingName: String
  /**
    * contains a proposal for a new new, non-clashing name.
    *
    * This field may be left empty if the implementation is not able to suggest a new name.
    */
  var ProposedNewName: String
  /** contains the URL of the folder that contains the clashing resource. */
  var TargetFolderURL: String
}

object NameClashResolveRequest {
  @scala.inline
  def apply(
    ClashingName: String,
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    ProposedNewName: String,
    TargetFolderURL: String
  ): NameClashResolveRequest = {
    val __obj = js.Dynamic.literal(ClashingName = ClashingName, Classification = Classification, Context = Context, Message = Message, ProposedNewName = ProposedNewName, TargetFolderURL = TargetFolderURL)
  
    __obj.asInstanceOf[NameClashResolveRequest]
  }
}

