package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skinFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SkinFilled", JSImport.Default)
  @js.native
  val default: SkinFilledIconType = js.native
  
  @js.native
  trait SkinFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SkinFilledIconType: String = js.native
  }
  
  type _To = SkinFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `skinFilledMod.foo` */
  override def _to: SkinFilledIconType = default
}
