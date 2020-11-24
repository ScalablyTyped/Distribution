package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotResource extends js.Object {
  
  var NotResource: String | js.Array[String] = js.native
}
object NotResource {
  
  @scala.inline
  def apply(NotResource: String | js.Array[String]): NotResource = {
    val __obj = js.Dynamic.literal(NotResource = NotResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotResource]
  }
  
  @scala.inline
  implicit class NotResourceOps[Self <: NotResource] (val x: Self) extends AnyVal {
    
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
    def setNotResourceVarargs(value: String*): Self = this.set("NotResource", js.Array(value :_*))
    
    @scala.inline
    def setNotResource(value: String | js.Array[String]): Self = this.set("NotResource", value.asInstanceOf[js.Any])
  }
}
