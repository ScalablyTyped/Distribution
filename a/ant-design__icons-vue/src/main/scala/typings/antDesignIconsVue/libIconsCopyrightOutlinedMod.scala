package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCopyrightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CopyrightOutlined", JSImport.Default)
  @js.native
  val default: CopyrightOutlinedIconType = js.native
  
  @js.native
  trait CopyrightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CopyrightOutlinedIconType: String = js.native
  }
  
  type _To = CopyrightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCopyrightOutlinedMod.foo` */
  override def _to: CopyrightOutlinedIconType = default
}
