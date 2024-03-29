package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTrophyOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TrophyOutlined", JSImport.Default)
  @js.native
  val default: TrophyOutlinedIconType = js.native
  
  @js.native
  trait TrophyOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TrophyOutlinedIconType: String = js.native
  }
  
  type _To = TrophyOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTrophyOutlinedMod.foo` */
  override def _to: TrophyOutlinedIconType = default
}
