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

