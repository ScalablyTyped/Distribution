package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsExpandAltOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExpandAltOutlined", JSImport.Default)
  @js.native
  val default: ExpandAltOutlinedIconType = js.native
  
  @js.native
  trait ExpandAltOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ExpandAltOutlinedIconType: String = js.native
  }
  
  type _To = ExpandAltOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsExpandAltOutlinedMod.foo` */
  override def _to: ExpandAltOutlinedIconType = default
}
