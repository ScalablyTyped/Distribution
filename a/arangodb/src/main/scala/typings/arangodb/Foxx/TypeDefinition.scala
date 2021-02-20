package typings.arangodb.Foxx

import typings.arangodb.anon.Data
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDefinition extends StObject {
  
  var forClient: js.UndefOr[js.Function1[/* body */ js.Any, Data]] = js.native
  
  var fromClient: js.UndefOr[
    js.Function3[/* body */ String | Buffer, /* req */ Request, /* type */ MediaType, _]
  ] = js.native
}
object TypeDefinition {
  
  @scala.inline
  def apply(): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  implicit class TypeDefinitionMutableBuilder[Self <: TypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForClient(value: /* body */ js.Any => Data): Self = StObject.set(x, "forClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForClientUndefined: Self = StObject.set(x, "forClient", js.undefined)
    
    @scala.inline
    def setFromClient(value: (/* body */ String | Buffer, /* req */ Request, /* type */ MediaType) => _): Self = StObject.set(x, "fromClient", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFromClientUndefined: Self = StObject.set(x, "fromClient", js.undefined)
  }
}
