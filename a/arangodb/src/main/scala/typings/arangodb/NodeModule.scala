package typings.arangodb

import typings.arangodb.Foxx.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModule extends js.Object {
  var context: Context
}

object NodeModule {
  @scala.inline
  def apply(context: Context): NodeModule = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
}

