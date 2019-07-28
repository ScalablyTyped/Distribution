package typings.atAngularAnimations.atAngularAnimationsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularAnimations.Anon_Name
import typings.atAngularAnimations.atAngularAnimationsStrings.`!`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AUTO_STYLE: typings.atAngularAnimations.atAngularAnimationsStrings.`*` = js.native
  val ɵPRE_STYLE: `!` = js.native
  def animate(timings: String): AnimationAnimateMetadata = js.native
  def animate(timings: String, styles: AnimationKeyframesSequenceMetadata): AnimationAnimateMetadata = js.native
  def animate(timings: String, styles: AnimationStyleMetadata): AnimationAnimateMetadata = js.native
  def animate(timings: Double): AnimationAnimateMetadata = js.native
  def animate(timings: Double, styles: AnimationKeyframesSequenceMetadata): AnimationAnimateMetadata = js.native
  def animate(timings: Double, styles: AnimationStyleMetadata): AnimationAnimateMetadata = js.native
  def animateChild(): AnimationAnimateChildMetadata = js.native
  def animateChild(options: AnimateChildOptions): AnimationAnimateChildMetadata = js.native
  def animation(steps: js.Array[AnimationMetadata]): AnimationReferenceMetadata = js.native
  def animation(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationReferenceMetadata = js.native
  def animation(steps: AnimationMetadata): AnimationReferenceMetadata = js.native
  def animation(steps: AnimationMetadata, options: AnimationOptions): AnimationReferenceMetadata = js.native
  def group(steps: js.Array[AnimationMetadata]): AnimationGroupMetadata = js.native
  def group(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationGroupMetadata = js.native
  def keyframes(steps: js.Array[AnimationStyleMetadata]): AnimationKeyframesSequenceMetadata = js.native
  def query(selector: String, animation: js.Array[AnimationMetadata]): AnimationQueryMetadata = js.native
  def query(selector: String, animation: js.Array[AnimationMetadata], options: AnimationQueryOptions): AnimationQueryMetadata = js.native
  def query(selector: String, animation: AnimationMetadata): AnimationQueryMetadata = js.native
  def query(selector: String, animation: AnimationMetadata, options: AnimationQueryOptions): AnimationQueryMetadata = js.native
  def sequence(steps: js.Array[AnimationMetadata]): AnimationSequenceMetadata = js.native
  def sequence(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationSequenceMetadata = js.native
  def stagger(timings: String, animation: js.Array[AnimationMetadata]): AnimationStaggerMetadata = js.native
  def stagger(timings: String, animation: AnimationMetadata): AnimationStaggerMetadata = js.native
  def stagger(timings: Double, animation: js.Array[AnimationMetadata]): AnimationStaggerMetadata = js.native
  def stagger(timings: Double, animation: AnimationMetadata): AnimationStaggerMetadata = js.native
  def state(name: String, styles: AnimationStyleMetadata): AnimationStateMetadata = js.native
  def state(name: String, styles: AnimationStyleMetadata, options: Anon_Name): AnimationStateMetadata = js.native
  def style(
    tokens: js.Array[
      typings.atAngularAnimations.atAngularAnimationsStrings.`*` | (StringDictionary[String | Double])
    ]
  ): AnimationStyleMetadata = js.native
  def style(tokens: StringDictionary[String | Double]): AnimationStyleMetadata = js.native
  def style(tokens: typings.atAngularAnimations.atAngularAnimationsStrings.`*`): AnimationStyleMetadata = js.native
  def transition(stateChangeExpr: String, steps: js.Array[AnimationMetadata]): AnimationTransitionMetadata = js.native
  def transition(stateChangeExpr: String, steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationTransitionMetadata = js.native
  def transition(stateChangeExpr: String, steps: AnimationMetadata): AnimationTransitionMetadata = js.native
  def transition(stateChangeExpr: String, steps: AnimationMetadata, options: AnimationOptions): AnimationTransitionMetadata = js.native
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      js.UndefOr[js.Any], 
      js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ],
    steps: js.Array[AnimationMetadata]
  ): AnimationTransitionMetadata = js.native
  def transition(
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
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      js.UndefOr[js.Any], 
      js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ],
    steps: AnimationMetadata
  ): AnimationTransitionMetadata = js.native
  def transition(
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
  def trigger(name: String, definitions: js.Array[AnimationMetadata]): AnimationTriggerMetadata = js.native
  def useAnimation(animation: AnimationReferenceMetadata): AnimationAnimateRefMetadata = js.native
  def useAnimation(animation: AnimationReferenceMetadata, options: AnimationOptions): AnimationAnimateRefMetadata = js.native
}

