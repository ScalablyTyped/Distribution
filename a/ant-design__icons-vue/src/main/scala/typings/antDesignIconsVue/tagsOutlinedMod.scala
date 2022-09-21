package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TagsOutlined", JSImport.Default)
  @js.native
  val default: TagsOutlinedIconType = js.native
  
  @js.native
  trait TagsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TagsOutlinedIconType: String = js.native
  }
  
  type _To = TagsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `tagsOutlinedMod.foo` */
  override def _to: TagsOutlinedIconType = default
}
