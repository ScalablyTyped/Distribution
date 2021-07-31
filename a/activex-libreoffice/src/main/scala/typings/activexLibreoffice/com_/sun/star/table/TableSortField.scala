package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes how to sort a single field (row/column) in a tables sort descriptor.
  * @see com.sun.star.table.TableSortDescriptor2
  * @since OOo 1.1.2
  */
trait TableSortField extends StObject {
  
  /**
    * the algorithm used by the collator when comparing/sorting text.
    *
    * This property will not be used when the "FieldType" is com::sun::star::table::TableSortFieldType::NUMERIC
    * @see com.sun.star.i18n.XCollator
    */
  var CollatorAlgorithm: String
  
  /**
    * the locale used by the collator when comparing/sorting text.
    *
    * This property will not be used when the "FieldType" is com::sun::star::table::TableSortFieldType::NUMERIC
    * @see com.sun.star.i18n.XCollator
    */
  var CollatorLocale: Locale
  
  /** index of the row or column in the table to be sorted; 0-based. */
  var Field: Double
  
  /**
    * type of contents in the field.
    *
    * If the value is com::sun::star::table::TableSortFieldType::AUTOMATIC the algorithm used for sorting is application specific. Especially it may or may
    * not use the values given by "CollatorLocale" and "CollatorAlgorithm".
    */
  var FieldType: TableSortFieldType
  
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: Boolean
  
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean
}
object TableSortField {
  
  @scala.inline
  def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    Field: Double,
    FieldType: TableSortFieldType,
    IsAscending: Boolean,
    IsCaseSensitive: Boolean
  ): TableSortField = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortField]
  }
  
  @scala.inline
  implicit class TableSortFieldMutableBuilder[Self <: TableSortField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollatorAlgorithm(value: String): Self = StObject.set(x, "CollatorAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollatorLocale(value: Locale): Self = StObject.set(x, "CollatorLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Double): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: TableSortFieldType): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAscending(value: Boolean): Self = StObject.set(x, "IsAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "IsCaseSensitive", value.asInstanceOf[js.Any])
  }
}
