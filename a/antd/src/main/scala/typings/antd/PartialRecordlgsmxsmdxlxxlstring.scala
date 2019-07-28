package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'lg' | 'sm' | 'xs' | 'md' | 'xl' | 'xxl', string>> */
trait PartialRecordlgsmxsmdxlxxlstring extends js.Object {
  var lg: js.UndefOr[String] = js.undefined
  var md: js.UndefOr[String] = js.undefined
  var sm: js.UndefOr[String] = js.undefined
  var xl: js.UndefOr[String] = js.undefined
  var xs: js.UndefOr[String] = js.undefined
  var xxl: js.UndefOr[String] = js.undefined
}

object PartialRecordlgsmxsmdxlxxlstring {
  @scala.inline
  def apply(
    lg: String = null,
    md: String = null,
    sm: String = null,
    xl: String = null,
    xs: String = null,
    xxl: String = null
  ): PartialRecordlgsmxsmdxlxxlstring = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg)
    if (md != null) __obj.updateDynamic("md")(md)
    if (sm != null) __obj.updateDynamic("sm")(sm)
    if (xl != null) __obj.updateDynamic("xl")(xl)
    if (xs != null) __obj.updateDynamic("xs")(xs)
    if (xxl != null) __obj.updateDynamic("xxl")(xxl)
    __obj.asInstanceOf[PartialRecordlgsmxsmdxlxxlstring]
  }
}

