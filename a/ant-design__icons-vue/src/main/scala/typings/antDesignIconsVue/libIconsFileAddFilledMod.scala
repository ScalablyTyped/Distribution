package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileAddFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileAddFilled", JSImport.Default)
  @js.native
  val default: FileAddFilledIconType = js.native
  
  @js.native
  trait FileAddFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileAddFilledIconType: String = js.native
  }
  
  type _To = FileAddFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileAddFilledMod.foo` */
  override def _to: FileAddFilledIconType = default
}
