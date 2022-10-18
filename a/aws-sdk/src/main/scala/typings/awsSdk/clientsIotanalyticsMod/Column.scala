package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * The name of the column.
    */
  var name: ColumnName
  
  /**
    * The type of data. For more information about the supported data types, see Common data types in the Glue Developer Guide.
    */
  var `type`: ColumnDataType
}
object Column {
  
  inline def apply(name: ColumnName, `type`: ColumnDataType): Column = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ColumnDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
