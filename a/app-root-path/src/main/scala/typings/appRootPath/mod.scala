package typings.appRootPath

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("app-root-path", JSImport.Namespace)
  @js.native
  val ^ : RootPath = js.native
  
  @js.native
  trait RootPath extends StObject {
    
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
    implicit class RootPathMutableBuilder[Self <: RootPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequire(value: String => js.Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: String => String): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPath(value: String => Unit): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
    }
  }
  
  type _To = RootPath
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RootPath = ^
}
