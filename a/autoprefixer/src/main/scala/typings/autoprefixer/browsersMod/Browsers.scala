package typings.autoprefixer.browsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browsers extends js.Object {
  def isSelected(browser: String): Boolean
  def parse(queries: Queries): js.Array[String]
  def prefix(browser: String): String
}

object Browsers {
  @scala.inline
  def apply(isSelected: String => Boolean, parse: Queries => js.Array[String], prefix: String => String): Browsers = {
    val __obj = js.Dynamic.literal(isSelected = js.Any.fromFunction1(isSelected), parse = js.Any.fromFunction1(parse), prefix = js.Any.fromFunction1(prefix))
    __obj.asInstanceOf[Browsers]
  }
}

