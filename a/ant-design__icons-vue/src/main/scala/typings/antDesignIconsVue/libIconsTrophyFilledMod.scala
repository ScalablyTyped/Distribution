package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTrophyFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TrophyFilled", JSImport.Default)
  @js.native
  val default: TrophyFilledIconType = js.native
  
  @js.native
  trait TrophyFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TrophyFilledIconType: String = js.native
  }
  
  type _To = TrophyFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTrophyFilledMod.foo` */
  override def _to: TrophyFilledIconType = default
}
