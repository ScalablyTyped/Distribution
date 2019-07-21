package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("active-win", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Get metadata about the [active window](https://en.wikipedia.org/wiki/Active_window) (title, id, bounds, owner, etc).
  	@returns The active window metadata.
  	@example
  	```
  	import activeWin = require('active-win');
  	(async () => {
  		const result = await activeWin();
  		if (!result) {
  			return;
  		}
  		if (result.platform === 'macos') {
  			// Among other fields, result.owner.bundleId is available on macOS.
  			console.log(`Process title is ${result.title} with bundle id ${result.owner.bundleId}.`);
  		} else if (result.platform === 'windows') {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		} else {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		}
  	})();
  	```
  	*/
  def apply(): js.Promise[js.UndefOr[Result]] = js.native
  /**
  	Synchronously get metadata about the [active window](https://en.wikipedia.org/wiki/Active_window) (title, id, bounds, owner, etc).
  	@returns The active window metadata.
  	@example
  	```
  	import activeWin = require('active-win');
  	const result = activeWin.sync();
  	if (result) {
  		if (result.platform === 'macos') {
  			// Among other fields, result.owner.bundleId is available on macOS.
  			console.log(`Process title is ${result.title} with bundle id ${result.owner.bundleId}.`);
  		} else if (result.platform === 'windows') {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		} else {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		}
  	}
  	```
  	*/
  def sync(): js.UndefOr[Result] = js.native
}

