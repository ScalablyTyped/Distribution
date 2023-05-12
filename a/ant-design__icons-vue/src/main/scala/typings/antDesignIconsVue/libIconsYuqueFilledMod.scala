package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsYuqueFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/YuqueFilled", JSImport.Default)
  @js.native
  val default: YuqueFilledIconType = js.native
  
  @js.native
  trait YuqueFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_YuqueFilledIconType: String = js.native
  }
  
  type _To = YuqueFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsYuqueFilledMod.foo` */
  override def _to: YuqueFilledIconType = default
}
