package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTransitionMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * One or more animation objects to which this transition applies.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  
  /**
    * An expression that describes a state change.
    */
  var expr: String | (js.Function4[
    /* fromState */ String, 
    /* toState */ String, 
    /* element */ js.UndefOr[Any], 
    /* params */ js.UndefOr[StringDictionary[Any]], 
    Boolean
  ])
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
}
object AnimationTransitionMetadata {
  
  inline def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    expr: String | (js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[Any], 
      /* params */ js.UndefOr[StringDictionary[Any]], 
      Boolean
    ]),
    `type`: AnimationMetadataType
  ): AnimationTransitionMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransitionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationTransitionMetadata] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value*))
    
    inline def setExpr(
      value: String | (js.Function4[
          /* fromState */ String, 
          /* toState */ String, 
          /* element */ js.UndefOr[Any], 
          /* params */ js.UndefOr[StringDictionary[Any]], 
          Boolean
        ])
    ): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprFunction4(
      value: (/* fromState */ String, /* toState */ String, /* element */ js.UndefOr[Any], /* params */ js.UndefOr[StringDictionary[Any]]) => Boolean
    ): Self = StObject.set(x, "expr", js.Any.fromFunction4(value))
    
    inline def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
