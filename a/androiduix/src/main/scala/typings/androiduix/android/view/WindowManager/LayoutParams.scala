package typings.androiduix.android.view.WindowManager

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams
  extends typings.androiduix.android.widget.FrameLayout.LayoutParams {
  var dimAmount: Double = js.native
  var enterAnimation: Animation = js.native
  var exitAnimation: Animation = js.native
  var flags: Double = js.native
  var hideAnimation: Animation = js.native
  var mTitle: js.Any = js.native
  var resumeAnimation: Animation = js.native
  var `type`: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def copyFrom(o: LayoutParams): Double = js.native
  def getTitle(): String = js.native
  /* private */ def isFloating(): js.Any = js.native
  /* private */ def isFocusable(): js.Any = js.native
  /* private */ def isSplitTouch(): js.Any = js.native
  /* private */ def isTouchModal(): js.Any = js.native
  /* private */ def isTouchable(): js.Any = js.native
  /* private */ def isWatchTouchOutside(): js.Any = js.native
  def setTitle(title: String): Unit = js.native
}

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    bottomMargin: Double,
    copyFrom: LayoutParams => Double,
    createClassAttrBinder: () => ClassBinderMap,
    dimAmount: Double,
    enterAnimation: Animation,
    equals: js.Any => Boolean,
    exitAnimation: Animation,
    flags: Double,
    getAttrBinder: () => AttrBinder,
    getLayoutDirection: () => Double,
    getTitle: () => String,
    gravity: Double,
    hash: js.Any,
    height: Double,
    hideAnimation: Animation,
    initBindAttr: () => js.Any,
    isFloating: () => js.Any,
    isFocusable: () => js.Any,
    isLayoutRtl: () => Boolean,
    isSplitTouch: () => js.Any,
    isTouchModal: () => js.Any,
    isTouchable: () => js.Any,
    isWatchTouchOutside: () => js.Any,
    leftMargin: Double,
    mTitle: js.Any,
    resolveLayoutDirection: Double => Unit,
    resumeAnimation: Animation,
    rightMargin: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    setLayoutDirection: Double => Unit,
    setMargins: (Double, Double, Double, Double) => Unit,
    setTitle: String => Unit,
    topMargin: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], copyFrom = js.Any.fromFunction1(copyFrom), createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), dimAmount = dimAmount.asInstanceOf[js.Any], enterAnimation = enterAnimation.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), exitAnimation = exitAnimation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), getTitle = js.Any.fromFunction0(getTitle), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideAnimation = hideAnimation.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isFloating = js.Any.fromFunction0(isFloating), isFocusable = js.Any.fromFunction0(isFocusable), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), isSplitTouch = js.Any.fromFunction0(isSplitTouch), isTouchModal = js.Any.fromFunction0(isTouchModal), isTouchable = js.Any.fromFunction0(isTouchable), isWatchTouchOutside = js.Any.fromFunction0(isWatchTouchOutside), leftMargin = leftMargin.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), resumeAnimation = resumeAnimation.asInstanceOf[js.Any], rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), setTitle = js.Any.fromFunction1(setTitle), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
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
    def setCopyFrom(value: LayoutParams => Double): Self = this.set("copyFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setDimAmount(value: Double): Self = this.set("dimAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterAnimation(value: Animation): Self = this.set("enterAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitAnimation(value: Animation): Self = this.set("exitAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setHideAnimation(value: Animation): Self = this.set("hideAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFloating(value: () => js.Any): Self = this.set("isFloating", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFocusable(value: () => js.Any): Self = this.set("isFocusable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSplitTouch(value: () => js.Any): Self = this.set("isSplitTouch", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTouchModal(value: () => js.Any): Self = this.set("isTouchModal", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTouchable(value: () => js.Any): Self = this.set("isTouchable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWatchTouchOutside(value: () => js.Any): Self = this.set("isWatchTouchOutside", js.Any.fromFunction0(value))
    @scala.inline
    def setMTitle(value: js.Any): Self = this.set("mTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setResumeAnimation(value: Animation): Self = this.set("resumeAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

