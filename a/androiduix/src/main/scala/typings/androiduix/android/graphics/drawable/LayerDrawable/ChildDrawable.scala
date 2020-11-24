package typings.androiduix.android.graphics.drawable.LayerDrawable

import typings.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildDrawable extends js.Object {
  
  var mDrawable: Drawable = js.native
  
  var mId: String = js.native
  
  var mInsetB: Double = js.native
  
  var mInsetL: Double = js.native
  
  var mInsetR: Double = js.native
  
  var mInsetT: Double = js.native
}
object ChildDrawable {
  
  @scala.inline
  def apply(
    mDrawable: Drawable,
    mId: String,
    mInsetB: Double,
    mInsetL: Double,
    mInsetR: Double,
    mInsetT: Double
  ): ChildDrawable = {
    val __obj = js.Dynamic.literal(mDrawable = mDrawable.asInstanceOf[js.Any], mId = mId.asInstanceOf[js.Any], mInsetB = mInsetB.asInstanceOf[js.Any], mInsetL = mInsetL.asInstanceOf[js.Any], mInsetR = mInsetR.asInstanceOf[js.Any], mInsetT = mInsetT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildDrawable]
  }
  
  @scala.inline
  implicit class ChildDrawableOps[Self <: ChildDrawable] (val x: Self) extends AnyVal {
    
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
    def setMDrawable(value: Drawable): Self = this.set("mDrawable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMId(value: String): Self = this.set("mId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInsetB(value: Double): Self = this.set("mInsetB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInsetL(value: Double): Self = this.set("mInsetL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInsetR(value: Double): Self = this.set("mInsetR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInsetT(value: Double): Self = this.set("mInsetT", value.asInstanceOf[js.Any])
  }
}
