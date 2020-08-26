package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams
  extends typings.androiduix.android.view.ViewGroup.LayoutParams {
  var forceAdd: Boolean = js.native
  var itemId: Double = js.native
  var recycledHeaderFooter: Boolean = js.native
  var scrappedFromPosition: Double = js.native
  var viewType: Double = js.native
}

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    forceAdd: Boolean,
    getAttrBinder: () => AttrBinder,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    itemId: Double,
    recycledHeaderFooter: Boolean,
    scrappedFromPosition: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    viewType: Double,
    width: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), forceAdd = forceAdd.asInstanceOf[js.Any], getAttrBinder = js.Any.fromFunction0(getAttrBinder), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), itemId = itemId.asInstanceOf[js.Any], recycledHeaderFooter = recycledHeaderFooter.asInstanceOf[js.Any], scrappedFromPosition = scrappedFromPosition.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), viewType = viewType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setForceAdd(value: Boolean): Self = this.set("forceAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: Double): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecycledHeaderFooter(value: Boolean): Self = this.set("recycledHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrappedFromPosition(value: Double): Self = this.set("scrappedFromPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewType(value: Double): Self = this.set("viewType", value.asInstanceOf[js.Any])
  }
  
}

