package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSchema extends StObject {
  
  /**
    * The data type of the column schema.
    */
  var DataType: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic role of the column schema.
    */
  var GeographicRole: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the column schema.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ColumnSchema {
  
  inline def apply(): ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSchema] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setGeographicRole(value: String): Self = StObject.set(x, "GeographicRole", value.asInstanceOf[js.Any])
    
    inline def setGeographicRoleUndefined: Self = StObject.set(x, "GeographicRole", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
