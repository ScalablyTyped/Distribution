package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFilterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilterOutlined", JSImport.Default)
  @js.native
  val default: FilterOutlinedIconType = js.native
  
  @js.native
  trait FilterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FilterOutlinedIconType: String = js.native
  }
  
  type _To = FilterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFilterOutlinedMod.foo` */
  override def _to: FilterOutlinedIconType = default
}
