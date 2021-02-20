package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait NameClashResolveRequest extends ClassifiedInteractionRequest {
  
  /** contains the clashing name. */
  var ClashingName: String = js.native
  
  /**
    * contains a proposal for a new new, non-clashing name.
    *
    * This field may be left empty if the implementation is not able to suggest a new name.
    */
  var ProposedNewName: String = js.native
  
  /** contains the URL of the folder that contains the clashing resource. */
  var TargetFolderURL: String = js.native
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
    val __obj = js.Dynamic.literal(ClashingName = ClashingName.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], ProposedNewName = ProposedNewName.asInstanceOf[js.Any], TargetFolderURL = TargetFolderURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameClashResolveRequest]
  }
  
  @scala.inline
  implicit class NameClashResolveRequestMutableBuilder[Self <: NameClashResolveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClashingName(value: String): Self = StObject.set(x, "ClashingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedNewName(value: String): Self = StObject.set(x, "ProposedNewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFolderURL(value: String): Self = StObject.set(x, "TargetFolderURL", value.asInstanceOf[js.Any])
  }
}
