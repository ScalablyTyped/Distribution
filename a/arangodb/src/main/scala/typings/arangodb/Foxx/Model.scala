package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var forClient: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
  
  var fromClient: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
  
  var schema: Schema
}
object Model {
  
  @scala.inline
  def apply(schema: Schema): Model = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForClient(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "forClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForClientUndefined: Self = StObject.set(x, "forClient", js.undefined)
    
    @scala.inline
    def setFromClient(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "fromClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromClientUndefined: Self = StObject.set(x, "fromClient", js.undefined)
    
    @scala.inline
    def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
