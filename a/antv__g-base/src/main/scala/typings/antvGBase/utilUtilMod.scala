package typings.antvGBase

import typings.antvGBase.interfacesMod.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilUtilMod {
  
  @JSImport("@antv/g-base/lib/util/util", "each")
  @js.native
  def each(elements: js.Array[_], func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  @JSImport("@antv/g-base/lib/util/util", "each")
  @js.native
  def each(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, _]): Unit = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isAllowCapture")
  @js.native
  def isAllowCapture(element: IBase): Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isArray")
  @js.native
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isFunction")
  @js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isNil")
  @js.native
  def isNil(value: js.Any): /* is null */ Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isObject")
  @js.native
  def isObject[T](value: js.Any): /* is T */ Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isParent")
  @js.native
  def isParent(container: js.Any, shape: js.Any): Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "isString")
  @js.native
  def isString(str: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B, src3: C): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: js.UndefOr[scala.Nothing], src3: C): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B, src3: C): Base with A with B with C = js.native
  @JSImport("@antv/g-base/lib/util/util", "mix")
  @js.native
  def mix[Base, A, B, C](
    dist: Base with A with B with C,
    src1: js.UndefOr[scala.Nothing],
    src2: js.UndefOr[scala.Nothing],
    src3: C
  ): Base with A with B with C = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "removeFromArray")
  @js.native
  def removeFromArray(arr: js.Array[_], obj: js.Any): Unit = js.native
  
  @JSImport("@antv/g-base/lib/util/util", "upperFirst")
  @js.native
  def upperFirst(value: String): String = js.native
}
