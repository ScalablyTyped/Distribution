package typings.antdMobile

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsAttachPropertiesToComponentMod {
  
  @JSImport("antd-mobile/es/utils/attach-properties-to-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachPropertiesToComponent[C, P /* <: Record[String, Any] */](component: C, properties: P): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("attachPropertiesToComponent")(component.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[C & P]
}
