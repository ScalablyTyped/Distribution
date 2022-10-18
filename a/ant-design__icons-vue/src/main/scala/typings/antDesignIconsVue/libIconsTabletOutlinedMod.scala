package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTabletOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TabletOutlined", JSImport.Default)
  @js.native
  val default: TabletOutlinedIconType = js.native
  
  @js.native
  trait TabletOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TabletOutlinedIconType: String = js.native
  }
  
  type _To = TabletOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTabletOutlinedMod.foo` */
  override def _to: TabletOutlinedIconType = default
}
