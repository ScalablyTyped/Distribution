package typings.awsSdk.anon

import typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
import typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentId
import typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentIdList
import typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName
import typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentNamesList
import typings.awsSdk.clientsElasticbeanstalkMod.IncludeDeleted
import typings.awsSdk.clientsElasticbeanstalkMod.MaxRecords
import typings.awsSdk.clientsElasticbeanstalkMod.Token
import typings.awsSdk.clientsElasticbeanstalkMod.VersionLabel
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elasticbeanstalk.DescribeEnvironmentsMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeEnvironmentsMessa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified IDs.
    */
  var EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.undefined
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified names.
    */
  var EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.undefined
  
  /**
    * Indicates whether to include deleted environments:  true: Environments that have been deleted after IncludedDeletedBackTo are displayed.  false: Do not include deleted environments.
    */
  var IncludeDeleted: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.IncludeDeleted] = js.undefined
  
  /**
    *  If specified when IncludeDeleted is set to true, then environments deleted after this date are displayed. 
    */
  var IncludedDeletedBackTo: js.UndefOr[js.Date] = js.undefined
  
  /**
    * For a paginated request. Specify a maximum number of environments to include in each response. If no MaxRecords is specified, all available environments are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.MaxRecords] = js.undefined
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application version.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}
object DescribeEnvironmentsMessa {
  
  inline def apply(): DescribeEnvironmentsMessa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsMessa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEnvironmentsMessa] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setEnvironmentIds(value: EnvironmentIdList): Self = StObject.set(x, "EnvironmentIds", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdsUndefined: Self = StObject.set(x, "EnvironmentIds", js.undefined)
    
    inline def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = StObject.set(x, "EnvironmentIds", js.Array(value*))
    
    inline def setEnvironmentNames(value: EnvironmentNamesList): Self = StObject.set(x, "EnvironmentNames", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNamesUndefined: Self = StObject.set(x, "EnvironmentNames", js.undefined)
    
    inline def setEnvironmentNamesVarargs(value: EnvironmentName*): Self = StObject.set(x, "EnvironmentNames", js.Array(value*))
    
    inline def setIncludeDeleted(value: IncludeDeleted): Self = StObject.set(x, "IncludeDeleted", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedUndefined: Self = StObject.set(x, "IncludeDeleted", js.undefined)
    
    inline def setIncludedDeletedBackTo(value: js.Date): Self = StObject.set(x, "IncludedDeletedBackTo", value.asInstanceOf[js.Any])
    
    inline def setIncludedDeletedBackToUndefined: Self = StObject.set(x, "IncludedDeletedBackTo", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    inline def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
