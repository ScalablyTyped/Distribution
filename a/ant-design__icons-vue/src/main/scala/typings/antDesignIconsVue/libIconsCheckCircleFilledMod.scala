package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCheckCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckCircleFilled", JSImport.Default)
  @js.native
  val default: CheckCircleFilledIconType = js.native
  
  @js.native
  trait CheckCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CheckCircleFilledIconType: String = js.native
  }
  
  type _To = CheckCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCheckCircleFilledMod.foo` */
  override def _to: CheckCircleFilledIconType = default
}
