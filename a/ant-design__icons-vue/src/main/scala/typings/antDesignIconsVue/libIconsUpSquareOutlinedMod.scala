package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUpSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpSquareOutlined", JSImport.Default)
  @js.native
  val default: UpSquareOutlinedIconType = js.native
  
  @js.native
  trait UpSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_UpSquareOutlinedIconType: String = js.native
  }
  
  type _To = UpSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUpSquareOutlinedMod.foo` */
  override def _to: UpSquareOutlinedIconType = default
}
