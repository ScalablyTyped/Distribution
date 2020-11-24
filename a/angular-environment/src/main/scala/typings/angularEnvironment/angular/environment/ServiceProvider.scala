package typings.angularEnvironment.angular.environment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceProvider extends js.Object {
  
  /**
    * Evaluates the current domain and
    * loads the correct environment variables.
    */
  def check(): Unit = js.native
  
  /**
    * Sets the configuration object
    */
  def config(config: Config): Unit = js.native
  
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: String): js.Any = js.native
}
object ServiceProvider {
  
  @scala.inline
  def apply(check: () => Unit, config: Config => Unit, read: String => js.Any): ServiceProvider = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), config = js.Any.fromFunction1(config), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[ServiceProvider]
  }
  
  @scala.inline
  implicit class ServiceProviderOps[Self <: ServiceProvider] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: () => Unit): Self = this.set("check", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfig(value: Config => Unit): Self = this.set("config", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: String => js.Any): Self = this.set("read", js.Any.fromFunction1(value))
  }
}
