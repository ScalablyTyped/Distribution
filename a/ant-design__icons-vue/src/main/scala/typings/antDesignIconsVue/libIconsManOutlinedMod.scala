package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsManOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ManOutlined", JSImport.Default)
  @js.native
  val default: ManOutlinedIconType = js.native
  
  @js.native
  trait ManOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ManOutlinedIconType: String = js.native
  }
  
  type _To = ManOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsManOutlinedMod.foo` */
  override def _to: ManOutlinedIconType = default
}
