package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the XML security template
  *
  * This interface represents a security template, which is the super interface of the {@link XXMLSignatureTemplate} interface and the {@link
  * XXMLEncryptionTemplate} interface.
  */
trait XXMLSecurityTemplate extends XInterface {
  /** Get the template status */
  var Status: SecurityOperationStatus
  /** Get the XML signature element that represents the signature template */
  var Template: XXMLElementWrapper
  /** Get the template status */
  def getStatus(): SecurityOperationStatus
  /** Get the XML signature element that represents the signature template */
  def getTemplate(): XXMLElementWrapper
  /** Set the template status */
  def setStatus(status: SecurityOperationStatus): Unit
  /** Load the target XML element, i.e. the element to be signed */
  def setTarget(aXmlElement: XXMLElementWrapper): Unit
  /** Load a XML signature template from XML signature element */
  def setTemplate(aXmlElement: XXMLElementWrapper): Unit
}

object XXMLSecurityTemplate {
  @scala.inline
  def apply(
    Status: SecurityOperationStatus,
    Template: XXMLElementWrapper,
    acquire: () => Unit,
    getStatus: () => SecurityOperationStatus,
    getTemplate: () => XXMLElementWrapper,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStatus: SecurityOperationStatus => Unit,
    setTarget: XXMLElementWrapper => Unit,
    setTemplate: XXMLElementWrapper => Unit
  ): XXMLSecurityTemplate = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatus = js.Any.fromFunction0(getStatus), getTemplate = js.Any.fromFunction0(getTemplate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStatus = js.Any.fromFunction1(setStatus), setTarget = js.Any.fromFunction1(setTarget), setTemplate = js.Any.fromFunction1(setTemplate))
    __obj.asInstanceOf[XXMLSecurityTemplate]
  }
}

