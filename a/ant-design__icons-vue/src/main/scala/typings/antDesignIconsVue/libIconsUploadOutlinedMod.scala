package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUploadOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UploadOutlined", JSImport.Default)
  @js.native
  val default: UploadOutlinedIconType = js.native
  
  @js.native
  trait UploadOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UploadOutlinedIconType: String = js.native
  }
  
  type _To = UploadOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUploadOutlinedMod.foo` */
  override def _to: UploadOutlinedIconType = default
}
