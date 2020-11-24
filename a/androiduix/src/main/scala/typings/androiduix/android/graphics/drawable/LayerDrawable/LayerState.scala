package typings.androiduix.android.graphics.drawable.LayerDrawable

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerState extends ConstantState {
  
  def canConstantState(): Boolean = js.native
  
  def getOpacity(): Double = js.native
  
  def isStateful(): Boolean = js.native
  
  var mAutoMirrored: js.Any = js.native
  
  var mCanConstantState: js.Any = js.native
  
  var mCheckedConstantState: js.Any = js.native
  
  var mChildren: js.Array[ChildDrawable] = js.native
  
  var mHaveOpacity: js.Any = js.native
  
  var mHaveStateful: js.Any = js.native
  
  var mNum: Double = js.native
  
  var mOpacity: js.Any = js.native
  
  var mStateful: js.Any = js.native
}
object LayerState {
  
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    getOpacity: () => Double,
    isStateful: () => Boolean,
    mAutoMirrored: js.Any,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mChildren: js.Array[ChildDrawable],
    mHaveOpacity: js.Any,
    mHaveStateful: js.Any,
    mNum: Double,
    mOpacity: js.Any,
    mStateful: js.Any,
    newDrawable: () => Drawable
  ): LayerState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), getOpacity = js.Any.fromFunction0(getOpacity), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mChildren = mChildren.asInstanceOf[js.Any], mHaveOpacity = mHaveOpacity.asInstanceOf[js.Any], mHaveStateful = mHaveStateful.asInstanceOf[js.Any], mNum = mNum.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[LayerState]
  }
  
  @scala.inline
  implicit class LayerStateOps[Self <: LayerState] (val x: Self) extends AnyVal {
    
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
    def setCanConstantState(value: () => Boolean): Self = this.set("canConstantState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpacity(value: () => Double): Self = this.set("getOpacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStateful(value: () => Boolean): Self = this.set("isStateful", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAutoMirrored(value: js.Any): Self = this.set("mAutoMirrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCanConstantState(value: js.Any): Self = this.set("mCanConstantState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCheckedConstantState(value: js.Any): Self = this.set("mCheckedConstantState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMChildrenVarargs(value: ChildDrawable*): Self = this.set("mChildren", js.Array(value :_*))
    
    @scala.inline
    def setMChildren(value: js.Array[ChildDrawable]): Self = this.set("mChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHaveOpacity(value: js.Any): Self = this.set("mHaveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHaveStateful(value: js.Any): Self = this.set("mHaveStateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNum(value: Double): Self = this.set("mNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOpacity(value: js.Any): Self = this.set("mOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMStateful(value: js.Any): Self = this.set("mStateful", value.asInstanceOf[js.Any])
  }
}
