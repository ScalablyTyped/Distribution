package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

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
  var expr: java.lang.String | (js.Function4[
    /* fromState */ java.lang.String, 
    /* toState */ java.lang.String, 
    /* element */ js.UndefOr[js.Any], 
    /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    scala.Boolean
  ])
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | scala.Null
}

object AnimationTransitionMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    expr: java.lang.String | (js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ]),
    `type`: AnimationMetadataType,
    options: AnimationOptions = null
  ): AnimationTransitionMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationTransitionMetadata]
  }
}

