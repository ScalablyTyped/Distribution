package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/substitute", JSImport.Namespace)
@js.native
object substituteMod extends js.Object {
  
  def default[T](str: String, o: ObjectType[T]): String = js.native
  
  type ObjectType[T] = StringDictionary[T]
}
