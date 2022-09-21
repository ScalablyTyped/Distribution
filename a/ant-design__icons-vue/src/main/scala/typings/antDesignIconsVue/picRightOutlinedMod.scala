package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PicRightOutlined", JSImport.Default)
  @js.native
  val default: PicRightOutlinedIconType = js.native
  
  @js.native
  trait PicRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PicRightOutlinedIconType: String = js.native
  }
  
  type _To = PicRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `picRightOutlinedMod.foo` */
  override def _to: PicRightOutlinedIconType = default
}
