package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Option extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: java.lang.String
  var init: js.UndefOr[argsLib.OptionInitFunction] = js.undefined
  var name: java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
}

