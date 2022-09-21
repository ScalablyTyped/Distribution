package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crownFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CrownFilled", JSImport.Default)
  @js.native
  val default: CrownFilledIconType = js.native
  
  @js.native
  trait CrownFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CrownFilledIconType: String = js.native
  }
  
  type _To = CrownFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `crownFilledMod.foo` */
  override def _to: CrownFilledIconType = default
}
