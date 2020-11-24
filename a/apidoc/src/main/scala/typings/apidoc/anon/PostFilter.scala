package typings.apidoc.anon

import typings.apidoc.mod.ParsedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostFilter extends js.Object {
  
  def postFilter(parsedFiles: js.Array[ParsedFile], parsedFilenames: js.Array[String]): Unit = js.native
}
object PostFilter {
  
  @scala.inline
  def apply(postFilter: (js.Array[ParsedFile], js.Array[String]) => Unit): PostFilter = {
    val __obj = js.Dynamic.literal(postFilter = js.Any.fromFunction2(postFilter))
    __obj.asInstanceOf[PostFilter]
  }
  
  @scala.inline
  implicit class PostFilterOps[Self <: PostFilter] (val x: Self) extends AnyVal {
    
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
    def setPostFilter(value: (js.Array[ParsedFile], js.Array[String]) => Unit): Self = this.set("postFilter", js.Any.fromFunction2(value))
  }
}
