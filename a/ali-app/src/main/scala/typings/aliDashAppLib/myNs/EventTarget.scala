package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTarget extends js.Object {
  var dataset: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var id: java.lang.String
  var tagName: java.lang.String
}

object EventTarget {
  @scala.inline
  def apply(
    dataset: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: java.lang.String,
    tagName: java.lang.String
  ): EventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[EventTarget]
  }
}

