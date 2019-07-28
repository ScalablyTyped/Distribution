package typings.arangodb

import typings.arangodb.FoxxNs.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModule extends js.Object {
  var context: Context
}

object NodeModule {
  @scala.inline
  def apply(context: Context): NodeModule = {
    val __obj = js.Dynamic.literal(context = context)
  
    __obj.asInstanceOf[NodeModule]
  }
}

