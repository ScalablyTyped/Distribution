package typings.ansiFragments.colorMod

import typings.ansiFragments.ifragmentMod.IFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ansi-fragments/build/fragments/Color", "color")
@js.native
object color extends js.Object {
  
  def apply(ansiColor: AnsiColor, children: (String | IFragment)*): Color_ = js.native
}
