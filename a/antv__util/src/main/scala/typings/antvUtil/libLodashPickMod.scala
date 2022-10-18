package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashPickMod {
  
  @JSImport("@antv/util/lib/lodash/pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](`object`: ObjectType[T], keys: js.Array[String]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  type ObjectType[T] = StringDictionary[T]
}
