package typings
package angularDashStrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Padding extends js.Object {
  var padding: java.lang.String | scala.Double
  var selector: java.lang.String
}

object Anon_Padding {
  @scala.inline
  def apply(padding: java.lang.String | scala.Double, selector: java.lang.String): Anon_Padding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_Padding]
  }
}

