package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationRouterOptions extends js.Object {
  var indexFile: java.lang.String
  var mount: java.lang.String
  var swaggerRoot: java.lang.String
  def before(req: Request, res: Response): scala.Unit | arangodbLib.arangodbLibNumbers.`false`
}

object DocumentationRouterOptions {
  @scala.inline
  def apply(
    before: js.Function2[Request, Response, scala.Unit | arangodbLib.arangodbLibNumbers.`false`],
    indexFile: java.lang.String,
    mount: java.lang.String,
    swaggerRoot: java.lang.String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("indexFile")(indexFile)
    __obj.updateDynamic("mount")(mount)
    __obj.updateDynamic("swaggerRoot")(swaggerRoot)
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
}

