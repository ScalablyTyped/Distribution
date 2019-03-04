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
  val Targets: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper]
  /** Get the dynamic URI binding */
  def getBinding(): XUriBinding
  /** Get the target XML element, i.e. the element to be signed */
  def getTargets(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper]
  /** Set the dynamic URI binding */
  def setBinding(aUriBinding: XUriBinding): scala.Unit
}

object XXMLSignatureTemplate {
  @scala.inline
  def apply(
    Binding: XUriBinding,
    Status: SecurityOperationStatus,
    Targets: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    Template: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper,
    acquire: js.Function0[scala.Unit],
    getBinding: js.Function0[XUriBinding],
    getStatus: js.Function0[SecurityOperationStatus],
    getTargets: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper]
    ],
    getTemplate: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setBinding: js.Function1[XUriBinding, scala.Unit],
    setStatus: js.Function1[SecurityOperationStatus, scala.Unit],
    setTarget: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper, 
      scala.Unit
    ],
    setTemplate: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XXMLElementWrapper, 
      scala.Unit
    ]
  ): XXMLSignatureTemplate = {
    val __obj = js.Dynamic.literal(Binding = Binding, Status = Status, Targets = Targets, Template = Template, acquire = acquire, getBinding = getBinding, getStatus = getStatus, getTargets = getTargets, getTemplate = getTemplate, queryInterface = queryInterface, release = release, setBinding = setBinding, setStatus = setStatus, setTarget = setTarget, setTemplate = setTemplate)
  
    __obj.asInstanceOf[XXMLSignatureTemplate]
  }
}

