package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies the object with a service name which can be used to create such an object by a factory. */
@js.native
trait XServiceName extends XInterface {
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  val ServiceName: String = js.native
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  def getServiceName(): String = js.native
}

object XServiceName {
  @scala.inline
  def apply(
    ServiceName: String,
    acquire: () => Unit,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceName = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XServiceName]
  }
  @scala.inline
  implicit class XServiceNameOps[Self <: XServiceName] (val x: Self) extends AnyVal {
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
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetServiceName(value: () => String): Self = this.set("getServiceName", js.Any.fromFunction0(value))
  }
  
}

