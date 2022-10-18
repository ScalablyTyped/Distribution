package typings.antDesignProUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRunFunctionMod {
  
  @JSImport("@ant-design/pro-utils/es/runFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runFunction[T /* <: js.Array[Any] */](
    valueEnum: Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runFunction")(valueEnum.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Any]
}
