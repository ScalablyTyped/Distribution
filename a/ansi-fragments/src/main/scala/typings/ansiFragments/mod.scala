package typings.ansiFragments

import typings.ansiFragments.colorMod.AnsiColor
import typings.ansiFragments.colorMod.Color_
import typings.ansiFragments.containerMod.Container_
import typings.ansiFragments.fixedMod.Bias
import typings.ansiFragments.fixedMod.Fixed_
import typings.ansiFragments.ifElseMod.Condition
import typings.ansiFragments.ifElseMod.IfElse_
import typings.ansiFragments.ifragmentMod.IFragment
import typings.ansiFragments.modifierMod.AnsiModifier
import typings.ansiFragments.modifierMod.Modifier_
import typings.ansiFragments.padMod.Pad_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ansi-fragments/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def color(ansiColor: AnsiColor, children: (String | IFragment)*): Color_ = js.native
  
  def container(children: (String | IFragment)*): Container_ = js.native
  
  def fixed(value: Double, bias: Bias, children: (String | IFragment)*): Fixed_ = js.native
  
  def ifElse(condition: Condition, ifTrueFragment: String): IfElse_ = js.native
  def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: String): IfElse_ = js.native
  def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: IFragment): IfElse_ = js.native
  def ifElse(condition: Condition, ifTrueFragment: IFragment): IfElse_ = js.native
  def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: String): IfElse_ = js.native
  def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment): IfElse_ = js.native
  
  def modifier(ansiModifier: AnsiModifier, children: (String | IFragment)*): Modifier_ = js.native
  
  def pad(count: Double): Pad_ = js.native
  def pad(count: Double, separator: String): Pad_ = js.native
}
