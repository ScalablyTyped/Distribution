package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMinusOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MinusOutlined", JSImport.Default)
  @js.native
  val default: MinusOutlinedIconType = js.native
  
  @js.native
  trait MinusOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MinusOutlinedIconType: String = js.native
  }
  
  type _To = MinusOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMinusOutlinedMod.foo` */
  override def _to: MinusOutlinedIconType = default
}
