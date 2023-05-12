package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFallOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FallOutlined", JSImport.Default)
  @js.native
  val default: FallOutlinedIconType = js.native
  
  @js.native
  trait FallOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FallOutlinedIconType: String = js.native
  }
  
  type _To = FallOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFallOutlinedMod.foo` */
  override def _to: FallOutlinedIconType = default
}
