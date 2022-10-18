package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHeartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HeartOutlined", JSImport.Default)
  @js.native
  val default: HeartOutlinedIconType = js.native
  
  @js.native
  trait HeartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HeartOutlinedIconType: String = js.native
  }
  
  type _To = HeartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHeartOutlinedMod.foo` */
  override def _to: HeartOutlinedIconType = default
}
