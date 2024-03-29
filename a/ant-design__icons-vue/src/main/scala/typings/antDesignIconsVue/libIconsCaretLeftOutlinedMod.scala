package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCaretLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CaretLeftOutlined", JSImport.Default)
  @js.native
  val default: CaretLeftOutlinedIconType = js.native
  
  @js.native
  trait CaretLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CaretLeftOutlinedIconType: String = js.native
  }
  
  type _To = CaretLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCaretLeftOutlinedMod.foo` */
  override def _to: CaretLeftOutlinedIconType = default
}
