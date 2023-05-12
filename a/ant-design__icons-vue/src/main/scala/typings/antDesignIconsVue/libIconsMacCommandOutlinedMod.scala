package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMacCommandOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MacCommandOutlined", JSImport.Default)
  @js.native
  val default: MacCommandOutlinedIconType = js.native
  
  @js.native
  trait MacCommandOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MacCommandOutlinedIconType: String = js.native
  }
  
  type _To = MacCommandOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMacCommandOutlinedMod.foo` */
  override def _to: MacCommandOutlinedIconType = default
}
