package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EditFilled", JSImport.Default)
  @js.native
  val default: EditFilledIconType = js.native
  
  @js.native
  trait EditFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EditFilledIconType: String = js.native
  }
  
  type _To = EditFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `editFilledMod.foo` */
  override def _to: EditFilledIconType = default
}
