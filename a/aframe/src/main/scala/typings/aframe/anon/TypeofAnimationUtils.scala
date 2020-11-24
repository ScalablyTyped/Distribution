package typings.aframe.anon

import typings.three.animationClipMod.AnimationClip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationUtils extends js.Object {
  
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
  
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
  
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit = js.native
  
  def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
  
  def isTypedArray(`object`: js.Any): Boolean = js.native
  
  def makeClipAdditive(targetClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(
    targetClip: AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: js.UndefOr[scala.Nothing],
    fps: Double
  ): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: js.UndefOr[scala.Nothing], referenceClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(
    targetClip: AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: AnimationClip,
    fps: Double
  ): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double): AnimationClip = js.native
  def makeClipAdditive(
    targetClip: AnimationClip,
    referenceFrame: Double,
    referenceClip: js.UndefOr[scala.Nothing],
    fps: Double
  ): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip, fps: Double): AnimationClip = js.native
  
  def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_] = js.native
  
  def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double): AnimationClip = js.native
  def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double, fps: Double): AnimationClip = js.native
}
