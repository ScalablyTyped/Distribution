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
    before: (Request, Response) => scala.Unit | arangodbLib.arangodbLibNumbers.`false`,
    indexFile: java.lang.String,
    mount: java.lang.String,
    swaggerRoot: java.lang.String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction2(before), indexFile = indexFile, mount = mount, swaggerRoot = swaggerRoot)
  
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
}

