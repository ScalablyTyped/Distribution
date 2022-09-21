package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boldOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BoldOutlined", JSImport.Default)
  @js.native
  val default: BoldOutlinedIconType = js.native
  
  @js.native
  trait BoldOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BoldOutlinedIconType: String = js.native
  }
  
  type _To = BoldOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `boldOutlinedMod.foo` */
  override def _to: BoldOutlinedIconType = default
}
