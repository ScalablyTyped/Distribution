package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a field in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalField
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalField
  extends StObject
     with XInterface {
  
  /** returns the column by which entries are grouped. */
  var GroupColumn: Double
  
  /** returns the definitions of which columns should have subtotals added to them. */
  var SubTotalColumns: SafeArray[SubTotalColumn]
  
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): Double
  
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): SafeArray[SubTotalColumn]
  
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: Double): Unit
  
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: SeqEquiv[SubTotalColumn]): Unit
}
object XSubTotalField {
  
  inline def apply(
    GroupColumn: Double,
    SubTotalColumns: SafeArray[SubTotalColumn],
    acquire: () => Unit,
    getGroupColumn: () => Double,
    getSubTotalColumns: () => SafeArray[SubTotalColumn],
    queryInterface: `type` => Any,
    release: () => Unit,
    setGroupColumn: Double => Unit,
    setSubTotalColumns: SeqEquiv[SubTotalColumn] => Unit
  ): XSubTotalField = {
    val __obj = js.Dynamic.literal(GroupColumn = GroupColumn.asInstanceOf[js.Any], SubTotalColumns = SubTotalColumns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroupColumn = js.Any.fromFunction0(getGroupColumn), getSubTotalColumns = js.Any.fromFunction0(getSubTotalColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroupColumn = js.Any.fromFunction1(setGroupColumn), setSubTotalColumns = js.Any.fromFunction1(setSubTotalColumns))
    __obj.asInstanceOf[XSubTotalField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSubTotalField] (val x: Self) extends AnyVal {
    
    inline def setGetGroupColumn(value: () => Double): Self = StObject.set(x, "getGroupColumn", js.Any.fromFunction0(value))
    
    inline def setGetSubTotalColumns(value: () => SafeArray[SubTotalColumn]): Self = StObject.set(x, "getSubTotalColumns", js.Any.fromFunction0(value))
    
    inline def setGroupColumn(value: Double): Self = StObject.set(x, "GroupColumn", value.asInstanceOf[js.Any])
    
    inline def setSetGroupColumn(value: Double => Unit): Self = StObject.set(x, "setGroupColumn", js.Any.fromFunction1(value))
    
    inline def setSetSubTotalColumns(value: SeqEquiv[SubTotalColumn] => Unit): Self = StObject.set(x, "setSubTotalColumns", js.Any.fromFunction1(value))
    
    inline def setSubTotalColumns(value: SafeArray[SubTotalColumn]): Self = StObject.set(x, "SubTotalColumns", value.asInstanceOf[js.Any])
  }
}
