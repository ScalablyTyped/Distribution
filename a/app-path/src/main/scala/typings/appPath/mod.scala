package typings.appPath

import typings.appPath.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the path to an app on macOS.
  	@param appName - An app name or bundle identifier.
  	@returns The path to the app specified in `appName`. Rejects when run on any other OS than macOS.
  	@example
  	```
  	import appPath from 'app-path';
  	(async () => {
  		console.log(await appPath('Safari'));
  		//=> '/Applications/Safari.app'
  		console.log(await appPath('com.apple.Safari'));
  		//=> '/Applications/Safari.app'
  	})();
  	```
  	*/
  @scala.inline
  def apply(appName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(appName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("app-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  @JSImport("app-path", "default")
  @js.native
  def default: Call = js.native
  /**
  	Get the path to an app on macOS.
  	@param appName - An app name or bundle identifier.
  	@returns The path to the app specified in `appName`. Rejects when run on any other OS than macOS.
  	@example
  	```
  	import appPath from 'app-path';
  	(async () => {
  		console.log(await appPath('Safari'));
  		//=> '/Applications/Safari.app'
  		console.log(await appPath('com.apple.Safari'));
  		//=> '/Applications/Safari.app'
  	})();
  	```
  	*/
  // TODO: remove this in the next major version
  @scala.inline
  def default(appName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(appName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Synchronously get the path to an app on macOS.
  	@param appName - An app name or bundle identifier.
  	@returns The path to the app specified in `appName`. Throws when run on any other OS than macOS.
  	@example
  	```
  	import appPath from 'app-path';
  	console.log(appPath.sync('Safari'));
  	//=> '/Applications/Safari.app'
  	console.log(appPath.sync('com.apple.Safari'));
  	//=> '/Applications/Safari.app'
  	```
  	*/
  @scala.inline
  def sync(appName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(appName.asInstanceOf[js.Any]).asInstanceOf[String]
}
