package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickMod {
  
  @JSImport("@antv/util/lib/pick", JSImport.Default)
  @js.native
  def default[T](`object`: ObjectType[T], keys: js.Array[String]): ObjectType[T] = js.native
  
  type ObjectType[T] = StringDictionary[T]
}
