package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformFilter extends StObject {
  
  /**
    * The operator to apply to the Type with each of the Values. Valid values: = | != | &lt; | &lt;= | &gt; | &gt;= | contains | begins_with | ends_with 
    */
  var Operator: js.UndefOr[PlatformFilterOperator] = js.undefined
  
  /**
    * The platform version attribute to which the filter values are applied. Valid values: PlatformName | PlatformVersion | PlatformStatus | PlatformBranchName | PlatformLifecycleState | PlatformOwner | SupportedTier | SupportedAddon | ProgrammingLanguageName | OperatingSystemName 
    */
  var Type: js.UndefOr[PlatformFilterType] = js.undefined
  
  /**
    * The list of values applied to the filtering platform version attribute. Only one value is supported for all current operators. The following list shows valid filter values for some filter attributes.    PlatformStatus: Creating | Failed | Ready | Deleting | Deleted     PlatformLifecycleState: recommended     SupportedTier: WebServer/Standard | Worker/SQS/HTTP     SupportedAddon: Log/S3 | Monitoring/Healthd | WorkerDaemon/SQSD   
    */
  var Values: js.UndefOr[PlatformFilterValueList] = js.undefined
}
object PlatformFilter {
  
  inline def apply(): PlatformFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformFilter]
  }
  
  extension [Self <: PlatformFilter](x: Self) {
    
    inline def setOperator(value: PlatformFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setType(value: PlatformFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValues(value: PlatformFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: PlatformFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
