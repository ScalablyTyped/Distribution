package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeys extends js.Object {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfApiKey] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  /**
    * A list of warning messages logged during the import of API keys when the failOnWarnings option is set to true.
    */
  var warnings: js.UndefOr[ListOfString] = js.native
}
object ApiKeys {
  
  @scala.inline
  def apply(): ApiKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeys]
  }
  
  @scala.inline
  implicit class ApiKeysOps[Self <: ApiKeys] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ApiKey*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ListOfApiKey): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: ListOfString): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
