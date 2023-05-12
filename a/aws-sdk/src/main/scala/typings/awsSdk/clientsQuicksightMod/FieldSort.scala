package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSort extends StObject {
  
  /**
    * The sort direction. Choose one of the following options:    ASC: Ascending    DESC: Descending  
    */
  var Direction: SortDirection
  
  /**
    * The sort configuration target field.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
}
object FieldSort {
  
  inline def apply(Direction: SortDirection, FieldId: FieldId): FieldSort = {
    val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldSort] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: SortDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
  }
}
