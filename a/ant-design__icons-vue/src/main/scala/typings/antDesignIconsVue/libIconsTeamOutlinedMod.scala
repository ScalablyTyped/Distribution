package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTeamOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TeamOutlined", JSImport.Default)
  @js.native
  val default: TeamOutlinedIconType = js.native
  
  @js.native
  trait TeamOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TeamOutlinedIconType: String = js.native
  }
  
  type _To = TeamOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTeamOutlinedMod.foo` */
  override def _to: TeamOutlinedIconType = default
}
