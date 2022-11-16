package typings.awsSdk.clientsSsmsapMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsmSap extends Service {
  
  @JSName("config")
  var config_SsmSap: ConfigBase & ClientConfiguration = js.native
  
  /**
    * 
    */
  def deleteResourcePermission(): Request[DeleteResourcePermissionOutput, AWSError] = js.native
  def deleteResourcePermission(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePermissionOutput, Unit]): Request[DeleteResourcePermissionOutput, AWSError] = js.native
  /**
    * 
    */
  def deleteResourcePermission(params: DeleteResourcePermissionInput): Request[DeleteResourcePermissionOutput, AWSError] = js.native
  def deleteResourcePermission(
    params: DeleteResourcePermissionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePermissionOutput, Unit]
  ): Request[DeleteResourcePermissionOutput, AWSError] = js.native
  
  /**
    * 
    */
  def deregisterApplication(): Request[DeregisterApplicationOutput, AWSError] = js.native
  def deregisterApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterApplicationOutput, Unit]): Request[DeregisterApplicationOutput, AWSError] = js.native
  /**
    * 
    */
  def deregisterApplication(params: DeregisterApplicationInput): Request[DeregisterApplicationOutput, AWSError] = js.native
  def deregisterApplication(
    params: DeregisterApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterApplicationOutput, Unit]
  ): Request[DeregisterApplicationOutput, AWSError] = js.native
  
  /**
    * 
    */
  def getApplication(): Request[GetApplicationOutput, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationOutput, Unit]): Request[GetApplicationOutput, AWSError] = js.native
  /**
    * 
    */
  def getApplication(params: GetApplicationInput): Request[GetApplicationOutput, AWSError] = js.native
  def getApplication(
    params: GetApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationOutput, Unit]
  ): Request[GetApplicationOutput, AWSError] = js.native
  
  /**
    * 
    */
  def getComponent(): Request[GetComponentOutput, AWSError] = js.native
  def getComponent(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]): Request[GetComponentOutput, AWSError] = js.native
  /**
    * 
    */
  def getComponent(params: GetComponentInput): Request[GetComponentOutput, AWSError] = js.native
  def getComponent(
    params: GetComponentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]
  ): Request[GetComponentOutput, AWSError] = js.native
  
  /**
    * 
    */
  def getDatabase(): Request[GetDatabaseOutput, AWSError] = js.native
  def getDatabase(callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseOutput, Unit]): Request[GetDatabaseOutput, AWSError] = js.native
  /**
    * 
    */
  def getDatabase(params: GetDatabaseInput): Request[GetDatabaseOutput, AWSError] = js.native
  def getDatabase(
    params: GetDatabaseInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatabaseOutput, Unit]
  ): Request[GetDatabaseOutput, AWSError] = js.native
  
  /**
    * 
    */
  def getOperation(): Request[GetOperationOutput, AWSError] = js.native
  def getOperation(callback: js.Function2[/* err */ AWSError, /* data */ GetOperationOutput, Unit]): Request[GetOperationOutput, AWSError] = js.native
  /**
    * 
    */
  def getOperation(params: GetOperationInput): Request[GetOperationOutput, AWSError] = js.native
  def getOperation(
    params: GetOperationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOperationOutput, Unit]
  ): Request[GetOperationOutput, AWSError] = js.native
  
  /**
    * 
    */
  def getResourcePermission(): Request[GetResourcePermissionOutput, AWSError] = js.native
  def getResourcePermission(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePermissionOutput, Unit]): Request[GetResourcePermissionOutput, AWSError] = js.native
  /**
    * 
    */
  def getResourcePermission(params: GetResourcePermissionInput): Request[GetResourcePermissionOutput, AWSError] = js.native
  def getResourcePermission(
    params: GetResourcePermissionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePermissionOutput, Unit]
  ): Request[GetResourcePermissionOutput, AWSError] = js.native
  
  /**
    * 
    */
  def listApplications(): Request[ListApplicationsOutput, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsOutput, Unit]): Request[ListApplicationsOutput, AWSError] = js.native
  /**
    * 
    */
  def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput, AWSError] = js.native
  def listApplications(
    params: ListApplicationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsOutput, Unit]
  ): Request[ListApplicationsOutput, AWSError] = js.native
  
  /**
    * 
    */
  def listComponents(): Request[ListComponentsOutput, AWSError] = js.native
  def listComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsOutput, Unit]): Request[ListComponentsOutput, AWSError] = js.native
  /**
    * 
    */
  def listComponents(params: ListComponentsInput): Request[ListComponentsOutput, AWSError] = js.native
  def listComponents(
    params: ListComponentsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsOutput, Unit]
  ): Request[ListComponentsOutput, AWSError] = js.native
  
  /**
    * 
    */
  def listDatabases(): Request[ListDatabasesOutput, AWSError] = js.native
  def listDatabases(callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesOutput, Unit]): Request[ListDatabasesOutput, AWSError] = js.native
  /**
    * 
    */
  def listDatabases(params: ListDatabasesInput): Request[ListDatabasesOutput, AWSError] = js.native
  def listDatabases(
    params: ListDatabasesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesOutput, Unit]
  ): Request[ListDatabasesOutput, AWSError] = js.native
  
  /**
    * 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * 
    */
  def putResourcePermission(): Request[PutResourcePermissionOutput, AWSError] = js.native
  def putResourcePermission(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePermissionOutput, Unit]): Request[PutResourcePermissionOutput, AWSError] = js.native
  /**
    * 
    */
  def putResourcePermission(params: PutResourcePermissionInput): Request[PutResourcePermissionOutput, AWSError] = js.native
  def putResourcePermission(
    params: PutResourcePermissionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePermissionOutput, Unit]
  ): Request[PutResourcePermissionOutput, AWSError] = js.native
  
  /**
    * 
    */
  def registerApplication(): Request[RegisterApplicationOutput, AWSError] = js.native
  def registerApplication(callback: js.Function2[/* err */ AWSError, /* data */ RegisterApplicationOutput, Unit]): Request[RegisterApplicationOutput, AWSError] = js.native
  /**
    * 
    */
  def registerApplication(params: RegisterApplicationInput): Request[RegisterApplicationOutput, AWSError] = js.native
  def registerApplication(
    params: RegisterApplicationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterApplicationOutput, Unit]
  ): Request[RegisterApplicationOutput, AWSError] = js.native
  
  /**
    * 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * 
    */
  def updateApplicationSettings(): Request[UpdateApplicationSettingsOutput, AWSError] = js.native
  def updateApplicationSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationSettingsOutput, Unit]): Request[UpdateApplicationSettingsOutput, AWSError] = js.native
  /**
    * 
    */
  def updateApplicationSettings(params: UpdateApplicationSettingsInput): Request[UpdateApplicationSettingsOutput, AWSError] = js.native
  def updateApplicationSettings(
    params: UpdateApplicationSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationSettingsOutput, Unit]
  ): Request[UpdateApplicationSettingsOutput, AWSError] = js.native
}
