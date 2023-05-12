package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPrinterFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PrinterFilled", JSImport.Default)
  @js.native
  val default: PrinterFilledIconType = js.native
  
  @js.native
  trait PrinterFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PrinterFilledIconType: String = js.native
  }
  
  type _To = PrinterFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPrinterFilledMod.foo` */
  override def _to: PrinterFilledIconType = default
}
