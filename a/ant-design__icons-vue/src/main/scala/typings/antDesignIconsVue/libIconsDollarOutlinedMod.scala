package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDollarOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DollarOutlined", JSImport.Default)
  @js.native
  val default: DollarOutlinedIconType = js.native
  
  @js.native
  trait DollarOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DollarOutlinedIconType: String = js.native
  }
  
  type _To = DollarOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDollarOutlinedMod.foo` */
  override def _to: DollarOutlinedIconType = default
}
