package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsQuestionCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/QuestionCircleFilled", JSImport.Default)
  @js.native
  val default: QuestionCircleFilledIconType = js.native
  
  @js.native
  trait QuestionCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_QuestionCircleFilledIconType: String = js.native
  }
  
  type _To = QuestionCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsQuestionCircleFilledMod.foo` */
  override def _to: QuestionCircleFilledIconType = default
}
