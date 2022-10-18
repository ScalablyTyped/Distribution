package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMinusCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MinusCircleOutlined", JSImport.Default)
  @js.native
  val default: MinusCircleOutlinedIconType = js.native
  
  @js.native
  trait MinusCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MinusCircleOutlinedIconType: String = js.native
  }
  
  type _To = MinusCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMinusCircleOutlinedMod.foo` */
  override def _to: MinusCircleOutlinedIconType = default
}
