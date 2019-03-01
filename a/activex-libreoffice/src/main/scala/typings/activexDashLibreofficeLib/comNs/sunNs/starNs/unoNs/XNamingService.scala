package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to insert, remove and access named objects. */
trait XNamingService extends XInterface {
  /** provides a previous registered object. */
  def getRegisteredObject(Name: java.lang.String): XInterface
  /**
    * registers one object under the specified name.
    *
    * If any object is registered before, then this object is revoked automatically.
    */
  def registerObject(Name: java.lang.String, Object: XInterface): scala.Unit
  /**
    * revokes the registration of an object.
    *
    * If the object was not previously registered, then this call does nothing.
    */
  def revokeObject(Name: java.lang.String): scala.Unit
}

object XNamingService {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getRegisteredObject: js.Function1[java.lang.String, XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerObject: js.Function2[java.lang.String, XInterface, scala.Unit],
    release: js.Function0[scala.Unit],
    revokeObject: js.Function1[java.lang.String, scala.Unit]
  ): XNamingService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getRegisteredObject")(getRegisteredObject)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerObject")(registerObject)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("revokeObject")(revokeObject)
    __obj.asInstanceOf[XNamingService]
  }
}

