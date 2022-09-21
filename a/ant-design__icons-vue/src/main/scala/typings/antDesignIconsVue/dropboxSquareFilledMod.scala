package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropboxSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DropboxSquareFilled", JSImport.Default)
  @js.native
  val default: DropboxSquareFilledIconType = js.native
  
  @js.native
  trait DropboxSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DropboxSquareFilledIconType: String = js.native
  }
  
  type _To = DropboxSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `dropboxSquareFilledMod.foo` */
  override def _to: DropboxSquareFilledIconType = default
}
