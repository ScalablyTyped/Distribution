package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGroupSchema extends StObject {
  
  /**
    * A structure containing the list of schemas for column group columns.
    */
  var ColumnGroupColumnSchemaList: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColumnGroupColumnSchemaList] = js.undefined
  
  /**
    * The name of the column group schema.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ColumnGroupSchema {
  
  inline def apply(): ColumnGroupSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupSchema]
  }
  
  extension [Self <: ColumnGroupSchema](x: Self) {
    
    inline def setColumnGroupColumnSchemaList(value: ColumnGroupColumnSchemaList): Self = StObject.set(x, "ColumnGroupColumnSchemaList", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupColumnSchemaListUndefined: Self = StObject.set(x, "ColumnGroupColumnSchemaList", js.undefined)
    
    inline def setColumnGroupColumnSchemaListVarargs(value: ColumnGroupColumnSchema*): Self = StObject.set(x, "ColumnGroupColumnSchemaList", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
