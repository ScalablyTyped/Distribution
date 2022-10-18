package typings.awsSdk

import typings.awsSdk.awsSdkStrings.ACCOUNT
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsMigrationhubconfigMod {
  
  @JSImport("aws-sdk/clients/migrationhubconfig", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends MigrationHubConfig {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type ControlId = String
  
  trait CreateHomeRegionControlRequest extends StObject {
    
    /**
      * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has permission to make the call.
      */
    var DryRun: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.DryRun] = js.undefined
    
    /**
      * The name of the home region of the calling account.
      */
    var HomeRegion: typings.awsSdk.clientsMigrationhubconfigMod.HomeRegion
    
    /**
      * The account for which this command sets up a home region control. The Target is always of type ACCOUNT.
      */
    var Target: typings.awsSdk.clientsMigrationhubconfigMod.Target
  }
  object CreateHomeRegionControlRequest {
    
    inline def apply(HomeRegion: HomeRegion, Target: Target): CreateHomeRegionControlRequest = {
      val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHomeRegionControlRequest]
    }
    
    extension [Self <: CreateHomeRegionControlRequest](x: Self) {
      
      inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
      
      inline def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateHomeRegionControlResult extends StObject {
    
    /**
      * This object is the HomeRegionControl object that's returned by a successful call to CreateHomeRegionControl.
      */
    var HomeRegionControl: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.HomeRegionControl] = js.undefined
  }
  object CreateHomeRegionControlResult {
    
    inline def apply(): CreateHomeRegionControlResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateHomeRegionControlResult]
    }
    
    extension [Self <: CreateHomeRegionControlResult](x: Self) {
      
      inline def setHomeRegionControl(value: HomeRegionControl): Self = StObject.set(x, "HomeRegionControl", value.asInstanceOf[js.Any])
      
      inline def setHomeRegionControlUndefined: Self = StObject.set(x, "HomeRegionControl", js.undefined)
    }
  }
  
  type DescribeHomeRegionControlsMaxResults = Double
  
  trait DescribeHomeRegionControlsRequest extends StObject {
    
    /**
      * The ControlID is a unique identifier string of your HomeRegionControl object.
      */
    var ControlId: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.ControlId] = js.undefined
    
    /**
      * The name of the home region you'd like to view.
      */
    var HomeRegion: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.HomeRegion] = js.undefined
    
    /**
      * The maximum number of filtering results to display per page. 
      */
    var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults] = js.undefined
    
    /**
      * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    
    /**
      * The target parameter specifies the identifier to which the home region is applied, which is always of type ACCOUNT. It applies the home region to the current ACCOUNT.
      */
    var Target: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.Target] = js.undefined
  }
  object DescribeHomeRegionControlsRequest {
    
    inline def apply(): DescribeHomeRegionControlsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeHomeRegionControlsRequest]
    }
    
    extension [Self <: DescribeHomeRegionControlsRequest](x: Self) {
      
      inline def setControlId(value: ControlId): Self = StObject.set(x, "ControlId", value.asInstanceOf[js.Any])
      
      inline def setControlIdUndefined: Self = StObject.set(x, "ControlId", js.undefined)
      
      inline def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
      
      inline def setMaxResults(value: DescribeHomeRegionControlsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    }
  }
  
  trait DescribeHomeRegionControlsResult extends StObject {
    
    /**
      * An array that contains your HomeRegionControl objects.
      */
    var HomeRegionControls: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.HomeRegionControls] = js.undefined
    
    /**
      * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  object DescribeHomeRegionControlsResult {
    
    inline def apply(): DescribeHomeRegionControlsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeHomeRegionControlsResult]
    }
    
    extension [Self <: DescribeHomeRegionControlsResult](x: Self) {
      
      inline def setHomeRegionControls(value: HomeRegionControls): Self = StObject.set(x, "HomeRegionControls", value.asInstanceOf[js.Any])
      
      inline def setHomeRegionControlsUndefined: Self = StObject.set(x, "HomeRegionControls", js.undefined)
      
      inline def setHomeRegionControlsVarargs(value: HomeRegionControl*): Self = StObject.set(x, "HomeRegionControls", js.Array(value*))
      
      inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type DryRun = Boolean
  
  trait GetHomeRegionRequest extends StObject
  
  trait GetHomeRegionResult extends StObject {
    
    /**
      * The name of the home region of the calling account.
      */
    var HomeRegion: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.HomeRegion] = js.undefined
  }
  object GetHomeRegionResult {
    
    inline def apply(): GetHomeRegionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHomeRegionResult]
    }
    
    extension [Self <: GetHomeRegionResult](x: Self) {
      
      inline def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    }
  }
  
  type HomeRegion = String
  
  trait HomeRegionControl extends StObject {
    
    /**
      * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-" followed by 12 lowercase letters and numbers.
      */
    var ControlId: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.ControlId] = js.undefined
    
    /**
      * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
      */
    var HomeRegion: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.HomeRegion] = js.undefined
    
    /**
      * A timestamp representing the time when the customer called CreateHomeregionControl and set the home region for the account.
      */
    var RequestedTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The target parameter specifies the identifier to which the home region is applied, which is always an ACCOUNT. It applies the home region to the current ACCOUNT.
      */
    var Target: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.Target] = js.undefined
  }
  object HomeRegionControl {
    
    inline def apply(): HomeRegionControl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HomeRegionControl]
    }
    
    extension [Self <: HomeRegionControl](x: Self) {
      
      inline def setControlId(value: ControlId): Self = StObject.set(x, "ControlId", value.asInstanceOf[js.Any])
      
      inline def setControlIdUndefined: Self = StObject.set(x, "ControlId", js.undefined)
      
      inline def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
      
      inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
      
      inline def setRequestedTime(value: js.Date): Self = StObject.set(x, "RequestedTime", value.asInstanceOf[js.Any])
      
      inline def setRequestedTimeUndefined: Self = StObject.set(x, "RequestedTime", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    }
  }
  
  type HomeRegionControls = js.Array[HomeRegionControl]
  
  @js.native
  trait MigrationHubConfig extends Service {
    
    @JSName("config")
    var config_MigrationHubConfig: ConfigBase & ClientConfiguration = js.native
    
    /**
      * This API sets up the home region for the calling account only.
      */
    def createHomeRegionControl(): Request[CreateHomeRegionControlResult, AWSError] = js.native
    def createHomeRegionControl(callback: js.Function2[/* err */ AWSError, /* data */ CreateHomeRegionControlResult, Unit]): Request[CreateHomeRegionControlResult, AWSError] = js.native
    /**
      * This API sets up the home region for the calling account only.
      */
    def createHomeRegionControl(params: CreateHomeRegionControlRequest): Request[CreateHomeRegionControlResult, AWSError] = js.native
    def createHomeRegionControl(
      params: CreateHomeRegionControlRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ CreateHomeRegionControlResult, Unit]
    ): Request[CreateHomeRegionControlResult, AWSError] = js.native
    
    /**
      * This API permits filtering on the ControlId and HomeRegion fields.
      */
    def describeHomeRegionControls(): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    def describeHomeRegionControls(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHomeRegionControlsResult, Unit]): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    /**
      * This API permits filtering on the ControlId and HomeRegion fields.
      */
    def describeHomeRegionControls(params: DescribeHomeRegionControlsRequest): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    def describeHomeRegionControls(
      params: DescribeHomeRegionControlsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DescribeHomeRegionControlsResult, Unit]
    ): Request[DescribeHomeRegionControlsResult, AWSError] = js.native
    
    /**
      * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call GetHomeRegion at least once before you call any other AWS Application Discovery Service and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
      */
    def getHomeRegion(): Request[GetHomeRegionResult, AWSError] = js.native
    def getHomeRegion(callback: js.Function2[/* err */ AWSError, /* data */ GetHomeRegionResult, Unit]): Request[GetHomeRegionResult, AWSError] = js.native
    /**
      * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call GetHomeRegion at least once before you call any other AWS Application Discovery Service and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
      */
    def getHomeRegion(params: GetHomeRegionRequest): Request[GetHomeRegionResult, AWSError] = js.native
    def getHomeRegion(
      params: GetHomeRegionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetHomeRegionResult, Unit]
    ): Request[GetHomeRegionResult, AWSError] = js.native
  }
  
  type RequestedTime = js.Date
  
  trait Target extends StObject {
    
    /**
      * The TargetID is a 12-character identifier of the ACCOUNT for which the control was created. (This must be the current account.) 
      */
    var Id: js.UndefOr[TargetId] = js.undefined
    
    /**
      * The target type is always an ACCOUNT.
      */
    var Type: TargetType
  }
  object Target {
    
    inline def apply(Type: TargetType): Target = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setId(value: TargetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetId = String
  
  type TargetType = ACCOUNT | String
  
  type Token = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
