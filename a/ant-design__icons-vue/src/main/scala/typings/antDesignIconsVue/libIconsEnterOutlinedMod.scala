package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEnterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EnterOutlined", JSImport.Default)
  @js.native
  val default: EnterOutlinedIconType = js.native
  
  @js.native
  trait EnterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EnterOutlinedIconType: String = js.native
  }
  
  type _To = EnterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEnterOutlinedMod.foo` */
  override def _to: EnterOutlinedIconType = default
}
