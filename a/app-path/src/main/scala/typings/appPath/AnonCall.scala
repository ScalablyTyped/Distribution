package typings.appPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
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

