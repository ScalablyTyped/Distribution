package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPilotFieldFilter extends js.Object {
  
  /** Field name. */
  var FieldName: String = js.native
  
  /**
    * String value that needs to match against, locale independent.
    *
    * This is the underlying value formatted in a standardized way, for example ISO 8601 YYYY-MM-DD for dates.
    */
  var MatchValue: String = js.native
  
  /**
    * String value that needs to match against, locale dependent.
    *
    * This is the value as name/label as also displayed in the filter popup dialog, maybe formatted by user applied number formats.
    */
  var MatchValueName: String = js.native
}
object DataPilotFieldFilter {
  
  @scala.inline
  def apply(FieldName: String, MatchValue: String, MatchValueName: String): DataPilotFieldFilter = {
    val __obj = js.Dynamic.literal(FieldName = FieldName.asInstanceOf[js.Any], MatchValue = MatchValue.asInstanceOf[js.Any], MatchValueName = MatchValueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldFilter]
  }
  
  @scala.inline
  implicit class DataPilotFieldFilterOps[Self <: DataPilotFieldFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("FieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchValue(value: String): Self = this.set("MatchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchValueName(value: String): Self = this.set("MatchValueName", value.asInstanceOf[js.Any])
  }
}
