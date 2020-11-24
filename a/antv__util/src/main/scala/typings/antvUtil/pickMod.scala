package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/pick", JSImport.Namespace)
@js.native
object pickMod extends js.Object {
  
  def default[T](`object`: ObjectType[T], keys: js.Array[String]): ObjectType[T] = js.native
  
  type ObjectType[T] = StringDictionary[T]
}
