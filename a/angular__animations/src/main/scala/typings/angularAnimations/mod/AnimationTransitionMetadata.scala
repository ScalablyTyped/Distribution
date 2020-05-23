package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTransitionMetadata extends AnimationMetadata {
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
    /* element */ js.UndefOr[js.Any], 
    /* params */ js.UndefOr[StringDictionary[js.Any]], 
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
    `type`: AnimationMetadataType,
    options: AnimationOptions = null
  ): AnimationTransitionMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransitionMetadata]
  }
}

