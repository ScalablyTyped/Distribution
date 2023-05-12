package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTwitterCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TwitterCircleFilled", JSImport.Default)
  @js.native
  val default: TwitterCircleFilledIconType = js.native
  
  @js.native
  trait TwitterCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TwitterCircleFilledIconType: String = js.native
  }
  
  type _To = TwitterCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTwitterCircleFilledMod.foo` */
  override def _to: TwitterCircleFilledIconType = default
}
