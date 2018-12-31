package typings
package asanaLib.asanaMod.asanaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to configure the client */
trait ClientOptions extends DispatcherOptions {
  var asanaBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
}

