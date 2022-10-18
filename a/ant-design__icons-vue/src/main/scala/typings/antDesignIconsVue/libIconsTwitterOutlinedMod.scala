package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTwitterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TwitterOutlined", JSImport.Default)
  @js.native
  val default: TwitterOutlinedIconType = js.native
  
  @js.native
  trait TwitterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TwitterOutlinedIconType: String = js.native
  }
  
  type _To = TwitterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTwitterOutlinedMod.foo` */
  override def _to: TwitterOutlinedIconType = default
}
