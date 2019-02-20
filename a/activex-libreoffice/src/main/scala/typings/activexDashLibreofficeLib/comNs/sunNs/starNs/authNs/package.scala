package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authNs {
  /**
    * indicates failure to authenticate using the specified security context.
    * @since OOo 1.1.2
    */
  type AuthenticationFailedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * indicates an invalid argument was passed to SSO API.
    * @since OOo 1.1.2
    */
  type InvalidArgumentException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * indicates an attempt was made to use an invalid source or target context.
    * @since OOo 1.1.2
    */
  type InvalidContextException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * indicates an attempt was made to use an invalid or non existent credential.
    * @since OOo 1.1.2
    */
  type InvalidCredentialException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * indicates an invalid principal was specified.
    * @since OOo 1.1.2
    */
  type InvalidPrincipalException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * indicates an underlying persistence implementation failure.
    * @since OOo 1.1.2
    */
  type PersistenceFailureException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * represents a starting point for Single Sign-on interactions.
    *
    * The Single Sign-on ( SSO ) APIs provide UNO based access to underlying SSO implementations ( e.g. Kerberos ). The aim of the SSO APIs is to enable
    * authentication ( possibly mutual ) between a client ( source or initiator ) and a network service ( target or acceptor ). This is achieved via. the
    * creation and processing of security tokens sent between the two parties. The steps which should be followed to successfully use the SSO APIs are as
    * follows: Create an {@link XSSOManagerFactory} instanceUse this factory to create/retrieve an {@link XSSOManager} instance.Depending on whether your
    * code is acting as SSO source or target, you should use the {@link XSSOManager} instance to create an initiator security context, {@link
    * XSSOInitiatorContext} or an acceptor security context, {@link XSSOAcceptorContext} respectively.On the initiator side, use the previously created
    * context to process security tokens received from the acceptor side and to create security tokens to send to the acceptor side. On the acceptor side,
    * use the previously created context to process security tokens received from the initiator side and to create security tokens to send to the initiator
    * side.
    *
    * The interface supports the creation of {@link XSSOManager} instances which can subsequently be used to create security contexts.
    * @since OOo 1.1.2
    */
  type SSOManagerFactory = XSSOManagerFactory
  /**
    * provided as a convenience for simple username/password based Single Sign-on implementations which don't provide some sort of authentication
    * information repository.
    *
    * provides access to a cache which maps usernames to associated passwords. Individual cache entries may be persisted.
    * @since OOo 1.1.2
    */
  type SSOPasswordCache = XSSOPasswordCache
  /**
    * indicates an operation unsupported by the implementation.
    * @since OOo 1.1.2
    */
  type UnsupportedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
}
