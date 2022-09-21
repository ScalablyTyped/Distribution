package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FlagFilled", JSImport.Default)
  @js.native
  val default: FlagFilledIconType = js.native
  
  @js.native
  trait FlagFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FlagFilledIconType: String = js.native
  }
  
  type _To = FlagFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `flagFilledMod.foo` */
  override def _to: FlagFilledIconType = default
}
