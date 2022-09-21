package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smileFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SmileFilled", JSImport.Default)
  @js.native
  val default: SmileFilledIconType = js.native
  
  @js.native
  trait SmileFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SmileFilledIconType: String = js.native
  }
  
  type _To = SmileFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `smileFilledMod.foo` */
  override def _to: SmileFilledIconType = default
}
