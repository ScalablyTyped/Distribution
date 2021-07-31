package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPilotFieldFilter extends StObject {
  
  /** Field name. */
  var FieldName: String
  
  /**
    * String value that needs to match against, locale independent.
    *
    * This is the underlying value formatted in a standardized way, for example ISO 8601 YYYY-MM-DD for dates.
    */
  var MatchValue: String
  
  /**
    * String value that needs to match against, locale dependent.
    *
    * This is the value as name/label as also displayed in the filter popup dialog, maybe formatted by user applied number formats.
    */
  var MatchValueName: String
}
object DataPilotFieldFilter {
  
  @scala.inline
  def apply(FieldName: String, MatchValue: String, MatchValueName: String): DataPilotFieldFilter = {
    val __obj = js.Dynamic.literal(FieldName = FieldName.asInstanceOf[js.Any], MatchValue = MatchValue.asInstanceOf[js.Any], MatchValueName = MatchValueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldFilter]
  }
  
  @scala.inline
  implicit class DataPilotFieldFilterMutableBuilder[Self <: DataPilotFieldFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "FieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchValue(value: String): Self = StObject.set(x, "MatchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchValueName(value: String): Self = StObject.set(x, "MatchValueName", value.asInstanceOf[js.Any])
  }
}
