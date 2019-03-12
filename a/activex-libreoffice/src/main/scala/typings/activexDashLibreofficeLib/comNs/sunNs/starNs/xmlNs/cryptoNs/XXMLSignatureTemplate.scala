package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML signature template
  *
  * This interface represents a signature template, which is the same as the desired XML signature element but some of the nodes may be empty. The empty
  * entities include digest value and signature value. Empty entities are not allowed in a signature template when performing validation.
  *
  * In some cases, the signer or verifier can determine and locate the contents to be signed from the template by dereference the URI.
  *
  * With the help of signature context, the signer or verifier specifies the key from the KeyInfo in the signature template.
  *
  * Owner: Andrew Fan
  */
trait XXMLSignatureTemplate extends XXMLSecurityTemplate {
  /** Get the dynamic URI binding */
  var Binding: XUriBinding
  /** Get the target XML element, i.e. the element to be signed */
  val Targets: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper]
  /** Get the dynamic URI binding */
  def getBinding(): XUriBinding
  /** Get the target XML element, i.e. the element to be signed */
  def getTargets(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper]
  /** Set the dynamic URI binding */
  def setBinding(aUriBinding: XUriBinding): scala.Unit
}

object XXMLSignatureTemplate {
  @scala.inline
  def apply(
    Binding: XUriBinding,
    Status: SecurityOperationStatus,
    Targets: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    Template: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    acquire: () => scala.Unit,
    getBinding: () => XUriBinding,
    getStatus: () => SecurityOperationStatus,
    getTargets: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    getTemplate: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setBinding: XUriBinding => scala.Unit,
    setStatus: SecurityOperationStatus => scala.Unit,
    setTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper => scala.Unit,
    setTemplate: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper => scala.Unit
  ): XXMLSignatureTemplate = {
    val __obj = js.Dynamic.literal(Binding = Binding, Status = Status, Targets = Targets, Template = Template, acquire = js.Any.fromFunction0(acquire), getBinding = js.Any.fromFunction0(getBinding), getStatus = js.Any.fromFunction0(getStatus), getTargets = js.Any.fromFunction0(getTargets), getTemplate = js.Any.fromFunction0(getTemplate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBinding = js.Any.fromFunction1(setBinding), setStatus = js.Any.fromFunction1(setStatus), setTarget = js.Any.fromFunction1(setTarget), setTemplate = js.Any.fromFunction1(setTemplate))
  
    __obj.asInstanceOf[XXMLSignatureTemplate]
  }
}

