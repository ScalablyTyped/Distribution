package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tagging extends StObject {
  
  /**
    * A collection for a set of tags
    */
  var TagSet: typings.awsSdk.clientsS3Mod.TagSet
}
object Tagging {
  
  inline def apply(TagSet: TagSet): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tagging] (val x: Self) extends AnyVal {
    
    inline def setTagSet(value: TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    inline def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value*))
  }
}
