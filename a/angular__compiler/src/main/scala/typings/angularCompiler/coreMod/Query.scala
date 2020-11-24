package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  var descendants: Boolean = js.native
  
  var first: Boolean = js.native
  
  var isViewQuery: Boolean = js.native
  
  var read: js.Any = js.native
  
  var selector: js.Any = js.native
  
  var static: js.UndefOr[Boolean] = js.native
}
object Query {
  
  @scala.inline
  def apply(descendants: Boolean, first: Boolean, isViewQuery: Boolean, read: js.Any, selector: js.Any): Query = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], isViewQuery = isViewQuery.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
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
    def setDescendants(value: Boolean): Self = this.set("descendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsViewQuery(value: Boolean): Self = this.set("isViewQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: js.Any): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
}
