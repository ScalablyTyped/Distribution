package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNamedQueryOutput extends js.Object {
  
  /**
    * The unique ID of the query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.athenaMod.NamedQueryId] = js.native
}
object CreateNamedQueryOutput {
  
  @scala.inline
  def apply(): CreateNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedQueryOutput]
  }
  
  @scala.inline
  implicit class CreateNamedQueryOutputOps[Self <: CreateNamedQueryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = this.set("NamedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedQueryId: Self = this.set("NamedQueryId", js.undefined)
  }
}
