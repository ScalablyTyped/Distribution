package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabletFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TabletFilled", JSImport.Default)
  @js.native
  val default: TabletFilledIconType = js.native
  
  @js.native
  trait TabletFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TabletFilledIconType: String = js.native
  }
  
  type _To = TabletFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `tabletFilledMod.foo` */
  override def _to: TabletFilledIconType = default
}
