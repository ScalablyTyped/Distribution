package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloseCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseCircleOutlined", JSImport.Default)
  @js.native
  val default: CloseCircleOutlinedIconType = js.native
  
  @js.native
  trait CloseCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloseCircleOutlinedIconType: String = js.native
  }
  
  type _To = CloseCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloseCircleOutlinedMod.foo` */
  override def _to: CloseCircleOutlinedIconType = default
}
