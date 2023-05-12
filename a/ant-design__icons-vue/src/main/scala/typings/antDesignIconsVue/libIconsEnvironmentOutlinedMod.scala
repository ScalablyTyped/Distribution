package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEnvironmentOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EnvironmentOutlined", JSImport.Default)
  @js.native
  val default: EnvironmentOutlinedIconType = js.native
  
  @js.native
  trait EnvironmentOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EnvironmentOutlinedIconType: String = js.native
  }
  
  type _To = EnvironmentOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEnvironmentOutlinedMod.foo` */
  override def _to: EnvironmentOutlinedIconType = default
}
