package typings.arangodb.Foxx

import typings.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationRouterOptions extends js.Object {
  
  def before(req: Request, res: Response): Unit | `false` = js.native
  
  var indexFile: String = js.native
  
  var mount: String = js.native
  
  var swaggerRoot: String = js.native
}
object DocumentationRouterOptions {
  
  @scala.inline
  def apply(
    before: (Request, Response) => Unit | `false`,
    indexFile: String,
    mount: String,
    swaggerRoot: String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction2(before), indexFile = indexFile.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], swaggerRoot = swaggerRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
  
  @scala.inline
  implicit class DocumentationRouterOptionsOps[Self <: DocumentationRouterOptions] (val x: Self) extends AnyVal {
    
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
    def setBefore(value: (Request, Response) => Unit | `false`): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndexFile(value: String): Self = this.set("indexFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwaggerRoot(value: String): Self = this.set("swaggerRoot", value.asInstanceOf[js.Any])
  }
}
