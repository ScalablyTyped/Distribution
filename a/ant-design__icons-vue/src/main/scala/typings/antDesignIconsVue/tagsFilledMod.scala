package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TagsFilled", JSImport.Default)
  @js.native
  val default: TagsFilledIconType = js.native
  
  @js.native
  trait TagsFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TagsFilledIconType: String = js.native
  }
  
  type _To = TagsFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `tagsFilledMod.foo` */
  override def _to: TagsFilledIconType = default
}
