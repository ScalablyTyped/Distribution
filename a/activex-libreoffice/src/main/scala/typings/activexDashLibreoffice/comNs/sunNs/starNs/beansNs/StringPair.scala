package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a pair of two strings. */
trait StringPair extends js.Object {
  /** specifies the first of the two strings. */
  var First: String
  /** specifies the second of the two strings. */
  var Second: String
}

object StringPair {
  @scala.inline
  def apply(First: String, Second: String): StringPair = {
    val __obj = js.Dynamic.literal(First = First, Second = Second)
  
    __obj.asInstanceOf[StringPair]
  }
}

