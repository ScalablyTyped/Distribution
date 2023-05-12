package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLikeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LikeFilled", JSImport.Default)
  @js.native
  val default: LikeFilledIconType = js.native
  
  @js.native
  trait LikeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_LikeFilledIconType: String = js.native
  }
  
  type _To = LikeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLikeFilledMod.foo` */
  override def _to: LikeFilledIconType = default
}
