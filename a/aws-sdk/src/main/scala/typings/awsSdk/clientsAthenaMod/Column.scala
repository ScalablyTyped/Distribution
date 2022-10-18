package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * Optional information about the column.
    */
  var Comment: js.UndefOr[CommentString] = js.undefined
  
  /**
    * The name of the column.
    */
  var Name: NameString
  
  /**
    * The data type of the column.
    */
  var Type: js.UndefOr[TypeString] = js.undefined
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
    
    inline def setType(value: TypeString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
