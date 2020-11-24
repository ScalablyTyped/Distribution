package typings.ansiFragments.fixedMod

import typings.ansiFragments.ifragmentMod.IFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ansi-fragments/build/fragments/Fixed", "fixed")
@js.native
object fixed extends js.Object {
  
  def apply(value: Double, bias: Bias, children: (String | IFragment)*): Fixed_ = js.native
}
