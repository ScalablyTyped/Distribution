package typings.antvG2

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("@antv/g2/lib/util/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBetween(value: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def omit[T](obj: T, keys: js.Array[String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def padEnd(source: String, targetLength: Double, padValue: Any): String | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(source.asInstanceOf[js.Any], targetLength.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Any]]
  inline def padEnd(source: js.Array[Any], targetLength: Double, padValue: Any): String | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(source.asInstanceOf[js.Any], targetLength.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Any]]
  
  inline def uniq(sourceArray: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(sourceArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def uniq(sourceArray: js.Array[Any], targetArray: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(sourceArray.asInstanceOf[js.Any], targetArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def uniq(sourceArray: js.Array[Any], targetArray: js.Array[Any], map: Map[Any, Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(sourceArray.asInstanceOf[js.Any], targetArray.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def uniq(sourceArray: js.Array[Any], targetArray: Unit, map: Map[Any, Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(sourceArray.asInstanceOf[js.Any], targetArray.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
