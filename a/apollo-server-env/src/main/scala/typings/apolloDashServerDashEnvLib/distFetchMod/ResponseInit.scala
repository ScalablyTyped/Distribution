package typings
package apolloDashServerDashEnvLib.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInit extends js.Object {
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  // Although this isn't part of the spec, `node-fetch` accepts a `url` property
  var url: js.UndefOr[java.lang.String] = js.undefined
}

