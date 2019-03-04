package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMeshMixin extends js.Object {
  var primitives: aframeLib.aframeMod.ObjectMap[
    aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ]
  ]
  def getMeshMixin(): Anon_DefaultComponents
}

object Anon_GetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: js.Function0[Anon_DefaultComponents],
    primitives: aframeLib.aframeMod.ObjectMap[
      aframeLib.aframeMod.Entity[
        aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
      ]
    ]
  ): Anon_GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = getMeshMixin, primitives = primitives)
  
    __obj.asInstanceOf[Anon_GetMeshMixin]
  }
}

