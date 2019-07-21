package typings
package appDashPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-path", JSImport.Namespace)
@js.native
object appDashPathMod extends js.Object {
  // TODO: remove this in the next major version
  @JSName("default")
  var default_Original: appDashPathLib.Anon_AppName = js.native
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
  def apply(appName: java.lang.String): js.Promise[java.lang.String] = js.native
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
  def default(appName: java.lang.String): js.Promise[java.lang.String] = js.native
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
  def sync(appName: java.lang.String): java.lang.String = js.native
}

