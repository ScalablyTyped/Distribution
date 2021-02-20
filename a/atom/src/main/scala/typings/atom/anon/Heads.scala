package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heads extends StObject {
  
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
  implicit class HeadsMutableBuilder[Self <: Heads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeads(value: js.Array[String]): Self = StObject.set(x, "heads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadsVarargs(value: String*): Self = StObject.set(x, "heads", js.Array(value :_*))
    
    @scala.inline
    def setRemotes(value: js.Array[String]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotesVarargs(value: String*): Self = StObject.set(x, "remotes", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
