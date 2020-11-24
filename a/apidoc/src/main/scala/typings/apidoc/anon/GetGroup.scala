package typings.apidoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroup extends js.Object {
  
  var getGroup: js.UndefOr[js.Function0[String]] = js.native
  
  var markdownFields: js.UndefOr[js.Array[String]] = js.native
  
  var markdownRemovePTags: js.UndefOr[js.Array[String]] = js.native
  
  def parse(content: String, source: String, messages: String): Description = js.native
  
  var path: String = js.native
}
object GetGroup {
  
  @scala.inline
  def apply(parse: (String, String, String) => Description, path: String): GetGroup = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3(parse), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroup]
  }
  
  @scala.inline
  implicit class GetGroupOps[Self <: GetGroup] (val x: Self) extends AnyVal {
    
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
    def setParse(value: (String, String, String) => Description): Self = this.set("parse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGroup(value: () => String): Self = this.set("getGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGroup: Self = this.set("getGroup", js.undefined)
    
    @scala.inline
    def setMarkdownFieldsVarargs(value: String*): Self = this.set("markdownFields", js.Array(value :_*))
    
    @scala.inline
    def setMarkdownFields(value: js.Array[String]): Self = this.set("markdownFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownFields: Self = this.set("markdownFields", js.undefined)
    
    @scala.inline
    def setMarkdownRemovePTagsVarargs(value: String*): Self = this.set("markdownRemovePTags", js.Array(value :_*))
    
    @scala.inline
    def setMarkdownRemovePTags(value: js.Array[String]): Self = this.set("markdownRemovePTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownRemovePTags: Self = this.set("markdownRemovePTags", js.undefined)
  }
}
