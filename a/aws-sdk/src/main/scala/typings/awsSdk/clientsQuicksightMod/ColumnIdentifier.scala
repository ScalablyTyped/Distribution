package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnIdentifier extends StObject {
  
  /**
    * The name of the column.
    */
  var ColumnName: typings.awsSdk.clientsQuicksightMod.ColumnName
  
  /**
    * The data set that the column belongs to.
    */
  var DataSetIdentifier: typings.awsSdk.clientsQuicksightMod.DataSetIdentifier
}
object ColumnIdentifier {
  
  inline def apply(ColumnName: ColumnName, DataSetIdentifier: DataSetIdentifier): ColumnIdentifier = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], DataSetIdentifier = DataSetIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnIdentifier] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
  }
}
