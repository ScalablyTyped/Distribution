package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRightCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightCircleOutlined", JSImport.Default)
  @js.native
  val default: RightCircleOutlinedIconType = js.native
  
  @js.native
  trait RightCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RightCircleOutlinedIconType: String = js.native
  }
  
  type _To = RightCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRightCircleOutlinedMod.foo` */
  override def _to: RightCircleOutlinedIconType = default
}
