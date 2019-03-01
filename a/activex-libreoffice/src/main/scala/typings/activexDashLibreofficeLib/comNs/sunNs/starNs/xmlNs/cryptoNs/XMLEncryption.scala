package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLEncryption} */
trait XMLEncryption
  extends XXMLEncryption
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object XMLEncryption {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    decrypt: js.Function2[XXMLEncryptionTemplate, XXMLSecurityContext, XXMLEncryptionTemplate],
    encrypt: js.Function2[XXMLEncryptionTemplate, XSecurityEnvironment, XXMLEncryptionTemplate],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMLEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("decrypt")(decrypt)
    __obj.updateDynamic("encrypt")(encrypt)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMLEncryption]
  }
}

