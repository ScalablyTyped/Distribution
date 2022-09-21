package typings.adeiraJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adeira/js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invariant(condition: Boolean, format: String, args: Any*): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")((List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isNumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nullthrows[T](x: Maybe[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nullthrows")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def nullthrows[T](x: Maybe[T], message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("nullthrows")(x.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def rangeMap[T](n: Double, fn: js.Function1[/* i */ Double, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeMap")(n.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def sprintf(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def warning(condition: Boolean, format: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")((List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  type Maybe[T] = js.UndefOr[Null | T]
}
