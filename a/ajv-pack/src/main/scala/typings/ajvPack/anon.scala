package typings.ajvPack

import typings.ajv.mod.Ajv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(schema: js.Array[js.Object]): Ajv = js.native
    def apply(schema: js.Array[js.Object], key: String): Ajv = js.native
    def apply(schema: js.Object): Ajv = js.native
    def apply(schema: js.Object, key: String): Ajv = js.native
  }
}
