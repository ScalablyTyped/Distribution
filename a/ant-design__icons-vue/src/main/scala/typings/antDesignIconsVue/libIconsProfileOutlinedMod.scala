package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsProfileOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ProfileOutlined", JSImport.Default)
  @js.native
  val default: ProfileOutlinedIconType = js.native
  
  @js.native
  trait ProfileOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ProfileOutlinedIconType: String = js.native
  }
  
  type _To = ProfileOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsProfileOutlinedMod.foo` */
  override def _to: ProfileOutlinedIconType = default
}
