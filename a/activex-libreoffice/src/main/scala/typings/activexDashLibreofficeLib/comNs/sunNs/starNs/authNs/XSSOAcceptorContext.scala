package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an acceptor side security context.
  *
  * This context may be used to authenticate a Single Sign-on initiator based on a security token sent by the initiator and to generate a token to be sent
  * back to the initiator so that it can authenticate the acceptor.
  * @since OOo 1.1.2
  */
trait XSSOAcceptorContext extends XSSOContext {
  /**
    * accepts/authenticates an SSO token sent from the context initiator side.
    *
    * {@link accept()} should be called only once. Subsequent calls produce undefined results.
    * @param Token the SSO token sent by the initiator.
    * @returns the sequence of bytes to be sent back to the initiator to allow authentication of the acceptor side, if mutual authentication is supported by the
    */
  def accept(Token: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): activexDashInteropLib.SafeArray[scala.Double]
}

object XSSOAcceptorContext {
  @scala.inline
  def apply(
    Mechanism: java.lang.String,
    Mutual: scala.Boolean,
    Source: java.lang.String,
    Target: java.lang.String,
    accept: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    acquire: js.Function0[scala.Unit],
    getMechanism: js.Function0[java.lang.String],
    getMutual: js.Function0[scala.Boolean],
    getSource: js.Function0[java.lang.String],
    getTarget: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSSOAcceptorContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Mechanism")(Mechanism)
    __obj.updateDynamic("Mutual")(Mutual)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMechanism")(getMechanism)
    __obj.updateDynamic("getMutual")(getMutual)
    __obj.updateDynamic("getSource")(getSource)
    __obj.updateDynamic("getTarget")(getTarget)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSSOAcceptorContext]
  }
}

