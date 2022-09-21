package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TagOutlined", JSImport.Default)
  @js.native
  val default: TagOutlinedIconType = js.native
  
  @js.native
  trait TagOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TagOutlinedIconType: String = js.native
  }
  
  type _To = TagOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `tagOutlinedMod.foo` */
  override def _to: TagOutlinedIconType = default
}
