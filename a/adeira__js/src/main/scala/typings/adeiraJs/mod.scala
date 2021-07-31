package typings.adeiraJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adeira/js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def invariant(condition: Boolean, format: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  @scala.inline
  def isNumeric(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObjectEmpty(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def nullthrows[T](x: Maybe[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nullthrows")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def nullthrows[T](x: Maybe[T], message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("nullthrows")(x.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def sprintf(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def warning(condition: Boolean, format: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Maybe[T] = js.UndefOr[Null | T]
}
