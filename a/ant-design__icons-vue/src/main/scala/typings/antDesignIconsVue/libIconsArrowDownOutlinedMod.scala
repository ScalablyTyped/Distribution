package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsArrowDownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ArrowDownOutlined", JSImport.Default)
  @js.native
  val default: ArrowDownOutlinedIconType = js.native
  
  @js.native
  trait ArrowDownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ArrowDownOutlinedIconType: String = js.native
  }
  
  type _To = ArrowDownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsArrowDownOutlinedMod.foo` */
  override def _to: ArrowDownOutlinedIconType = default
}
