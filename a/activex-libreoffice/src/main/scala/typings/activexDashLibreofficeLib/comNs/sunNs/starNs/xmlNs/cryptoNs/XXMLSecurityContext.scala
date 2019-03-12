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

object XXMLSecurityContext {
  @scala.inline
  def apply(
    DefaultSecurityEnvironmentIndex: scala.Double,
    SecurityEnvironment: XSecurityEnvironment,
    SecurityEnvironmentNumber: scala.Double,
    acquire: () => scala.Unit,
    addSecurityEnvironment: XSecurityEnvironment => scala.Double,
    getDefaultSecurityEnvironmentIndex: () => scala.Double,
    getSecurityEnvironment: () => XSecurityEnvironment,
    getSecurityEnvironmentByIndex: scala.Double => XSecurityEnvironment,
    getSecurityEnvironmentNumber: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDefaultSecurityEnvironmentIndex: scala.Double => scala.Unit
  ): XXMLSecurityContext = {
    val __obj = js.Dynamic.literal(DefaultSecurityEnvironmentIndex = DefaultSecurityEnvironmentIndex, SecurityEnvironment = SecurityEnvironment, SecurityEnvironmentNumber = SecurityEnvironmentNumber, acquire = js.Any.fromFunction0(acquire), addSecurityEnvironment = js.Any.fromFunction1(addSecurityEnvironment), getDefaultSecurityEnvironmentIndex = js.Any.fromFunction0(getDefaultSecurityEnvironmentIndex), getSecurityEnvironment = js.Any.fromFunction0(getSecurityEnvironment), getSecurityEnvironmentByIndex = js.Any.fromFunction1(getSecurityEnvironmentByIndex), getSecurityEnvironmentNumber = js.Any.fromFunction0(getSecurityEnvironmentNumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultSecurityEnvironmentIndex = js.Any.fromFunction1(setDefaultSecurityEnvironmentIndex))
  
    __obj.asInstanceOf[XXMLSecurityContext]
  }
}

