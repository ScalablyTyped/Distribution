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
    acquire: () => scala.Unit,
    getRegisteredObject: java.lang.String => XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerObject: (java.lang.String, XInterface) => scala.Unit,
    release: () => scala.Unit,
    revokeObject: java.lang.String => scala.Unit
  ): XNamingService = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), queryInterface = js.Any.fromFunction1(queryInterface), registerObject = js.Any.fromFunction2(registerObject), release = js.Any.fromFunction0(release), revokeObject = js.Any.fromFunction1(revokeObject))
  
    __obj.asInstanceOf[XNamingService]
  }
}

