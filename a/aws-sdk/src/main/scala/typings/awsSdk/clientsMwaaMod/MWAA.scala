package typings.awsSdk.clientsMwaaMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MWAA extends Service {
  
  @JSName("config")
  var config_MWAA: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a CLI token for the Airflow CLI. To learn more, see Creating an Apache Airflow CLI token.
    */
  def createCliToken(): Request[CreateCliTokenResponse, AWSError] = js.native
  def createCliToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateCliTokenResponse, scala.Unit]): Request[CreateCliTokenResponse, AWSError] = js.native
  /**
    * Creates a CLI token for the Airflow CLI. To learn more, see Creating an Apache Airflow CLI token.
    */
  def createCliToken(params: CreateCliTokenRequest): Request[CreateCliTokenResponse, AWSError] = js.native
  def createCliToken(
    params: CreateCliTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCliTokenResponse, scala.Unit]
  ): Request[CreateCliTokenResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def createEnvironment(): Request[CreateEnvironmentOutput, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentOutput, scala.Unit]): Request[CreateEnvironmentOutput, AWSError] = js.native
  /**
    * Creates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def createEnvironment(params: CreateEnvironmentInput): Request[CreateEnvironmentOutput, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentOutput, scala.Unit]
  ): Request[CreateEnvironmentOutput, AWSError] = js.native
  
  /**
    * Creates a web login token for the Airflow Web UI. To learn more, see Creating an Apache Airflow web login token.
    */
  def createWebLoginToken(): Request[CreateWebLoginTokenResponse, AWSError] = js.native
  def createWebLoginToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebLoginTokenResponse, scala.Unit]): Request[CreateWebLoginTokenResponse, AWSError] = js.native
  /**
    * Creates a web login token for the Airflow Web UI. To learn more, see Creating an Apache Airflow web login token.
    */
  def createWebLoginToken(params: CreateWebLoginTokenRequest): Request[CreateWebLoginTokenResponse, AWSError] = js.native
  def createWebLoginToken(
    params: CreateWebLoginTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebLoginTokenResponse, scala.Unit]
  ): Request[CreateWebLoginTokenResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def deleteEnvironment(): Request[DeleteEnvironmentOutput, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentOutput, scala.Unit]): Request[DeleteEnvironmentOutput, AWSError] = js.native
  /**
    * Deletes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def deleteEnvironment(params: DeleteEnvironmentInput): Request[DeleteEnvironmentOutput, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentOutput, scala.Unit]
  ): Request[DeleteEnvironmentOutput, AWSError] = js.native
  
  /**
    * Describes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def getEnvironment(): Request[GetEnvironmentOutput, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentOutput, scala.Unit]): Request[GetEnvironmentOutput, AWSError] = js.native
  /**
    * Describes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def getEnvironment(params: GetEnvironmentInput): Request[GetEnvironmentOutput, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentOutput, scala.Unit]
  ): Request[GetEnvironmentOutput, AWSError] = js.native
  
  /**
    * Lists the Amazon Managed Workflows for Apache Airflow (MWAA) environments.
    */
  def listEnvironments(): Request[ListEnvironmentsOutput, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsOutput, scala.Unit]): Request[ListEnvironmentsOutput, AWSError] = js.native
  /**
    * Lists the Amazon Managed Workflows for Apache Airflow (MWAA) environments.
    */
  def listEnvironments(params: ListEnvironmentsInput): Request[ListEnvironmentsOutput, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsOutput, scala.Unit]
  ): Request[ListEnvironmentsOutput, AWSError] = js.native
  
  /**
    * Lists the key-value tag pairs associated to the Amazon Managed Workflows for Apache Airflow (MWAA) environment. For example, "Environment": "Staging". 
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, scala.Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the key-value tag pairs associated to the Amazon Managed Workflows for Apache Airflow (MWAA) environment. For example, "Environment": "Staging". 
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, scala.Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    *  Internal only. Publishes environment health metrics to Amazon CloudWatch.
    */
  def publishMetrics(): Request[PublishMetricsOutput, AWSError] = js.native
  def publishMetrics(callback: js.Function2[/* err */ AWSError, /* data */ PublishMetricsOutput, scala.Unit]): Request[PublishMetricsOutput, AWSError] = js.native
  /**
    *  Internal only. Publishes environment health metrics to Amazon CloudWatch.
    */
  def publishMetrics(params: PublishMetricsInput): Request[PublishMetricsOutput, AWSError] = js.native
  def publishMetrics(
    params: PublishMetricsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishMetricsOutput, scala.Unit]
  ): Request[PublishMetricsOutput, AWSError] = js.native
  
  /**
    * Associates key-value tag pairs to your Amazon Managed Workflows for Apache Airflow (MWAA) environment. 
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, scala.Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Associates key-value tag pairs to your Amazon Managed Workflows for Apache Airflow (MWAA) environment. 
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, scala.Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes key-value tag pairs associated to your Amazon Managed Workflows for Apache Airflow (MWAA) environment. For example, "Environment": "Staging".
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, scala.Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes key-value tag pairs associated to your Amazon Managed Workflows for Apache Airflow (MWAA) environment. For example, "Environment": "Staging".
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, scala.Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def updateEnvironment(): Request[UpdateEnvironmentOutput, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentOutput, scala.Unit]): Request[UpdateEnvironmentOutput, AWSError] = js.native
  /**
    * Updates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
    */
  def updateEnvironment(params: UpdateEnvironmentInput): Request[UpdateEnvironmentOutput, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentOutput, scala.Unit]
  ): Request[UpdateEnvironmentOutput, AWSError] = js.native
}
