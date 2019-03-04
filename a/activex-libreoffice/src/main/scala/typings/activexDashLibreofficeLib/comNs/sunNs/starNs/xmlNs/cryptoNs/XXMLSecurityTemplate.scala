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
    acquire: js.Function0[scala.Unit],
    getStatus: js.Function0[SecurityOperationStatus],
    getTemplate: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setStatus: js.Function1[SecurityOperationStatus, scala.Unit],
    setTarget: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper, 
      scala.Unit
    ],
    setTemplate: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper, 
      scala.Unit
    ]
  ): XXMLSecurityTemplate = {
    val __obj = js.Dynamic.literal(Status = Status, Template = Template, acquire = acquire, getStatus = getStatus, getTemplate = getTemplate, queryInterface = queryInterface, release = release, setStatus = setStatus, setTarget = setTarget, setTemplate = setTemplate)
  
    __obj.asInstanceOf[XXMLSecurityTemplate]
  }
}

