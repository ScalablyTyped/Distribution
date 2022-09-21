package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TeamOutlined", JSImport.Default)
  @js.native
  val default: TeamOutlinedIconType = js.native
  
  @js.native
  trait TeamOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TeamOutlinedIconType: String = js.native
  }
  
  type _To = TeamOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `teamOutlinedMod.foo` */
  override def _to: TeamOutlinedIconType = default
}
