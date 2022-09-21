package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropboxCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DropboxCircleFilled", JSImport.Default)
  @js.native
  val default: DropboxCircleFilledIconType = js.native
  
  @js.native
  trait DropboxCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DropboxCircleFilledIconType: String = js.native
  }
  
  type _To = DropboxCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `dropboxCircleFilledMod.foo` */
  override def _to: DropboxCircleFilledIconType = default
}
