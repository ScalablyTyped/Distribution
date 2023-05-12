package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFilterTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilterTwoTone", JSImport.Default)
  @js.native
  val default: FilterTwoToneIconType = js.native
  
  @js.native
  trait FilterTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FilterTwoToneIconType: String = js.native
  }
  
  type _To = FilterTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFilterTwoToneMod.foo` */
  override def _to: FilterTwoToneIconType = default
}
