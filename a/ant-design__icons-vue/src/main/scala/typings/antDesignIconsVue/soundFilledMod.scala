package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SoundFilled", JSImport.Default)
  @js.native
  val default: SoundFilledIconType = js.native
  
  @js.native
  trait SoundFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SoundFilledIconType: String = js.native
  }
  
  type _To = SoundFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `soundFilledMod.foo` */
  override def _to: SoundFilledIconType = default
}
