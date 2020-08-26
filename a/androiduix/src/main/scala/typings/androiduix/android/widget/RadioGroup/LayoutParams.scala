package typings.androiduix.android.widget.RadioGroup

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams
  extends typings.androiduix.android.widget.LinearLayout.LayoutParams

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    bottomMargin: Double,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    getLayoutDirection: () => Double,
    gravity: Double,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    isLayoutRtl: () => Boolean,
    leftMargin: Double,
    resolveLayoutDirection: Double => Unit,
    rightMargin: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    setLayoutDirection: Double => Unit,
    setMargins: (Double, Double, Double, Double) => Unit,
    topMargin: Double,
    weight: Double,
    width: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
}

