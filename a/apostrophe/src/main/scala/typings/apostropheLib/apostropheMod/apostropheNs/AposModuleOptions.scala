package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules to AposModuleOptions to allow them in extend
trait AposModuleOptions[C] extends js.Object {
  var addFields: js.UndefOr[js.Array[Field]] = js.undefined
  var arrangeFields: js.UndefOr[js.Array[apostropheLib.Anon_Fields]] = js.undefined
  var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var extend: AposCoreModules | C
  var filters: js.UndefOr[apostropheLib.Anon_Projection] = js.undefined
  var label: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var playerData: js.UndefOr[apostropheLib.apostropheLibNumbers.`false` | js.Array[java.lang.String]] = js.undefined
  var pluralLabel: js.UndefOr[java.lang.String] = js.undefined
  var removeFields: js.UndefOr[js.Array[Field]] = js.undefined
  var scene: js.UndefOr[apostropheLib.apostropheLibStrings.user] = js.undefined
}

