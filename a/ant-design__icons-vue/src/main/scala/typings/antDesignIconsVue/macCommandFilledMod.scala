package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macCommandFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MacCommandFilled", JSImport.Default)
  @js.native
  val default: MacCommandFilledIconType = js.native
  
  @js.native
  trait MacCommandFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MacCommandFilledIconType: String = js.native
  }
  
  type _To = MacCommandFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `macCommandFilledMod.foo` */
  override def _to: MacCommandFilledIconType = default
}
