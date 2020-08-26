package typings.androiduix.android.view.ViewGroup

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java_.lang.JavaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams extends JavaObject {
  var _attrBinder: js.Any = js.native
  var height: Double = js.native
  var width: Double = js.native
  /* protected */ def createClassAttrBinder(): ClassBinderMap = js.native
  def getAttrBinder(): AttrBinder = js.native
  /* private */ def initBindAttr(): js.Any = js.native
  /* protected */ def setBaseAttributes(a: TypedArray, widthAttr: String, heightAttr: String): Unit = js.native
}

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    width: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), width = width.asInstanceOf[js.Any])
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
    def set_attrBinder(value: js.Any): Self = this.set("_attrBinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateClassAttrBinder(value: () => ClassBinderMap): Self = this.set("createClassAttrBinder", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAttrBinder(value: () => AttrBinder): Self = this.set("getAttrBinder", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitBindAttr(value: () => js.Any): Self = this.set("initBindAttr", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBaseAttributes(value: (TypedArray, String, String) => Unit): Self = this.set("setBaseAttributes", js.Any.fromFunction3(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

