package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redoOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RedoOutlined", JSImport.Default)
  @js.native
  val default: RedoOutlinedIconType = js.native
  
  @js.native
  trait RedoOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RedoOutlinedIconType: String = js.native
  }
  
  type _To = RedoOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `redoOutlinedMod.foo` */
  override def _to: RedoOutlinedIconType = default
}
