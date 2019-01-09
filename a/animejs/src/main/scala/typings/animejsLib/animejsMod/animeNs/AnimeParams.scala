package typings
package animejsLib.animejsMod.animeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- animejsLib.animejsMod.animeNs.AnimeAnimParams because var conflicts: begin, complete, run, update. Inlined targets, duration, delay, elasticity, round, easing */ trait AnimeParams extends AnimeInstanceParams {
  var delay: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var duration: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var easing: js.UndefOr[EasingOptions | java.lang.String | js.Array[scala.Double]] = js.undefined
  var elasticity: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var round: js.UndefOr[scala.Double | scala.Boolean | animejsLib.FunctionBasedParameter] = js.undefined
  var targets: animejsLib.AnimeTarget | js.Array[animejsLib.AnimeTarget]
}

