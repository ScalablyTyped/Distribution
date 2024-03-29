package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDatabaseTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DatabaseTwoTone", JSImport.Default)
  @js.native
  val default: DatabaseTwoToneIconType = js.native
  
  @js.native
  trait DatabaseTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DatabaseTwoToneIconType: String = js.native
  }
  
  type _To = DatabaseTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDatabaseTwoToneMod.foo` */
  override def _to: DatabaseTwoToneIconType = default
}
