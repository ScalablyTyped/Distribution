package typings.asana.anon

import typings.asana.mod.resources.NextPage
import typings.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[T /* <: Resource */] extends js.Object {
  
  var data: js.Array[T] = js.native
  
  var next_page: js.UndefOr[NextPage] = js.native
}
object Data {
  
  @scala.inline
  def apply[T /* <: Resource */](data: js.Array[T]): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data[_], T /* <: Resource */] (val x: Self with Data[T]) extends AnyVal {
    
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_page(value: NextPage): Self = this.set("next_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_page: Self = this.set("next_page", js.undefined)
  }
}
