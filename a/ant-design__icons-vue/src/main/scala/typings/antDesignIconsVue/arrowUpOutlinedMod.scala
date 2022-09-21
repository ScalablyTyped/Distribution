package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowUpOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ArrowUpOutlined", JSImport.Default)
  @js.native
  val default: ArrowUpOutlinedIconType = js.native
  
  @js.native
  trait ArrowUpOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ArrowUpOutlinedIconType: String = js.native
  }
  
  type _To = ArrowUpOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `arrowUpOutlinedMod.foo` */
  override def _to: ArrowUpOutlinedIconType = default
}
