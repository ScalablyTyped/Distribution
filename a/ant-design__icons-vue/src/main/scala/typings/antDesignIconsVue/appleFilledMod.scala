package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AppleFilled", JSImport.Default)
  @js.native
  val default: AppleFilledIconType = js.native
  
  @js.native
  trait AppleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AppleFilledIconType: String = js.native
  }
  
  type _To = AppleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `appleFilledMod.foo` */
  override def _to: AppleFilledIconType = default
}
