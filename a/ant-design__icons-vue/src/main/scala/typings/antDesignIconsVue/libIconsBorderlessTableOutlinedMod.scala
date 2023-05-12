package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBorderlessTableOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderlessTableOutlined", JSImport.Default)
  @js.native
  val default: BorderlessTableOutlinedIconType = js.native
  
  @js.native
  trait BorderlessTableOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BorderlessTableOutlinedIconType: String = js.native
  }
  
  type _To = BorderlessTableOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBorderlessTableOutlinedMod.foo` */
  override def _to: BorderlessTableOutlinedIconType = default
}
