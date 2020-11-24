package typings.arangodb.Foxx

import typings.arangodb.anon.Data
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDefinition extends js.Object {
  
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
  implicit class TypeDefinitionOps[Self <: TypeDefinition] (val x: Self) extends AnyVal {
    
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
    def setForClient(value: /* body */ js.Any => Data): Self = this.set("forClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteForClient: Self = this.set("forClient", js.undefined)
    
    @scala.inline
    def setFromClient(value: (/* body */ String | Buffer, /* req */ Request, /* type */ MediaType) => _): Self = this.set("fromClient", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFromClient: Self = this.set("fromClient", js.undefined)
  }
}
