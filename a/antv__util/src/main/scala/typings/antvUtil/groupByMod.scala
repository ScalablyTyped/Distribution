package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupByMod {
  
  @JSImport("@antv/util/lib/group-by", JSImport.Default)
  @js.native
  def default[T](data: js.Array[T], condition: String): ObjectType[T] = js.native
  @JSImport("@antv/util/lib/group-by", JSImport.Default)
  @js.native
  def default[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = js.native
  
  type ObjectType[T] = StringDictionary[js.Array[T]]
}
