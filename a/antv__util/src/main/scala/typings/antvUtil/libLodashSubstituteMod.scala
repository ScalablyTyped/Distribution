package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashSubstituteMod {
  
  @JSImport("@antv/util/lib/lodash/substitute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](str: String, o: ObjectType[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ObjectType[T] = StringDictionary[T]
}
