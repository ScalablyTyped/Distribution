package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowLevelPermissionTagRule extends StObject {
  
  /**
    * The column name that a tag key is assigned to.
    */
  var ColumnName: String
  
  /**
    * A string that you want to use to filter by all the values in a column in the dataset and don’t want to list the values one by one. For example, you can use an asterisk as your match all value.
    */
  var MatchAllValue: js.UndefOr[SessionTagValue] = js.undefined
  
  /**
    * The unique key for a tag.
    */
  var TagKey: SessionTagKey
  
  /**
    * A string that you want to use to delimit the values when you pass the values at run time. For example, you can delimit the values with a comma.
    */
  var TagMultiValueDelimiter: js.UndefOr[RowLevelPermissionTagDelimiter] = js.undefined
}
object RowLevelPermissionTagRule {
  
  inline def apply(ColumnName: String, TagKey: SessionTagKey): RowLevelPermissionTagRule = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], TagKey = TagKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionTagRule]
  }
  
  extension [Self <: RowLevelPermissionTagRule](x: Self) {
    
    inline def setColumnName(value: String): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setMatchAllValue(value: SessionTagValue): Self = StObject.set(x, "MatchAllValue", value.asInstanceOf[js.Any])
    
    inline def setMatchAllValueUndefined: Self = StObject.set(x, "MatchAllValue", js.undefined)
    
    inline def setTagKey(value: SessionTagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagMultiValueDelimiter(value: RowLevelPermissionTagDelimiter): Self = StObject.set(x, "TagMultiValueDelimiter", value.asInstanceOf[js.Any])
    
    inline def setTagMultiValueDelimiterUndefined: Self = StObject.set(x, "TagMultiValueDelimiter", js.undefined)
  }
}
