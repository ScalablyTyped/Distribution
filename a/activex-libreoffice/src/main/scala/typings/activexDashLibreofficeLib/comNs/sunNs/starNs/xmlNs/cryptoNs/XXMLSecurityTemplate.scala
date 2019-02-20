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

