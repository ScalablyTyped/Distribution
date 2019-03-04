package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var size: antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
  var spinning: scala.Boolean
  var wrapperClassName: java.lang.String
}

object Anon_Default {
  @scala.inline
  def apply(
    size: antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large,
    spinning: scala.Boolean,
    wrapperClassName: java.lang.String
  ): Anon_Default = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], spinning = spinning, wrapperClassName = wrapperClassName)
  
    __obj.asInstanceOf[Anon_Default]
  }
}

