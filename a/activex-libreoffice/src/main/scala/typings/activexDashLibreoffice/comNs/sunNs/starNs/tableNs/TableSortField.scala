package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes how to sort a single field (row/column) in a tables sort descriptor.
  * @see com.sun.star.table.TableSortDescriptor2
  * @since OOo 1.1.2
  */
trait TableSortField extends js.Object {
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
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm, CollatorLocale = CollatorLocale, Field = Field, FieldType = FieldType, IsAscending = IsAscending, IsCaseSensitive = IsCaseSensitive)
  
    __obj.asInstanceOf[TableSortField]
  }
}

