package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAnimationClip
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AnimationClip] {
  def CreateClipsFromMorphTargetSequences(
    morphTargets: js.Array[threeLib.srcCoreGeometryMod.MorphTarget],
    fps: scala.Double,
    noLoop: scala.Boolean
  ): js.Array[threeLib.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(
    name: java.lang.String,
    morphTargetSequence: js.Array[threeLib.srcCoreGeometryMod.MorphTarget],
    fps: scala.Double,
    noLoop: scala.Boolean
  ): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[threeLib.srcAnimationAnimationClipMod.AnimationClip], name: java.lang.String): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parse(json: js.Any): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[threeLib.srcObjectsBoneMod.Bone], nodeName: java.lang.String): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

