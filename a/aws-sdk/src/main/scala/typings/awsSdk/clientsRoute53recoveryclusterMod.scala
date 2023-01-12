package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsRoute53recoveryclusterMod {
  
  @JSImport("aws-sdk/clients/route53recoverycluster", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends Route53RecoveryCluster {
    def this(options: ClientConfiguration) = this()
  }
  
  type Arn = String
  
  type Arns = js.Array[Arn]
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type ControlPanelName = String
  
  trait GetRoutingControlStateRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the routing control that you want to get the state for.
      */
    var RoutingControlArn: Arn
  }
  object GetRoutingControlStateRequest {
    
    inline def apply(RoutingControlArn: Arn): GetRoutingControlStateRequest = {
      val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoutingControlStateRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRoutingControlStateRequest] (val x: Self) extends AnyVal {
      
      inline def setRoutingControlArn(value: Arn): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRoutingControlStateResponse extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the response.
      */
    var RoutingControlArn: Arn
    
    /**
      * The routing control name.
      */
    var RoutingControlName: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControlName] = js.undefined
    
    /**
      * The state of the routing control.
      */
    var RoutingControlState: typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControlState
  }
  object GetRoutingControlStateResponse {
    
    inline def apply(RoutingControlArn: Arn, RoutingControlState: RoutingControlState): GetRoutingControlStateResponse = {
      val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any], RoutingControlState = RoutingControlState.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoutingControlStateResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRoutingControlStateResponse] (val x: Self) extends AnyVal {
      
      inline def setRoutingControlArn(value: Arn): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlName(value: RoutingControlName): Self = StObject.set(x, "RoutingControlName", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlNameUndefined: Self = StObject.set(x, "RoutingControlName", js.undefined)
      
      inline def setRoutingControlState(value: RoutingControlState): Self = StObject.set(x, "RoutingControlState", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListRoutingControlsRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
      */
    var ControlPanelArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The number of routing controls objects that you want to return with this call. The default value is 500.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.MaxResults] = js.undefined
    
    /**
      * The token for the next set of results. You receive this token from a previous call.
      */
    var NextToken: js.UndefOr[PageToken] = js.undefined
  }
  object ListRoutingControlsRequest {
    
    inline def apply(): ListRoutingControlsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListRoutingControlsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListRoutingControlsRequest] (val x: Self) extends AnyVal {
      
      inline def setControlPanelArn(value: Arn): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
      
      inline def setControlPanelArnUndefined: Self = StObject.set(x, "ControlPanelArn", js.undefined)
      
      inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListRoutingControlsResponse extends StObject {
    
    /**
      * The token for the next set of results. You receive this token from a previous call.
      */
    var NextToken: js.UndefOr[PageToken] = js.undefined
    
    /**
      * The list of routing controls.
      */
    var RoutingControls: typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControls
  }
  object ListRoutingControlsResponse {
    
    inline def apply(RoutingControls: RoutingControls): ListRoutingControlsResponse = {
      val __obj = js.Dynamic.literal(RoutingControls = RoutingControls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRoutingControlsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListRoutingControlsResponse] (val x: Self) extends AnyVal {
      
      inline def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setRoutingControls(value: RoutingControls): Self = StObject.set(x, "RoutingControls", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlsVarargs(value: RoutingControl*): Self = StObject.set(x, "RoutingControls", js.Array(value*))
    }
  }
  
  type MaxResults = Double
  
  type PageToken = String
  
  @js.native
  trait Route53RecoveryCluster extends Service {
    
    @JSName("config")
    var config_Route53RecoveryCluster: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Get the state for a routing control. A routing control is a simple on/off switch that you can use to route traffic to cells. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow.  Before you can create a routing control, you must first create a cluster, and then host the control in a control panel on the cluster. For more information, see  Create routing control structures in the Amazon Route 53 Application Recovery Controller Developer Guide. You access one of the endpoints for the cluster to get or update the routing control state to redirect traffic for your application.   You must specify Regional endpoints when you work with API cluster operations to get or update routing control states in Route 53 ARC.  To see a code example for getting a routing control state, including accessing Regional cluster endpoints in sequence, see API examples in the Amazon Route 53 Application Recovery Controller Developer Guide. Learn more about working with routing controls in the following topics in the Amazon Route 53 Application Recovery Controller Developer Guide:     Viewing and updating routing control states     Working with routing controls in Route 53 ARC   
      */
    def getRoutingControlState(): Request[GetRoutingControlStateResponse, AWSError] = js.native
    def getRoutingControlState(callback: js.Function2[/* err */ AWSError, /* data */ GetRoutingControlStateResponse, Unit]): Request[GetRoutingControlStateResponse, AWSError] = js.native
    /**
      * Get the state for a routing control. A routing control is a simple on/off switch that you can use to route traffic to cells. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow.  Before you can create a routing control, you must first create a cluster, and then host the control in a control panel on the cluster. For more information, see  Create routing control structures in the Amazon Route 53 Application Recovery Controller Developer Guide. You access one of the endpoints for the cluster to get or update the routing control state to redirect traffic for your application.   You must specify Regional endpoints when you work with API cluster operations to get or update routing control states in Route 53 ARC.  To see a code example for getting a routing control state, including accessing Regional cluster endpoints in sequence, see API examples in the Amazon Route 53 Application Recovery Controller Developer Guide. Learn more about working with routing controls in the following topics in the Amazon Route 53 Application Recovery Controller Developer Guide:     Viewing and updating routing control states     Working with routing controls in Route 53 ARC   
      */
    def getRoutingControlState(params: GetRoutingControlStateRequest): Request[GetRoutingControlStateResponse, AWSError] = js.native
    def getRoutingControlState(
      params: GetRoutingControlStateRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetRoutingControlStateResponse, Unit]
    ): Request[GetRoutingControlStateResponse, AWSError] = js.native
    
    /**
      * List routing control names and Amazon Resource Names (ARNs), as well as the routing control state for each routing control, along with the control panel name and control panel ARN for the routing controls. If you specify a control panel ARN, this call lists the routing controls in the control panel. Otherwise, it lists all the routing controls in the cluster. A routing control is a simple on/off switch in Route 53 ARC that you can use to route traffic to cells. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow. Before you can create a routing control, you must first create a cluster, and then host the control in a control panel on the cluster. For more information, see  Create routing control structures in the Amazon Route 53 Application Recovery Controller Developer Guide. You access one of the endpoints for the cluster to get or update the routing control state to redirect traffic for your application.   You must specify Regional endpoints when you work with API cluster operations to use this API operation to list routing controls in Route 53 ARC.  Learn more about working with routing controls in the following topics in the Amazon Route 53 Application Recovery Controller Developer Guide:     Viewing and updating routing control states     Working with routing controls in Route 53 ARC   
      */
    def listRoutingControls(): Request[ListRoutingControlsResponse, AWSError] = js.native
    def listRoutingControls(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingControlsResponse, Unit]): Request[ListRoutingControlsResponse, AWSError] = js.native
    /**
      * List routing control names and Amazon Resource Names (ARNs), as well as the routing control state for each routing control, along with the control panel name and control panel ARN for the routing controls. If you specify a control panel ARN, this call lists the routing controls in the control panel. Otherwise, it lists all the routing controls in the cluster. A routing control is a simple on/off switch in Route 53 ARC that you can use to route traffic to cells. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow. Before you can create a routing control, you must first create a cluster, and then host the control in a control panel on the cluster. For more information, see  Create routing control structures in the Amazon Route 53 Application Recovery Controller Developer Guide. You access one of the endpoints for the cluster to get or update the routing control state to redirect traffic for your application.   You must specify Regional endpoints when you work with API cluster operations to use this API operation to list routing controls in Route 53 ARC.  Learn more about working with routing controls in the following topics in the Amazon Route 53 Application Recovery Controller Developer Guide:     Viewing and updating routing control states     Working with routing controls in Route 53 ARC   
      */
    def listRoutingControls(params: ListRoutingControlsRequest): Request[ListRoutingControlsResponse, AWSError] = js.native
    def listRoutingControls(
      params: ListRoutingControlsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingControlsResponse, Unit]
    ): Request[ListRoutingControlsResponse, AWSError] = js.native
    
    /**
      * Set the state of the routing control to reroute traffic. You can set the value to be On or Off. When the state is On, traffic flows to a cell. When the state is Off, traffic does not flow. With Route 53 ARC, you can add safety rules for routing controls, which are safeguards for routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However, there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic. In a "break glass" scenario like this, you can override one or more safety rules to change a routing control state and fail over your application. The SafetyRulesToOverride property enables you override one or more safety rules and update routing control states. For more information, see  Override safety rules to reroute traffic in the Amazon Route 53 Application Recovery Controller Developer Guide.  You must specify Regional endpoints when you work with API cluster operations to get or update routing control states in Route 53 ARC.  To see a code example for getting a routing control state, including accessing Regional cluster endpoints in sequence, see API examples in the Amazon Route 53 Application Recovery Controller Developer Guide.     Viewing and updating routing control states     Working with routing controls overall   
      */
    def updateRoutingControlState(): Request[UpdateRoutingControlStateResponse, AWSError] = js.native
    def updateRoutingControlState(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoutingControlStateResponse, Unit]): Request[UpdateRoutingControlStateResponse, AWSError] = js.native
    /**
      * Set the state of the routing control to reroute traffic. You can set the value to be On or Off. When the state is On, traffic flows to a cell. When the state is Off, traffic does not flow. With Route 53 ARC, you can add safety rules for routing controls, which are safeguards for routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However, there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic. In a "break glass" scenario like this, you can override one or more safety rules to change a routing control state and fail over your application. The SafetyRulesToOverride property enables you override one or more safety rules and update routing control states. For more information, see  Override safety rules to reroute traffic in the Amazon Route 53 Application Recovery Controller Developer Guide.  You must specify Regional endpoints when you work with API cluster operations to get or update routing control states in Route 53 ARC.  To see a code example for getting a routing control state, including accessing Regional cluster endpoints in sequence, see API examples in the Amazon Route 53 Application Recovery Controller Developer Guide.     Viewing and updating routing control states     Working with routing controls overall   
      */
    def updateRoutingControlState(params: UpdateRoutingControlStateRequest): Request[UpdateRoutingControlStateResponse, AWSError] = js.native
    def updateRoutingControlState(
      params: UpdateRoutingControlStateRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoutingControlStateResponse, Unit]
    ): Request[UpdateRoutingControlStateResponse, AWSError] = js.native
    
    /**
      * Set multiple routing control states. You can set the value for each state to be On or Off. When the state is On, traffic flows to a cell. When it's Off, traffic does not flow. With Route 53 ARC, you can add safety rules for routing controls, which are safeguards for routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However, there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic. In a "break glass" scenario like this, you can override one or more safety rules to change a routing control state and fail over your application. The SafetyRulesToOverride property enables you override one or more safety rules and update routing control states. For more information, see  Override safety rules to reroute traffic in the Amazon Route 53 Application Recovery Controller Developer Guide.  You must specify Regional endpoints when you work with API cluster operations to get or update routing control states in Route 53 ARC.  To see a code example for getting a routing control state, including accessing Regional cluster endpoints in sequence, see API examples in the Amazon Route 53 Application Recovery Controller Developer Guide.     Viewing and updating routing control states     Working with routing controls overall   
      */
    def updateRoutingControlStates(): Request[UpdateRoutingControlStatesResponse, AWSError] = js.native
    def updateRoutingControlStates(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoutingControlStatesResponse, Unit]): Request[UpdateRoutingControlStatesResponse, AWSError] = js.native
    /**
      * Set multiple routing control states. You can set the value for each state to be On or Off. When the state is On, traffic flows to a cell. When it's Off, traffic does not flow. With Route 53 ARC, you can add safety rules for routing controls, which are safeguards for routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However, there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic. In a "break glass" scenario like this, you can override one or more safety rules to change a routing control state and fail over your application. The SafetyRulesToOverride property enables you override one or more safety rules and update routing control states. For more information, see  Override safety rules to reroute traffic in the Amazon Route 53 Application Recovery Controller Developer Guide.  You must specify Regional endpoints when you work with API cluster operations to get or update routing control states in Route 53 ARC.  To see a code example for getting a routing control state, including accessing Regional cluster endpoints in sequence, see API examples in the Amazon Route 53 Application Recovery Controller Developer Guide.     Viewing and updating routing control states     Working with routing controls overall   
      */
    def updateRoutingControlStates(params: UpdateRoutingControlStatesRequest): Request[UpdateRoutingControlStatesResponse, AWSError] = js.native
    def updateRoutingControlStates(
      params: UpdateRoutingControlStatesRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoutingControlStatesResponse, Unit]
    ): Request[UpdateRoutingControlStatesResponse, AWSError] = js.native
  }
  
  trait RoutingControl extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the control panel where the routing control is located.
      */
    var ControlPanelArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The name of the control panel where the routing control is located.
      */
    var ControlPanelName: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.ControlPanelName] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the routing control.
      */
    var RoutingControlArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The name of the routing control.
      */
    var RoutingControlName: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControlName] = js.undefined
    
    /**
      * The current state of the routing control. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow. 
      */
    var RoutingControlState: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControlState] = js.undefined
  }
  object RoutingControl {
    
    inline def apply(): RoutingControl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutingControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingControl] (val x: Self) extends AnyVal {
      
      inline def setControlPanelArn(value: Arn): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
      
      inline def setControlPanelArnUndefined: Self = StObject.set(x, "ControlPanelArn", js.undefined)
      
      inline def setControlPanelName(value: ControlPanelName): Self = StObject.set(x, "ControlPanelName", value.asInstanceOf[js.Any])
      
      inline def setControlPanelNameUndefined: Self = StObject.set(x, "ControlPanelName", js.undefined)
      
      inline def setRoutingControlArn(value: Arn): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlArnUndefined: Self = StObject.set(x, "RoutingControlArn", js.undefined)
      
      inline def setRoutingControlName(value: RoutingControlName): Self = StObject.set(x, "RoutingControlName", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlNameUndefined: Self = StObject.set(x, "RoutingControlName", js.undefined)
      
      inline def setRoutingControlState(value: RoutingControlState): Self = StObject.set(x, "RoutingControlState", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlStateUndefined: Self = StObject.set(x, "RoutingControlState", js.undefined)
    }
  }
  
  type RoutingControlName = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.On_
    - typings.awsSdk.awsSdkStrings.Off_
    - java.lang.String
  */
  type RoutingControlState = _RoutingControlState | String
  
  type RoutingControls = js.Array[RoutingControl]
  
  type UpdateRoutingControlStateEntries = js.Array[UpdateRoutingControlStateEntry]
  
  trait UpdateRoutingControlStateEntry extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for a routing control state entry.
      */
    var RoutingControlArn: Arn
    
    /**
      * The routing control state in a set of routing control state entries.
      */
    var RoutingControlState: typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControlState
  }
  object UpdateRoutingControlStateEntry {
    
    inline def apply(RoutingControlArn: Arn, RoutingControlState: RoutingControlState): UpdateRoutingControlStateEntry = {
      val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any], RoutingControlState = RoutingControlState.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoutingControlStateEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRoutingControlStateEntry] (val x: Self) extends AnyVal {
      
      inline def setRoutingControlArn(value: Arn): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlState(value: RoutingControlState): Self = StObject.set(x, "RoutingControlState", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateRoutingControlStateRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the routing control that you want to update the state for.
      */
    var RoutingControlArn: Arn
    
    /**
      * The state of the routing control. You can set the value to be On or Off.
      */
    var RoutingControlState: typings.awsSdk.clientsRoute53recoveryclusterMod.RoutingControlState
    
    /**
      * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating the state of a routing control. You can override one safety rule or multiple safety rules by including one or more ARNs, separated by commas. For more information, see  Override safety rules to reroute traffic in the Amazon Route 53 Application Recovery Controller Developer Guide.
      */
    var SafetyRulesToOverride: js.UndefOr[Arns] = js.undefined
  }
  object UpdateRoutingControlStateRequest {
    
    inline def apply(RoutingControlArn: Arn, RoutingControlState: RoutingControlState): UpdateRoutingControlStateRequest = {
      val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any], RoutingControlState = RoutingControlState.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoutingControlStateRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRoutingControlStateRequest] (val x: Self) extends AnyVal {
      
      inline def setRoutingControlArn(value: Arn): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
      
      inline def setRoutingControlState(value: RoutingControlState): Self = StObject.set(x, "RoutingControlState", value.asInstanceOf[js.Any])
      
      inline def setSafetyRulesToOverride(value: Arns): Self = StObject.set(x, "SafetyRulesToOverride", value.asInstanceOf[js.Any])
      
      inline def setSafetyRulesToOverrideUndefined: Self = StObject.set(x, "SafetyRulesToOverride", js.undefined)
      
      inline def setSafetyRulesToOverrideVarargs(value: Arn*): Self = StObject.set(x, "SafetyRulesToOverride", js.Array(value*))
    }
  }
  
  trait UpdateRoutingControlStateResponse extends StObject
  
  trait UpdateRoutingControlStatesRequest extends StObject {
    
    /**
      * The Amazon Resource Names (ARNs) for the safety rules that you want to override when you're updating routing control states. You can override one safety rule or multiple safety rules by including one or more ARNs, separated by commas. For more information, see  Override safety rules to reroute traffic in the Amazon Route 53 Application Recovery Controller Developer Guide.
      */
    var SafetyRulesToOverride: js.UndefOr[Arns] = js.undefined
    
    /**
      * A set of routing control entries that you want to update.
      */
    var UpdateRoutingControlStateEntries: typings.awsSdk.clientsRoute53recoveryclusterMod.UpdateRoutingControlStateEntries
  }
  object UpdateRoutingControlStatesRequest {
    
    inline def apply(UpdateRoutingControlStateEntries: UpdateRoutingControlStateEntries): UpdateRoutingControlStatesRequest = {
      val __obj = js.Dynamic.literal(UpdateRoutingControlStateEntries = UpdateRoutingControlStateEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoutingControlStatesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRoutingControlStatesRequest] (val x: Self) extends AnyVal {
      
      inline def setSafetyRulesToOverride(value: Arns): Self = StObject.set(x, "SafetyRulesToOverride", value.asInstanceOf[js.Any])
      
      inline def setSafetyRulesToOverrideUndefined: Self = StObject.set(x, "SafetyRulesToOverride", js.undefined)
      
      inline def setSafetyRulesToOverrideVarargs(value: Arn*): Self = StObject.set(x, "SafetyRulesToOverride", js.Array(value*))
      
      inline def setUpdateRoutingControlStateEntries(value: UpdateRoutingControlStateEntries): Self = StObject.set(x, "UpdateRoutingControlStateEntries", value.asInstanceOf[js.Any])
      
      inline def setUpdateRoutingControlStateEntriesVarargs(value: UpdateRoutingControlStateEntry*): Self = StObject.set(x, "UpdateRoutingControlStateEntries", js.Array(value*))
    }
  }
  
  trait UpdateRoutingControlStatesResponse extends StObject
  
  trait _RoutingControlState extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
