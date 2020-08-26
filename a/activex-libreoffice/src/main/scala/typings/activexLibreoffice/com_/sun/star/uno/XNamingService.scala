package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to insert, remove and access named objects. */
@js.native
trait XNamingService extends XInterface {
  /** provides a previous registered object. */
  def getRegisteredObject(Name: String): XInterface = js.native
  /**
    * registers one object under the specified name.
    *
    * If any object is registered before, then this object is revoked automatically.
    */
  def registerObject(Name: String, Object: XInterface): Unit = js.native
  /**
    * revokes the registration of an object.
    *
    * If the object was not previously registered, then this call does nothing.
    */
  def revokeObject(Name: String): Unit = js.native
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
  @scala.inline
  implicit class XNamingServiceOps[Self <: XNamingService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetRegisteredObject(value: String => XInterface): Self = this.set("getRegisteredObject", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterObject(value: (String, XInterface) => Unit): Self = this.set("registerObject", js.Any.fromFunction2(value))
    @scala.inline
    def setRevokeObject(value: String => Unit): Self = this.set("revokeObject", js.Any.fromFunction1(value))
  }
  
}

