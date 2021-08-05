package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to specify how the labels have to be created.
  * @see XDataSequence.generateLabel().
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait LabelOrigin extends StObject
object LabelOrigin {
  
  /**
    * Uses the column name for label generation. A spreadsheet range A1:A6 could, e.g., result in "Column A".
    *
    * If a range consists of more than one column the result of label generation may be empty. Of course, it could also succeed with a string like "Columns
    * A to B".
    */
  inline def COLUMN: `2` = 2.asInstanceOf[`2`]
  
  /**
    * This is exactly the opposite of SHORT_SIDE. I.e., if SHORT_SIDE has the same effect as ROW, LONG_SIDE will have the same effect as COLUMN and the
    * other way round.
    * @see LabelOrigin.SHORT_SIDE
    */
  inline def LONG_SIDE: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Uses the column name for label generation. A spreadsheet range A2:D2 could, e.g., result in "Row 2".
    *
    * If a range consists of more than one row the result of label generation may be empty. Of course, it could also succeed with a string like "Rows 1-3".
    */
  inline def ROW: `3` = 3.asInstanceOf[`3`]
  
  /**
    * If a range spans a single row over more than one column, this parameter has the same effect as ROW. If the range spans a single column over more than
    * one row, this is the same as COLUMN.
    *
    * In case of a range spanning more than one column and row, the shorter range of both should be used (e.g. a spreadsheet range A1:B10 should treat
    * columns as short side).
    *
    * In case of a rectangular range, or a range that is composed of more than one contiguous sub-regions, the short side cannot be determined, thus {@link
    * XDataSequence.generateLabel()} will return an empty sequence.
    */
  inline def SHORT_SIDE: `0` = 0.asInstanceOf[`0`]
}
