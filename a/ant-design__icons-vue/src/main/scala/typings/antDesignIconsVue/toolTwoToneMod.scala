package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ToolTwoTone", JSImport.Default)
  @js.native
  val default: ToolTwoToneIconType = js.native
  
  @js.native
  trait ToolTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ToolTwoToneIconType: String = js.native
  }
  
  type _To = ToolTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `toolTwoToneMod.foo` */
  override def _to: ToolTwoToneIconType = default
}
