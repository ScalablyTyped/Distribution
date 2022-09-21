package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rocketOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RocketOutlined", JSImport.Default)
  @js.native
  val default: RocketOutlinedIconType = js.native
  
  @js.native
  trait RocketOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RocketOutlinedIconType: String = js.native
  }
  
  type _To = RocketOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `rocketOutlinedMod.foo` */
  override def _to: RocketOutlinedIconType = default
}
