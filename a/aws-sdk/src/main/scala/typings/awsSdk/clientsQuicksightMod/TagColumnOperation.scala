package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagColumnOperation extends StObject {
  
  /**
    * The column that this operation acts on.
    */
  var ColumnName: typings.awsSdk.clientsQuicksightMod.ColumnName
  
  /**
    * The dataset column tag, currently only used for geospatial type tagging.  This is not tags for the Amazon Web Services tagging feature. 
    */
  var Tags: ColumnTagList
}
object TagColumnOperation {
  
  inline def apply(ColumnName: ColumnName, Tags: ColumnTagList): TagColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagColumnOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagColumnOperation] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: ColumnTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: ColumnTag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
