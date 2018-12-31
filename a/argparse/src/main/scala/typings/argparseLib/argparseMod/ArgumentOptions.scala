package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentOptions extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
   // tslint:disable-line:ban-types
  var choices: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var constant: js.UndefOr[js.Any] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var dest: js.UndefOr[java.lang.String] = js.undefined
  var help: js.UndefOr[java.lang.String] = js.undefined
  var metavar: js.UndefOr[java.lang.String] = js.undefined
  var nargs: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var optionStrings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  // type may be a string (primitive) or a Function (constructor)
  var `type`: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

