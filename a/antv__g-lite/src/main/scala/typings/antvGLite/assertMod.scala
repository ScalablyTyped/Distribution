package typings.antvGLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("@antv/g-lite/dist/utils/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DCHECK(bool: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DCHECK")(bool.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def DCHECK_EQ(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DCHECK_EQ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def DCHECK_NE(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DCHECK_NE")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def definedProps(obj: js.Object): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("definedProps")(obj.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def formatAttribute(name: String, value: Any): js.Tuple2[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, Any]]
  
  inline def isFunction(func: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
}
