package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBorderTopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderTopOutlined", JSImport.Default)
  @js.native
  val default: BorderTopOutlinedIconType = js.native
  
  @js.native
  trait BorderTopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderTopOutlinedIconType: String = js.native
  }
  
  type _To = BorderTopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBorderTopOutlinedMod.foo` */
  override def _to: BorderTopOutlinedIconType = default
}
