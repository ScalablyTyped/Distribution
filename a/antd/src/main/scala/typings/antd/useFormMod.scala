package typings.antd

import typings.antd.anon.ItemRef
import typings.rcFieldForm.interfaceMod.NamePath
import typings.scrollIntoViewIfNeeded.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/form/hooks/useForm", JSImport.Namespace)
@js.native
object useFormMod extends js.Object {
  @js.native
  trait FormInstance
    extends typings.rcFieldForm.interfaceMod.FormInstance {
    /** This is an internal usage. Do not use in your prod */
    var __INTERNAL__ : ItemRef = js.native
    def getFieldInstance(name: NamePath): js.Any = js.native
    def scrollToField(name: NamePath): Unit = js.native
    def scrollToField(name: NamePath, options: Options): Unit = js.native
  }
  
  def default(): js.Array[FormInstance] = js.native
  def default(form: typings.rcFieldForm.interfaceMod.FormInstance): js.Array[FormInstance] = js.native
}

