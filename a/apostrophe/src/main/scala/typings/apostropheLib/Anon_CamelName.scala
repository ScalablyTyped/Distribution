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
    camelName: js.Function1[java.lang.String, java.lang.String],
    capitalizeFirst: js.Function1[java.lang.String, java.lang.String],
    error: js.Function1[java.lang.String, scala.Unit],
    generateId: js.Function0[java.lang.String]
  ): Anon_CamelName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camelName")(camelName)
    __obj.updateDynamic("capitalizeFirst")(capitalizeFirst)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("generateId")(generateId)
    __obj.asInstanceOf[Anon_CamelName]
  }
}

