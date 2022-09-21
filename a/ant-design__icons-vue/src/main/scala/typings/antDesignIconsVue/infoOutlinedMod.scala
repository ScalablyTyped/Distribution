package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InfoOutlined", JSImport.Default)
  @js.native
  val default: InfoOutlinedIconType = js.native
  
  @js.native
  trait InfoOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InfoOutlinedIconType: String = js.native
  }
  
  type _To = InfoOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `infoOutlinedMod.foo` */
  override def _to: InfoOutlinedIconType = default
}
