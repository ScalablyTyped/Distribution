package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElAny extends js.Object {
  var el: stdLib.Element | (aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
  ])
}

object Anon_ElAny {
  @scala.inline
  def apply(
    el: stdLib.Element | (aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ])
  ): Anon_ElAny = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ElAny]
  }
}

