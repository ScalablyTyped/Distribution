package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bellFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BellFilled", JSImport.Default)
  @js.native
  val default: BellFilledIconType = js.native
  
  @js.native
  trait BellFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BellFilledIconType: String = js.native
  }
  
  type _To = BellFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `bellFilledMod.foo` */
  override def _to: BellFilledIconType = default
}
