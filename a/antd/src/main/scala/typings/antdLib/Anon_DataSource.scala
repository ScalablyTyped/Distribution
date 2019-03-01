package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSource extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: scala.Boolean
  var titleText: java.lang.String
}

object Anon_DataSource {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], showSearch: scala.Boolean, titleText: java.lang.String): Anon_DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSource")(dataSource)
    __obj.updateDynamic("showSearch")(showSearch)
    __obj.updateDynamic("titleText")(titleText)
    __obj.asInstanceOf[Anon_DataSource]
  }
}

