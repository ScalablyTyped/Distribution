package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CamelName extends js.Object {
  def camelName(s: java.lang.String): java.lang.String
  def capitalizeFirst(s: java.lang.String): java.lang.String
  def error(msg: java.lang.String): scala.Unit
  def generateId(): java.lang.String
}

object Anon_CamelName {
  @scala.inline
  def apply(
    camelName: java.lang.String => java.lang.String,
    capitalizeFirst: java.lang.String => java.lang.String,
    error: java.lang.String => scala.Unit,
    generateId: () => java.lang.String
  ): Anon_CamelName = {
    val __obj = js.Dynamic.literal(camelName = js.Any.fromFunction1(camelName), capitalizeFirst = js.Any.fromFunction1(capitalizeFirst), error = js.Any.fromFunction1(error), generateId = js.Any.fromFunction0(generateId))
  
    __obj.asInstanceOf[Anon_CamelName]
  }
}

