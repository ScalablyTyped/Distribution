package typings.architectSandbox

import typings.architectSandbox.architectSandboxStrings.debug
import typings.architectSandbox.architectSandboxStrings.normal
import typings.architectSandbox.architectSandboxStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  type Callback = js.Function2[/* err */ Null | js.Error, /* data */ js.UndefOr[String], Unit]
  
  trait StartOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[normal | verbose | debug] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var symlink: js.UndefOr[Boolean] = js.undefined
  }
  object StartOptions {
    
    inline def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setLogLevel(value: normal | verbose | debug): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setSymlink(value: Boolean): Self = StObject.set(x, "symlink", value.asInstanceOf[js.Any])
      
      inline def setSymlinkUndefined: Self = StObject.set(x, "symlink", js.undefined)
    }
  }
}
