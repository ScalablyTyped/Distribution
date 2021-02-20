package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object substituteMod {
  
  @JSImport("@antv/util/lib/substitute", JSImport.Default)
  @js.native
  def default[T](str: String, o: ObjectType[T]): String = js.native
  
  type ObjectType[T] = StringDictionary[T]
}
