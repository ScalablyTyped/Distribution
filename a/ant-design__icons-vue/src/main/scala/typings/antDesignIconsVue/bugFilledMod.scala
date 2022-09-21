package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bugFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BugFilled", JSImport.Default)
  @js.native
  val default: BugFilledIconType = js.native
  
  @js.native
  trait BugFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BugFilledIconType: String = js.native
  }
  
  type _To = BugFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `bugFilledMod.foo` */
  override def _to: BugFilledIconType = default
}
