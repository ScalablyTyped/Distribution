package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUnknownFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileUnknownFilled", JSImport.Default)
  @js.native
  val default: FileUnknownFilledIconType = js.native
  
  @js.native
  trait FileUnknownFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileUnknownFilledIconType: String = js.native
  }
  
  type _To = FileUnknownFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileUnknownFilledMod.foo` */
  override def _to: FileUnknownFilledIconType = default
}
