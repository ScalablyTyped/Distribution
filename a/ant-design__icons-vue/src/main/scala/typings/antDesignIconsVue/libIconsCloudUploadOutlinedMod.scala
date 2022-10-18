package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloudUploadOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloudUploadOutlined", JSImport.Default)
  @js.native
  val default: CloudUploadOutlinedIconType = js.native
  
  @js.native
  trait CloudUploadOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloudUploadOutlinedIconType: String = js.native
  }
  
  type _To = CloudUploadOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloudUploadOutlinedMod.foo` */
  override def _to: CloudUploadOutlinedIconType = default
}
