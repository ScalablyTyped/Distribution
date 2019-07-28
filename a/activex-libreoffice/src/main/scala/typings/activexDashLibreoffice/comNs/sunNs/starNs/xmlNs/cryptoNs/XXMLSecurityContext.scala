package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML security context
  *
  * This interface specifies a certain signature context. By signature context, the signer or verifier retrieves key specification.
  */
trait XXMLSecurityContext extends XInterface {
  /** Get the ID of the internal security environment */
  var DefaultSecurityEnvironmentIndex: Double
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  val SecurityEnvironment: XSecurityEnvironment
  /** Get the number of security environments */
  val SecurityEnvironmentNumber: Double
  /** Add personal security environment , and return the index of the added environment. */
  def addSecurityEnvironment(aSecurityEnvironment: XSecurityEnvironment): Double
  /** Get the ID of the internal security environment */
  def getDefaultSecurityEnvironmentIndex(): Double
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  def getSecurityEnvironment(): XSecurityEnvironment
  /** Get personal security environment */
  def getSecurityEnvironmentByIndex(index: Double): XSecurityEnvironment
  /** Get the number of security environments */
  def getSecurityEnvironmentNumber(): Double
  /** set the ID of the internal security environment */
  def setDefaultSecurityEnvironmentIndex(index: Double): Unit
}

object XXMLSecurityContext {
  @scala.inline
  def apply(
    DefaultSecurityEnvironmentIndex: Double,
    SecurityEnvironment: XSecurityEnvironment,
    SecurityEnvironmentNumber: Double,
    acquire: () => Unit,
    addSecurityEnvironment: XSecurityEnvironment => Double,
    getDefaultSecurityEnvironmentIndex: () => Double,
    getSecurityEnvironment: () => XSecurityEnvironment,
    getSecurityEnvironmentByIndex: Double => XSecurityEnvironment,
    getSecurityEnvironmentNumber: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultSecurityEnvironmentIndex: Double => Unit
  ): XXMLSecurityContext = {
    val __obj = js.Dynamic.literal(DefaultSecurityEnvironmentIndex = DefaultSecurityEnvironmentIndex, SecurityEnvironment = SecurityEnvironment, SecurityEnvironmentNumber = SecurityEnvironmentNumber, acquire = js.Any.fromFunction0(acquire), addSecurityEnvironment = js.Any.fromFunction1(addSecurityEnvironment), getDefaultSecurityEnvironmentIndex = js.Any.fromFunction0(getDefaultSecurityEnvironmentIndex), getSecurityEnvironment = js.Any.fromFunction0(getSecurityEnvironment), getSecurityEnvironmentByIndex = js.Any.fromFunction1(getSecurityEnvironmentByIndex), getSecurityEnvironmentNumber = js.Any.fromFunction0(getSecurityEnvironmentNumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultSecurityEnvironmentIndex = js.Any.fromFunction1(setDefaultSecurityEnvironmentIndex))
  
    __obj.asInstanceOf[XXMLSecurityContext]
  }
}

