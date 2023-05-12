package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsScanOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ScanOutlined", JSImport.Default)
  @js.native
  val default: ScanOutlinedIconType = js.native
  
  @js.native
  trait ScanOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ScanOutlinedIconType: String = js.native
  }
  
  type _To = ScanOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsScanOutlinedMod.foo` */
  override def _to: ScanOutlinedIconType = default
}
