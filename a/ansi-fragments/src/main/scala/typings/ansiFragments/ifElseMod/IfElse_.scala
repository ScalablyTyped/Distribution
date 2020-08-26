package typings.ansiFragments.ifElseMod

import typings.ansiFragments.ifragmentMod.IFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-fragments/build/fragments/IfElse", "IfElse")
@js.native
class IfElse_ protected () extends IFragment {
  def this(condition: Condition, ifTrueFragment: String) = this()
  def this(condition: Condition, ifTrueFragment: IFragment) = this()
  def this(condition: Condition, ifTrueFragment: String, elseFragment: String) = this()
  def this(condition: Condition, ifTrueFragment: String, elseFragment: IFragment) = this()
  def this(condition: Condition, ifTrueFragment: IFragment, elseFragment: String) = this()
  def this(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment) = this()
  val condition: js.Any = js.native
  val elseFragment: js.Any = js.native
  val ifTrueFragment: js.Any = js.native
}

