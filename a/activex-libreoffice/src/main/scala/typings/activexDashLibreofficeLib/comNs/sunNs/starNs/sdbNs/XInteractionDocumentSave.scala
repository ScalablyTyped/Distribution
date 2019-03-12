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

object XInteractionDocumentSave {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    select: () => scala.Unit,
    setName: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent) => scala.Unit
  ): XInteractionDocumentSave = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setName = js.Any.fromFunction2(setName))
  
    __obj.asInstanceOf[XInteractionDocumentSave]
  }
}

