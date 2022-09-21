package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fastBackwardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FastBackwardFilled", JSImport.Default)
  @js.native
  val default: FastBackwardFilledIconType = js.native
  
  @js.native
  trait FastBackwardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FastBackwardFilledIconType: String = js.native
  }
  
  type _To = FastBackwardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `fastBackwardFilledMod.foo` */
  override def _to: FastBackwardFilledIconType = default
}
