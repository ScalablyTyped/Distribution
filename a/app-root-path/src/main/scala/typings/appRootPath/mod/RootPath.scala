package typings.appRootPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootPath extends js.Object {
  
  /**
    * Application root directory absolute path
    * @type {string}
    */
  var path: String = js.native
  
  /**
    * Resolve module by relative addressing from root
    * @param {string} pathToModule
    * @returns {*}
    */
  def require(pathToModule: String): js.Any = js.native
  
  /**
    * Resolves relative path from root to absolute path
    * @param {string} pathToModule
    * @returns {string}
    */
  def resolve(pathToModule: String): String = js.native
  
  /**
    * Explicitly set root path
    * @param {string} explicitlySetPath
    */
  def setPath(explicitlySetPath: String): Unit = js.native
}
object RootPath {
  
  @scala.inline
  def apply(path: String, require: String => js.Any, resolve: String => String, setPath: String => Unit): RootPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], require = js.Any.fromFunction1(require), resolve = js.Any.fromFunction1(resolve), setPath = js.Any.fromFunction1(setPath))
    __obj.asInstanceOf[RootPath]
  }
  
  @scala.inline
  implicit class RootPathOps[Self <: RootPath] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String => js.Any): Self = this.set("require", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: String => String): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPath(value: String => Unit): Self = this.set("setPath", js.Any.fromFunction1(value))
  }
}
