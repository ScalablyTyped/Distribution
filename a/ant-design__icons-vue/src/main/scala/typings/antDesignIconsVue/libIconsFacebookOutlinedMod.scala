package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFacebookOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FacebookOutlined", JSImport.Default)
  @js.native
  val default: FacebookOutlinedIconType = js.native
  
  @js.native
  trait FacebookOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FacebookOutlinedIconType: String = js.native
  }
  
  type _To = FacebookOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFacebookOutlinedMod.foo` */
  override def _to: FacebookOutlinedIconType = default
}
