package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slackCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlackCircleFilled", JSImport.Default)
  @js.native
  val default: SlackCircleFilledIconType = js.native
  
  @js.native
  trait SlackCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SlackCircleFilledIconType: String = js.native
  }
  
  type _To = SlackCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `slackCircleFilledMod.foo` */
  override def _to: SlackCircleFilledIconType = default
}
