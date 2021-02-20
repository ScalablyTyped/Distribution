package typings.arangodb.anon

import typings.arangodb.Foxx.Request
import typings.arangodb.Foxx.Response
import typings.arangodb.arangodbBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<arangodb.Foxx.DocumentationRouterOptions> */
@js.native
trait PartialDocumentationRoute extends StObject {
  
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
  implicit class PartialDocumentationRouteMutableBuilder[Self <: PartialDocumentationRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: (/* req */ Request, /* res */ Response) => Unit | `false`): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setIndexFile(value: String): Self = StObject.set(x, "indexFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFileUndefined: Self = StObject.set(x, "indexFile", js.undefined)
    
    @scala.inline
    def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    @scala.inline
    def setSwaggerRoot(value: String): Self = StObject.set(x, "swaggerRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwaggerRootUndefined: Self = StObject.set(x, "swaggerRoot", js.undefined)
  }
}
