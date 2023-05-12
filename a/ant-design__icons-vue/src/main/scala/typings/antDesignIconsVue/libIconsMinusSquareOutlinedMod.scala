package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMinusSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MinusSquareOutlined", JSImport.Default)
  @js.native
  val default: MinusSquareOutlinedIconType = js.native
  
  @js.native
  trait MinusSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MinusSquareOutlinedIconType: String = js.native
  }
  
  type _To = MinusSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMinusSquareOutlinedMod.foo` */
  override def _to: MinusSquareOutlinedIconType = default
}
