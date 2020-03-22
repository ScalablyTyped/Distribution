package typings.arangodb

import typings.arangodb.Foxx.Request
import typings.arangodb.Foxx.Response
import typings.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<arangodb.Foxx.DocumentationRouterOptions> */
trait PartialDocumentationRoute extends js.Object {
  var before: js.UndefOr[js.Function2[/* req */ Request, /* res */ Response, Unit | `false`]] = js.undefined
  var indexFile: js.UndefOr[String] = js.undefined
  var mount: js.UndefOr[String] = js.undefined
  var swaggerRoot: js.UndefOr[String] = js.undefined
}

object PartialDocumentationRoute {
  @scala.inline
  def apply(
    before: (/* req */ Request, /* res */ Response) => Unit | `false` = null,
    indexFile: String = null,
    mount: String = null,
    swaggerRoot: String = null
  ): PartialDocumentationRoute = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (indexFile != null) __obj.updateDynamic("indexFile")(indexFile.asInstanceOf[js.Any])
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    if (swaggerRoot != null) __obj.updateDynamic("swaggerRoot")(swaggerRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDocumentationRoute]
  }
}

