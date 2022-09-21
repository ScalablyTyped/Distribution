package typings.appPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Get the path to an app on macOS.
    	@param appName - An app name or bundle identifier.
    	@returns The path to the app specified in `appName`. Rejects when run on any other operating system than macOS.
    	@example
    	```
    	import appPath from 'app-path';
    	console.log(await appPath('Safari'));
    	//=> '/Applications/Safari.app'
    	console.log(await appPath('com.apple.Safari'));
    	//=> '/Applications/Safari.app'
    	```
    	*/
    inline def apply(appName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(appName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    @JSImport("app-path", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Synchronously get the path to an app on macOS.
    	@param appName - An app name or bundle identifier.
    	@returns The path to the app specified in `appName`. Throws when run on any other operating system than macOS.
    	@example
    	```
    	import appPath from 'app-path';
    	console.log(appPath.sync('Safari'));
    	//=> '/Applications/Safari.app'
    	console.log(appPath.sync('com.apple.Safari'));
    	//=> '/Applications/Safari.app'
    	```
    	*/
    inline def sync(appName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(appName.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
