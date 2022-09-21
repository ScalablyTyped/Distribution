package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlockOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UnlockOutlined", JSImport.Default)
  @js.native
  val default: UnlockOutlinedIconType = js.native
  
  @js.native
  trait UnlockOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UnlockOutlinedIconType: String = js.native
  }
  
  type _To = UnlockOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `unlockOutlinedMod.foo` */
  override def _to: UnlockOutlinedIconType = default
}
