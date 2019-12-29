package typings.antDashDesignDashPro.libChartsTagCloudMod

import typings.antDashDesignDashPro.Anon_Name
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagCloudProps extends js.Object {
  var data: js.Array[Anon_Name]
  var height: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ITagCloudProps {
  @scala.inline
  def apply(data: js.Array[Anon_Name], height: Double, style: CSSProperties = null): ITagCloudProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagCloudProps]
  }
}

