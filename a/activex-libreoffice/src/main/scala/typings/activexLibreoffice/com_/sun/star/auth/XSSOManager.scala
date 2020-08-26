package typings.activexLibreoffice.com_.sun.star.auth

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports the creation of security contexts for both the initiator/source side and the acceptor/target side.
  * @since OOo 1.1.2
  */
@js.native
trait XSSOManager extends XInterface {
  /**
    * retrieves the mechanism name of all security contexts created using this manager.
    * @returns the mechanism name ( e.g. "KERBEROS" )
    */
  val Mechanism: String = js.native
  /**
    * creates an acceptor side security context.
    * @param TargetPrincipal the name of the acceptor side principal.
    * @returns the newly created acceptor side context.
    */
  def createAcceptorContext(TargetPrincipal: String): XSSOAcceptorContext = js.native
  /**
    * creates an initiator side security context.
    * @param SourcePrincipal the name of the initiator side principal for which the context will be created.
    * @param TargetPrincipal the name of the target/acceptor side principal to which the source principal intends to authenticate.
    * @param TargetHost the host name associated with the target principal.
    * @returns the newly created initiator context.
    */
  def createInitiatorContext(SourcePrincipal: String, TargetPrincipal: String, TargetHost: String): XSSOInitiatorContext = js.native
  /**
    * retrieves the mechanism name of all security contexts created using this manager.
    * @returns the mechanism name ( e.g. "KERBEROS" )
    */
  def getMechanism(): String = js.native
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
    val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createAcceptorContext = js.Any.fromFunction1(createAcceptorContext), createInitiatorContext = js.Any.fromFunction3(createInitiatorContext), getMechanism = js.Any.fromFunction0(getMechanism), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSSOManager]
  }
  @scala.inline
  implicit class XSSOManagerOps[Self <: XSSOManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMechanism(value: String): Self = this.set("Mechanism", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateAcceptorContext(value: String => XSSOAcceptorContext): Self = this.set("createAcceptorContext", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateInitiatorContext(value: (String, String, String) => XSSOInitiatorContext): Self = this.set("createInitiatorContext", js.Any.fromFunction3(value))
    @scala.inline
    def setGetMechanism(value: () => String): Self = this.set("getMechanism", js.Any.fromFunction0(value))
  }
  
}

