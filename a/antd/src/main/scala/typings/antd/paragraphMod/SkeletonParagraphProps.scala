package typings.antd.paragraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonParagraphProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[widthUnit | js.Array[widthUnit]] = js.native
}

object SkeletonParagraphProps {
  @scala.inline
  def apply(): SkeletonParagraphProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkeletonParagraphProps]
  }
  @scala.inline
  implicit class SkeletonParagraphPropsOps[Self <: SkeletonParagraphProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidthVarargs(value: widthUnit*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: widthUnit | js.Array[widthUnit]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

