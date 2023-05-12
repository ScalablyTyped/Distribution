package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSignalFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SignalFilled", JSImport.Default)
  @js.native
  val default: SignalFilledIconType = js.native
  
  @js.native
  trait SignalFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SignalFilledIconType: String = js.native
  }
  
  type _To = SignalFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSignalFilledMod.foo` */
  override def _to: SignalFilledIconType = default
}
