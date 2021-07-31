package typings.aframe.anon

import typings.three.animationClipMod.AnimationClip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationUtils extends StObject {
  
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
  
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
  
  def flattenJSON(
    jsonKeys: js.Array[String],
    times: js.Array[js.Any],
    values: js.Array[js.Any],
    valuePropertyName: String
  ): Unit = js.native
  
  def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
  
  def isTypedArray(`object`: js.Any): Boolean = js.native
  
  def makeClipAdditive(targetClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: Unit, fps: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip, fps: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Unit, referenceClip: Unit, fps: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Unit, referenceClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Unit, referenceClip: AnimationClip, fps: Double): AnimationClip = js.native
  
  def sortedArray(values: js.Array[js.Any], stride: Double, order: js.Array[Double]): js.Array[js.Any] = js.native
  
  def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double): AnimationClip = js.native
  def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double, fps: Double): AnimationClip = js.native
}
