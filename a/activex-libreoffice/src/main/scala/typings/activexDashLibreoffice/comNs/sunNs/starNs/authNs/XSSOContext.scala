package typings.activexDashLibreoffice.comNs.sunNs.starNs.authNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base SSO security context representation
  * @since OOo 1.1.2
  */
trait XSSOContext extends XInterface {
  /**
    * retrieves the mechanism associated with the context.
    * @returns the mechanism name
    */
  val Mechanism: String
  /**
    * retrieves whether or not the context supports mutual authentication
    * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
    */
  val Mutual: Boolean
  /**
    * retrieves the principal name of the source/initiator of the context.
    *
    * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
    * @returns the source principal name
    */
  val Source: String
  /**
    * retrieves the principal name of the target/acceptor of the context.
    * @returns the target principal name
    */
  val Target: String
  /**
    * retrieves the mechanism associated with the context.
    * @returns the mechanism name
    */
  def getMechanism(): String
  /**
    * retrieves whether or not the context supports mutual authentication
    * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
    */
  def getMutual(): Boolean
  /**
    * retrieves the principal name of the source/initiator of the context.
    *
    * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
    * @returns the source principal name
    */
  def getSource(): String
  /**
    * retrieves the principal name of the target/acceptor of the context.
    * @returns the target principal name
    */
  def getTarget(): String
}

object XSSOContext {
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
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOContext = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism, Mutual = Mutual, Source = Source, Target = Target, acquire = js.Any.fromFunction0(acquire), getMechanism = js.Any.fromFunction0(getMechanism), getMutual = js.Any.fromFunction0(getMutual), getSource = js.Any.fromFunction0(getSource), getTarget = js.Any.fromFunction0(getTarget), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSSOContext]
  }
}

