package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes how a single data column is treated when creating subtotals.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait SubTotalColumn extends StObject {
  
  /** the index of the column inside the source data area. */
  var Column: Double
  
  /** specifies what kind of subtotals are calculated. */
  var Function: GeneralFunction
}
object SubTotalColumn {
  
  @scala.inline
  def apply(Column: Double, Function: GeneralFunction): SubTotalColumn = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubTotalColumn]
  }
  
  @scala.inline
  implicit class SubTotalColumnMutableBuilder[Self <: SubTotalColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: GeneralFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
  }
}
