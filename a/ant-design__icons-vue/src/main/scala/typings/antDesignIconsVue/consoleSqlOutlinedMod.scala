package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleSqlOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ConsoleSqlOutlined", JSImport.Default)
  @js.native
  val default: ConsoleSqlOutlinedIconType = js.native
  
  @js.native
  trait ConsoleSqlOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ConsoleSqlOutlinedIconType: String = js.native
  }
  
  type _To = ConsoleSqlOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `consoleSqlOutlinedMod.foo` */
  override def _to: ConsoleSqlOutlinedIconType = default
}
