package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSmileFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SmileFilled", JSImport.Default)
  @js.native
  val default: SmileFilledIconType = js.native
  
  @js.native
  trait SmileFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SmileFilledIconType: String = js.native
  }
  
  type _To = SmileFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSmileFilledMod.foo` */
  override def _to: SmileFilledIconType = default
}
