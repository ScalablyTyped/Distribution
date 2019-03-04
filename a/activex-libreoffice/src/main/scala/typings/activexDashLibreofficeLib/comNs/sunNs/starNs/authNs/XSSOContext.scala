package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base SSO security context representation
  * @since OOo 1.1.2
  */
trait XSSOContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the mechanism associated with the context.
    * @returns the mechanism name
    */
  val Mechanism: java.lang.String
  /**
    * retrieves whether or not the context supports mutual authentication
    * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
    */
  val Mutual: scala.Boolean
  /**
    * retrieves the principal name of the source/initiator of the context.
    *
    * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
    * @returns the source principal name
    */
  val Source: java.lang.String
  /**
    * retrieves the principal name of the target/acceptor of the context.
    * @returns the target principal name
    */
  val Target: java.lang.String
  /**
    * retrieves the mechanism associated with the context.
    * @returns the mechanism name
    */
  def getMechanism(): java.lang.String
  /**
    * retrieves whether or not the context supports mutual authentication
    * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
    */
  def getMutual(): scala.Boolean
  /**
    * retrieves the principal name of the source/initiator of the context.
    *
    * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
    * @returns the source principal name
    */
  def getSource(): java.lang.String
  /**
    * retrieves the principal name of the target/acceptor of the context.
    * @returns the target principal name
    */
  def getTarget(): java.lang.String
}

object XSSOContext {
  @scala.inline
  def apply(
    Mechanism: java.lang.String,
    Mutual: scala.Boolean,
    Source: java.lang.String,
    Target: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getMechanism: js.Function0[java.lang.String],
    getMutual: js.Function0[scala.Boolean],
    getSource: js.Function0[java.lang.String],
    getTarget: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSSOContext = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism, Mutual = Mutual, Source = Source, Target = Target, acquire = acquire, getMechanism = getMechanism, getMutual = getMutual, getSource = getSource, getTarget = getTarget, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSSOContext]
  }
}

