package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PartitionOutlined", JSImport.Default)
  @js.native
  val default: PartitionOutlinedIconType = js.native
  
  @js.native
  trait PartitionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PartitionOutlinedIconType: String = js.native
  }
  
  type _To = PartitionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `partitionOutlinedMod.foo` */
  override def _to: PartitionOutlinedIconType = default
}
