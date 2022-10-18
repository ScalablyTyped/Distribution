package typings.ahooks

import typings.ahooks.libUseAntdTableTypesMod.AntdFormUtils
import typings.ahooks.libUseFusionTableTypesMod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFusionTableFusionAdapterMod {
  
  @JSImport("ahooks/lib/useFusionTable/fusionAdapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fieldAdapter(field: Field): AntdFormUtils = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldAdapter")(field.asInstanceOf[js.Any]).asInstanceOf[AntdFormUtils]
  
  inline def resultAdapter(result: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resultAdapter")(result.asInstanceOf[js.Any]).asInstanceOf[Any]
}
