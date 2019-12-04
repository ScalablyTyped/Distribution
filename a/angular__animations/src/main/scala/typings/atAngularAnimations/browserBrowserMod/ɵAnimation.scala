package typings.atAngularAnimations.browserBrowserMod

import typings.atAngularAnimations.atAngularAnimationsMod.AnimationMetadata
import typings.atAngularAnimations.atAngularAnimationsMod.AnimationOptions
import typings.atAngularAnimations.atAngularAnimationsMod.ɵStyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/browser", "ɵAnimation")
@js.native
class ɵAnimation protected () extends js.Object {
  def this(_driver: AnimationDriver, input: js.Array[AnimationMetadata]) = this()
  def this(_driver: AnimationDriver, input: AnimationMetadata) = this()
  var _animationAst: js.Any = js.native
  var _driver: js.Any = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: js.Array[ɵStyleData],
    destinationStyles: js.Array[ɵStyleData],
    options: AnimationOptions
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: js.Array[ɵStyleData],
    destinationStyles: js.Array[ɵStyleData],
    options: AnimationOptions,
    subInstructions: ElementInstructionMap
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: js.Array[ɵStyleData],
    destinationStyles: ɵStyleData,
    options: AnimationOptions
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: js.Array[ɵStyleData],
    destinationStyles: ɵStyleData,
    options: AnimationOptions,
    subInstructions: ElementInstructionMap
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: ɵStyleData,
    destinationStyles: js.Array[ɵStyleData],
    options: AnimationOptions
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: ɵStyleData,
    destinationStyles: js.Array[ɵStyleData],
    options: AnimationOptions,
    subInstructions: ElementInstructionMap
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: ɵStyleData,
    destinationStyles: ɵStyleData,
    options: AnimationOptions
  ): js.Array[AnimationTimelineInstruction] = js.native
  def buildTimelines(
    element: js.Any,
    startingStyles: ɵStyleData,
    destinationStyles: ɵStyleData,
    options: AnimationOptions,
    subInstructions: ElementInstructionMap
  ): js.Array[AnimationTimelineInstruction] = js.native
}

