package typings.antd

import typings.antd.antdBooleans.`false`
import typings.react.mod.ReactNode
import typings.scrollIntoViewIfNeeded.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form/util", JSImport.Namespace)
@js.native
object formUtilMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcFormInstance * / any */ @js.native
  trait FormInstance extends js.Object {
    var __INTERNAL__ : AnonName = js.native
    def scrollToField(name: String): Unit = js.native
    def scrollToField(name: String, options: Options[_]): Unit = js.native
    def scrollToField(name: Double): Unit = js.native
    def scrollToField(name: Double, options: Options[_]): Unit = js.native
    def scrollToField(name: InternalNamePath): Unit = js.native
    def scrollToField(name: InternalNamePath, options: Options[_]): Unit = js.native
  }
  
  def getFieldId(namePath: InternalNamePath): js.UndefOr[String] = js.native
  def getFieldId(namePath: InternalNamePath, formName: String): js.UndefOr[String] = js.native
  def toArray[T](): js.Array[T] = js.native
  def toArray[T](candidate: T): js.Array[T] = js.native
  def toArray[T](candidate: js.Array[T]): js.Array[T] = js.native
  @JSName("toArray")
  def toArray_false[T](candidate: `false`): js.Array[T] = js.native
  def useCacheErrors(
    errors: js.Array[ReactNode],
    changeTrigger: js.Function1[/* visible */ Boolean, Unit],
    directly: Boolean
  ): js.Tuple2[Boolean, js.Array[ReactNode]] = js.native
  def useForm(): js.Array[FormInstance] = js.native
  def useForm(form: FormInstance): js.Array[FormInstance] = js.native
  type InternalNamePath = js.Array[String | Double]
}

