package typings
package adoneLib.adoneNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runtime extends js.Object {
   // TODO
  var app: js.Object
   // TODO
  var logger: js.Object
  var term: js.Object
}

object Runtime {
  @scala.inline
  def apply(app: js.Object, logger: js.Object, term: js.Object): Runtime = {
    val __obj = js.Dynamic.literal(app = app, logger = logger, term = term)
  
    __obj.asInstanceOf[Runtime]
  }
}

