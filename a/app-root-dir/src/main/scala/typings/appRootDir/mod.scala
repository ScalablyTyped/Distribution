package typings.appRootDir

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("app-root-dir", JSImport.Namespace)
  @js.native
  val ^ : AppRootDir = js.native
  
  trait AppRootDir extends StObject {
    
    // Get the application's root directory
    def get(): String
    
    /**
      * Set the application's root directory
      *    this will set a global so that no matter
      *    how many instances of app-root-dir module are installed,
      *    they will all return the same directory
      */
    def set(dirname: String): Unit
  }
  object AppRootDir {
    
    inline def apply(get: () => String, set: String => Unit): AppRootDir = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[AppRootDir]
    }
    
    extension [Self <: AppRootDir](x: Self) {
      
      inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  type _To = AppRootDir
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AppRootDir = ^
}
