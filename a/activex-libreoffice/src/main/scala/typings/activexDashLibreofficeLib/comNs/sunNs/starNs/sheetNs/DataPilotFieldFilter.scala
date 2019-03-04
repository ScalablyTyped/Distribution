package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPilotFieldFilter extends js.Object {
  /** Field name. */
  var FieldName: java.lang.String
  /**
    * String value that needs to match against, locale independent.
    *
    * This is the underlying value formatted in a standardized way, for example ISO 8601 YYYY-MM-DD for dates.
    */
  var MatchValue: java.lang.String
  /**
    * String value that needs to match against, locale dependent.
    *
    * This is the value as name/label as also displayed in the filter popup dialog, maybe formatted by user applied number formats.
    */
  var MatchValueName: java.lang.String
}

object DataPilotFieldFilter {
  @scala.inline
  def apply(FieldName: java.lang.String, MatchValue: java.lang.String, MatchValueName: java.lang.String): DataPilotFieldFilter = {
    val __obj = js.Dynamic.literal(FieldName = FieldName, MatchValue = MatchValue, MatchValueName = MatchValueName)
  
    __obj.asInstanceOf[DataPilotFieldFilter]
  }
}

