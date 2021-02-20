package typings.antDesignProUtils

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseValueToMomentMod {
  
  @JSImport("@ant-design/pro-utils/lib/parseValueToMoment", JSImport.Default)
  @js.native
  def default(value: DateValue): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  @JSImport("@ant-design/pro-utils/lib/parseValueToMoment", JSImport.Default)
  @js.native
  def default(value: DateValue, formatter: String): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  
  type DateValue = Moment | (js.Array[Double | Moment | String]) | String | Double
}
