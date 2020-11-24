package typings.antDesignProUtils

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/pro-utils/lib/parseValueToMoment", JSImport.Namespace)
@js.native
object parseValueToMomentMod extends js.Object {
  
  def default(value: DateValue): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  def default(value: DateValue, formatter: String): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  
  type DateValue = Moment | (js.Array[Double | Moment | String]) | String | Double
}
