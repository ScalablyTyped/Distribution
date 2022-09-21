package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barcodeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BarcodeOutlined", JSImport.Default)
  @js.native
  val default: BarcodeOutlinedIconType = js.native
  
  @js.native
  trait BarcodeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BarcodeOutlinedIconType: String = js.native
  }
  
  type _To = BarcodeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `barcodeOutlinedMod.foo` */
  override def _to: BarcodeOutlinedIconType = default
}
