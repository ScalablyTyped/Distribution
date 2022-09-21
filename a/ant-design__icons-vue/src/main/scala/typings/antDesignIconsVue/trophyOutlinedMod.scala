package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trophyOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TrophyOutlined", JSImport.Default)
  @js.native
  val default: TrophyOutlinedIconType = js.native
  
  @js.native
  trait TrophyOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TrophyOutlinedIconType: String = js.native
  }
  
  type _To = TrophyOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `trophyOutlinedMod.foo` */
  override def _to: TrophyOutlinedIconType = default
}
