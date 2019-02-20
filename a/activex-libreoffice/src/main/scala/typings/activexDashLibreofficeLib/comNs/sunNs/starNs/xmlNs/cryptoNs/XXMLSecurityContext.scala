package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML security context
  *
  * This interface specifies a certain signature context. By signature context, the signer or verifier retrieves key specification.
  */
trait XXMLSecurityContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get the ID of the internal security environment */
  var DefaultSecurityEnvironmentIndex: scala.Double
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  val SecurityEnvironment: XSecurityEnvironment
  /** Get the number of security environments */
  val SecurityEnvironmentNumber: scala.Double
  /** Add personal security environment , and return the index of the added environment. */
  def addSecurityEnvironment(aSecurityEnvironment: XSecurityEnvironment): scala.Double
  /** Get the ID of the internal security environment */
  def getDefaultSecurityEnvironmentIndex(): scala.Double
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  def getSecurityEnvironment(): XSecurityEnvironment
  /** Get personal security environment */
  def getSecurityEnvironmentByIndex(index: scala.Double): XSecurityEnvironment
  /** Get the number of security environments */
  def getSecurityEnvironmentNumber(): scala.Double
  /** set the ID of the internal security environment */
  def setDefaultSecurityEnvironmentIndex(index: scala.Double): scala.Unit
}

