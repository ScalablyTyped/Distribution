package typings.antDesignProUtils

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseValueToMomentMod {
  
  @JSImport("@ant-design/pro-utils/lib/parseValueToMoment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: DateValue): js.UndefOr[Moment | js.Array[Moment] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Moment | js.Array[Moment] | Null]]
  inline def default(value: DateValue, formatter: String): js.UndefOr[Moment | js.Array[Moment] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Moment | js.Array[Moment] | Null]]
  
  type DateValue = Moment | (js.Array[Double | Moment | String]) | String | Double
}
