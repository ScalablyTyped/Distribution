package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPictureFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PictureFilled", JSImport.Default)
  @js.native
  val default: PictureFilledIconType = js.native
  
  @js.native
  trait PictureFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PictureFilledIconType: String = js.native
  }
  
  type _To = PictureFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPictureFilledMod.foo` */
  override def _to: PictureFilledIconType = default
}
