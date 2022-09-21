package typings.antd

import typings.antd.useFormMod.FormInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormInstanceMod {
  
  @JSImport("antd/lib/form/hooks/useFormInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Value](): FormInstance[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[FormInstance[Value]]
}
