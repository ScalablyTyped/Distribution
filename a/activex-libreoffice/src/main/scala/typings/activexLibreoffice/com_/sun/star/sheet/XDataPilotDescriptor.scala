package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the layout settings of a data pilot table.
  *
  * This interface extends the interface {@link com.sun.star.container.XNamed} which provides access to the name of the data pilot table used e.g. in
  * collections.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotDescriptor
  extends StObject
     with XNamed {
  
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val ColumnFields: XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val DataFields: XIndexAccess
  
  /** returns the collection of all the data pilot fields. */
  val DataPilotFields: XIndexAccess
  
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  val FilterDescriptor: XSheetFilterDescriptor
  
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val HiddenFields: XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val PageFields: XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val RowFields: XIndexAccess
  
  /** returns the cell range containing the data for the data pilot table. */
  var SourceRange: CellRangeAddress
  
  /** returns an additional string stored in the data pilot table. */
  var Tag: String
  
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getColumnFields(): XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getDataFields(): XIndexAccess
  
  /** returns the collection of all the data pilot fields. */
  def getDataPilotFields(): XIndexAccess
  
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  def getFilterDescriptor(): XSheetFilterDescriptor
  
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getHiddenFields(): XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getPageFields(): XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getRowFields(): XIndexAccess
  
  /** returns the cell range containing the data for the data pilot table. */
  def getSourceRange(): CellRangeAddress
  
  /** returns an additional string stored in the data pilot table. */
  def getTag(): String
  
  /** sets the cell range containing the data for the data pilot table. */
  def setSourceRange(aSourceRange: CellRangeAddress): Unit
  
  /** sets an additional string stored in the data pilot table. */
  def setTag(aTag: String): Unit
}
object XDataPilotDescriptor {
  
  inline def apply(
    ColumnFields: XIndexAccess,
    DataFields: XIndexAccess,
    DataPilotFields: XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: XIndexAccess,
    Name: String,
    PageFields: XIndexAccess,
    RowFields: XIndexAccess,
    SourceRange: CellRangeAddress,
    Tag: String,
    acquire: () => Unit,
    getColumnFields: () => XIndexAccess,
    getDataFields: () => XIndexAccess,
    getDataPilotFields: () => XIndexAccess,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getHiddenFields: () => XIndexAccess,
    getName: () => String,
    getPageFields: () => XIndexAccess,
    getRowFields: () => XIndexAccess,
    getSourceRange: () => CellRangeAddress,
    getTag: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setName: String => Unit,
    setSourceRange: CellRangeAddress => Unit,
    setTag: String => Unit
  ): XDataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields.asInstanceOf[js.Any], DataFields = DataFields.asInstanceOf[js.Any], DataPilotFields = DataPilotFields.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], HiddenFields = HiddenFields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFields = PageFields.asInstanceOf[js.Any], RowFields = RowFields.asInstanceOf[js.Any], SourceRange = SourceRange.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getPageFields = js.Any.fromFunction0(getPageFields), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
    __obj.asInstanceOf[XDataPilotDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataPilotDescriptor] (val x: Self) extends AnyVal {
    
    inline def setColumnFields(value: XIndexAccess): Self = StObject.set(x, "ColumnFields", value.asInstanceOf[js.Any])
    
    inline def setDataFields(value: XIndexAccess): Self = StObject.set(x, "DataFields", value.asInstanceOf[js.Any])
    
    inline def setDataPilotFields(value: XIndexAccess): Self = StObject.set(x, "DataPilotFields", value.asInstanceOf[js.Any])
    
    inline def setFilterDescriptor(value: XSheetFilterDescriptor): Self = StObject.set(x, "FilterDescriptor", value.asInstanceOf[js.Any])
    
    inline def setGetColumnFields(value: () => XIndexAccess): Self = StObject.set(x, "getColumnFields", js.Any.fromFunction0(value))
    
    inline def setGetDataFields(value: () => XIndexAccess): Self = StObject.set(x, "getDataFields", js.Any.fromFunction0(value))
    
    inline def setGetDataPilotFields(value: () => XIndexAccess): Self = StObject.set(x, "getDataPilotFields", js.Any.fromFunction0(value))
    
    inline def setGetFilterDescriptor(value: () => XSheetFilterDescriptor): Self = StObject.set(x, "getFilterDescriptor", js.Any.fromFunction0(value))
    
    inline def setGetHiddenFields(value: () => XIndexAccess): Self = StObject.set(x, "getHiddenFields", js.Any.fromFunction0(value))
    
    inline def setGetPageFields(value: () => XIndexAccess): Self = StObject.set(x, "getPageFields", js.Any.fromFunction0(value))
    
    inline def setGetRowFields(value: () => XIndexAccess): Self = StObject.set(x, "getRowFields", js.Any.fromFunction0(value))
    
    inline def setGetSourceRange(value: () => CellRangeAddress): Self = StObject.set(x, "getSourceRange", js.Any.fromFunction0(value))
    
    inline def setGetTag(value: () => String): Self = StObject.set(x, "getTag", js.Any.fromFunction0(value))
    
    inline def setHiddenFields(value: XIndexAccess): Self = StObject.set(x, "HiddenFields", value.asInstanceOf[js.Any])
    
    inline def setPageFields(value: XIndexAccess): Self = StObject.set(x, "PageFields", value.asInstanceOf[js.Any])
    
    inline def setRowFields(value: XIndexAccess): Self = StObject.set(x, "RowFields", value.asInstanceOf[js.Any])
    
    inline def setSetSourceRange(value: CellRangeAddress => Unit): Self = StObject.set(x, "setSourceRange", js.Any.fromFunction1(value))
    
    inline def setSetTag(value: String => Unit): Self = StObject.set(x, "setTag", js.Any.fromFunction1(value))
    
    inline def setSourceRange(value: CellRangeAddress): Self = StObject.set(x, "SourceRange", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
