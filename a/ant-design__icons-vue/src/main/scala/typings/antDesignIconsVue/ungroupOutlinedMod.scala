package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ungroupOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UngroupOutlined", JSImport.Default)
  @js.native
  val default: UngroupOutlinedIconType = js.native
  
  @js.native
  trait UngroupOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UngroupOutlinedIconType: String = js.native
  }
  
  type _To = UngroupOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `ungroupOutlinedMod.foo` */
  override def _to: UngroupOutlinedIconType = default
}
