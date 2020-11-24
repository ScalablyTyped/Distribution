package typings.appRootDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppRootDir extends js.Object {
  
  // Get the application's root directory
  def get(): String = js.native
  
  /**
    * Set the application's root directory
    *    this will set a global so that no matter
    *    how many instances of app-root-dir module are installed,
    *    they will all return the same directory
    */
  def set(dirname: String): Unit = js.native
}
object AppRootDir {
  
  @scala.inline
  def apply(get: () => String, set: String => Unit): AppRootDir = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[AppRootDir]
  }
  
  @scala.inline
  implicit class AppRootDirOps[Self <: AppRootDir] (val x: Self) extends AnyVal {
    
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
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
