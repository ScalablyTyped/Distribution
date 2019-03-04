package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detail[D] extends js.Object {
  var detail: D
  var target: stdLib.EventTarget with (aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
  ])
}

object Anon_Detail {
  @scala.inline
  def apply[D](
    detail: D,
    target: stdLib.EventTarget with (aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ])
  ): Anon_Detail[D] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target)
  
    __obj.asInstanceOf[Anon_Detail[D]]
  }
}

