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

