package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backwardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BackwardFilled", JSImport.Default)
  @js.native
  val default: BackwardFilledIconType = js.native
  
  @js.native
  trait BackwardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BackwardFilledIconType: String = js.native
  }
  
  type _To = BackwardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `backwardFilledMod.foo` */
  override def _to: BackwardFilledIconType = default
}
