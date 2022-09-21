package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DatabaseTwoTone", JSImport.Default)
  @js.native
  val default: DatabaseTwoToneIconType = js.native
  
  @js.native
  trait DatabaseTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DatabaseTwoToneIconType: String = js.native
  }
  
  type _To = DatabaseTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `databaseTwoToneMod.foo` */
  override def _to: DatabaseTwoToneIconType = default
}
