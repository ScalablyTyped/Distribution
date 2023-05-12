package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStarOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StarOutlined", JSImport.Default)
  @js.native
  val default: StarOutlinedIconType = js.native
  
  @js.native
  trait StarOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_StarOutlinedIconType: String = js.native
  }
  
  type _To = StarOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStarOutlinedMod.foo` */
  override def _to: StarOutlinedIconType = default
}
