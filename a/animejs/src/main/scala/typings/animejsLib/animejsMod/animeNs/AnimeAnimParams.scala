package typings
package animejsLib.animejsMod.animeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeAnimParams
  extends /* AnyAnimatedProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var begin: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var complete: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var delay: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var duration: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var easing: js.UndefOr[EasingOptions | java.lang.String | js.Array[scala.Double]] = js.undefined
  var elasticity: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var round: js.UndefOr[scala.Double | scala.Boolean | animejsLib.FunctionBasedParameter] = js.undefined
  var run: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var targets: animejsLib.AnimeTarget | js.Array[animejsLib.AnimeTarget]
  var update: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
}

