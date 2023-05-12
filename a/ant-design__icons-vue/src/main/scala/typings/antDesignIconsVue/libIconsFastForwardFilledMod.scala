package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFastForwardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FastForwardFilled", JSImport.Default)
  @js.native
  val default: FastForwardFilledIconType = js.native
  
  @js.native
  trait FastForwardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FastForwardFilledIconType: String = js.native
  }
  
  type _To = FastForwardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFastForwardFilledMod.foo` */
  override def _to: FastForwardFilledIconType = default
}
