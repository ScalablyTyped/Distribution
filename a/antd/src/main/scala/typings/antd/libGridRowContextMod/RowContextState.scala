package typings.antd.libGridRowContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowContextState extends js.Object {
  var gutter: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object RowContextState {
  @scala.inline
  def apply(gutter: js.Tuple2[Double, Double] = null): RowContextState = {
    val __obj = js.Dynamic.literal()
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContextState]
  }
}

