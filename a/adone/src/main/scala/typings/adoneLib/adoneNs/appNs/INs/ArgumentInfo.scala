package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArgumentInfo extends js.Object {
  var action: js.UndefOr[
    adoneLib.adoneLibStrings.store | adoneLib.adoneLibStrings.store_const | adoneLib.adoneLibStrings.store_true | adoneLib.adoneLibStrings.store_false | adoneLib.adoneLibStrings.append | adoneLib.adoneLibStrings.count | adoneLib.adoneLibStrings.set
  ] = js.undefined
  var appendChoicesHelpMessage: js.UndefOr[scala.Boolean] = js.undefined
  var appendDefaultMessage: js.UndefOr[scala.Boolean] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var help: js.UndefOr[java.lang.String] = js.undefined
  var holder: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String | js.Array[java.lang.String]
  var nargs: js.UndefOr[
    scala.Double | adoneLib.adoneLibStrings.`+` | adoneLib.adoneLibStrings.`*` | adoneLib.adoneLibStrings.`?`
  ] = js.undefined
   // TODO
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[ArgumentType | js.Array[ArgumentType]] = js.undefined
  var verify: js.UndefOr[js.Function2[/* args */ js.Any, /* opts */ js.Any, scala.Boolean]] = js.undefined
}

