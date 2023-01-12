package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Csv extends StObject {
  
  /**
    * The column names specified in the .csv file.
    */
  var columnNames: js.UndefOr[ColumnNames] = js.undefined
}
object Csv {
  
  inline def apply(): Csv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Csv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Csv] (val x: Self) extends AnyVal {
    
    inline def setColumnNames(value: ColumnNames): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: ColumnName*): Self = StObject.set(x, "columnNames", js.Array(value*))
  }
}
