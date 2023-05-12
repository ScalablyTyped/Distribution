package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWarningFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WarningFilled", JSImport.Default)
  @js.native
  val default: WarningFilledIconType = js.native
  
  @js.native
  trait WarningFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_WarningFilledIconType: String = js.native
  }
  
  type _To = WarningFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWarningFilledMod.foo` */
  override def _to: WarningFilledIconType = default
}
