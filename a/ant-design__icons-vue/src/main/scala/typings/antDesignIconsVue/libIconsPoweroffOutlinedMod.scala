package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPoweroffOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PoweroffOutlined", JSImport.Default)
  @js.native
  val default: PoweroffOutlinedIconType = js.native
  
  @js.native
  trait PoweroffOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PoweroffOutlinedIconType: String = js.native
  }
  
  type _To = PoweroffOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPoweroffOutlinedMod.foo` */
  override def _to: PoweroffOutlinedIconType = default
}
