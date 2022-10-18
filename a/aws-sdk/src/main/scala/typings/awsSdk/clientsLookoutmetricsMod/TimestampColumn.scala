package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampColumn extends StObject {
  
  /**
    * The format of the timestamp column.
    */
  var ColumnFormat: js.UndefOr[DateTimeFormat] = js.undefined
  
  /**
    * The name of the timestamp column.
    */
  var ColumnName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.ColumnName] = js.undefined
}
object TimestampColumn {
  
  inline def apply(): TimestampColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampColumn]
  }
  
  extension [Self <: TimestampColumn](x: Self) {
    
    inline def setColumnFormat(value: DateTimeFormat): Self = StObject.set(x, "ColumnFormat", value.asInstanceOf[js.Any])
    
    inline def setColumnFormatUndefined: Self = StObject.set(x, "ColumnFormat", js.undefined)
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
  }
}
