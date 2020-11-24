package typings.antDesignProProvider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapsed extends js.Object {
  
  var collapsed: String = js.native
  
  var expand: String = js.native
  
  var inputPlaceholder: String = js.native
  
  var reset: String = js.native
  
  var search: String = js.native
  
  var selectPlaceholder: String = js.native
  
  var submit: String = js.native
}
object Collapsed {
  
  @scala.inline
  def apply(
    collapsed: String,
    expand: String,
    inputPlaceholder: String,
    reset: String,
    search: String,
    selectPlaceholder: String,
    submit: String
  ): Collapsed = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], inputPlaceholder = inputPlaceholder.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selectPlaceholder = selectPlaceholder.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsed]
  }
  
  @scala.inline
  implicit class CollapsedOps[Self <: Collapsed] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: String): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPlaceholder(value: String): Self = this.set("inputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: String): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectPlaceholder(value: String): Self = this.set("selectPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: String): Self = this.set("submit", value.asInstanceOf[js.Any])
  }
}
