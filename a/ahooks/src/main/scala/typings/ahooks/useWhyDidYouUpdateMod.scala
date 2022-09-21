package typings.ahooks

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWhyDidYouUpdateMod {
  
  @JSImport("ahooks/lib/useWhyDidYouUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(componentName: String, props: IProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IProps = Record[String, Any]
}
