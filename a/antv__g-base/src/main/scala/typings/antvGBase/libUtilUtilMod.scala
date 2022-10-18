package typings.antvGBase

import typings.antvGBase.libInterfacesMod.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilUtilMod {
  
  @JSImport("@antv/g-base/lib/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each(elements: js.Array[Any], func: js.Function2[/* v */ Any, /* k */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(elements: js.Object, func: js.Function2[/* v */ Any, /* k */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(elements.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAllowCapture(element: IBase): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowCapture")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArray(value: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  @JSImport("@antv/g-base/lib/util/util", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNil(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isObject[T](value: Any): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isParent(container: Any, shape: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParent")(container.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isString(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def mix[Base, A, B, C](dist: Base & A & B & C): Base & A & B & C = ^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any]).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: A, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: B, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  inline def mix[Base, A, B, C](dist: Base & A & B & C, src1: Unit, src2: Unit, src3: C): Base & A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(dist.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[Base & A & B & C]
  
  inline def removeFromArray(arr: js.Array[Any], obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromArray")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def upperFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
