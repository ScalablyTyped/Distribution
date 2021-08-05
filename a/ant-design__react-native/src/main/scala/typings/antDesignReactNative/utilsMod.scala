package typings.antDesignReactNative

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatFn(instance: js.Any, value: Date): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFn")(instance.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def formatProps(props: js.Any, value: Date): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatProps")(props.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
