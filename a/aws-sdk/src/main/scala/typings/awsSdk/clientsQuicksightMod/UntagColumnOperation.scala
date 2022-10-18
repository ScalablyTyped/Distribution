package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagColumnOperation extends StObject {
  
  /**
    * The column that this operation acts on.
    */
  var ColumnName: typings.awsSdk.clientsQuicksightMod.ColumnName
  
  /**
    * The column tags to remove from this column.
    */
  var TagNames: ColumnTagNames
}
object UntagColumnOperation {
  
  inline def apply(ColumnName: ColumnName, TagNames: ColumnTagNames): UntagColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], TagNames = TagNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagColumnOperation]
  }
  
  extension [Self <: UntagColumnOperation](x: Self) {
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setTagNames(value: ColumnTagNames): Self = StObject.set(x, "TagNames", value.asInstanceOf[js.Any])
    
    inline def setTagNamesVarargs(value: ColumnTagName*): Self = StObject.set(x, "TagNames", js.Array(value*))
  }
}
