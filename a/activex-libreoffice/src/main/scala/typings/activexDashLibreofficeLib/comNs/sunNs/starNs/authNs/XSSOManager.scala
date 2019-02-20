package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports the creation of security contexts for both the initiator/source side and the acceptor/target side.
  * @since OOo 1.1.2
  */
trait XSSOManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the mechanism name of all security contexts created using this manager.
    * @returns the mechanism name ( e.g. "KERBEROS" )
    */
  val Mechanism: java.lang.String
  /**
    * creates an acceptor side security context.
    * @param TargetPrincipal the name of the acceptor side principal.
    * @returns the newly created acceptor side context.
    */
  def createAcceptorContext(TargetPrincipal: java.lang.String): XSSOAcceptorContext
  /**
    * creates an initiator side security context.
    * @param SourcePrincipal the name of the initiator side principal for which the context will be created.
    * @param TargetPrincipal the name of the target/acceptor side principal to which the source principal intends to authenticate.
    * @param TargetHost the host name associated with the target principal.
    * @returns the newly created initiator context.
    */
  def createInitiatorContext(SourcePrincipal: java.lang.String, TargetPrincipal: java.lang.String, TargetHost: java.lang.String): XSSOInitiatorContext
  /**
    * retrieves the mechanism name of all security contexts created using this manager.
    * @returns the mechanism name ( e.g. "KERBEROS" )
    */
  def getMechanism(): java.lang.String
}

