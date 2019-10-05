package typings.atAngularAnimations.atAngularAnimationsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations", "transition")
@js.native
object transition extends js.Object {
  def apply(stateChangeExpr: String, steps: js.Array[AnimationMetadata]): AnimationTransitionMetadata = js.native
  def apply(stateChangeExpr: String, steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationTransitionMetadata = js.native
  def apply(stateChangeExpr: String, steps: AnimationMetadata): AnimationTransitionMetadata = js.native
  def apply(stateChangeExpr: String, steps: AnimationMetadata, options: AnimationOptions): AnimationTransitionMetadata = js.native
  def apply(
    stateChangeExpr: js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ],
    steps: js.Array[AnimationMetadata]
  ): AnimationTransitionMetadata = js.native
  def apply(
    stateChangeExpr: js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ],
    steps: js.Array[AnimationMetadata],
    options: AnimationOptions
  ): AnimationTransitionMetadata = js.native
  def apply(
    stateChangeExpr: js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ],
    steps: AnimationMetadata
  ): AnimationTransitionMetadata = js.native
  def apply(
    stateChangeExpr: js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ],
    steps: AnimationMetadata,
    options: AnimationOptions
  ): AnimationTransitionMetadata = js.native
}

