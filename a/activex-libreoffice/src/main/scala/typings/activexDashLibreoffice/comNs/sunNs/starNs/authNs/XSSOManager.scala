package typings.activexDashLibreoffice.comNs.sunNs.starNs.authNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports the creation of security contexts for both the initiator/source side and the acceptor/target side.
  * @since OOo 1.1.2
  */
trait XSSOManager extends XInterface {
  /**
    * retrieves the mechanism name of all security contexts created using this manager.
    * @returns the mechanism name ( e.g. "KERBEROS" )
    */
  val Mechanism: String
  /**
    * creates an acceptor side security context.
    * @param TargetPrincipal the name of the acceptor side principal.
    * @returns the newly created acceptor side context.
    */
  def createAcceptorContext(TargetPrincipal: String): XSSOAcceptorContext
  /**
    * creates an initiator side security context.
    * @param SourcePrincipal the name of the initiator side principal for which the context will be created.
    * @param TargetPrincipal the name of the target/acceptor side principal to which the source principal intends to authenticate.
    * @param TargetHost the host name associated with the target principal.
    * @returns the newly created initiator context.
    */
  def createInitiatorContext(SourcePrincipal: String, TargetPrincipal: String, TargetHost: String): XSSOInitiatorContext
  /**
    * retrieves the mechanism name of all security contexts created using this manager.
    * @returns the mechanism name ( e.g. "KERBEROS" )
    */
  def getMechanism(): String
}

object XSSOManager {
  @scala.inline
  def apply(
    Mechanism: String,
    acquire: () => Unit,
    createAcceptorContext: String => XSSOAcceptorContext,
    createInitiatorContext: (String, String, String) => XSSOInitiatorContext,
    getMechanism: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOManager = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism, acquire = js.Any.fromFunction0(acquire), createAcceptorContext = js.Any.fromFunction1(createAcceptorContext), createInitiatorContext = js.Any.fromFunction3(createInitiatorContext), getMechanism = js.Any.fromFunction0(getMechanism), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSSOManager]
  }
}

