package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSlackSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlackSquareFilled", JSImport.Default)
  @js.native
  val default: SlackSquareFilledIconType = js.native
  
  @js.native
  trait SlackSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SlackSquareFilledIconType: String = js.native
  }
  
  type _To = SlackSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSlackSquareFilledMod.foo` */
  override def _to: SlackSquareFilledIconType = default
}
