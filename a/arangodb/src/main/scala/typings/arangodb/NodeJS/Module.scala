package typings.arangodb.NodeJS

import typings.arangodb.Foxx.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var context: Context
}

object Module {
  @scala.inline
  def apply(context: Context): Module = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Module]
  }
}

