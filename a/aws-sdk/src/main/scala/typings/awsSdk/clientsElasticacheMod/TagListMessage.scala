package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagListMessage extends StObject {
  
  /**
    * A list of tags as key-value pairs.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsElasticacheMod.TagList] = js.undefined
}
object TagListMessage {
  
  inline def apply(): TagListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagListMessage]
  }
  
  extension [Self <: TagListMessage](x: Self) {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
