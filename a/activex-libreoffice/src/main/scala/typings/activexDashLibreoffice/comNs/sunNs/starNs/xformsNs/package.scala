package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xformsNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.VetoException

  /**
    * thrown if the user triggers an {@link XForms} submission with invalid instance data
    *
    * The com::sun::star::uno::Exception::Source member refers to the submission which was invoked.
    */
  type InvalidDataOnSubmitException = VetoException
  /** @since LibreOffice 4.1 */
  type Model = XModel2
  /** @since LibreOffice 4.1 */
  type XForms = XNameContainer
}
