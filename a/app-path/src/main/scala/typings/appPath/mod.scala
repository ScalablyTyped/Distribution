package typings.appPath

import typings.appPath.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def apply(appName: String): js.Promise[String] = js.native
  
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
  def default(appName: String): js.Promise[String] = js.native
  // TODO: remove this in the next major version
  @JSName("default")
  var default_Original: Call = js.native
  
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
  def sync(appName: String): String = js.native
}
