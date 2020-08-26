package typings.arangodb.anon

import typings.arangodb.Foxx.Request
import typings.arangodb.Foxx.Response
import typings.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<arangodb.Foxx.DocumentationRouterOptions> */
@js.native
trait PartialDocumentationRoute extends js.Object {
  var before: js.UndefOr[js.Function2[/* req */ Request, /* res */ Response, Unit | `false`]] = js.native
  var indexFile: js.UndefOr[String] = js.native
  var mount: js.UndefOr[String] = js.native
  var swaggerRoot: js.UndefOr[String] = js.native
}

object PartialDocumentationRoute {
  @scala.inline
  def apply(): PartialDocumentationRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDocumentationRoute]
  }
  @scala.inline
  implicit class PartialDocumentationRouteOps[Self <: PartialDocumentationRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBefore(value: (/* req */ Request, /* res */ Response) => Unit | `false`): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setIndexFile(value: String): Self = this.set("indexFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexFile: Self = this.set("indexFile", js.undefined)
    @scala.inline
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMount: Self = this.set("mount", js.undefined)
    @scala.inline
    def setSwaggerRoot(value: String): Self = this.set("swaggerRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerRoot: Self = this.set("swaggerRoot", js.undefined)
  }
  
}

