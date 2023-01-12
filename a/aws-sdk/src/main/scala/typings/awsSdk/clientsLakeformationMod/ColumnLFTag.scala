package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnLFTag extends StObject {
  
  /**
    * The LF-tags attached to a column resource.
    */
  var LFTags: js.UndefOr[LFTagsList] = js.undefined
  
  /**
    * The name of a column resource.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object ColumnLFTag {
  
  inline def apply(): ColumnLFTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLFTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnLFTag] (val x: Self) extends AnyVal {
    
    inline def setLFTags(value: LFTagsList): Self = StObject.set(x, "LFTags", value.asInstanceOf[js.Any])
    
    inline def setLFTagsUndefined: Self = StObject.set(x, "LFTags", js.undefined)
    
    inline def setLFTagsVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTags", js.Array(value*))
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
