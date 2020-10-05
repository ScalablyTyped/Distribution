package typings.antd.rowContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowContextState extends js.Object {
  var gutter: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object RowContextState {
  @scala.inline
  def apply(): RowContextState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowContextState]
  }
  @scala.inline
  implicit class RowContextStateOps[Self <: RowContextState] (val x: Self) extends AnyVal {
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
    def setGutter(value: js.Tuple2[Double, Double]): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
  }
  
}

