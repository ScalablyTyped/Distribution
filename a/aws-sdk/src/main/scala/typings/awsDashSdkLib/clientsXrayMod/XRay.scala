package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRay
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_XRay: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsXrayMod.XRayNs.ClientConfiguration = js.native
  /**
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
     */
  def batchGetTraces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
     */
  def batchGetTraces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
     */
  def batchGetTraces(params: awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
     */
  def batchGetTraces(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.BatchGetTracesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
     */
  def createSamplingRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
     */
  def createSamplingRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
     */
  def createSamplingRule(params: awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
     */
  def createSamplingRule(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.CreateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a sampling rule.
     */
  def deleteSamplingRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a sampling rule.
     */
  def deleteSamplingRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a sampling rule.
     */
  def deleteSamplingRule(params: awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a sampling rule.
     */
  def deleteSamplingRule(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.DeleteSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current encryption configuration for X-Ray data.
     */
  def getEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current encryption configuration for X-Ray data.
     */
  def getEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current encryption configuration for X-Ray data.
     */
  def getEncryptionConfig(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current encryption configuration for X-Ray data.
     */
  def getEncryptionConfig(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all sampling rules.
     */
  def getSamplingRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all sampling rules.
     */
  def getSamplingRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all sampling rules.
     */
  def getSamplingRules(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all sampling rules.
     */
  def getSamplingRules(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about recent sampling results for all sampling rules.
     */
  def getSamplingStatisticSummaries(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about recent sampling results for all sampling rules.
     */
  def getSamplingStatisticSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about recent sampling results for all sampling rules.
     */
  def getSamplingStatisticSummaries(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about recent sampling results for all sampling rules.
     */
  def getSamplingStatisticSummaries(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingStatisticSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a sampling quota for rules that the service is using to sample requests. 
     */
  def getSamplingTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a sampling quota for rules that the service is using to sample requests. 
     */
  def getSamplingTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a sampling quota for rules that the service is using to sample requests. 
     */
  def getSamplingTargets(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a sampling quota for rules that the service is using to sample requests. 
     */
  def getSamplingTargets(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetSamplingTargetsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
     */
  def getServiceGraph(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
     */
  def getServiceGraph(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
     */
  def getServiceGraph(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
     */
  def getServiceGraph(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetServiceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a service graph for one or more specific trace IDs.
     */
  def getTraceGraph(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a service graph for one or more specific trace IDs.
     */
  def getTraceGraph(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a service graph for one or more specific trace IDs.
     */
  def getTraceGraph(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a service graph for one or more specific trace IDs.
     */
  def getTraceGraph(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceGraphResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
     */
  def getTraceSummaries(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
     */
  def getTraceSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
     */
  def getTraceSummaries(params: awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
     */
  def getTraceSummaries(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.GetTraceSummariesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the encryption configuration for X-Ray data.
     */
  def putEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the encryption configuration for X-Ray data.
     */
  def putEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the encryption configuration for X-Ray data.
     */
  def putEncryptionConfig(params: awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the encryption configuration for X-Ray data.
     */
  def putEncryptionConfig(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by the AWS X-Ray daemon to upload telemetry.
     */
  def putTelemetryRecords(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by the AWS X-Ray daemon to upload telemetry.
     */
  def putTelemetryRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by the AWS X-Ray daemon to upload telemetry.
     */
  def putTelemetryRecords(params: awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by the AWS X-Ray daemon to upload telemetry.
     */
  def putTelemetryRecords(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTelemetryRecordsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
     */
  def putTraceSegments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
     */
  def putTraceSegments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
     */
  def putTraceSegments(params: awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
     */
  def putTraceSegments(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.PutTraceSegmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a sampling rule's configuration.
     */
  def updateSamplingRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a sampling rule's configuration.
     */
  def updateSamplingRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a sampling rule's configuration.
     */
  def updateSamplingRule(params: awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a sampling rule's configuration.
     */
  def updateSamplingRule(
    params: awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsXrayMod.XRayNs.UpdateSamplingRuleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

