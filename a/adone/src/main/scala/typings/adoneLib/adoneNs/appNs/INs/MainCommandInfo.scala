package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MainCommandInfo extends js.Object {
  var arguments: js.UndefOr[js.Array[ArgumentInfo | java.lang.String]] = js.undefined
  var blindMode: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var handler: js.UndefOr[js.Function2[/* args */ js.Object, /* opts */ js.Object, scala.Unit]] = js.undefined
  var `match`: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  var options: js.UndefOr[js.Array[ArgumentInfo | java.lang.String]] = js.undefined
  var optionsGroups: js.UndefOr[js.Array[Group]] = js.undefined
}

