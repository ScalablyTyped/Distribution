package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRule extends StObject {
  
  /** expire date, e.g.: 2022-10-11T00:00:00.000Z date and days only set one. */
  var date: String
  
  /** expire after the days */
  var days: js.UndefOr[Double | String] = js.undefined
  
  /** rule id, if not set, OSS will auto create it with random string. */
  var id: js.UndefOr[String] = js.undefined
  
  /** store prefix */
  var prefix: String
  
  /** rule status, allow values: Enabled or Disabled */
  var status: RuleStatusType
}
object LifecycleRule {
  
  inline def apply(date: String, prefix: String, status: RuleStatusType): LifecycleRule = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDays(value: Double | String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RuleStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
