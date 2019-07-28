package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLSignature} */
trait XMLSignature
  extends XXMLSignature
     with XInitialization

object XMLSignature {
  @scala.inline
  def apply(
    acquire: () => Unit,
    generate: (XXMLSignatureTemplate, XSecurityEnvironment) => XXMLSignatureTemplate,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    validate: (XXMLSignatureTemplate, XXMLSecurityContext) => XXMLSignatureTemplate
  ): XMLSignature = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), generate = js.Any.fromFunction2(generate), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[XMLSignature]
  }
}

