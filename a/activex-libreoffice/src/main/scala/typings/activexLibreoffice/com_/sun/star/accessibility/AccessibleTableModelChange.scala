package typings.activexLibreoffice.com_.sun.star.accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure lets an event give access to a change of a table model.
  *
  * The data members of the {@link AccessibleTableModelChange} structure give access to the type and cell range of a change of a table model. See {@link
  * AccessibleTableModelChangeType} for details of the change type. The range of the affected rows, columns, and/or cells can be obtained by accessing the
  * other four data members.
  * @since OOo 1.1.2
  */
trait AccessibleTableModelChange extends StObject {
  
  /**
    * The lowest index of a column that has changed.
    *
    * The first column that has been changed or contains modified cells.
    */
  var FirstColumn: Double
  
  /**
    * The lowest index of a row that has changed.
    *
    * The first row that has been changed or that contains modified cells.
    */
  var FirstRow: Double
  
  /**
    * The highest index of a column that has changed.
    *
    * The last column that has been changed or contains modified cells.
    */
  var LastColumn: Double
  
  /**
    * The highest index of a row that has changed.
    *
    * The last row that has been changed or that contains modified cells.
    */
  var LastRow: Double
  
  /**
    * The type of the event as defined in {@link AccessibleTableModelChangeType} .
    *
    * The model change either inserted or deleted one or more rows and/or columns or modified the content of a number of cells. See {@link
    * AccessibleTableModelChangeType} for details of the type of the model change.
    */
  var Type: Double
}
object AccessibleTableModelChange {
  
  inline def apply(FirstColumn: Double, FirstRow: Double, LastColumn: Double, LastRow: Double, Type: Double): AccessibleTableModelChange = {
    val __obj = js.Dynamic.literal(FirstColumn = FirstColumn.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], LastColumn = LastColumn.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibleTableModelChange]
  }
  
  extension [Self <: AccessibleTableModelChange](x: Self) {
    
    inline def setFirstColumn(value: Double): Self = StObject.set(x, "FirstColumn", value.asInstanceOf[js.Any])
    
    inline def setFirstRow(value: Double): Self = StObject.set(x, "FirstRow", value.asInstanceOf[js.Any])
    
    inline def setLastColumn(value: Double): Self = StObject.set(x, "LastColumn", value.asInstanceOf[js.Any])
    
    inline def setLastRow(value: Double): Self = StObject.set(x, "LastRow", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
