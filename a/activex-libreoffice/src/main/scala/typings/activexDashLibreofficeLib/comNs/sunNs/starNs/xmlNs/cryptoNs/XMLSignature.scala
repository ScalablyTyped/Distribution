package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLSignature} */
trait XMLSignature
  extends XXMLSignature
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object XMLSignature {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    generate: js.Function2[XXMLSignatureTemplate, XSecurityEnvironment, XXMLSignatureTemplate],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    validate: js.Function2[XXMLSignatureTemplate, XXMLSecurityContext, XXMLSignatureTemplate]
  ): XMLSignature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("generate")(generate)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[XMLSignature]
  }
}

