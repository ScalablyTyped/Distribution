package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsNumberOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NumberOutlined", JSImport.Default)
  @js.native
  val default: NumberOutlinedIconType = js.native
  
  @js.native
  trait NumberOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_NumberOutlinedIconType: String = js.native
  }
  
  type _To = NumberOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsNumberOutlinedMod.foo` */
  override def _to: NumberOutlinedIconType = default
}
