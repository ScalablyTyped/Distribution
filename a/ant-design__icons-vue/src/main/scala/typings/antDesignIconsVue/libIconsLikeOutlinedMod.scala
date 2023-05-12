package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLikeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LikeOutlined", JSImport.Default)
  @js.native
  val default: LikeOutlinedIconType = js.native
  
  @js.native
  trait LikeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_LikeOutlinedIconType: String = js.native
  }
  
  type _To = LikeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLikeOutlinedMod.foo` */
  override def _to: LikeOutlinedIconType = default
}
