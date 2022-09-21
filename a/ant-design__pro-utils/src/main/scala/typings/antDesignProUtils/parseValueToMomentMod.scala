package typings.antDesignProUtils

import typings.dayjs.mod.Dayjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseValueToMomentMod {
  
  @JSImport("@ant-design/pro-utils/es/parseValueToMoment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseValueToDay(value: DateValue): js.UndefOr[Dayjs | js.Array[Dayjs] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValueToDay")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Dayjs | js.Array[Dayjs] | Null]]
  inline def parseValueToDay(value: DateValue, formatter: String): js.UndefOr[Dayjs | js.Array[Dayjs] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValueToDay")(value.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Dayjs | js.Array[Dayjs] | Null]]
  
  type DateValue = Dayjs | (js.Array[Dayjs | Double | String]) | String | Double
}
