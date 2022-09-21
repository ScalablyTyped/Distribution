package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BookFilled", JSImport.Default)
  @js.native
  val default: BookFilledIconType = js.native
  
  @js.native
  trait BookFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BookFilledIconType: String = js.native
  }
  
  type _To = BookFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `bookFilledMod.foo` */
  override def _to: BookFilledIconType = default
}
