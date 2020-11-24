package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stages extends js.Object {
  
  /**
    * The current page of elements from this collection.
    */
  var item: js.UndefOr[ListOfStage] = js.native
}
object Stages {
  
  @scala.inline
  def apply(): Stages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stages]
  }
  
  @scala.inline
  implicit class StagesOps[Self <: Stages] (val x: Self) extends AnyVal {
    
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
    def setItemVarargs(value: Stage*): Self = this.set("item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: ListOfStage): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
}
