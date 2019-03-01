package typings
package alexaDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Subtitle extends js.Object {
  var subtitle: java.lang.String
  var title: java.lang.String
}

object Anon_Subtitle {
  @scala.inline
  def apply(subtitle: java.lang.String, title: java.lang.String): Anon_Subtitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subtitle")(subtitle)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Subtitle]
  }
}

