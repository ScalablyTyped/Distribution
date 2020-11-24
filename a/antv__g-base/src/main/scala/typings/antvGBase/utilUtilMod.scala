package typings.antvGBase

import typings.antvGBase.interfacesMod.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/util/util", JSImport.Namespace)
@js.native
object utilUtilMod extends js.Object {
  
  def each(elements: js.Array[_], func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  def each(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  
  def isAllowCapture(element: IBase): Boolean = js.native
  
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  val isBrowser: Boolean = js.native
  
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  def isNil(value: js.Any): /* is null */ Boolean = js.native
  
  def isObject[T](value: js.Any): /* is T */ Boolean = js.native
  
  def isParent(container: js.Any, shape: js.Any): Boolean = js.native
  
  def isString(str: js.Any): /* is string */ Boolean = js.native
  
  def mix[Base, A, B, C](dist: Base with A with B with C): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B, src3: C): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: js.UndefOr[scala.Nothing], src3: C): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B): Base with A with B with C = js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B, src3: C): Base with A with B with C = js.native
  def mix[Base, A, B, C](
    dist: Base with A with B with C,
    src1: js.UndefOr[scala.Nothing],
    src2: js.UndefOr[scala.Nothing],
    src3: C
  ): Base with A with B with C = js.native
  
  def removeFromArray(arr: js.Array[_], obj: js.Any): Unit = js.native
  
  def upperFirst(value: String): String = js.native
}
