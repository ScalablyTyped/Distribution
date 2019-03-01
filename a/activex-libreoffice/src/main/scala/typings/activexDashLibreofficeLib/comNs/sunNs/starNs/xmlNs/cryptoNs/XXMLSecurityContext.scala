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
    acquire: js.Function0[scala.Unit],
    addSecurityEnvironment: js.Function1[XSecurityEnvironment, scala.Double],
    getDefaultSecurityEnvironmentIndex: js.Function0[scala.Double],
    getSecurityEnvironment: js.Function0[XSecurityEnvironment],
    getSecurityEnvironmentByIndex: js.Function1[scala.Double, XSecurityEnvironment],
    getSecurityEnvironmentNumber: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDefaultSecurityEnvironmentIndex: js.Function1[scala.Double, scala.Unit]
  ): XXMLSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultSecurityEnvironmentIndex")(DefaultSecurityEnvironmentIndex)
    __obj.updateDynamic("SecurityEnvironment")(SecurityEnvironment)
    __obj.updateDynamic("SecurityEnvironmentNumber")(SecurityEnvironmentNumber)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSecurityEnvironment")(addSecurityEnvironment)
    __obj.updateDynamic("getDefaultSecurityEnvironmentIndex")(getDefaultSecurityEnvironmentIndex)
    __obj.updateDynamic("getSecurityEnvironment")(getSecurityEnvironment)
    __obj.updateDynamic("getSecurityEnvironmentByIndex")(getSecurityEnvironmentByIndex)
    __obj.updateDynamic("getSecurityEnvironmentNumber")(getSecurityEnvironmentNumber)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDefaultSecurityEnvironmentIndex")(setDefaultSecurityEnvironmentIndex)
    __obj.asInstanceOf[XXMLSecurityContext]
  }
}

