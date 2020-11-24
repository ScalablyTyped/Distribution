package typings.antd

import typings.antd.anon.ItemRef
import typings.rcFieldForm.interfaceMod.NamePath
import typings.scrollIntoViewIfNeeded.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/form/hooks/useForm", JSImport.Namespace)
@js.native
object useFormMod extends js.Object {
  
  def default[Values](): js.Array[FormInstance[Values]] = js.native
  def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @js.native
  trait FormInstance[Values]
    extends typings.rcFieldForm.interfaceMod.FormInstance[Values] {
    
    /** This is an internal usage. Do not use in your prod */
    var __INTERNAL__ : ItemRef = js.native
    
    def getFieldInstance(name: NamePath): js.Any = js.native
    
    def scrollToField(name: NamePath): Unit = js.native
    def scrollToField(name: NamePath, options: Options[_]): Unit = js.native
  }
}
