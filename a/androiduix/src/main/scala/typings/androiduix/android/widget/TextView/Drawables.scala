package typings.androiduix.android.widget.TextView

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawables extends js.Object {
  var mCompoundRect: Rect = js.native
  var mDrawableBottom: Drawable = js.native
  var mDrawableEnd: Drawable = js.native
  var mDrawableError: Drawable = js.native
  var mDrawableHeightEnd: Double = js.native
  var mDrawableHeightError: Double = js.native
  var mDrawableHeightLeft: Double = js.native
  var mDrawableHeightRight: Double = js.native
  var mDrawableHeightStart: Double = js.native
  var mDrawableHeightTemp: Double = js.native
  var mDrawableLeft: Drawable = js.native
  var mDrawableLeftInitial: Drawable = js.native
  var mDrawablePadding: Double = js.native
  var mDrawableRight: Drawable = js.native
  var mDrawableRightInitial: Drawable = js.native
  var mDrawableSaved: Double = js.native
  var mDrawableSizeBottom: Double = js.native
  var mDrawableSizeEnd: Double = js.native
  var mDrawableSizeError: Double = js.native
  var mDrawableSizeLeft: Double = js.native
  var mDrawableSizeRight: Double = js.native
  var mDrawableSizeStart: Double = js.native
  var mDrawableSizeTemp: Double = js.native
  var mDrawableSizeTop: Double = js.native
  var mDrawableStart: Drawable = js.native
  var mDrawableTemp: Drawable = js.native
  var mDrawableTop: Drawable = js.native
  var mDrawableWidthBottom: Double = js.native
  var mDrawableWidthTop: Double = js.native
  var mIsRtlCompatibilityMode: Boolean = js.native
  var mOverride: Boolean = js.native
  /* private */ def applyErrorDrawableIfNeeded(layoutDirection: js.Any): js.Any = js.native
  def resolveWithLayoutDirection(layoutDirection: Double): Unit = js.native
  def setErrorDrawable(dr: Drawable, tv: typings.androiduix.android.widget.TextView): Unit = js.native
  /* private */ def updateDrawablesLayoutDirection(layoutDirection: js.Any): js.Any = js.native
}

object Drawables {
  @scala.inline
  def apply(
    applyErrorDrawableIfNeeded: js.Any => js.Any,
    mCompoundRect: Rect,
    mDrawableBottom: Drawable,
    mDrawableEnd: Drawable,
    mDrawableError: Drawable,
    mDrawableHeightEnd: Double,
    mDrawableHeightError: Double,
    mDrawableHeightLeft: Double,
    mDrawableHeightRight: Double,
    mDrawableHeightStart: Double,
    mDrawableHeightTemp: Double,
    mDrawableLeft: Drawable,
    mDrawableLeftInitial: Drawable,
    mDrawablePadding: Double,
    mDrawableRight: Drawable,
    mDrawableRightInitial: Drawable,
    mDrawableSaved: Double,
    mDrawableSizeBottom: Double,
    mDrawableSizeEnd: Double,
    mDrawableSizeError: Double,
    mDrawableSizeLeft: Double,
    mDrawableSizeRight: Double,
    mDrawableSizeStart: Double,
    mDrawableSizeTemp: Double,
    mDrawableSizeTop: Double,
    mDrawableStart: Drawable,
    mDrawableTemp: Drawable,
    mDrawableTop: Drawable,
    mDrawableWidthBottom: Double,
    mDrawableWidthTop: Double,
    mIsRtlCompatibilityMode: Boolean,
    mOverride: Boolean,
    resolveWithLayoutDirection: Double => Unit,
    setErrorDrawable: (Drawable, typings.androiduix.android.widget.TextView) => Unit,
    updateDrawablesLayoutDirection: js.Any => js.Any
  ): Drawables = {
    val __obj = js.Dynamic.literal(applyErrorDrawableIfNeeded = js.Any.fromFunction1(applyErrorDrawableIfNeeded), mCompoundRect = mCompoundRect.asInstanceOf[js.Any], mDrawableBottom = mDrawableBottom.asInstanceOf[js.Any], mDrawableEnd = mDrawableEnd.asInstanceOf[js.Any], mDrawableError = mDrawableError.asInstanceOf[js.Any], mDrawableHeightEnd = mDrawableHeightEnd.asInstanceOf[js.Any], mDrawableHeightError = mDrawableHeightError.asInstanceOf[js.Any], mDrawableHeightLeft = mDrawableHeightLeft.asInstanceOf[js.Any], mDrawableHeightRight = mDrawableHeightRight.asInstanceOf[js.Any], mDrawableHeightStart = mDrawableHeightStart.asInstanceOf[js.Any], mDrawableHeightTemp = mDrawableHeightTemp.asInstanceOf[js.Any], mDrawableLeft = mDrawableLeft.asInstanceOf[js.Any], mDrawableLeftInitial = mDrawableLeftInitial.asInstanceOf[js.Any], mDrawablePadding = mDrawablePadding.asInstanceOf[js.Any], mDrawableRight = mDrawableRight.asInstanceOf[js.Any], mDrawableRightInitial = mDrawableRightInitial.asInstanceOf[js.Any], mDrawableSaved = mDrawableSaved.asInstanceOf[js.Any], mDrawableSizeBottom = mDrawableSizeBottom.asInstanceOf[js.Any], mDrawableSizeEnd = mDrawableSizeEnd.asInstanceOf[js.Any], mDrawableSizeError = mDrawableSizeError.asInstanceOf[js.Any], mDrawableSizeLeft = mDrawableSizeLeft.asInstanceOf[js.Any], mDrawableSizeRight = mDrawableSizeRight.asInstanceOf[js.Any], mDrawableSizeStart = mDrawableSizeStart.asInstanceOf[js.Any], mDrawableSizeTemp = mDrawableSizeTemp.asInstanceOf[js.Any], mDrawableSizeTop = mDrawableSizeTop.asInstanceOf[js.Any], mDrawableStart = mDrawableStart.asInstanceOf[js.Any], mDrawableTemp = mDrawableTemp.asInstanceOf[js.Any], mDrawableTop = mDrawableTop.asInstanceOf[js.Any], mDrawableWidthBottom = mDrawableWidthBottom.asInstanceOf[js.Any], mDrawableWidthTop = mDrawableWidthTop.asInstanceOf[js.Any], mIsRtlCompatibilityMode = mIsRtlCompatibilityMode.asInstanceOf[js.Any], mOverride = mOverride.asInstanceOf[js.Any], resolveWithLayoutDirection = js.Any.fromFunction1(resolveWithLayoutDirection), setErrorDrawable = js.Any.fromFunction2(setErrorDrawable), updateDrawablesLayoutDirection = js.Any.fromFunction1(updateDrawablesLayoutDirection))
    __obj.asInstanceOf[Drawables]
  }
  @scala.inline
  implicit class DrawablesOps[Self <: Drawables] (val x: Self) extends AnyVal {
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
    def setApplyErrorDrawableIfNeeded(value: js.Any => js.Any): Self = this.set("applyErrorDrawableIfNeeded", js.Any.fromFunction1(value))
    @scala.inline
    def setMCompoundRect(value: Rect): Self = this.set("mCompoundRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableBottom(value: Drawable): Self = this.set("mDrawableBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableEnd(value: Drawable): Self = this.set("mDrawableEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableError(value: Drawable): Self = this.set("mDrawableError", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableHeightEnd(value: Double): Self = this.set("mDrawableHeightEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableHeightError(value: Double): Self = this.set("mDrawableHeightError", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableHeightLeft(value: Double): Self = this.set("mDrawableHeightLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableHeightRight(value: Double): Self = this.set("mDrawableHeightRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableHeightStart(value: Double): Self = this.set("mDrawableHeightStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableHeightTemp(value: Double): Self = this.set("mDrawableHeightTemp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableLeft(value: Drawable): Self = this.set("mDrawableLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableLeftInitial(value: Drawable): Self = this.set("mDrawableLeftInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawablePadding(value: Double): Self = this.set("mDrawablePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableRight(value: Drawable): Self = this.set("mDrawableRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableRightInitial(value: Drawable): Self = this.set("mDrawableRightInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSaved(value: Double): Self = this.set("mDrawableSaved", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeBottom(value: Double): Self = this.set("mDrawableSizeBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeEnd(value: Double): Self = this.set("mDrawableSizeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeError(value: Double): Self = this.set("mDrawableSizeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeLeft(value: Double): Self = this.set("mDrawableSizeLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeRight(value: Double): Self = this.set("mDrawableSizeRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeStart(value: Double): Self = this.set("mDrawableSizeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeTemp(value: Double): Self = this.set("mDrawableSizeTemp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableSizeTop(value: Double): Self = this.set("mDrawableSizeTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableStart(value: Drawable): Self = this.set("mDrawableStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableTemp(value: Drawable): Self = this.set("mDrawableTemp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableTop(value: Drawable): Self = this.set("mDrawableTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableWidthBottom(value: Double): Self = this.set("mDrawableWidthBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableWidthTop(value: Double): Self = this.set("mDrawableWidthTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIsRtlCompatibilityMode(value: Boolean): Self = this.set("mIsRtlCompatibilityMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOverride(value: Boolean): Self = this.set("mOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolveWithLayoutDirection(value: Double => Unit): Self = this.set("resolveWithLayoutDirection", js.Any.fromFunction1(value))
    @scala.inline
    def setSetErrorDrawable(value: (Drawable, typings.androiduix.android.widget.TextView) => Unit): Self = this.set("setErrorDrawable", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateDrawablesLayoutDirection(value: js.Any => js.Any): Self = this.set("updateDrawablesLayoutDirection", js.Any.fromFunction1(value))
  }
  
}

