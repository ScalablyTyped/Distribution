package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGoogleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GoogleOutlined", JSImport.Default)
  @js.native
  val default: GoogleOutlinedIconType = js.native
  
  @js.native
  trait GoogleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GoogleOutlinedIconType: String = js.native
  }
  
  type _To = GoogleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGoogleOutlinedMod.foo` */
  override def _to: GoogleOutlinedIconType = default
}
