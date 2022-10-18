package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTabletTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TabletTwoTone", JSImport.Default)
  @js.native
  val default: TabletTwoToneIconType = js.native
  
  @js.native
  trait TabletTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TabletTwoToneIconType: String = js.native
  }
  
  type _To = TabletTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTabletTwoToneMod.foo` */
  override def _to: TabletTwoToneIconType = default
}
