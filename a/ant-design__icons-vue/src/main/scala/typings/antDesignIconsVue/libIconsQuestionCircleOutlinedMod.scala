package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsQuestionCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/QuestionCircleOutlined", JSImport.Default)
  @js.native
  val default: QuestionCircleOutlinedIconType = js.native
  
  @js.native
  trait QuestionCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_QuestionCircleOutlinedIconType: String = js.native
  }
  
  type _To = QuestionCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsQuestionCircleOutlinedMod.foo` */
  override def _to: QuestionCircleOutlinedIconType = default
}
