package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLeftSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LeftSquareOutlined", JSImport.Default)
  @js.native
  val default: LeftSquareOutlinedIconType = js.native
  
  @js.native
  trait LeftSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LeftSquareOutlinedIconType: String = js.native
  }
  
  type _To = LeftSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLeftSquareOutlinedMod.foo` */
  override def _to: LeftSquareOutlinedIconType = default
}
