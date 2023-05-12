package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAndroidOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AndroidOutlined", JSImport.Default)
  @js.native
  val default: AndroidOutlinedIconType = js.native
  
  @js.native
  trait AndroidOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AndroidOutlinedIconType: String = js.native
  }
  
  type _To = AndroidOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAndroidOutlinedMod.foo` */
  override def _to: AndroidOutlinedIconType = default
}
