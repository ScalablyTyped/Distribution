package typings.aframe

import org.scalablytyped.runtime.Instantiable0
import typings.three.srcCoreGeometryMod.MorphTarget
import typings.three.srcObjectsBoneMod.Bone
import typings.three.threeMod.AnimationClip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAnimationClip extends Instantiable0[AnimationClip] {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typings.three.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[typings.three.srcAnimationAnimationClipMod.AnimationClip], name: String): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parse(json: js.Any): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[Bone], nodeName: String): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

