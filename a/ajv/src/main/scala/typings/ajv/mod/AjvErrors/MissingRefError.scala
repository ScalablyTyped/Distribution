package typings.ajv.mod.AjvErrors

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MissingRefError extends Error {
  
  var missingRef: String = js.native
  
  var missingSchema: String = js.native
}
object MissingRefError {
  
  @scala.inline
  def apply(message: String, missingRef: String, missingSchema: String, name: String): MissingRefError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missingRef = missingRef.asInstanceOf[js.Any], missingSchema = missingSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingRefError]
  }
  
  @scala.inline
  implicit class MissingRefErrorOps[Self <: MissingRefError] (val x: Self) extends AnyVal {
    
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
    def setMissingRef(value: String): Self = this.set("missingRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingSchema(value: String): Self = this.set("missingSchema", value.asInstanceOf[js.Any])
  }
}
