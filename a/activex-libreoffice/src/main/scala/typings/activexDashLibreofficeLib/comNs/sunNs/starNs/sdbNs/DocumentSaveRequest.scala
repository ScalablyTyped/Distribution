package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an error specifying the lack of a document name
  *
  * Usually thrown if someone tries to save a document which hasn't a name yet.
  * @since OOo 2.0
  */
trait DocumentSaveRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /**
    * specifies the content where the document should save inside. Somebody handling the request could, e.g., use the content as root content to display the
    * hierarchy of the sub contents.
    */
  var Content: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent
  /** The default name of the document, may be empty. */
  var Name: java.lang.String
}

