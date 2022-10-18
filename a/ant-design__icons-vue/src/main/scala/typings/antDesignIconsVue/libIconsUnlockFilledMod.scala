package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUnlockFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UnlockFilled", JSImport.Default)
  @js.native
  val default: UnlockFilledIconType = js.native
  
  @js.native
  trait UnlockFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UnlockFilledIconType: String = js.native
  }
  
  type _To = UnlockFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUnlockFilledMod.foo` */
  override def _to: UnlockFilledIconType = default
}
