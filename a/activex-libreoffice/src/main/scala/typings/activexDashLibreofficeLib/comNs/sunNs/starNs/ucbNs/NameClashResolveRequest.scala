package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

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
trait NameClashResolveRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** contains the clashing name. */
  var ClashingName: java.lang.String
  /**
    * contains a proposal for a new new, non-clashing name.
    *
    * This field may be left empty if the implementation is not able to suggest a new name.
    */
  var ProposedNewName: java.lang.String
  /** contains the URL of the folder that contains the clashing resource. */
  var TargetFolderURL: java.lang.String
}

