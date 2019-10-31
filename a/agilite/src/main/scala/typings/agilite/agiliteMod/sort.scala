package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sort extends js.Object {
  var ASC: String
  var ASC_VALUE: String
  var DESC: String
  var DESC_VALUE: String
}

object sort {
  @scala.inline
  def apply(ASC: String, ASC_VALUE: String, DESC: String, DESC_VALUE: String): sort = {
    val __obj = js.Dynamic.literal(ASC = ASC, ASC_VALUE = ASC_VALUE, DESC = DESC, DESC_VALUE = DESC_VALUE)
  
    __obj.asInstanceOf[sort]
  }
}

