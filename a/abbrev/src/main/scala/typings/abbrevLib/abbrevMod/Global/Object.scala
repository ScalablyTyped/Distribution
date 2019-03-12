package typings
package abbrevLib.abbrevMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def abbrev(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Object {
  @scala.inline
  def apply(abbrev: () => org.scalablytyped.runtime.StringDictionary[java.lang.String]): Object = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
  
    __obj.asInstanceOf[Object]
  }
}

