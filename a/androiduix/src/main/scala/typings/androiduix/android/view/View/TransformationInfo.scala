package typings.androiduix.android.view.View

import typings.androiduix.android.graphics.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationInfo extends js.Object {
  
  var mAlpha: Double = js.native
  
  var mInverseMatrix: js.Any = js.native
  
  var mInverseMatrixDirty: Boolean = js.native
  
  var mMatrix: Matrix = js.native
  
  var mMatrixDirty: Boolean = js.native
  
  var mMatrixIsIdentity: Boolean = js.native
  
  var mPivotX: Double = js.native
  
  var mPivotY: Double = js.native
  
  var mPrevHeight: Double = js.native
  
  var mPrevWidth: Double = js.native
  
  var mRotation: Double = js.native
  
  var mScaleX: Double = js.native
  
  var mScaleY: Double = js.native
  
  var mTransitionAlpha: Double = js.native
  
  var mTranslationX: Double = js.native
  
  var mTranslationY: Double = js.native
}
object TransformationInfo {
  
  @scala.inline
  def apply(
    mAlpha: Double,
    mInverseMatrix: js.Any,
    mInverseMatrixDirty: Boolean,
    mMatrix: Matrix,
    mMatrixDirty: Boolean,
    mMatrixIsIdentity: Boolean,
    mPivotX: Double,
    mPivotY: Double,
    mPrevHeight: Double,
    mPrevWidth: Double,
    mRotation: Double,
    mScaleX: Double,
    mScaleY: Double,
    mTransitionAlpha: Double,
    mTranslationX: Double,
    mTranslationY: Double
  ): TransformationInfo = {
    val __obj = js.Dynamic.literal(mAlpha = mAlpha.asInstanceOf[js.Any], mInverseMatrix = mInverseMatrix.asInstanceOf[js.Any], mInverseMatrixDirty = mInverseMatrixDirty.asInstanceOf[js.Any], mMatrix = mMatrix.asInstanceOf[js.Any], mMatrixDirty = mMatrixDirty.asInstanceOf[js.Any], mMatrixIsIdentity = mMatrixIsIdentity.asInstanceOf[js.Any], mPivotX = mPivotX.asInstanceOf[js.Any], mPivotY = mPivotY.asInstanceOf[js.Any], mPrevHeight = mPrevHeight.asInstanceOf[js.Any], mPrevWidth = mPrevWidth.asInstanceOf[js.Any], mRotation = mRotation.asInstanceOf[js.Any], mScaleX = mScaleX.asInstanceOf[js.Any], mScaleY = mScaleY.asInstanceOf[js.Any], mTransitionAlpha = mTransitionAlpha.asInstanceOf[js.Any], mTranslationX = mTranslationX.asInstanceOf[js.Any], mTranslationY = mTranslationY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationInfo]
  }
  
  @scala.inline
  implicit class TransformationInfoOps[Self <: TransformationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMAlpha(value: Double): Self = this.set("mAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInverseMatrix(value: js.Any): Self = this.set("mInverseMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInverseMatrixDirty(value: Boolean): Self = this.set("mInverseMatrixDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMatrix(value: Matrix): Self = this.set("mMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMatrixDirty(value: Boolean): Self = this.set("mMatrixDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMatrixIsIdentity(value: Boolean): Self = this.set("mMatrixIsIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPivotX(value: Double): Self = this.set("mPivotX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPivotY(value: Double): Self = this.set("mPivotY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevHeight(value: Double): Self = this.set("mPrevHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevWidth(value: Double): Self = this.set("mPrevWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRotation(value: Double): Self = this.set("mRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScaleX(value: Double): Self = this.set("mScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScaleY(value: Double): Self = this.set("mScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTransitionAlpha(value: Double): Self = this.set("mTransitionAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTranslationX(value: Double): Self = this.set("mTranslationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTranslationY(value: Double): Self = this.set("mTranslationY", value.asInstanceOf[js.Any])
  }
}
