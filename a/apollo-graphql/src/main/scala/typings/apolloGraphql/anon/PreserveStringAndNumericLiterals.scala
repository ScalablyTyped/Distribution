package typings.apolloGraphql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreserveStringAndNumericLiterals extends js.Object {
  var preserveStringAndNumericLiterals: Boolean
}

object PreserveStringAndNumericLiterals {
  @scala.inline
  def apply(preserveStringAndNumericLiterals: Boolean): PreserveStringAndNumericLiterals = {
    val __obj = js.Dynamic.literal(preserveStringAndNumericLiterals = preserveStringAndNumericLiterals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveStringAndNumericLiterals]
  }
}

