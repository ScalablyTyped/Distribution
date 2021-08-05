package typings.arangodb.Foxx

import typings.arangodb.anon.Data
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDefinition extends StObject {
  
  var forClient: js.UndefOr[js.Function1[/* body */ js.Any, Data]] = js.undefined
  
  var fromClient: js.UndefOr[
    js.Function3[/* body */ String | Buffer, /* req */ Request, /* type */ MediaType, js.Any]
  ] = js.undefined
}
object TypeDefinition {
  
  inline def apply(): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinition]
  }
  
  extension [Self <: TypeDefinition](x: Self) {
    
    inline def setForClient(value: /* body */ js.Any => Data): Self = StObject.set(x, "forClient", js.Any.fromFunction1(value))
    
    inline def setForClientUndefined: Self = StObject.set(x, "forClient", js.undefined)
    
    inline def setFromClient(value: (/* body */ String | Buffer, /* req */ Request, /* type */ MediaType) => js.Any): Self = StObject.set(x, "fromClient", js.Any.fromFunction3(value))
    
    inline def setFromClientUndefined: Self = StObject.set(x, "fromClient", js.undefined)
  }
}
