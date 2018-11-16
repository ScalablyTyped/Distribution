package typings
package androiduixLib.androidNs.graphicsNs.drawableNs.DrawableContainerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.DrawableContainer.DrawableContainerState")
@js.native
class DrawableContainerState protected ()
  extends androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState {
  def this(orig: DrawableContainerState, owner: androiduixLib.androidNs.graphicsNs.drawableNs.DrawableContainer) = this()
  var mAutoMirrored: scala.Boolean = js.native
  var mCanConstantState: scala.Boolean = js.native
  var mCheckedConstantState: scala.Boolean = js.native
  var mCheckedOpacity: scala.Boolean = js.native
  var mCheckedStateful: scala.Boolean = js.native
  var mComputedConstantSize: scala.Boolean = js.native
  var mConstantHeight: scala.Double = js.native
  var mConstantMinimumHeight: scala.Double = js.native
  var mConstantMinimumWidth: scala.Double = js.native
  var mConstantPadding: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mConstantSize: scala.Boolean = js.native
  var mConstantWidth: scala.Double = js.native
  var mDither: scala.Boolean = js.native
  var mDrawableFutures: js.Any = js.native
  var mDrawables: js.Array[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable] = js.native
  var mEnterFadeDuration: scala.Double = js.native
  var mExitFadeDuration: scala.Double = js.native
  var mMutated: scala.Boolean = js.native
  val mNumChildren: scala.Double = js.native
  var mOpacity: scala.Double = js.native
  var mOwner: androiduixLib.androidNs.graphicsNs.drawableNs.DrawableContainer = js.native
  var mPaddingChecked: scala.Boolean = js.native
  var mStateful: scala.Boolean = js.native
  var mVariablePadding: scala.Boolean = js.native
  def addChild(dr: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Double = js.native
  def canConstantState(): scala.Boolean = js.native
  def computeConstantSize(): scala.Unit = js.native
  /* private */ def createAllFutures(): js.Any = js.native
  def getCapacity(): scala.Double = js.native
  def getChild(index: scala.Double): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getChildCount(): scala.Double = js.native
  def getChildren(): js.Array[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable] = js.native
  def getConstantHeight(): scala.Double = js.native
  def getConstantMinimumHeight(): scala.Double = js.native
  def getConstantMinimumWidth(): scala.Double = js.native
  def getConstantPadding(): androiduixLib.androidNs.graphicsNs.Rect = js.native
  def getConstantWidth(): scala.Double = js.native
  def getEnterFadeDuration(): scala.Double = js.native
  def getExitFadeDuration(): scala.Double = js.native
  def getOpacity(): scala.Double = js.native
  def isConstantSize(): scala.Boolean = js.native
  def isStateful(): scala.Boolean = js.native
  def mutate(): scala.Unit = js.native
  /* CompleteClass */
  override def newDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def setConstantSize(constant: scala.Boolean): scala.Unit = js.native
  def setEnterFadeDuration(duration: scala.Double): scala.Unit = js.native
  def setExitFadeDuration(duration: scala.Double): scala.Unit = js.native
  def setVariablePadding(variable: scala.Boolean): scala.Unit = js.native
}

