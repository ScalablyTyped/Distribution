package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back a document name.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.DocumentSaveRequest} .
  * @since OOo 2.0
  */
trait XInteractionDocumentSave
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  /**
    * set the document name chosen by the interaction handler
    * @param Name the name of the document
    * @param Content the content where the document should store itself
    */
  def setName(Name: java.lang.String, Content: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent): scala.Unit
}

