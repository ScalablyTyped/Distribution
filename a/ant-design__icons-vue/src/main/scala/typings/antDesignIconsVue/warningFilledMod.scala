package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WarningFilled", JSImport.Default)
  @js.native
  val default: WarningFilledIconType = js.native
  
  @js.native
  trait WarningFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WarningFilledIconType: String = js.native
  }
  
  type _To = WarningFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `warningFilledMod.foo` */
  override def _to: WarningFilledIconType = default
}
