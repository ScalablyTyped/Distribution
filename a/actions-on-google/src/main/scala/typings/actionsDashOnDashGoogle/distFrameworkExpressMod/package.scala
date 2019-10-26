package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFrameworkExpressMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response

  type ExpressHandler = js.Function2[/* request */ Request, /* response */ Response, Unit]
}
