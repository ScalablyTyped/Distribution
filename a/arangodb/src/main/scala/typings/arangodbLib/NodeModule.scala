package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModule extends js.Object {
  var context: arangodbLib.FoxxNs.Context
}

object NodeModule {
  @scala.inline
  def apply(context: arangodbLib.FoxxNs.Context): NodeModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[NodeModule]
  }
}

