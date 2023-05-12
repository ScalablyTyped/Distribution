package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import typings.awsSdk.anon.DescribeClusterRequestwaiClusterArn
import typings.awsSdk.anon.DescribeControlPanelReque
import typings.awsSdk.anon.DescribeRoutingControlReq
import typings.awsSdk.awsSdkStrings.clusterCreated
import typings.awsSdk.awsSdkStrings.clusterDeleted
import typings.awsSdk.awsSdkStrings.controlPanelCreated
import typings.awsSdk.awsSdkStrings.controlPanelDeleted
import typings.awsSdk.awsSdkStrings.routingControlCreated
import typings.awsSdk.awsSdkStrings.routingControlDeleted
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route53RecoveryControlConfig extends Service {
  
  @JSName("config")
  var config_Route53RecoveryControlConfig: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create a new cluster. A cluster is a set of redundant Regional endpoints against which you can run API calls to update or get the state of one or more routing controls. Each cluster has a name, status, Amazon Resource Name (ARN), and an array of the five cluster endpoints (one for each supported Amazon Web Services Region) that you can use with API calls to the cluster data plane.
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Create a new cluster. A cluster is a set of redundant Regional endpoints against which you can run API calls to update or get the state of one or more routing controls. Each cluster has a name, status, Amazon Resource Name (ARN), and an array of the five cluster endpoints (one for each supported Amazon Web Services Region) that you can use with API calls to the cluster data plane.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  
  /**
    * Creates a new control panel. A control panel represents a group of routing controls that can be changed together in a single transaction. You can use a control panel to centrally view the operational status of applications across your organization, and trigger multi-app failovers in a single transaction, for example, to fail over an Availability Zone or Amazon Web Services Region.
    */
  def createControlPanel(): Request[CreateControlPanelResponse, AWSError] = js.native
  def createControlPanel(callback: js.Function2[/* err */ AWSError, /* data */ CreateControlPanelResponse, Unit]): Request[CreateControlPanelResponse, AWSError] = js.native
  /**
    * Creates a new control panel. A control panel represents a group of routing controls that can be changed together in a single transaction. You can use a control panel to centrally view the operational status of applications across your organization, and trigger multi-app failovers in a single transaction, for example, to fail over an Availability Zone or Amazon Web Services Region.
    */
  def createControlPanel(params: CreateControlPanelRequest): Request[CreateControlPanelResponse, AWSError] = js.native
  def createControlPanel(
    params: CreateControlPanelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateControlPanelResponse, Unit]
  ): Request[CreateControlPanelResponse, AWSError] = js.native
  
  /**
    * Creates a new routing control. A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control traffic routing. To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery Controller.
    */
  def createRoutingControl(): Request[CreateRoutingControlResponse, AWSError] = js.native
  def createRoutingControl(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoutingControlResponse, Unit]): Request[CreateRoutingControlResponse, AWSError] = js.native
  /**
    * Creates a new routing control. A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control traffic routing. To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery Controller.
    */
  def createRoutingControl(params: CreateRoutingControlRequest): Request[CreateRoutingControlResponse, AWSError] = js.native
  def createRoutingControl(
    params: CreateRoutingControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoutingControlResponse, Unit]
  ): Request[CreateRoutingControlResponse, AWSError] = js.native
  
  /**
    * Creates a safety rule in a control panel. Safety rules let you add safeguards around changing routing control states, and for enabling and disabling routing controls, to help prevent unexpected outcomes. There are two types of safety rules: assertion rules and gating rules. Assertion rule: An assertion rule enforces that, when you change a routing control state, that a certain criteria is met. For example, the criteria might be that at least one routing control state is On after the transaction so that traffic continues to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario. Gating rule: A gating rule lets you configure a gating routing control as an overall "on/off" switch for a group of routing controls. Or, you can configure more complex gating scenarios, for example by configuring multiple gating routing controls. For more information, see Safety rules in the Amazon Route 53 Application Recovery Controller Developer Guide.
    */
  def createSafetyRule(): Request[CreateSafetyRuleResponse, AWSError] = js.native
  def createSafetyRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateSafetyRuleResponse, Unit]): Request[CreateSafetyRuleResponse, AWSError] = js.native
  /**
    * Creates a safety rule in a control panel. Safety rules let you add safeguards around changing routing control states, and for enabling and disabling routing controls, to help prevent unexpected outcomes. There are two types of safety rules: assertion rules and gating rules. Assertion rule: An assertion rule enforces that, when you change a routing control state, that a certain criteria is met. For example, the criteria might be that at least one routing control state is On after the transaction so that traffic continues to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario. Gating rule: A gating rule lets you configure a gating routing control as an overall "on/off" switch for a group of routing controls. Or, you can configure more complex gating scenarios, for example by configuring multiple gating routing controls. For more information, see Safety rules in the Amazon Route 53 Application Recovery Controller Developer Guide.
    */
  def createSafetyRule(params: CreateSafetyRuleRequest): Request[CreateSafetyRuleResponse, AWSError] = js.native
  def createSafetyRule(
    params: CreateSafetyRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSafetyRuleResponse, Unit]
  ): Request[CreateSafetyRuleResponse, AWSError] = js.native
  
  /**
    * Delete a cluster.
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Delete a cluster.
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  
  /**
    * Deletes a control panel.
    */
  def deleteControlPanel(): Request[DeleteControlPanelResponse, AWSError] = js.native
  def deleteControlPanel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteControlPanelResponse, Unit]): Request[DeleteControlPanelResponse, AWSError] = js.native
  /**
    * Deletes a control panel.
    */
  def deleteControlPanel(params: DeleteControlPanelRequest): Request[DeleteControlPanelResponse, AWSError] = js.native
  def deleteControlPanel(
    params: DeleteControlPanelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteControlPanelResponse, Unit]
  ): Request[DeleteControlPanelResponse, AWSError] = js.native
  
  /**
    * Deletes a routing control.
    */
  def deleteRoutingControl(): Request[DeleteRoutingControlResponse, AWSError] = js.native
  def deleteRoutingControl(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoutingControlResponse, Unit]): Request[DeleteRoutingControlResponse, AWSError] = js.native
  /**
    * Deletes a routing control.
    */
  def deleteRoutingControl(params: DeleteRoutingControlRequest): Request[DeleteRoutingControlResponse, AWSError] = js.native
  def deleteRoutingControl(
    params: DeleteRoutingControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoutingControlResponse, Unit]
  ): Request[DeleteRoutingControlResponse, AWSError] = js.native
  
  /**
    * Deletes a safety rule./&gt;
    */
  def deleteSafetyRule(): Request[DeleteSafetyRuleResponse, AWSError] = js.native
  def deleteSafetyRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSafetyRuleResponse, Unit]): Request[DeleteSafetyRuleResponse, AWSError] = js.native
  /**
    * Deletes a safety rule./&gt;
    */
  def deleteSafetyRule(params: DeleteSafetyRuleRequest): Request[DeleteSafetyRuleResponse, AWSError] = js.native
  def deleteSafetyRule(
    params: DeleteSafetyRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSafetyRuleResponse, Unit]
  ): Request[DeleteSafetyRuleResponse, AWSError] = js.native
  
  /**
    * Display the details about a cluster. The response includes the cluster name, endpoints, status, and Amazon Resource Name (ARN).
    */
  def describeCluster(): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Display the details about a cluster. The response includes the cluster name, endpoints, status, and Amazon Resource Name (ARN).
    */
  def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(
    params: DescribeClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  
  /**
    * Displays details about a control panel.
    */
  def describeControlPanel(): Request[DescribeControlPanelResponse, AWSError] = js.native
  def describeControlPanel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeControlPanelResponse, Unit]): Request[DescribeControlPanelResponse, AWSError] = js.native
  /**
    * Displays details about a control panel.
    */
  def describeControlPanel(params: DescribeControlPanelRequest): Request[DescribeControlPanelResponse, AWSError] = js.native
  def describeControlPanel(
    params: DescribeControlPanelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeControlPanelResponse, Unit]
  ): Request[DescribeControlPanelResponse, AWSError] = js.native
  
  /**
    * Displays details about a routing control. A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control routing. To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery Controller.
    */
  def describeRoutingControl(): Request[DescribeRoutingControlResponse, AWSError] = js.native
  def describeRoutingControl(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingControlResponse, Unit]): Request[DescribeRoutingControlResponse, AWSError] = js.native
  /**
    * Displays details about a routing control. A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control routing. To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery Controller.
    */
  def describeRoutingControl(params: DescribeRoutingControlRequest): Request[DescribeRoutingControlResponse, AWSError] = js.native
  def describeRoutingControl(
    params: DescribeRoutingControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingControlResponse, Unit]
  ): Request[DescribeRoutingControlResponse, AWSError] = js.native
  
  /**
    * Returns information about a safety rule.
    */
  def describeSafetyRule(): Request[DescribeSafetyRuleResponse, AWSError] = js.native
  def describeSafetyRule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSafetyRuleResponse, Unit]): Request[DescribeSafetyRuleResponse, AWSError] = js.native
  /**
    * Returns information about a safety rule.
    */
  def describeSafetyRule(params: DescribeSafetyRuleRequest): Request[DescribeSafetyRuleResponse, AWSError] = js.native
  def describeSafetyRule(
    params: DescribeSafetyRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSafetyRuleResponse, Unit]
  ): Request[DescribeSafetyRuleResponse, AWSError] = js.native
  
  /**
    * Returns an array of all Amazon Route 53 health checks associated with a specific routing control.
    */
  def listAssociatedRoute53HealthChecks(): Request[ListAssociatedRoute53HealthChecksResponse, AWSError] = js.native
  def listAssociatedRoute53HealthChecks(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedRoute53HealthChecksResponse, Unit]
  ): Request[ListAssociatedRoute53HealthChecksResponse, AWSError] = js.native
  /**
    * Returns an array of all Amazon Route 53 health checks associated with a specific routing control.
    */
  def listAssociatedRoute53HealthChecks(params: ListAssociatedRoute53HealthChecksRequest): Request[ListAssociatedRoute53HealthChecksResponse, AWSError] = js.native
  def listAssociatedRoute53HealthChecks(
    params: ListAssociatedRoute53HealthChecksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedRoute53HealthChecksResponse, Unit]
  ): Request[ListAssociatedRoute53HealthChecksResponse, AWSError] = js.native
  
  /**
    * Returns an array of all the clusters in an account.
    */
  def listClusters(): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]): Request[ListClustersResponse, AWSError] = js.native
  /**
    * Returns an array of all the clusters in an account.
    */
  def listClusters(params: ListClustersRequest): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]
  ): Request[ListClustersResponse, AWSError] = js.native
  
  /**
    * Returns an array of control panels in an account or in a cluster.
    */
  def listControlPanels(): Request[ListControlPanelsResponse, AWSError] = js.native
  def listControlPanels(callback: js.Function2[/* err */ AWSError, /* data */ ListControlPanelsResponse, Unit]): Request[ListControlPanelsResponse, AWSError] = js.native
  /**
    * Returns an array of control panels in an account or in a cluster.
    */
  def listControlPanels(params: ListControlPanelsRequest): Request[ListControlPanelsResponse, AWSError] = js.native
  def listControlPanels(
    params: ListControlPanelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListControlPanelsResponse, Unit]
  ): Request[ListControlPanelsResponse, AWSError] = js.native
  
  /**
    * Returns an array of routing controls for a control panel. A routing control is an Amazon Route 53 Application Recovery Controller construct that has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control routing.
    */
  def listRoutingControls(): Request[ListRoutingControlsResponse, AWSError] = js.native
  def listRoutingControls(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingControlsResponse, Unit]): Request[ListRoutingControlsResponse, AWSError] = js.native
  /**
    * Returns an array of routing controls for a control panel. A routing control is an Amazon Route 53 Application Recovery Controller construct that has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control routing.
    */
  def listRoutingControls(params: ListRoutingControlsRequest): Request[ListRoutingControlsResponse, AWSError] = js.native
  def listRoutingControls(
    params: ListRoutingControlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingControlsResponse, Unit]
  ): Request[ListRoutingControlsResponse, AWSError] = js.native
  
  /**
    * List the safety rules (the assertion rules and gating rules) that you've defined for the routing controls in a control panel.
    */
  def listSafetyRules(): Request[ListSafetyRulesResponse, AWSError] = js.native
  def listSafetyRules(callback: js.Function2[/* err */ AWSError, /* data */ ListSafetyRulesResponse, Unit]): Request[ListSafetyRulesResponse, AWSError] = js.native
  /**
    * List the safety rules (the assertion rules and gating rules) that you've defined for the routing controls in a control panel.
    */
  def listSafetyRules(params: ListSafetyRulesRequest): Request[ListSafetyRulesResponse, AWSError] = js.native
  def listSafetyRules(
    params: ListSafetyRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSafetyRulesResponse, Unit]
  ): Request[ListSafetyRulesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds a tag to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds a tag to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a control panel. The only update you can make to a control panel is to change the name of the control panel.
    */
  def updateControlPanel(): Request[UpdateControlPanelResponse, AWSError] = js.native
  def updateControlPanel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateControlPanelResponse, Unit]): Request[UpdateControlPanelResponse, AWSError] = js.native
  /**
    * Updates a control panel. The only update you can make to a control panel is to change the name of the control panel.
    */
  def updateControlPanel(params: UpdateControlPanelRequest): Request[UpdateControlPanelResponse, AWSError] = js.native
  def updateControlPanel(
    params: UpdateControlPanelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateControlPanelResponse, Unit]
  ): Request[UpdateControlPanelResponse, AWSError] = js.native
  
  /**
    * Updates a routing control. You can only update the name of the routing control. To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery Controller.
    */
  def updateRoutingControl(): Request[UpdateRoutingControlResponse, AWSError] = js.native
  def updateRoutingControl(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoutingControlResponse, Unit]): Request[UpdateRoutingControlResponse, AWSError] = js.native
  /**
    * Updates a routing control. You can only update the name of the routing control. To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery Controller.
    */
  def updateRoutingControl(params: UpdateRoutingControlRequest): Request[UpdateRoutingControlResponse, AWSError] = js.native
  def updateRoutingControl(
    params: UpdateRoutingControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoutingControlResponse, Unit]
  ): Request[UpdateRoutingControlResponse, AWSError] = js.native
  
  /**
    * Update a safety rule (an assertion rule or gating rule). You can only update the name and the waiting period for a safety rule. To make other updates, delete the safety rule and create a new one.
    */
  def updateSafetyRule(): Request[UpdateSafetyRuleResponse, AWSError] = js.native
  def updateSafetyRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSafetyRuleResponse, Unit]): Request[UpdateSafetyRuleResponse, AWSError] = js.native
  /**
    * Update a safety rule (an assertion rule or gating rule). You can only update the name and the waiting period for a safety rule. To make other updates, delete the safety rule and create a new one.
    */
  def updateSafetyRule(params: UpdateSafetyRuleRequest): Request[UpdateSafetyRuleResponse, AWSError] = js.native
  def updateSafetyRule(
    params: UpdateSafetyRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSafetyRuleResponse, Unit]
  ): Request[UpdateSafetyRuleResponse, AWSError] = js.native
  
  /**
    * Waits for the clusterCreated state by periodically calling the underlying Route53RecoveryControlConfig.describeClusteroperation every 5 seconds (at most 26 times). Wait until a cluster is created
    */
  @JSName("waitFor")
  def waitFor_clusterCreated(state: clusterCreated): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterCreated(
    state: clusterCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterCreated state by periodically calling the underlying Route53RecoveryControlConfig.describeClusteroperation every 5 seconds (at most 26 times). Wait until a cluster is created
    */
  @JSName("waitFor")
  def waitFor_clusterCreated(state: clusterCreated, params: DescribeClusterRequestwaiClusterArn): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterCreated(
    state: clusterCreated,
    params: DescribeClusterRequestwaiClusterArn,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying Route53RecoveryControlConfig.describeClusteroperation every 5 seconds (at most 26 times). Wait for a cluster to be deleted
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying Route53RecoveryControlConfig.describeClusteroperation every 5 seconds (at most 26 times). Wait for a cluster to be deleted
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted, params: DescribeClusterRequestwaiClusterArn): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    params: DescribeClusterRequestwaiClusterArn,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the controlPanelCreated state by periodically calling the underlying Route53RecoveryControlConfig.describeControlPaneloperation every 5 seconds (at most 26 times). Wait until a control panel is created
    */
  @JSName("waitFor")
  def waitFor_controlPanelCreated(state: controlPanelCreated): Request[DescribeControlPanelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_controlPanelCreated(
    state: controlPanelCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeControlPanelResponse, Unit]
  ): Request[DescribeControlPanelResponse, AWSError] = js.native
  /**
    * Waits for the controlPanelCreated state by periodically calling the underlying Route53RecoveryControlConfig.describeControlPaneloperation every 5 seconds (at most 26 times). Wait until a control panel is created
    */
  @JSName("waitFor")
  def waitFor_controlPanelCreated(state: controlPanelCreated, params: DescribeControlPanelReque): Request[DescribeControlPanelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_controlPanelCreated(
    state: controlPanelCreated,
    params: DescribeControlPanelReque,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeControlPanelResponse, Unit]
  ): Request[DescribeControlPanelResponse, AWSError] = js.native
  /**
    * Waits for the controlPanelDeleted state by periodically calling the underlying Route53RecoveryControlConfig.describeControlPaneloperation every 5 seconds (at most 26 times). Wait until a control panel is deleted
    */
  @JSName("waitFor")
  def waitFor_controlPanelDeleted(state: controlPanelDeleted): Request[DescribeControlPanelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_controlPanelDeleted(
    state: controlPanelDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeControlPanelResponse, Unit]
  ): Request[DescribeControlPanelResponse, AWSError] = js.native
  /**
    * Waits for the controlPanelDeleted state by periodically calling the underlying Route53RecoveryControlConfig.describeControlPaneloperation every 5 seconds (at most 26 times). Wait until a control panel is deleted
    */
  @JSName("waitFor")
  def waitFor_controlPanelDeleted(state: controlPanelDeleted, params: DescribeControlPanelReque): Request[DescribeControlPanelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_controlPanelDeleted(
    state: controlPanelDeleted,
    params: DescribeControlPanelReque,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeControlPanelResponse, Unit]
  ): Request[DescribeControlPanelResponse, AWSError] = js.native
  /**
    * Waits for the routingControlCreated state by periodically calling the underlying Route53RecoveryControlConfig.describeRoutingControloperation every 5 seconds (at most 26 times). Wait until a routing control is created
    */
  @JSName("waitFor")
  def waitFor_routingControlCreated(state: routingControlCreated): Request[DescribeRoutingControlResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_routingControlCreated(
    state: routingControlCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingControlResponse, Unit]
  ): Request[DescribeRoutingControlResponse, AWSError] = js.native
  /**
    * Waits for the routingControlCreated state by periodically calling the underlying Route53RecoveryControlConfig.describeRoutingControloperation every 5 seconds (at most 26 times). Wait until a routing control is created
    */
  @JSName("waitFor")
  def waitFor_routingControlCreated(state: routingControlCreated, params: DescribeRoutingControlReq): Request[DescribeRoutingControlResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_routingControlCreated(
    state: routingControlCreated,
    params: DescribeRoutingControlReq,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingControlResponse, Unit]
  ): Request[DescribeRoutingControlResponse, AWSError] = js.native
  /**
    * Waits for the routingControlDeleted state by periodically calling the underlying Route53RecoveryControlConfig.describeRoutingControloperation every 5 seconds (at most 26 times). Wait for a routing control to be deleted
    */
  @JSName("waitFor")
  def waitFor_routingControlDeleted(state: routingControlDeleted): Request[DescribeRoutingControlResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_routingControlDeleted(
    state: routingControlDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingControlResponse, Unit]
  ): Request[DescribeRoutingControlResponse, AWSError] = js.native
  /**
    * Waits for the routingControlDeleted state by periodically calling the underlying Route53RecoveryControlConfig.describeRoutingControloperation every 5 seconds (at most 26 times). Wait for a routing control to be deleted
    */
  @JSName("waitFor")
  def waitFor_routingControlDeleted(state: routingControlDeleted, params: DescribeRoutingControlReq): Request[DescribeRoutingControlResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_routingControlDeleted(
    state: routingControlDeleted,
    params: DescribeRoutingControlReq,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingControlResponse, Unit]
  ): Request[DescribeRoutingControlResponse, AWSError] = js.native
}
