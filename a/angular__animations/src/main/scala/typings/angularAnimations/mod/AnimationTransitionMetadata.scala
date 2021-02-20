package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTransitionMetadata extends AnimationMetadata {
  
  /**
    * One or more animation objects to which this transition applies.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  
  /**
    * An expression that describes a state change.
    */
  var expr: String | (js.Function4[
    /* fromState */ String, 
    /* toState */ String, 
    /* element */ js.UndefOr[js.Any], 
    /* params */ js.UndefOr[StringDictionary[js.Any]], 
    Boolean
  ]) = js.native
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
}
object AnimationTransitionMetadata {
  
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    expr: String | (js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ]),
    `type`: AnimationMetadataType
  ): AnimationTransitionMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransitionMetadata]
  }
  
  @scala.inline
  implicit class AnimationTransitionMetadataMutableBuilder[Self <: AnimationTransitionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value :_*))
    
    @scala.inline
    def setExpr(
      value: String | (js.Function4[
          /* fromState */ String, 
          /* toState */ String, 
          /* element */ js.UndefOr[js.Any], 
          /* params */ js.UndefOr[StringDictionary[js.Any]], 
          Boolean
        ])
    ): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprFunction4(
      value: (/* fromState */ String, /* toState */ String, /* element */ js.UndefOr[js.Any], /* params */ js.UndefOr[StringDictionary[js.Any]]) => Boolean
    ): Self = StObject.set(x, "expr", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
