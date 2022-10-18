package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * A free-form text comment.
    */
  var Comment: js.UndefOr[CommentString] = js.undefined
  
  /**
    * The name of the Column.
    */
  var Name: NameString
  
  /**
    * These key-value pairs define properties associated with the column.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The data type of the Column.
    */
  var Type: js.UndefOr[ColumnTypeString] = js.undefined
}
object Column {
  
  inline def apply(Name: NameString): Column = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setComment(value: CommentString): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setType(value: ColumnTypeString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
