package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PictureFilled", JSImport.Default)
  @js.native
  val default: PictureFilledIconType = js.native
  
  @js.native
  trait PictureFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PictureFilledIconType: String = js.native
  }
  
  type _To = PictureFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `pictureFilledMod.foo` */
  override def _to: PictureFilledIconType = default
}
