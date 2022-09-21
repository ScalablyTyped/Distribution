package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DatabaseOutlined", JSImport.Default)
  @js.native
  val default: DatabaseOutlinedIconType = js.native
  
  @js.native
  trait DatabaseOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DatabaseOutlinedIconType: String = js.native
  }
  
  type _To = DatabaseOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `databaseOutlinedMod.foo` */
  override def _to: DatabaseOutlinedIconType = default
}
