package typings.activexDashLibreoffice.comNs.sunNs.starNs.authNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
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
  def accept(Token: SeqEquiv[Double]): SafeArray[Double]
}

object XSSOAcceptorContext {
  @scala.inline
  def apply(
    Mechanism: String,
    Mutual: Boolean,
    Source: String,
    Target: String,
    accept: SeqEquiv[Double] => SafeArray[Double],
    acquire: () => Unit,
    getMechanism: () => String,
    getMutual: () => Boolean,
    getSource: () => String,
    getTarget: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOAcceptorContext = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism, Mutual = Mutual, Source = Source, Target = Target, accept = js.Any.fromFunction1(accept), acquire = js.Any.fromFunction0(acquire), getMechanism = js.Any.fromFunction0(getMechanism), getMutual = js.Any.fromFunction0(getMutual), getSource = js.Any.fromFunction0(getSource), getTarget = js.Any.fromFunction0(getTarget), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSSOAcceptorContext]
  }
}

