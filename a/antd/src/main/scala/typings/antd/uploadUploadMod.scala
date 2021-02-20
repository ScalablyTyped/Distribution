package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.draggerMod.DraggerProps
import typings.antd.uploadInterfaceMod.UploadProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadUploadMod extends Shortcut {
  
  @JSImport("antd/lib/upload/Upload", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[PropsWithChildren[UploadProps[_]] with RefAttributes[_]] {
    
    var Dragger: FC[DraggerProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `uploadUploadMod.foo` */
  override def _to: CompoundedComponent = default
}
