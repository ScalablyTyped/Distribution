package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies the object with a service name which can be used to create such an object by a factory. */
trait XServiceName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  val ServiceName: java.lang.String
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  def getServiceName(): java.lang.String
}

object XServiceName {
  @scala.inline
  def apply(
    ServiceName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XServiceName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getServiceName")(getServiceName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XServiceName]
  }
}

