package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the XML security template
  *
  * This interface represents a security template, which is the super interface of the {@link XXMLSignatureTemplate} interface and the {@link
  * XXMLEncryptionTemplate} interface.
  */
trait XXMLSecurityTemplate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get the template status */
  var Status: SecurityOperationStatus
  /** Get the XML signature element that represents the signature template */
  var Template: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
  /** Get the template status */
  def getStatus(): SecurityOperationStatus
  /** Get the XML signature element that represents the signature template */
  def getTemplate(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper
  /** Set the template status */
  def setStatus(status: SecurityOperationStatus): scala.Unit
  /** Load the target XML element, i.e. the element to be signed */
  def setTarget(aXmlElement: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper): scala.Unit
  /** Load a XML signature template from XML signature element */
  def setTemplate(aXmlElement: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper): scala.Unit
}

object XXMLSecurityTemplate {
  @scala.inline
  def apply(
    Status: SecurityOperationStatus,
    Template: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    acquire: () => scala.Unit,
    getStatus: () => SecurityOperationStatus,
    getTemplate: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setStatus: SecurityOperationStatus => scala.Unit,
    setTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper => scala.Unit,
    setTemplate: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper => scala.Unit
  ): XXMLSecurityTemplate = {
    val __obj = js.Dynamic.literal(Status = Status, Template = Template, acquire = js.Any.fromFunction0(acquire), getStatus = js.Any.fromFunction0(getStatus), getTemplate = js.Any.fromFunction0(getTemplate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStatus = js.Any.fromFunction1(setStatus), setTarget = js.Any.fromFunction1(setTarget), setTemplate = js.Any.fromFunction1(setTemplate))
  
    __obj.asInstanceOf[XXMLSecurityTemplate]
  }
}

