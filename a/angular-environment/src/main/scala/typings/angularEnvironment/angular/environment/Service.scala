package typings.angularEnvironment.angular.environment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * Retrieve the current environment
    */
  def get(): String = js.native
  /**
    * Evaluates current environment against
    * environment parameter.
    */
  def is(environment: String): Boolean = js.native
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: String): js.Any = js.native
  /**
    * Force sets the current environment
    */
  def set(environment: String): Unit = js.native
}

object Service {
  @scala.inline
  def apply(get: () => String, is: String => Boolean, read: String => js.Any, set: String => Unit): Service = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), is = js.Any.fromFunction1(is), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
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
    def setGet(value: () => String): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setIs(value: String => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: String => js.Any): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

