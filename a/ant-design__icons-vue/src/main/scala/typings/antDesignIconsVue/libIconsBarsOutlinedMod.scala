package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBarsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BarsOutlined", JSImport.Default)
  @js.native
  val default: BarsOutlinedIconType = js.native
  
  @js.native
  trait BarsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BarsOutlinedIconType: String = js.native
  }
  
  type _To = BarsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBarsOutlinedMod.foo` */
  override def _to: BarsOutlinedIconType = default
}
