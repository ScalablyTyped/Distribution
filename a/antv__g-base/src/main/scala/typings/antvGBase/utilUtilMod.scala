package typings.antvGBase

import typings.antvGBase.interfacesMod.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilUtilMod {
  
  @JSImport("@antv/g-base/lib/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def each(elements: js.Array[js.Any], func: js.Function2[/* v */ js.Any, /* k */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(elements: js.Object, func: js.Function2[/* v */ js.Any, /* k */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isAllowCapture(element: IBase): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowCapture")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  @JSImport("@antv/g-base/lib/util/util", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  @scala.inline
  def isFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isNil(value: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  @scala.inline
  def isObject[T](value: js.Any): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def isParent(container: js.Any, shape: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParent")(container.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(str: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C): Base & A & B & C = ^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any]).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: A): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  @scala.inline
  def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  
  @scala.inline
  def removeFromArray(arr: js.Array[js.Any], obj: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromArray")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def upperFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
