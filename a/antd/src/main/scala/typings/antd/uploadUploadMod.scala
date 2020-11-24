package typings.antd

import typings.antd.draggerMod.DraggerProps
import typings.antd.uploadInterfaceMod.UploadProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object uploadUploadMod extends js.Object {
  
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[PropsWithChildren[UploadProps[_]] with RefAttributes[_]] {
    
    var Dragger: FC[DraggerProps] = js.native
  }
}
