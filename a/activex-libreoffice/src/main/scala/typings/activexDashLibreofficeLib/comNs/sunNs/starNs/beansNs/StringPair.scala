package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a pair of two strings. */
trait StringPair extends js.Object {
  /** specifies the first of the two strings. */
  var First: java.lang.String
  /** specifies the second of the two strings. */
  var Second: java.lang.String
}

object StringPair {
  @scala.inline
  def apply(First: java.lang.String, Second: java.lang.String): StringPair = {
    val __obj = js.Dynamic.literal(First = First, Second = Second)
  
    __obj.asInstanceOf[StringPair]
  }
}

