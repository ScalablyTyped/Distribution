package typings.agilite.mod

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
    val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], ASC_VALUE = ASC_VALUE.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DESC_VALUE = DESC_VALUE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[sort]
  }
}

