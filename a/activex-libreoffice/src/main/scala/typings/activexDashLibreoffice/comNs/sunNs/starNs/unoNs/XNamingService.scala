package typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to insert, remove and access named objects. */
trait XNamingService extends XInterface {
  /** provides a previous registered object. */
  def getRegisteredObject(Name: String): XInterface
  /**
    * registers one object under the specified name.
    *
    * If any object is registered before, then this object is revoked automatically.
    */
  def registerObject(Name: String, Object: XInterface): Unit
  /**
    * revokes the registration of an object.
    *
    * If the object was not previously registered, then this call does nothing.
    */
  def revokeObject(Name: String): Unit
}

object XNamingService {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getRegisteredObject: String => XInterface,
    queryInterface: `type` => js.Any,
    registerObject: (String, XInterface) => Unit,
    release: () => Unit,
    revokeObject: String => Unit
  ): XNamingService = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), queryInterface = js.Any.fromFunction1(queryInterface), registerObject = js.Any.fromFunction2(registerObject), release = js.Any.fromFunction0(release), revokeObject = js.Any.fromFunction1(revokeObject))
  
    __obj.asInstanceOf[XNamingService]
  }
}

