package typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableContainerNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableContainer
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.DrawableContainer.DrawableContainerState")
@js.native
class DrawableContainerState protected () extends ConstantState {
  def this(orig: DrawableContainerState, owner: DrawableContainer) = this()
  var mAutoMirrored: Boolean = js.native
  var mCanConstantState: Boolean = js.native
  var mCheckedConstantState: Boolean = js.native
  var mCheckedOpacity: Boolean = js.native
  var mCheckedStateful: Boolean = js.native
  var mComputedConstantSize: Boolean = js.native
  var mConstantHeight: Double = js.native
  var mConstantMinimumHeight: Double = js.native
  var mConstantMinimumWidth: Double = js.native
  var mConstantPadding: Rect = js.native
  var mConstantSize: Boolean = js.native
  var mConstantWidth: Double = js.native
  var mDither: Boolean = js.native
  var mDrawableFutures: js.Any = js.native
  var mDrawables: js.Array[Drawable] = js.native
  var mEnterFadeDuration: Double = js.native
  var mExitFadeDuration: Double = js.native
  var mMutated: Boolean = js.native
  val mNumChildren: Double = js.native
  var mOpacity: Double = js.native
  var mOwner: DrawableContainer = js.native
  var mPaddingChecked: Boolean = js.native
  var mStateful: Boolean = js.native
  var mVariablePadding: Boolean = js.native
  def addChild(dr: Drawable): Double = js.native
  def canConstantState(): Boolean = js.native
  def computeConstantSize(): Unit = js.native
  /* private */ def createAllFutures(): js.Any = js.native
  def getCapacity(): Double = js.native
  def getChild(index: Double): Drawable = js.native
  def getChildCount(): Double = js.native
  def getChildren(): js.Array[Drawable] = js.native
  def getConstantHeight(): Double = js.native
  def getConstantMinimumHeight(): Double = js.native
  def getConstantMinimumWidth(): Double = js.native
  def getConstantPadding(): Rect = js.native
  def getConstantWidth(): Double = js.native
  def getEnterFadeDuration(): Double = js.native
  def getExitFadeDuration(): Double = js.native
  def getOpacity(): Double = js.native
  def isConstantSize(): Boolean = js.native
  def isStateful(): Boolean = js.native
  def mutate(): Unit = js.native
  /* CompleteClass */
  override def newDrawable(): Drawable = js.native
  def setConstantSize(constant: Boolean): Unit = js.native
  def setEnterFadeDuration(duration: Double): Unit = js.native
  def setExitFadeDuration(duration: Double): Unit = js.native
  def setVariablePadding(variable: Boolean): Unit = js.native
}

