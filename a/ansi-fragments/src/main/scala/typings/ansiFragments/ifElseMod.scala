package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifElseMod {
  
  @JSImport("ansi-fragments/build/fragments/IfElse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/IfElse", "IfElse")
  @js.native
  class IfElse_ protected ()
    extends StObject
       with IFragment {
    def this(condition: Condition, ifTrueFragment: String) = this()
    def this(condition: Condition, ifTrueFragment: IFragment) = this()
    def this(condition: Condition, ifTrueFragment: String, elseFragment: String) = this()
    def this(condition: Condition, ifTrueFragment: String, elseFragment: IFragment) = this()
    def this(condition: Condition, ifTrueFragment: IFragment, elseFragment: String) = this()
    def this(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val condition: js.Any = js.native
    
    /* private */ val elseFragment: js.Any = js.native
    
    /* private */ val ifTrueFragment: js.Any = js.native
  }
  
  inline def ifElse(condition: Condition, ifTrueFragment: String): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: String): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: IFragment): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: IFragment): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: String): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  
  type Condition = ConditionValue | js.Function0[ConditionValue]
  
  type ConditionValue = js.UndefOr[Boolean | String | Double | Null]
}
