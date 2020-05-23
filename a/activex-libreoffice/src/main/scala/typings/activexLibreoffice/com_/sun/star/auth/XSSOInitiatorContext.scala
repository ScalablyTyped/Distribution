package typings.activexLibreoffice.com_.sun.star.auth

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an initiator side security context.
  *
  * This context may be used to initialize authentication tokens to send to an acceptor and to authenticate any token sent back in response.
  * @since OOo 1.1.2
  */
trait XSSOInitiatorContext extends XSSOContext {
  /**
    * initializes an SSO Token to send to the acceptor side and authenticates an SSO Token returned by the acceptor if the context supports mutual
    * authentication.
    *
    * init should be called only once for contexts which don't support mutual authentication and at most twice for contexts which do support mutual
    * authentication. Additional calls produce undefined results.
    * @param Token the SSO token received from the acceptor side in response to an authentication request. This token is ignored on the first call to init and
    * @returns the sequence of bytes to be sent to the acceptor side as part of an authentication request. This sequence will be non zero length for the first c
    */
  def init(Token: SeqEquiv[Double]): SafeArray[Double]
}

object XSSOInitiatorContext {
  @scala.inline
  def apply(
    Mechanism: String,
    Mutual: Boolean,
    Source: String,
    Target: String,
    acquire: () => Unit,
    getMechanism: () => String,
    getMutual: () => Boolean,
    getSource: () => String,
    getTarget: () => String,
    init: SeqEquiv[Double] => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOInitiatorContext = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], Mutual = Mutual.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMechanism = js.Any.fromFunction0(getMechanism), getMutual = js.Any.fromFunction0(getMutual), getSource = js.Any.fromFunction0(getSource), getTarget = js.Any.fromFunction0(getTarget), init = js.Any.fromFunction1(init), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSSOInitiatorContext]
  }
}

