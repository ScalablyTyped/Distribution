package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPayCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PayCircleFilled", JSImport.Default)
  @js.native
  val default: PayCircleFilledIconType = js.native
  
  @js.native
  trait PayCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PayCircleFilledIconType: String = js.native
  }
  
  type _To = PayCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPayCircleFilledMod.foo` */
  override def _to: PayCircleFilledIconType = default
}
