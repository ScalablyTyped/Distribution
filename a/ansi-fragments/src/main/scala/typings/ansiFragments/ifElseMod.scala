package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifElseMod {
  
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
  
  @JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
  @js.native
  def ifElse(condition: Condition, ifTrueFragment: String): IfElse_ = js.native
  @JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
  @js.native
  def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: String): IfElse_ = js.native
  @JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
  @js.native
  def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: IFragment): IfElse_ = js.native
  @JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
  @js.native
  def ifElse(condition: Condition, ifTrueFragment: IFragment): IfElse_ = js.native
  @JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
  @js.native
  def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: String): IfElse_ = js.native
  @JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
  @js.native
  def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment): IfElse_ = js.native
  
  type Condition = ConditionValue | js.Function0[ConditionValue]
  
  type ConditionValue = js.UndefOr[Boolean | String | Double | Null]
}
