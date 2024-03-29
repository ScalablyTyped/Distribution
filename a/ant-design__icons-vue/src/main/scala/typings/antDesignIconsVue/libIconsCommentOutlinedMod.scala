package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCommentOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CommentOutlined", JSImport.Default)
  @js.native
  val default: CommentOutlinedIconType = js.native
  
  @js.native
  trait CommentOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CommentOutlinedIconType: String = js.native
  }
  
  type _To = CommentOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCommentOutlinedMod.foo` */
  override def _to: CommentOutlinedIconType = default
}
