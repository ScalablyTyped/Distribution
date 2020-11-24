package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNamedQueryInput extends js.Object {
  
  /**
    * The unique ID of the query. Use ListNamedQueries to get query IDs.
    */
  var NamedQueryId: typings.awsSdk.athenaMod.NamedQueryId = js.native
}
object GetNamedQueryInput {
  
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): GetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamedQueryInput]
  }
  
  @scala.inline
  implicit class GetNamedQueryInputOps[Self <: GetNamedQueryInput] (val x: Self) extends AnyVal {
    
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
  }
}
