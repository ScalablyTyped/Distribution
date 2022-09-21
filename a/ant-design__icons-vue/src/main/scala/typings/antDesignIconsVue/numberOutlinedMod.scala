package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NumberOutlined", JSImport.Default)
  @js.native
  val default: NumberOutlinedIconType = js.native
  
  @js.native
  trait NumberOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_NumberOutlinedIconType: String = js.native
  }
  
  type _To = NumberOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `numberOutlinedMod.foo` */
  override def _to: NumberOutlinedIconType = default
}
