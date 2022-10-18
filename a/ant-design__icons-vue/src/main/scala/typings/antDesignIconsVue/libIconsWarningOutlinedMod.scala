package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWarningOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WarningOutlined", JSImport.Default)
  @js.native
  val default: WarningOutlinedIconType = js.native
  
  @js.native
  trait WarningOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WarningOutlinedIconType: String = js.native
  }
  
  type _To = WarningOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWarningOutlinedMod.foo` */
  override def _to: WarningOutlinedIconType = default
}
