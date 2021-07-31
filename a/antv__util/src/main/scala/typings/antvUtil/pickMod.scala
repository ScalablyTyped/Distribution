package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickMod {
  
  @JSImport("@antv/util/lib/pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](`object`: ObjectType[T], keys: js.Array[String]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  type ObjectType[T] = StringDictionary[T]
}
