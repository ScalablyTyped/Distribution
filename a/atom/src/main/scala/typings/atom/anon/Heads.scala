package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heads extends StObject {
  
  var heads: js.Array[String]
  
  var remotes: js.Array[String]
  
  var tags: js.Array[String]
}
object Heads {
  
  inline def apply(heads: js.Array[String], remotes: js.Array[String], tags: js.Array[String]): Heads = {
    val __obj = js.Dynamic.literal(heads = heads.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heads]
  }
  
  extension [Self <: Heads](x: Self) {
    
    inline def setHeads(value: js.Array[String]): Self = StObject.set(x, "heads", value.asInstanceOf[js.Any])
    
    inline def setHeadsVarargs(value: String*): Self = StObject.set(x, "heads", js.Array(value :_*))
    
    inline def setRemotes(value: js.Array[String]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
    
    inline def setRemotesVarargs(value: String*): Self = StObject.set(x, "remotes", js.Array(value :_*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
