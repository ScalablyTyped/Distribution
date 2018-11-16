package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigurationOptions extends js.Object {
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var mainColor: java.lang.String | js.Array[java.lang.String]
  var minimist: js.UndefOr[MinimistOptions] = js.undefined
  var mri: MriOptions
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subColor: java.lang.String | js.Array[java.lang.String]
  var usageFilter: js.UndefOr[js.Function1[/* output */ js.Any, _]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Boolean] = js.undefined
}

