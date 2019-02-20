package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to produce proxy objects.
  * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
  */
trait XProxyFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * This method creates a new proxy object that acts on behalf of the given target object. ;  The proxy delegates calls to the given target object. In
    * addition, it is aggregatable, thus it is possible to intercept calls on the proxy's interfaces.
    * @param xTarget target object
    * @returns proxy object
    */
  def createProxy(xTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XAggregation
}

