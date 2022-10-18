package typings.antDesignProUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDateArrayFormatterMod {
  
  @JSImport("@ant-design/pro-utils/es/dateArrayFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateArrayFormatter(value: js.Array[Any], format: js.Array[FormatType]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateArrayFormatter")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateArrayFormatter(value: js.Array[Any], format: FormatType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateArrayFormatter")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type FormatType = (js.Function1[/* dayjs */ Any, String]) | String
}
