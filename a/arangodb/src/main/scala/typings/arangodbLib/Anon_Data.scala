package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
}

object Anon_Data {
  @scala.inline
  def apply(
    data: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_Data]
  }
}

