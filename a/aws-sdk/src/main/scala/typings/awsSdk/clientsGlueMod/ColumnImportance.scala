package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnImportance extends StObject {
  
  /**
    * The name of a column.
    */
  var ColumnName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The column importance score for the column, as a decimal.
    */
  var Importance: js.UndefOr[GenericBoundedDouble] = js.undefined
}
object ColumnImportance {
  
  inline def apply(): ColumnImportance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnImportance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnImportance] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
    
    inline def setImportance(value: GenericBoundedDouble): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "Importance", js.undefined)
  }
}
