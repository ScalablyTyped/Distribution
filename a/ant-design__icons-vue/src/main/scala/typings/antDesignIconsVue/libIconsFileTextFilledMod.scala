package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileTextFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileTextFilled", JSImport.Default)
  @js.native
  val default: FileTextFilledIconType = js.native
  
  @js.native
  trait FileTextFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileTextFilledIconType: String = js.native
  }
  
  type _To = FileTextFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileTextFilledMod.foo` */
  override def _to: FileTextFilledIconType = default
}
