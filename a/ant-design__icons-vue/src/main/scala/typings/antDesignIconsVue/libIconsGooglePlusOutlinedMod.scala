package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGooglePlusOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GooglePlusOutlined", JSImport.Default)
  @js.native
  val default: GooglePlusOutlinedIconType = js.native
  
  @js.native
  trait GooglePlusOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GooglePlusOutlinedIconType: String = js.native
  }
  
  type _To = GooglePlusOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGooglePlusOutlinedMod.foo` */
  override def _to: GooglePlusOutlinedIconType = default
}
