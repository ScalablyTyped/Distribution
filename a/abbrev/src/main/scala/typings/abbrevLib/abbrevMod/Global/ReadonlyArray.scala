package typings
package abbrevLib.abbrevMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyArray[T] extends js.Object {
  def abbrev(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object ReadonlyArray {
  @scala.inline
  def apply[T](abbrev: () => org.scalablytyped.runtime.StringDictionary[java.lang.String]): ReadonlyArray[T] = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
  
    __obj.asInstanceOf[ReadonlyArray[T]]
  }
}

