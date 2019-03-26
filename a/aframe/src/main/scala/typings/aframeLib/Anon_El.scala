package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_El extends js.Object {
  var el: stdLib.Element | (aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
  ])
}

object Anon_El {
  @scala.inline
  def apply(
    el: stdLib.Element | (aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ])
  ): Anon_El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_El]
  }
}

