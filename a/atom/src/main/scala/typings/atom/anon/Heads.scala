package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heads extends js.Object {
  
  var heads: js.Array[String] = js.native
  
  var remotes: js.Array[String] = js.native
  
  var tags: js.Array[String] = js.native
}
object Heads {
  
  @scala.inline
  def apply(heads: js.Array[String], remotes: js.Array[String], tags: js.Array[String]): Heads = {
    val __obj = js.Dynamic.literal(heads = heads.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heads]
  }
  
  @scala.inline
  implicit class HeadsOps[Self <: Heads] (val x: Self) extends AnyVal {
    
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
    def setHeadsVarargs(value: String*): Self = this.set("heads", js.Array(value :_*))
    
    @scala.inline
    def setHeads(value: js.Array[String]): Self = this.set("heads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotesVarargs(value: String*): Self = this.set("remotes", js.Array(value :_*))
    
    @scala.inline
    def setRemotes(value: js.Array[String]): Self = this.set("remotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
