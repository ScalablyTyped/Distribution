package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDingtalkCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DingtalkCircleFilled", JSImport.Default)
  @js.native
  val default: DingtalkCircleFilledIconType = js.native
  
  @js.native
  trait DingtalkCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DingtalkCircleFilledIconType: String = js.native
  }
  
  type _To = DingtalkCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDingtalkCircleFilledMod.foo` */
  override def _to: DingtalkCircleFilledIconType = default
}
