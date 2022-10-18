package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSetMetadata extends StObject {
  
  /**
    * Information about the columns returned in a query result metadata.
    */
  var ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
}
object ResultSetMetadata {
  
  inline def apply(): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetMetadata]
  }
  
  extension [Self <: ResultSetMetadata](x: Self) {
    
    inline def setColumnInfo(value: ColumnInfoList): Self = StObject.set(x, "ColumnInfo", value.asInstanceOf[js.Any])
    
    inline def setColumnInfoUndefined: Self = StObject.set(x, "ColumnInfo", js.undefined)
    
    inline def setColumnInfoVarargs(value: ColumnInfo*): Self = StObject.set(x, "ColumnInfo", js.Array(value*))
  }
}
