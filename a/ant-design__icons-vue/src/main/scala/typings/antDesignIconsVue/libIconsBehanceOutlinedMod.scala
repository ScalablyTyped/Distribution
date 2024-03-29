package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBehanceOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BehanceOutlined", JSImport.Default)
  @js.native
  val default: BehanceOutlinedIconType = js.native
  
  @js.native
  trait BehanceOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BehanceOutlinedIconType: String = js.native
  }
  
  type _To = BehanceOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBehanceOutlinedMod.foo` */
  override def _to: BehanceOutlinedIconType = default
}
