package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnProcessOptions extends StObject {
  
  /** Current working directory of the child process. */
  var cwd: js.UndefOr[String] = js.undefined
  
  /** Prepare child to run independently of its parent process. */
  var detached: js.UndefOr[Boolean] = js.undefined
  
  /** Environment key-value pairs. */
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Sets the group identity of the process. */
  var gid: js.UndefOr[Double] = js.undefined
  
  /**
    *  If true, runs command inside of a shell. Uses "/bin/sh" on UNIX, and process.env.ComSpec
    *  on Windows. A different shell can be specified as a string.
    */
  var shell: js.UndefOr[Boolean | String] = js.undefined
  
  /** The child's stdio configuration. */
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
  
  /** Sets the user identity of the process. */
  var uid: js.UndefOr[Double] = js.undefined
}
object SpawnProcessOptions {
  
  inline def apply(): SpawnProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnProcessOptions]
  }
  
  extension [Self <: SpawnProcessOptions](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setStdio(value: String | (js.Array[String | Double])): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (String | Double)*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
