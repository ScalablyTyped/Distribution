package typings.antDesignReactNative.segmentedControlPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControlPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var selectedTextColor: js.UndefOr[String] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SegmentedControlPropsType {
  @scala.inline
  def apply(): SegmentedControlPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentedControlPropsType]
  }
  @scala.inline
  implicit class SegmentedControlPropsTypeOps[Self <: SegmentedControlPropsType] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnValueChange(value: /* value */ String => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    @scala.inline
    def setSelectedTextColor(value: String): Self = this.set("selectedTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTextColor: Self = this.set("selectedTextColor", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

