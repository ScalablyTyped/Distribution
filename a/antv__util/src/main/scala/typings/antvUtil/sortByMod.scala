package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortByMod {
  
  @JSImport("@antv/util/lib/sort-by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[ObjectType[T]], key: String): js.Array[ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectType[T]]]
  inline def default[T](arr: js.Array[ObjectType[T]], key: js.Array[String]): js.Array[ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectType[T]]]
  inline def default[T](arr: js.Array[ObjectType[T]], key: js.Function): js.Array[ObjectType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectType[T]]]
  
  type ObjectType[T] = StringDictionary[T]
}
