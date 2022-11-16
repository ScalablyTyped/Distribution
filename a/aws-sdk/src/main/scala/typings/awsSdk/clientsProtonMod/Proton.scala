package typings.awsSdk.clientsProtonMod

import typings.awsSdk.anon.GetComponentInputwaiterWa
import typings.awsSdk.anon.GetEnvironmentInputwaiter
import typings.awsSdk.anon.GetEnvironmentTemplateVer
import typings.awsSdk.anon.GetServiceInputwaiterWait
import typings.awsSdk.anon.GetServiceInstanceInputwa
import typings.awsSdk.anon.GetServiceTemplateVersion
import typings.awsSdk.awsSdkStrings.componentDeleted
import typings.awsSdk.awsSdkStrings.componentDeployed
import typings.awsSdk.awsSdkStrings.environmentDeployed
import typings.awsSdk.awsSdkStrings.environmentTemplateVersionRegistered
import typings.awsSdk.awsSdkStrings.serviceCreated
import typings.awsSdk.awsSdkStrings.serviceDeleted
import typings.awsSdk.awsSdkStrings.serviceInstanceDeployed
import typings.awsSdk.awsSdkStrings.servicePipelineDeployed
import typings.awsSdk.awsSdkStrings.serviceTemplateVersionRegistered
import typings.awsSdk.awsSdkStrings.serviceUpdated
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proton
  extends StObject
     with Service {
  
  /**
    * In a management account, an environment account connection request is accepted. When the environment account connection request is accepted, Proton can use the associated IAM role to provision environment infrastructure resources in the associated environment account. For more information, see Environment account connections in the Proton User guide.
    */
  def acceptEnvironmentAccountConnection(): Request[AcceptEnvironmentAccountConnectionOutput, AWSError] = js.native
  def acceptEnvironmentAccountConnection(
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptEnvironmentAccountConnectionOutput, Unit]
  ): Request[AcceptEnvironmentAccountConnectionOutput, AWSError] = js.native
  /**
    * In a management account, an environment account connection request is accepted. When the environment account connection request is accepted, Proton can use the associated IAM role to provision environment infrastructure resources in the associated environment account. For more information, see Environment account connections in the Proton User guide.
    */
  def acceptEnvironmentAccountConnection(params: AcceptEnvironmentAccountConnectionInput): Request[AcceptEnvironmentAccountConnectionOutput, AWSError] = js.native
  def acceptEnvironmentAccountConnection(
    params: AcceptEnvironmentAccountConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptEnvironmentAccountConnectionOutput, Unit]
  ): Request[AcceptEnvironmentAccountConnectionOutput, AWSError] = js.native
  
  /**
    * Attempts to cancel a component deployment (for a component that is in the IN_PROGRESS deployment status). For more information about components, see Proton components in the Proton User Guide.
    */
  def cancelComponentDeployment(): Request[CancelComponentDeploymentOutput, AWSError] = js.native
  def cancelComponentDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CancelComponentDeploymentOutput, Unit]): Request[CancelComponentDeploymentOutput, AWSError] = js.native
  /**
    * Attempts to cancel a component deployment (for a component that is in the IN_PROGRESS deployment status). For more information about components, see Proton components in the Proton User Guide.
    */
  def cancelComponentDeployment(params: CancelComponentDeploymentInput): Request[CancelComponentDeploymentOutput, AWSError] = js.native
  def cancelComponentDeployment(
    params: CancelComponentDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelComponentDeploymentOutput, Unit]
  ): Request[CancelComponentDeploymentOutput, AWSError] = js.native
  
  /**
    * Attempts to cancel an environment deployment on an UpdateEnvironment action, if the deployment is IN_PROGRESS. For more information, see Update an environment in the Proton User guide. The following list includes potential cancellation scenarios.   If the cancellation attempt succeeds, the resulting deployment state is CANCELLED.   If the cancellation attempt fails, the resulting deployment state is FAILED.   If the current UpdateEnvironment action succeeds before the cancellation attempt starts, the resulting deployment state is SUCCEEDED and the cancellation attempt has no effect.  
    */
  def cancelEnvironmentDeployment(): Request[CancelEnvironmentDeploymentOutput, AWSError] = js.native
  def cancelEnvironmentDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CancelEnvironmentDeploymentOutput, Unit]): Request[CancelEnvironmentDeploymentOutput, AWSError] = js.native
  /**
    * Attempts to cancel an environment deployment on an UpdateEnvironment action, if the deployment is IN_PROGRESS. For more information, see Update an environment in the Proton User guide. The following list includes potential cancellation scenarios.   If the cancellation attempt succeeds, the resulting deployment state is CANCELLED.   If the cancellation attempt fails, the resulting deployment state is FAILED.   If the current UpdateEnvironment action succeeds before the cancellation attempt starts, the resulting deployment state is SUCCEEDED and the cancellation attempt has no effect.  
    */
  def cancelEnvironmentDeployment(params: CancelEnvironmentDeploymentInput): Request[CancelEnvironmentDeploymentOutput, AWSError] = js.native
  def cancelEnvironmentDeployment(
    params: CancelEnvironmentDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelEnvironmentDeploymentOutput, Unit]
  ): Request[CancelEnvironmentDeploymentOutput, AWSError] = js.native
  
  /**
    * Attempts to cancel a service instance deployment on an UpdateServiceInstance action, if the deployment is IN_PROGRESS. For more information, see Update a service instance in the Proton User guide. The following list includes potential cancellation scenarios.   If the cancellation attempt succeeds, the resulting deployment state is CANCELLED.   If the cancellation attempt fails, the resulting deployment state is FAILED.   If the current UpdateServiceInstance action succeeds before the cancellation attempt starts, the resulting deployment state is SUCCEEDED and the cancellation attempt has no effect.  
    */
  def cancelServiceInstanceDeployment(): Request[CancelServiceInstanceDeploymentOutput, AWSError] = js.native
  def cancelServiceInstanceDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CancelServiceInstanceDeploymentOutput, Unit]): Request[CancelServiceInstanceDeploymentOutput, AWSError] = js.native
  /**
    * Attempts to cancel a service instance deployment on an UpdateServiceInstance action, if the deployment is IN_PROGRESS. For more information, see Update a service instance in the Proton User guide. The following list includes potential cancellation scenarios.   If the cancellation attempt succeeds, the resulting deployment state is CANCELLED.   If the cancellation attempt fails, the resulting deployment state is FAILED.   If the current UpdateServiceInstance action succeeds before the cancellation attempt starts, the resulting deployment state is SUCCEEDED and the cancellation attempt has no effect.  
    */
  def cancelServiceInstanceDeployment(params: CancelServiceInstanceDeploymentInput): Request[CancelServiceInstanceDeploymentOutput, AWSError] = js.native
  def cancelServiceInstanceDeployment(
    params: CancelServiceInstanceDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelServiceInstanceDeploymentOutput, Unit]
  ): Request[CancelServiceInstanceDeploymentOutput, AWSError] = js.native
  
  /**
    * Attempts to cancel a service pipeline deployment on an UpdateServicePipeline action, if the deployment is IN_PROGRESS. For more information, see Update a service pipeline in the Proton User guide. The following list includes potential cancellation scenarios.   If the cancellation attempt succeeds, the resulting deployment state is CANCELLED.   If the cancellation attempt fails, the resulting deployment state is FAILED.   If the current UpdateServicePipeline action succeeds before the cancellation attempt starts, the resulting deployment state is SUCCEEDED and the cancellation attempt has no effect.  
    */
  def cancelServicePipelineDeployment(): Request[CancelServicePipelineDeploymentOutput, AWSError] = js.native
  def cancelServicePipelineDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CancelServicePipelineDeploymentOutput, Unit]): Request[CancelServicePipelineDeploymentOutput, AWSError] = js.native
  /**
    * Attempts to cancel a service pipeline deployment on an UpdateServicePipeline action, if the deployment is IN_PROGRESS. For more information, see Update a service pipeline in the Proton User guide. The following list includes potential cancellation scenarios.   If the cancellation attempt succeeds, the resulting deployment state is CANCELLED.   If the cancellation attempt fails, the resulting deployment state is FAILED.   If the current UpdateServicePipeline action succeeds before the cancellation attempt starts, the resulting deployment state is SUCCEEDED and the cancellation attempt has no effect.  
    */
  def cancelServicePipelineDeployment(params: CancelServicePipelineDeploymentInput): Request[CancelServicePipelineDeploymentOutput, AWSError] = js.native
  def cancelServicePipelineDeployment(
    params: CancelServicePipelineDeploymentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelServicePipelineDeploymentOutput, Unit]
  ): Request[CancelServicePipelineDeploymentOutput, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create an Proton component. A component is an infrastructure extension for a service instance. For more information about components, see Proton components in the Proton User Guide.
    */
  def createComponent(): Request[CreateComponentOutput, AWSError] = js.native
  def createComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentOutput, Unit]): Request[CreateComponentOutput, AWSError] = js.native
  /**
    * Create an Proton component. A component is an infrastructure extension for a service instance. For more information about components, see Proton components in the Proton User Guide.
    */
  def createComponent(params: CreateComponentInput): Request[CreateComponentOutput, AWSError] = js.native
  def createComponent(
    params: CreateComponentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentOutput, Unit]
  ): Request[CreateComponentOutput, AWSError] = js.native
  
  /**
    * Deploy a new environment. An Proton environment is created from an environment template that defines infrastructure and resources that can be shared across services.  You can provision environments using the following methods:     Amazon Web Services-managed provisioning – Proton makes direct calls to provision your resources.    Self-managed provisioning – Proton makes pull requests on your repository to provide compiled infrastructure as code (IaC) files that your IaC engine uses to provision resources.    CodeBuild-based provisioning – Proton uses CodeBuild to run shell commands that you provide. Your commands can read inputs that Proton provides, and are responsible for provisioning or deprovisioning infrastructure and generating output values.   For more information, see Environments and Provisioning methods in the Proton User Guide.
    */
  def createEnvironment(): Request[CreateEnvironmentOutput, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentOutput, Unit]): Request[CreateEnvironmentOutput, AWSError] = js.native
  /**
    * Deploy a new environment. An Proton environment is created from an environment template that defines infrastructure and resources that can be shared across services.  You can provision environments using the following methods:     Amazon Web Services-managed provisioning – Proton makes direct calls to provision your resources.    Self-managed provisioning – Proton makes pull requests on your repository to provide compiled infrastructure as code (IaC) files that your IaC engine uses to provision resources.    CodeBuild-based provisioning – Proton uses CodeBuild to run shell commands that you provide. Your commands can read inputs that Proton provides, and are responsible for provisioning or deprovisioning infrastructure and generating output values.   For more information, see Environments and Provisioning methods in the Proton User Guide.
    */
  def createEnvironment(params: CreateEnvironmentInput): Request[CreateEnvironmentOutput, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentOutput, Unit]
  ): Request[CreateEnvironmentOutput, AWSError] = js.native
  
  /**
    * Create an environment account connection in an environment account so that environment infrastructure resources can be provisioned in the environment account from a management account. An environment account connection is a secure bi-directional connection between a management account and an environment account that maintains authorization and permissions. For more information, see Environment account connections in the Proton User guide.
    */
  def createEnvironmentAccountConnection(): Request[CreateEnvironmentAccountConnectionOutput, AWSError] = js.native
  def createEnvironmentAccountConnection(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentAccountConnectionOutput, Unit]
  ): Request[CreateEnvironmentAccountConnectionOutput, AWSError] = js.native
  /**
    * Create an environment account connection in an environment account so that environment infrastructure resources can be provisioned in the environment account from a management account. An environment account connection is a secure bi-directional connection between a management account and an environment account that maintains authorization and permissions. For more information, see Environment account connections in the Proton User guide.
    */
  def createEnvironmentAccountConnection(params: CreateEnvironmentAccountConnectionInput): Request[CreateEnvironmentAccountConnectionOutput, AWSError] = js.native
  def createEnvironmentAccountConnection(
    params: CreateEnvironmentAccountConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentAccountConnectionOutput, Unit]
  ): Request[CreateEnvironmentAccountConnectionOutput, AWSError] = js.native
  
  /**
    * Create an environment template for Proton. For more information, see Environment Templates in the Proton User Guide. You can create an environment template in one of the two following ways:   Register and publish a standard environment template that instructs Proton to deploy and manage environment infrastructure.   Register and publish a customer managed environment template that connects Proton to your existing provisioned infrastructure that you manage. Proton doesn't manage your existing provisioned infrastructure. To create an environment template for customer provisioned and managed infrastructure, include the provisioning parameter and set the value to CUSTOMER_MANAGED. For more information, see Register and publish an environment template in the Proton User Guide.  
    */
  def createEnvironmentTemplate(): Request[CreateEnvironmentTemplateOutput, AWSError] = js.native
  def createEnvironmentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentTemplateOutput, Unit]): Request[CreateEnvironmentTemplateOutput, AWSError] = js.native
  /**
    * Create an environment template for Proton. For more information, see Environment Templates in the Proton User Guide. You can create an environment template in one of the two following ways:   Register and publish a standard environment template that instructs Proton to deploy and manage environment infrastructure.   Register and publish a customer managed environment template that connects Proton to your existing provisioned infrastructure that you manage. Proton doesn't manage your existing provisioned infrastructure. To create an environment template for customer provisioned and managed infrastructure, include the provisioning parameter and set the value to CUSTOMER_MANAGED. For more information, see Register and publish an environment template in the Proton User Guide.  
    */
  def createEnvironmentTemplate(params: CreateEnvironmentTemplateInput): Request[CreateEnvironmentTemplateOutput, AWSError] = js.native
  def createEnvironmentTemplate(
    params: CreateEnvironmentTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentTemplateOutput, Unit]
  ): Request[CreateEnvironmentTemplateOutput, AWSError] = js.native
  
  /**
    * Create a new major or minor version of an environment template. A major version of an environment template is a version that isn't backwards compatible. A minor version of an environment template is a version that's backwards compatible within its major version.
    */
  def createEnvironmentTemplateVersion(): Request[CreateEnvironmentTemplateVersionOutput, AWSError] = js.native
  def createEnvironmentTemplateVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentTemplateVersionOutput, Unit]
  ): Request[CreateEnvironmentTemplateVersionOutput, AWSError] = js.native
  /**
    * Create a new major or minor version of an environment template. A major version of an environment template is a version that isn't backwards compatible. A minor version of an environment template is a version that's backwards compatible within its major version.
    */
  def createEnvironmentTemplateVersion(params: CreateEnvironmentTemplateVersionInput): Request[CreateEnvironmentTemplateVersionOutput, AWSError] = js.native
  def createEnvironmentTemplateVersion(
    params: CreateEnvironmentTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentTemplateVersionOutput, Unit]
  ): Request[CreateEnvironmentTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Create and register a link to a repository. Proton uses the link to repeatedly access the repository, to either push to it (self-managed provisioning) or pull from it (template sync). You can share a linked repository across multiple resources (like environments using self-managed provisioning, or synced templates). When you create a repository link, Proton creates a service-linked role for you. For more information, see Self-managed provisioning, Template bundles, and Template sync configurations in the Proton User Guide.
    */
  def createRepository(): Request[CreateRepositoryOutput, AWSError] = js.native
  def createRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryOutput, Unit]): Request[CreateRepositoryOutput, AWSError] = js.native
  /**
    * Create and register a link to a repository. Proton uses the link to repeatedly access the repository, to either push to it (self-managed provisioning) or pull from it (template sync). You can share a linked repository across multiple resources (like environments using self-managed provisioning, or synced templates). When you create a repository link, Proton creates a service-linked role for you. For more information, see Self-managed provisioning, Template bundles, and Template sync configurations in the Proton User Guide.
    */
  def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput, AWSError] = js.native
  def createRepository(
    params: CreateRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryOutput, Unit]
  ): Request[CreateRepositoryOutput, AWSError] = js.native
  
  /**
    * Create an Proton service. An Proton service is an instantiation of a service template and often includes several service instances and pipeline. For more information, see Services in the Proton User Guide.
    */
  def createService(): Request[CreateServiceOutput, AWSError] = js.native
  def createService(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceOutput, Unit]): Request[CreateServiceOutput, AWSError] = js.native
  /**
    * Create an Proton service. An Proton service is an instantiation of a service template and often includes several service instances and pipeline. For more information, see Services in the Proton User Guide.
    */
  def createService(params: CreateServiceInput): Request[CreateServiceOutput, AWSError] = js.native
  def createService(
    params: CreateServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceOutput, Unit]
  ): Request[CreateServiceOutput, AWSError] = js.native
  
  /**
    * Create a service template. The administrator creates a service template to define standardized infrastructure and an optional CI/CD service pipeline. Developers, in turn, select the service template from Proton. If the selected service template includes a service pipeline definition, they provide a link to their source code repository. Proton then deploys and manages the infrastructure defined by the selected service template. For more information, see Proton templates in the Proton User Guide.
    */
  def createServiceTemplate(): Request[CreateServiceTemplateOutput, AWSError] = js.native
  def createServiceTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceTemplateOutput, Unit]): Request[CreateServiceTemplateOutput, AWSError] = js.native
  /**
    * Create a service template. The administrator creates a service template to define standardized infrastructure and an optional CI/CD service pipeline. Developers, in turn, select the service template from Proton. If the selected service template includes a service pipeline definition, they provide a link to their source code repository. Proton then deploys and manages the infrastructure defined by the selected service template. For more information, see Proton templates in the Proton User Guide.
    */
  def createServiceTemplate(params: CreateServiceTemplateInput): Request[CreateServiceTemplateOutput, AWSError] = js.native
  def createServiceTemplate(
    params: CreateServiceTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceTemplateOutput, Unit]
  ): Request[CreateServiceTemplateOutput, AWSError] = js.native
  
  /**
    * Create a new major or minor version of a service template. A major version of a service template is a version that isn't backward compatible. A minor version of a service template is a version that's backward compatible within its major version.
    */
  def createServiceTemplateVersion(): Request[CreateServiceTemplateVersionOutput, AWSError] = js.native
  def createServiceTemplateVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceTemplateVersionOutput, Unit]): Request[CreateServiceTemplateVersionOutput, AWSError] = js.native
  /**
    * Create a new major or minor version of a service template. A major version of a service template is a version that isn't backward compatible. A minor version of a service template is a version that's backward compatible within its major version.
    */
  def createServiceTemplateVersion(params: CreateServiceTemplateVersionInput): Request[CreateServiceTemplateVersionOutput, AWSError] = js.native
  def createServiceTemplateVersion(
    params: CreateServiceTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceTemplateVersionOutput, Unit]
  ): Request[CreateServiceTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Set up a template to create new template versions automatically by tracking a linked repository. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository. When a commit is pushed to your linked repository, Proton checks for changes to your repository template bundles. If it detects a template bundle change, a new major or minor version of its template is created, if the version doesn’t already exist. For more information, see Template sync configurations in the Proton User Guide.
    */
  def createTemplateSyncConfig(): Request[CreateTemplateSyncConfigOutput, AWSError] = js.native
  def createTemplateSyncConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateSyncConfigOutput, Unit]): Request[CreateTemplateSyncConfigOutput, AWSError] = js.native
  /**
    * Set up a template to create new template versions automatically by tracking a linked repository. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository. When a commit is pushed to your linked repository, Proton checks for changes to your repository template bundles. If it detects a template bundle change, a new major or minor version of its template is created, if the version doesn’t already exist. For more information, see Template sync configurations in the Proton User Guide.
    */
  def createTemplateSyncConfig(params: CreateTemplateSyncConfigInput): Request[CreateTemplateSyncConfigOutput, AWSError] = js.native
  def createTemplateSyncConfig(
    params: CreateTemplateSyncConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateSyncConfigOutput, Unit]
  ): Request[CreateTemplateSyncConfigOutput, AWSError] = js.native
  
  /**
    * Delete an Proton component resource. For more information about components, see Proton components in the Proton User Guide.
    */
  def deleteComponent(): Request[DeleteComponentOutput, AWSError] = js.native
  def deleteComponent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentOutput, Unit]): Request[DeleteComponentOutput, AWSError] = js.native
  /**
    * Delete an Proton component resource. For more information about components, see Proton components in the Proton User Guide.
    */
  def deleteComponent(params: DeleteComponentInput): Request[DeleteComponentOutput, AWSError] = js.native
  def deleteComponent(
    params: DeleteComponentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentOutput, Unit]
  ): Request[DeleteComponentOutput, AWSError] = js.native
  
  /**
    * Delete an environment.
    */
  def deleteEnvironment(): Request[DeleteEnvironmentOutput, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentOutput, Unit]): Request[DeleteEnvironmentOutput, AWSError] = js.native
  /**
    * Delete an environment.
    */
  def deleteEnvironment(params: DeleteEnvironmentInput): Request[DeleteEnvironmentOutput, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentOutput, Unit]
  ): Request[DeleteEnvironmentOutput, AWSError] = js.native
  
  /**
    * In an environment account, delete an environment account connection. After you delete an environment account connection that’s in use by an Proton environment, Proton can’t manage the environment infrastructure resources until a new environment account connection is accepted for the environment account and associated environment. You're responsible for cleaning up provisioned resources that remain without an environment connection. For more information, see Environment account connections in the Proton User guide.
    */
  def deleteEnvironmentAccountConnection(): Request[DeleteEnvironmentAccountConnectionOutput, AWSError] = js.native
  def deleteEnvironmentAccountConnection(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentAccountConnectionOutput, Unit]
  ): Request[DeleteEnvironmentAccountConnectionOutput, AWSError] = js.native
  /**
    * In an environment account, delete an environment account connection. After you delete an environment account connection that’s in use by an Proton environment, Proton can’t manage the environment infrastructure resources until a new environment account connection is accepted for the environment account and associated environment. You're responsible for cleaning up provisioned resources that remain without an environment connection. For more information, see Environment account connections in the Proton User guide.
    */
  def deleteEnvironmentAccountConnection(params: DeleteEnvironmentAccountConnectionInput): Request[DeleteEnvironmentAccountConnectionOutput, AWSError] = js.native
  def deleteEnvironmentAccountConnection(
    params: DeleteEnvironmentAccountConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentAccountConnectionOutput, Unit]
  ): Request[DeleteEnvironmentAccountConnectionOutput, AWSError] = js.native
  
  /**
    * If no other major or minor versions of an environment template exist, delete the environment template.
    */
  def deleteEnvironmentTemplate(): Request[DeleteEnvironmentTemplateOutput, AWSError] = js.native
  def deleteEnvironmentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentTemplateOutput, Unit]): Request[DeleteEnvironmentTemplateOutput, AWSError] = js.native
  /**
    * If no other major or minor versions of an environment template exist, delete the environment template.
    */
  def deleteEnvironmentTemplate(params: DeleteEnvironmentTemplateInput): Request[DeleteEnvironmentTemplateOutput, AWSError] = js.native
  def deleteEnvironmentTemplate(
    params: DeleteEnvironmentTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentTemplateOutput, Unit]
  ): Request[DeleteEnvironmentTemplateOutput, AWSError] = js.native
  
  /**
    * If no other minor versions of an environment template exist, delete a major version of the environment template if it's not the Recommended version. Delete the Recommended version of the environment template if no other major versions or minor versions of the environment template exist. A major version of an environment template is a version that's not backward compatible. Delete a minor version of an environment template if it isn't the Recommended version. Delete a Recommended minor version of the environment template if no other minor versions of the environment template exist. A minor version of an environment template is a version that's backward compatible.
    */
  def deleteEnvironmentTemplateVersion(): Request[DeleteEnvironmentTemplateVersionOutput, AWSError] = js.native
  def deleteEnvironmentTemplateVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentTemplateVersionOutput, Unit]
  ): Request[DeleteEnvironmentTemplateVersionOutput, AWSError] = js.native
  /**
    * If no other minor versions of an environment template exist, delete a major version of the environment template if it's not the Recommended version. Delete the Recommended version of the environment template if no other major versions or minor versions of the environment template exist. A major version of an environment template is a version that's not backward compatible. Delete a minor version of an environment template if it isn't the Recommended version. Delete a Recommended minor version of the environment template if no other minor versions of the environment template exist. A minor version of an environment template is a version that's backward compatible.
    */
  def deleteEnvironmentTemplateVersion(params: DeleteEnvironmentTemplateVersionInput): Request[DeleteEnvironmentTemplateVersionOutput, AWSError] = js.native
  def deleteEnvironmentTemplateVersion(
    params: DeleteEnvironmentTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentTemplateVersionOutput, Unit]
  ): Request[DeleteEnvironmentTemplateVersionOutput, AWSError] = js.native
  
  /**
    * De-register and unlink your repository.
    */
  def deleteRepository(): Request[DeleteRepositoryOutput, AWSError] = js.native
  def deleteRepository(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryOutput, Unit]): Request[DeleteRepositoryOutput, AWSError] = js.native
  /**
    * De-register and unlink your repository.
    */
  def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput, AWSError] = js.native
  def deleteRepository(
    params: DeleteRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryOutput, Unit]
  ): Request[DeleteRepositoryOutput, AWSError] = js.native
  
  /**
    * Delete a service, with its instances and pipeline.  You can't delete a service if it has any service instances that have components attached to them. For more information about components, see Proton components in the Proton User Guide. 
    */
  def deleteService(): Request[DeleteServiceOutput, AWSError] = js.native
  def deleteService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceOutput, Unit]): Request[DeleteServiceOutput, AWSError] = js.native
  /**
    * Delete a service, with its instances and pipeline.  You can't delete a service if it has any service instances that have components attached to them. For more information about components, see Proton components in the Proton User Guide. 
    */
  def deleteService(params: DeleteServiceInput): Request[DeleteServiceOutput, AWSError] = js.native
  def deleteService(
    params: DeleteServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceOutput, Unit]
  ): Request[DeleteServiceOutput, AWSError] = js.native
  
  /**
    * If no other major or minor versions of the service template exist, delete the service template.
    */
  def deleteServiceTemplate(): Request[DeleteServiceTemplateOutput, AWSError] = js.native
  def deleteServiceTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceTemplateOutput, Unit]): Request[DeleteServiceTemplateOutput, AWSError] = js.native
  /**
    * If no other major or minor versions of the service template exist, delete the service template.
    */
  def deleteServiceTemplate(params: DeleteServiceTemplateInput): Request[DeleteServiceTemplateOutput, AWSError] = js.native
  def deleteServiceTemplate(
    params: DeleteServiceTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceTemplateOutput, Unit]
  ): Request[DeleteServiceTemplateOutput, AWSError] = js.native
  
  /**
    * If no other minor versions of a service template exist, delete a major version of the service template if it's not the Recommended version. Delete the Recommended version of the service template if no other major versions or minor versions of the service template exist. A major version of a service template is a version that isn't backwards compatible. Delete a minor version of a service template if it's not the Recommended version. Delete a Recommended minor version of the service template if no other minor versions of the service template exist. A minor version of a service template is a version that's backwards compatible.
    */
  def deleteServiceTemplateVersion(): Request[DeleteServiceTemplateVersionOutput, AWSError] = js.native
  def deleteServiceTemplateVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceTemplateVersionOutput, Unit]): Request[DeleteServiceTemplateVersionOutput, AWSError] = js.native
  /**
    * If no other minor versions of a service template exist, delete a major version of the service template if it's not the Recommended version. Delete the Recommended version of the service template if no other major versions or minor versions of the service template exist. A major version of a service template is a version that isn't backwards compatible. Delete a minor version of a service template if it's not the Recommended version. Delete a Recommended minor version of the service template if no other minor versions of the service template exist. A minor version of a service template is a version that's backwards compatible.
    */
  def deleteServiceTemplateVersion(params: DeleteServiceTemplateVersionInput): Request[DeleteServiceTemplateVersionOutput, AWSError] = js.native
  def deleteServiceTemplateVersion(
    params: DeleteServiceTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceTemplateVersionOutput, Unit]
  ): Request[DeleteServiceTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Delete a template sync configuration.
    */
  def deleteTemplateSyncConfig(): Request[DeleteTemplateSyncConfigOutput, AWSError] = js.native
  def deleteTemplateSyncConfig(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateSyncConfigOutput, Unit]): Request[DeleteTemplateSyncConfigOutput, AWSError] = js.native
  /**
    * Delete a template sync configuration.
    */
  def deleteTemplateSyncConfig(params: DeleteTemplateSyncConfigInput): Request[DeleteTemplateSyncConfigOutput, AWSError] = js.native
  def deleteTemplateSyncConfig(
    params: DeleteTemplateSyncConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateSyncConfigOutput, Unit]
  ): Request[DeleteTemplateSyncConfigOutput, AWSError] = js.native
  
  /**
    * Get detail data for Proton account-wide settings.
    */
  def getAccountSettings(): Request[GetAccountSettingsOutput, AWSError] = js.native
  def getAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsOutput, Unit]): Request[GetAccountSettingsOutput, AWSError] = js.native
  /**
    * Get detail data for Proton account-wide settings.
    */
  def getAccountSettings(params: GetAccountSettingsInput): Request[GetAccountSettingsOutput, AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsOutput, Unit]
  ): Request[GetAccountSettingsOutput, AWSError] = js.native
  
  /**
    * Get detailed data for a component. For more information about components, see Proton components in the Proton User Guide.
    */
  def getComponent(): Request[GetComponentOutput, AWSError] = js.native
  def getComponent(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]): Request[GetComponentOutput, AWSError] = js.native
  /**
    * Get detailed data for a component. For more information about components, see Proton components in the Proton User Guide.
    */
  def getComponent(params: GetComponentInput): Request[GetComponentOutput, AWSError] = js.native
  def getComponent(
    params: GetComponentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]
  ): Request[GetComponentOutput, AWSError] = js.native
  
  /**
    * Get detailed data for an environment.
    */
  def getEnvironment(): Request[GetEnvironmentOutput, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentOutput, Unit]): Request[GetEnvironmentOutput, AWSError] = js.native
  /**
    * Get detailed data for an environment.
    */
  def getEnvironment(params: GetEnvironmentInput): Request[GetEnvironmentOutput, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentOutput, Unit]
  ): Request[GetEnvironmentOutput, AWSError] = js.native
  
  /**
    * In an environment account, get the detailed data for an environment account connection. For more information, see Environment account connections in the Proton User guide.
    */
  def getEnvironmentAccountConnection(): Request[GetEnvironmentAccountConnectionOutput, AWSError] = js.native
  def getEnvironmentAccountConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentAccountConnectionOutput, Unit]): Request[GetEnvironmentAccountConnectionOutput, AWSError] = js.native
  /**
    * In an environment account, get the detailed data for an environment account connection. For more information, see Environment account connections in the Proton User guide.
    */
  def getEnvironmentAccountConnection(params: GetEnvironmentAccountConnectionInput): Request[GetEnvironmentAccountConnectionOutput, AWSError] = js.native
  def getEnvironmentAccountConnection(
    params: GetEnvironmentAccountConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentAccountConnectionOutput, Unit]
  ): Request[GetEnvironmentAccountConnectionOutput, AWSError] = js.native
  
  /**
    * Get detailed data for an environment template.
    */
  def getEnvironmentTemplate(): Request[GetEnvironmentTemplateOutput, AWSError] = js.native
  def getEnvironmentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentTemplateOutput, Unit]): Request[GetEnvironmentTemplateOutput, AWSError] = js.native
  /**
    * Get detailed data for an environment template.
    */
  def getEnvironmentTemplate(params: GetEnvironmentTemplateInput): Request[GetEnvironmentTemplateOutput, AWSError] = js.native
  def getEnvironmentTemplate(
    params: GetEnvironmentTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentTemplateOutput, Unit]
  ): Request[GetEnvironmentTemplateOutput, AWSError] = js.native
  
  /**
    * Get detailed data for a major or minor version of an environment template.
    */
  def getEnvironmentTemplateVersion(): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  def getEnvironmentTemplateVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentTemplateVersionOutput, Unit]): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  /**
    * Get detailed data for a major or minor version of an environment template.
    */
  def getEnvironmentTemplateVersion(params: GetEnvironmentTemplateVersionInput): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  def getEnvironmentTemplateVersion(
    params: GetEnvironmentTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentTemplateVersionOutput, Unit]
  ): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Get detail data for a linked repository.
    */
  def getRepository(): Request[GetRepositoryOutput, AWSError] = js.native
  def getRepository(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryOutput, Unit]): Request[GetRepositoryOutput, AWSError] = js.native
  /**
    * Get detail data for a linked repository.
    */
  def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput, AWSError] = js.native
  def getRepository(
    params: GetRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryOutput, Unit]
  ): Request[GetRepositoryOutput, AWSError] = js.native
  
  /**
    * Get the sync status of a repository used for Proton template sync. For more information about template sync, see .  A repository sync status isn't tied to the Proton Repository resource (or any other Proton resource). Therefore, tags on an Proton Repository resource have no effect on this action. Specifically, you can't use these tags to control access to this action using Attribute-based access control (ABAC). For more information about ABAC, see ABAC in the Proton User Guide. 
    */
  def getRepositorySyncStatus(): Request[GetRepositorySyncStatusOutput, AWSError] = js.native
  def getRepositorySyncStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositorySyncStatusOutput, Unit]): Request[GetRepositorySyncStatusOutput, AWSError] = js.native
  /**
    * Get the sync status of a repository used for Proton template sync. For more information about template sync, see .  A repository sync status isn't tied to the Proton Repository resource (or any other Proton resource). Therefore, tags on an Proton Repository resource have no effect on this action. Specifically, you can't use these tags to control access to this action using Attribute-based access control (ABAC). For more information about ABAC, see ABAC in the Proton User Guide. 
    */
  def getRepositorySyncStatus(params: GetRepositorySyncStatusInput): Request[GetRepositorySyncStatusOutput, AWSError] = js.native
  def getRepositorySyncStatus(
    params: GetRepositorySyncStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositorySyncStatusOutput, Unit]
  ): Request[GetRepositorySyncStatusOutput, AWSError] = js.native
  
  /**
    * Get detailed data for a service.
    */
  def getService(): Request[GetServiceOutput, AWSError] = js.native
  def getService(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Get detailed data for a service.
    */
  def getService(params: GetServiceInput): Request[GetServiceOutput, AWSError] = js.native
  def getService(
    params: GetServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  
  /**
    * Get detailed data for a service instance. A service instance is an instantiation of service template and it runs in a specific environment.
    */
  def getServiceInstance(): Request[GetServiceInstanceOutput, AWSError] = js.native
  def getServiceInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceInstanceOutput, Unit]): Request[GetServiceInstanceOutput, AWSError] = js.native
  /**
    * Get detailed data for a service instance. A service instance is an instantiation of service template and it runs in a specific environment.
    */
  def getServiceInstance(params: GetServiceInstanceInput): Request[GetServiceInstanceOutput, AWSError] = js.native
  def getServiceInstance(
    params: GetServiceInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceInstanceOutput, Unit]
  ): Request[GetServiceInstanceOutput, AWSError] = js.native
  
  /**
    * Get detailed data for a service template.
    */
  def getServiceTemplate(): Request[GetServiceTemplateOutput, AWSError] = js.native
  def getServiceTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceTemplateOutput, Unit]): Request[GetServiceTemplateOutput, AWSError] = js.native
  /**
    * Get detailed data for a service template.
    */
  def getServiceTemplate(params: GetServiceTemplateInput): Request[GetServiceTemplateOutput, AWSError] = js.native
  def getServiceTemplate(
    params: GetServiceTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceTemplateOutput, Unit]
  ): Request[GetServiceTemplateOutput, AWSError] = js.native
  
  /**
    * Get detailed data for a major or minor version of a service template.
    */
  def getServiceTemplateVersion(): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  def getServiceTemplateVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceTemplateVersionOutput, Unit]): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  /**
    * Get detailed data for a major or minor version of a service template.
    */
  def getServiceTemplateVersion(params: GetServiceTemplateVersionInput): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  def getServiceTemplateVersion(
    params: GetServiceTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceTemplateVersionOutput, Unit]
  ): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Get detail data for a template sync configuration.
    */
  def getTemplateSyncConfig(): Request[GetTemplateSyncConfigOutput, AWSError] = js.native
  def getTemplateSyncConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateSyncConfigOutput, Unit]): Request[GetTemplateSyncConfigOutput, AWSError] = js.native
  /**
    * Get detail data for a template sync configuration.
    */
  def getTemplateSyncConfig(params: GetTemplateSyncConfigInput): Request[GetTemplateSyncConfigOutput, AWSError] = js.native
  def getTemplateSyncConfig(
    params: GetTemplateSyncConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateSyncConfigOutput, Unit]
  ): Request[GetTemplateSyncConfigOutput, AWSError] = js.native
  
  /**
    * Get the status of a template sync.
    */
  def getTemplateSyncStatus(): Request[GetTemplateSyncStatusOutput, AWSError] = js.native
  def getTemplateSyncStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateSyncStatusOutput, Unit]): Request[GetTemplateSyncStatusOutput, AWSError] = js.native
  /**
    * Get the status of a template sync.
    */
  def getTemplateSyncStatus(params: GetTemplateSyncStatusInput): Request[GetTemplateSyncStatusOutput, AWSError] = js.native
  def getTemplateSyncStatus(
    params: GetTemplateSyncStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateSyncStatusOutput, Unit]
  ): Request[GetTemplateSyncStatusOutput, AWSError] = js.native
  
  /**
    * Get a list of component Infrastructure as Code (IaC) outputs. For more information about components, see Proton components in the Proton User Guide.
    */
  def listComponentOutputs(): Request[ListComponentOutputsOutput, AWSError] = js.native
  def listComponentOutputs(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentOutputsOutput, Unit]): Request[ListComponentOutputsOutput, AWSError] = js.native
  /**
    * Get a list of component Infrastructure as Code (IaC) outputs. For more information about components, see Proton components in the Proton User Guide.
    */
  def listComponentOutputs(params: ListComponentOutputsInput): Request[ListComponentOutputsOutput, AWSError] = js.native
  def listComponentOutputs(
    params: ListComponentOutputsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentOutputsOutput, Unit]
  ): Request[ListComponentOutputsOutput, AWSError] = js.native
  
  /**
    * List provisioned resources for a component with details. For more information about components, see Proton components in the Proton User Guide.
    */
  def listComponentProvisionedResources(): Request[ListComponentProvisionedResourcesOutput, AWSError] = js.native
  def listComponentProvisionedResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentProvisionedResourcesOutput, Unit]
  ): Request[ListComponentProvisionedResourcesOutput, AWSError] = js.native
  /**
    * List provisioned resources for a component with details. For more information about components, see Proton components in the Proton User Guide.
    */
  def listComponentProvisionedResources(params: ListComponentProvisionedResourcesInput): Request[ListComponentProvisionedResourcesOutput, AWSError] = js.native
  def listComponentProvisionedResources(
    params: ListComponentProvisionedResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentProvisionedResourcesOutput, Unit]
  ): Request[ListComponentProvisionedResourcesOutput, AWSError] = js.native
  
  /**
    * List components with summary data. You can filter the result list by environment, service, or a single service instance. For more information about components, see Proton components in the Proton User Guide.
    */
  def listComponents(): Request[ListComponentsOutput, AWSError] = js.native
  def listComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsOutput, Unit]): Request[ListComponentsOutput, AWSError] = js.native
  /**
    * List components with summary data. You can filter the result list by environment, service, or a single service instance. For more information about components, see Proton components in the Proton User Guide.
    */
  def listComponents(params: ListComponentsInput): Request[ListComponentsOutput, AWSError] = js.native
  def listComponents(
    params: ListComponentsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsOutput, Unit]
  ): Request[ListComponentsOutput, AWSError] = js.native
  
  /**
    * View a list of environment account connections. For more information, see Environment account connections in the Proton User guide.
    */
  def listEnvironmentAccountConnections(): Request[ListEnvironmentAccountConnectionsOutput, AWSError] = js.native
  def listEnvironmentAccountConnections(
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentAccountConnectionsOutput, Unit]
  ): Request[ListEnvironmentAccountConnectionsOutput, AWSError] = js.native
  /**
    * View a list of environment account connections. For more information, see Environment account connections in the Proton User guide.
    */
  def listEnvironmentAccountConnections(params: ListEnvironmentAccountConnectionsInput): Request[ListEnvironmentAccountConnectionsOutput, AWSError] = js.native
  def listEnvironmentAccountConnections(
    params: ListEnvironmentAccountConnectionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentAccountConnectionsOutput, Unit]
  ): Request[ListEnvironmentAccountConnectionsOutput, AWSError] = js.native
  
  /**
    * List the infrastructure as code outputs for your environment.
    */
  def listEnvironmentOutputs(): Request[ListEnvironmentOutputsOutput, AWSError] = js.native
  def listEnvironmentOutputs(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentOutputsOutput, Unit]): Request[ListEnvironmentOutputsOutput, AWSError] = js.native
  /**
    * List the infrastructure as code outputs for your environment.
    */
  def listEnvironmentOutputs(params: ListEnvironmentOutputsInput): Request[ListEnvironmentOutputsOutput, AWSError] = js.native
  def listEnvironmentOutputs(
    params: ListEnvironmentOutputsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentOutputsOutput, Unit]
  ): Request[ListEnvironmentOutputsOutput, AWSError] = js.native
  
  /**
    * List the provisioned resources for your environment.
    */
  def listEnvironmentProvisionedResources(): Request[ListEnvironmentProvisionedResourcesOutput, AWSError] = js.native
  def listEnvironmentProvisionedResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentProvisionedResourcesOutput, Unit]
  ): Request[ListEnvironmentProvisionedResourcesOutput, AWSError] = js.native
  /**
    * List the provisioned resources for your environment.
    */
  def listEnvironmentProvisionedResources(params: ListEnvironmentProvisionedResourcesInput): Request[ListEnvironmentProvisionedResourcesOutput, AWSError] = js.native
  def listEnvironmentProvisionedResources(
    params: ListEnvironmentProvisionedResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentProvisionedResourcesOutput, Unit]
  ): Request[ListEnvironmentProvisionedResourcesOutput, AWSError] = js.native
  
  /**
    * List major or minor versions of an environment template with detail data.
    */
  def listEnvironmentTemplateVersions(): Request[ListEnvironmentTemplateVersionsOutput, AWSError] = js.native
  def listEnvironmentTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentTemplateVersionsOutput, Unit]): Request[ListEnvironmentTemplateVersionsOutput, AWSError] = js.native
  /**
    * List major or minor versions of an environment template with detail data.
    */
  def listEnvironmentTemplateVersions(params: ListEnvironmentTemplateVersionsInput): Request[ListEnvironmentTemplateVersionsOutput, AWSError] = js.native
  def listEnvironmentTemplateVersions(
    params: ListEnvironmentTemplateVersionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentTemplateVersionsOutput, Unit]
  ): Request[ListEnvironmentTemplateVersionsOutput, AWSError] = js.native
  
  /**
    * List environment templates.
    */
  def listEnvironmentTemplates(): Request[ListEnvironmentTemplatesOutput, AWSError] = js.native
  def listEnvironmentTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentTemplatesOutput, Unit]): Request[ListEnvironmentTemplatesOutput, AWSError] = js.native
  /**
    * List environment templates.
    */
  def listEnvironmentTemplates(params: ListEnvironmentTemplatesInput): Request[ListEnvironmentTemplatesOutput, AWSError] = js.native
  def listEnvironmentTemplates(
    params: ListEnvironmentTemplatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentTemplatesOutput, Unit]
  ): Request[ListEnvironmentTemplatesOutput, AWSError] = js.native
  
  /**
    * List environments with detail data summaries.
    */
  def listEnvironments(): Request[ListEnvironmentsOutput, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsOutput, Unit]): Request[ListEnvironmentsOutput, AWSError] = js.native
  /**
    * List environments with detail data summaries.
    */
  def listEnvironments(params: ListEnvironmentsInput): Request[ListEnvironmentsOutput, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsOutput, Unit]
  ): Request[ListEnvironmentsOutput, AWSError] = js.native
  
  /**
    * List linked repositories with detail data.
    */
  def listRepositories(): Request[ListRepositoriesOutput, AWSError] = js.native
  def listRepositories(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesOutput, Unit]): Request[ListRepositoriesOutput, AWSError] = js.native
  /**
    * List linked repositories with detail data.
    */
  def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput, AWSError] = js.native
  def listRepositories(
    params: ListRepositoriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesOutput, Unit]
  ): Request[ListRepositoriesOutput, AWSError] = js.native
  
  /**
    * List repository sync definitions with detail data.
    */
  def listRepositorySyncDefinitions(): Request[ListRepositorySyncDefinitionsOutput, AWSError] = js.native
  def listRepositorySyncDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositorySyncDefinitionsOutput, Unit]): Request[ListRepositorySyncDefinitionsOutput, AWSError] = js.native
  /**
    * List repository sync definitions with detail data.
    */
  def listRepositorySyncDefinitions(params: ListRepositorySyncDefinitionsInput): Request[ListRepositorySyncDefinitionsOutput, AWSError] = js.native
  def listRepositorySyncDefinitions(
    params: ListRepositorySyncDefinitionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositorySyncDefinitionsOutput, Unit]
  ): Request[ListRepositorySyncDefinitionsOutput, AWSError] = js.native
  
  /**
    * Get a list service of instance Infrastructure as Code (IaC) outputs.
    */
  def listServiceInstanceOutputs(): Request[ListServiceInstanceOutputsOutput, AWSError] = js.native
  def listServiceInstanceOutputs(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceInstanceOutputsOutput, Unit]): Request[ListServiceInstanceOutputsOutput, AWSError] = js.native
  /**
    * Get a list service of instance Infrastructure as Code (IaC) outputs.
    */
  def listServiceInstanceOutputs(params: ListServiceInstanceOutputsInput): Request[ListServiceInstanceOutputsOutput, AWSError] = js.native
  def listServiceInstanceOutputs(
    params: ListServiceInstanceOutputsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceInstanceOutputsOutput, Unit]
  ): Request[ListServiceInstanceOutputsOutput, AWSError] = js.native
  
  /**
    * List provisioned resources for a service instance with details.
    */
  def listServiceInstanceProvisionedResources(): Request[ListServiceInstanceProvisionedResourcesOutput, AWSError] = js.native
  def listServiceInstanceProvisionedResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceInstanceProvisionedResourcesOutput, Unit]
  ): Request[ListServiceInstanceProvisionedResourcesOutput, AWSError] = js.native
  /**
    * List provisioned resources for a service instance with details.
    */
  def listServiceInstanceProvisionedResources(params: ListServiceInstanceProvisionedResourcesInput): Request[ListServiceInstanceProvisionedResourcesOutput, AWSError] = js.native
  def listServiceInstanceProvisionedResources(
    params: ListServiceInstanceProvisionedResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceInstanceProvisionedResourcesOutput, Unit]
  ): Request[ListServiceInstanceProvisionedResourcesOutput, AWSError] = js.native
  
  /**
    * List service instances with summary data.
    */
  def listServiceInstances(): Request[ListServiceInstancesOutput, AWSError] = js.native
  def listServiceInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceInstancesOutput, Unit]): Request[ListServiceInstancesOutput, AWSError] = js.native
  /**
    * List service instances with summary data.
    */
  def listServiceInstances(params: ListServiceInstancesInput): Request[ListServiceInstancesOutput, AWSError] = js.native
  def listServiceInstances(
    params: ListServiceInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceInstancesOutput, Unit]
  ): Request[ListServiceInstancesOutput, AWSError] = js.native
  
  /**
    * Get a list of service pipeline Infrastructure as Code (IaC) outputs.
    */
  def listServicePipelineOutputs(): Request[ListServicePipelineOutputsOutput, AWSError] = js.native
  def listServicePipelineOutputs(callback: js.Function2[/* err */ AWSError, /* data */ ListServicePipelineOutputsOutput, Unit]): Request[ListServicePipelineOutputsOutput, AWSError] = js.native
  /**
    * Get a list of service pipeline Infrastructure as Code (IaC) outputs.
    */
  def listServicePipelineOutputs(params: ListServicePipelineOutputsInput): Request[ListServicePipelineOutputsOutput, AWSError] = js.native
  def listServicePipelineOutputs(
    params: ListServicePipelineOutputsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicePipelineOutputsOutput, Unit]
  ): Request[ListServicePipelineOutputsOutput, AWSError] = js.native
  
  /**
    * List provisioned resources for a service and pipeline with details.
    */
  def listServicePipelineProvisionedResources(): Request[ListServicePipelineProvisionedResourcesOutput, AWSError] = js.native
  def listServicePipelineProvisionedResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicePipelineProvisionedResourcesOutput, Unit]
  ): Request[ListServicePipelineProvisionedResourcesOutput, AWSError] = js.native
  /**
    * List provisioned resources for a service and pipeline with details.
    */
  def listServicePipelineProvisionedResources(params: ListServicePipelineProvisionedResourcesInput): Request[ListServicePipelineProvisionedResourcesOutput, AWSError] = js.native
  def listServicePipelineProvisionedResources(
    params: ListServicePipelineProvisionedResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicePipelineProvisionedResourcesOutput, Unit]
  ): Request[ListServicePipelineProvisionedResourcesOutput, AWSError] = js.native
  
  /**
    * List major or minor versions of a service template with detail data.
    */
  def listServiceTemplateVersions(): Request[ListServiceTemplateVersionsOutput, AWSError] = js.native
  def listServiceTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceTemplateVersionsOutput, Unit]): Request[ListServiceTemplateVersionsOutput, AWSError] = js.native
  /**
    * List major or minor versions of a service template with detail data.
    */
  def listServiceTemplateVersions(params: ListServiceTemplateVersionsInput): Request[ListServiceTemplateVersionsOutput, AWSError] = js.native
  def listServiceTemplateVersions(
    params: ListServiceTemplateVersionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceTemplateVersionsOutput, Unit]
  ): Request[ListServiceTemplateVersionsOutput, AWSError] = js.native
  
  /**
    * List service templates with detail data.
    */
  def listServiceTemplates(): Request[ListServiceTemplatesOutput, AWSError] = js.native
  def listServiceTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceTemplatesOutput, Unit]): Request[ListServiceTemplatesOutput, AWSError] = js.native
  /**
    * List service templates with detail data.
    */
  def listServiceTemplates(params: ListServiceTemplatesInput): Request[ListServiceTemplatesOutput, AWSError] = js.native
  def listServiceTemplates(
    params: ListServiceTemplatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceTemplatesOutput, Unit]
  ): Request[ListServiceTemplatesOutput, AWSError] = js.native
  
  /**
    * List services with summaries of detail data.
    */
  def listServices(): Request[ListServicesOutput, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesOutput, Unit]): Request[ListServicesOutput, AWSError] = js.native
  /**
    * List services with summaries of detail data.
    */
  def listServices(params: ListServicesInput): Request[ListServicesOutput, AWSError] = js.native
  def listServices(
    params: ListServicesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesOutput, Unit]
  ): Request[ListServicesOutput, AWSError] = js.native
  
  /**
    * List tags for a resource. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * List tags for a resource. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Notify Proton of the following information related to a provisioned resource (environment, service instance, or service pipeline):   For CodeBuild-based provisioning, provide your provisioned resource output values to Proton.   For self-managed provisioning, notify Proton about the status of your provisioned resource. To disambiguate between different deployments of the same resource, set deploymentId to a unique deployment ID of your choice.  &lt;/li&gt; &lt;/ul&gt; 
    */
  def notifyResourceDeploymentStatusChange(): Request[NotifyResourceDeploymentStatusChangeOutput, AWSError] = js.native
  def notifyResourceDeploymentStatusChange(
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyResourceDeploymentStatusChangeOutput, Unit]
  ): Request[NotifyResourceDeploymentStatusChangeOutput, AWSError] = js.native
  /**
    * Notify Proton of the following information related to a provisioned resource (environment, service instance, or service pipeline):   For CodeBuild-based provisioning, provide your provisioned resource output values to Proton.   For self-managed provisioning, notify Proton about the status of your provisioned resource. To disambiguate between different deployments of the same resource, set deploymentId to a unique deployment ID of your choice.  &lt;/li&gt; &lt;/ul&gt; 
    */
  def notifyResourceDeploymentStatusChange(params: NotifyResourceDeploymentStatusChangeInput): Request[NotifyResourceDeploymentStatusChangeOutput, AWSError] = js.native
  def notifyResourceDeploymentStatusChange(
    params: NotifyResourceDeploymentStatusChangeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyResourceDeploymentStatusChangeOutput, Unit]
  ): Request[NotifyResourceDeploymentStatusChangeOutput, AWSError] = js.native
  
  /**
    * In a management account, reject an environment account connection from another environment account. After you reject an environment account connection request, you can't accept or use the rejected environment account connection. You can’t reject an environment account connection that's connected to an environment. For more information, see Environment account connections in the Proton User guide.
    */
  def rejectEnvironmentAccountConnection(): Request[RejectEnvironmentAccountConnectionOutput, AWSError] = js.native
  def rejectEnvironmentAccountConnection(
    callback: js.Function2[/* err */ AWSError, /* data */ RejectEnvironmentAccountConnectionOutput, Unit]
  ): Request[RejectEnvironmentAccountConnectionOutput, AWSError] = js.native
  /**
    * In a management account, reject an environment account connection from another environment account. After you reject an environment account connection request, you can't accept or use the rejected environment account connection. You can’t reject an environment account connection that's connected to an environment. For more information, see Environment account connections in the Proton User guide.
    */
  def rejectEnvironmentAccountConnection(params: RejectEnvironmentAccountConnectionInput): Request[RejectEnvironmentAccountConnectionOutput, AWSError] = js.native
  def rejectEnvironmentAccountConnection(
    params: RejectEnvironmentAccountConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectEnvironmentAccountConnectionOutput, Unit]
  ): Request[RejectEnvironmentAccountConnectionOutput, AWSError] = js.native
  
  /**
    * Tag a resource. A tag is a key-value pair of metadata that you associate with an Proton resource. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Tag a resource. A tag is a key-value pair of metadata that you associate with an Proton resource. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Remove a customer tag from a resource. A tag is a key-value pair of metadata associated with an Proton resource. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Remove a customer tag from a resource. A tag is a key-value pair of metadata associated with an Proton resource. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Update Proton settings that are used for multiple services in the Amazon Web Services account.
    */
  def updateAccountSettings(): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  def updateAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsOutput, Unit]): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  /**
    * Update Proton settings that are used for multiple services in the Amazon Web Services account.
    */
  def updateAccountSettings(params: UpdateAccountSettingsInput): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsOutput, Unit]
  ): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  
  /**
    * Update a component. There are a few modes for updating a component. The deploymentType field defines the mode.  You can't update a component while its deployment status, or the deployment status of a service instance attached to it, is IN_PROGRESS.  For more information about components, see Proton components in the Proton User Guide.
    */
  def updateComponent(): Request[UpdateComponentOutput, AWSError] = js.native
  def updateComponent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentOutput, Unit]): Request[UpdateComponentOutput, AWSError] = js.native
  /**
    * Update a component. There are a few modes for updating a component. The deploymentType field defines the mode.  You can't update a component while its deployment status, or the deployment status of a service instance attached to it, is IN_PROGRESS.  For more information about components, see Proton components in the Proton User Guide.
    */
  def updateComponent(params: UpdateComponentInput): Request[UpdateComponentOutput, AWSError] = js.native
  def updateComponent(
    params: UpdateComponentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentOutput, Unit]
  ): Request[UpdateComponentOutput, AWSError] = js.native
  
  /**
    * Update an environment. If the environment is associated with an environment account connection, don't update or include the protonServiceRoleArn, codebuildRoleArn, and provisioningRepository parameters. You can only update to a new environment account connection if that connection was created in the same environment account that the current environment account connection was created in. The account connection must also be associated with the current environment. If the environment isn't associated with an environment account connection, don't update or include the environmentAccountConnectionId parameter. You can't update or connect the environment to an environment account connection if it isn't already associated with an environment connection. You can update either environmentAccountConnectionId or one or more of protonServiceRoleArn, codebuildRoleArn, and provisioningRepository. If the environment was configured for Amazon Web Services-managed or CodeBuild-based provisioning, omit the provisioningRepository parameter. If the environment was configured for self-managed provisioning, specify the provisioningRepository parameter and omit the protonServiceRoleArn, codebuildRoleArn, and provisioningRepository parameters. For more information, see Environments and Provisioning methods in the Proton User Guide. There are four modes for updating an environment. The deploymentType field defines the mode.     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the environment is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include minor or major version parameters when you use this deployment-type.     MINOR_VERSION  In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can also specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor version of the current template, by default. You can also specify a different major version that's higher than the major version in use and a minor version.  
    */
  def updateEnvironment(): Request[UpdateEnvironmentOutput, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentOutput, Unit]): Request[UpdateEnvironmentOutput, AWSError] = js.native
  /**
    * Update an environment. If the environment is associated with an environment account connection, don't update or include the protonServiceRoleArn, codebuildRoleArn, and provisioningRepository parameters. You can only update to a new environment account connection if that connection was created in the same environment account that the current environment account connection was created in. The account connection must also be associated with the current environment. If the environment isn't associated with an environment account connection, don't update or include the environmentAccountConnectionId parameter. You can't update or connect the environment to an environment account connection if it isn't already associated with an environment connection. You can update either environmentAccountConnectionId or one or more of protonServiceRoleArn, codebuildRoleArn, and provisioningRepository. If the environment was configured for Amazon Web Services-managed or CodeBuild-based provisioning, omit the provisioningRepository parameter. If the environment was configured for self-managed provisioning, specify the provisioningRepository parameter and omit the protonServiceRoleArn, codebuildRoleArn, and provisioningRepository parameters. For more information, see Environments and Provisioning methods in the Proton User Guide. There are four modes for updating an environment. The deploymentType field defines the mode.     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the environment is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include minor or major version parameters when you use this deployment-type.     MINOR_VERSION  In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can also specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor version of the current template, by default. You can also specify a different major version that's higher than the major version in use and a minor version.  
    */
  def updateEnvironment(params: UpdateEnvironmentInput): Request[UpdateEnvironmentOutput, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentOutput, Unit]
  ): Request[UpdateEnvironmentOutput, AWSError] = js.native
  
  /**
    * In an environment account, update an environment account connection to use a new IAM role. For more information, see Environment account connections in the Proton User guide.
    */
  def updateEnvironmentAccountConnection(): Request[UpdateEnvironmentAccountConnectionOutput, AWSError] = js.native
  def updateEnvironmentAccountConnection(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentAccountConnectionOutput, Unit]
  ): Request[UpdateEnvironmentAccountConnectionOutput, AWSError] = js.native
  /**
    * In an environment account, update an environment account connection to use a new IAM role. For more information, see Environment account connections in the Proton User guide.
    */
  def updateEnvironmentAccountConnection(params: UpdateEnvironmentAccountConnectionInput): Request[UpdateEnvironmentAccountConnectionOutput, AWSError] = js.native
  def updateEnvironmentAccountConnection(
    params: UpdateEnvironmentAccountConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentAccountConnectionOutput, Unit]
  ): Request[UpdateEnvironmentAccountConnectionOutput, AWSError] = js.native
  
  /**
    * Update an environment template.
    */
  def updateEnvironmentTemplate(): Request[UpdateEnvironmentTemplateOutput, AWSError] = js.native
  def updateEnvironmentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentTemplateOutput, Unit]): Request[UpdateEnvironmentTemplateOutput, AWSError] = js.native
  /**
    * Update an environment template.
    */
  def updateEnvironmentTemplate(params: UpdateEnvironmentTemplateInput): Request[UpdateEnvironmentTemplateOutput, AWSError] = js.native
  def updateEnvironmentTemplate(
    params: UpdateEnvironmentTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentTemplateOutput, Unit]
  ): Request[UpdateEnvironmentTemplateOutput, AWSError] = js.native
  
  /**
    * Update a major or minor version of an environment template.
    */
  def updateEnvironmentTemplateVersion(): Request[UpdateEnvironmentTemplateVersionOutput, AWSError] = js.native
  def updateEnvironmentTemplateVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentTemplateVersionOutput, Unit]
  ): Request[UpdateEnvironmentTemplateVersionOutput, AWSError] = js.native
  /**
    * Update a major or minor version of an environment template.
    */
  def updateEnvironmentTemplateVersion(params: UpdateEnvironmentTemplateVersionInput): Request[UpdateEnvironmentTemplateVersionOutput, AWSError] = js.native
  def updateEnvironmentTemplateVersion(
    params: UpdateEnvironmentTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentTemplateVersionOutput, Unit]
  ): Request[UpdateEnvironmentTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Edit a service description or use a spec to add and delete service instances.  Existing service instances and the service pipeline can't be edited using this API. They can only be deleted.  Use the description parameter to modify the description. Edit the spec parameter to add or delete instances.  You can't delete a service instance (remove it from the spec) if it has an attached component. For more information about components, see Proton components in the Proton User Guide. 
    */
  def updateService(): Request[UpdateServiceOutput, AWSError] = js.native
  def updateService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceOutput, Unit]): Request[UpdateServiceOutput, AWSError] = js.native
  /**
    * Edit a service description or use a spec to add and delete service instances.  Existing service instances and the service pipeline can't be edited using this API. They can only be deleted.  Use the description parameter to modify the description. Edit the spec parameter to add or delete instances.  You can't delete a service instance (remove it from the spec) if it has an attached component. For more information about components, see Proton components in the Proton User Guide. 
    */
  def updateService(params: UpdateServiceInput): Request[UpdateServiceOutput, AWSError] = js.native
  def updateService(
    params: UpdateServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceOutput, Unit]
  ): Request[UpdateServiceOutput, AWSError] = js.native
  
  /**
    * Update a service instance. There are a few modes for updating a service instance. The deploymentType field defines the mode.  You can't update a service instance while its deployment status, or the deployment status of a component attached to it, is IN_PROGRESS. For more information about components, see Proton components in the Proton User Guide. 
    */
  def updateServiceInstance(): Request[UpdateServiceInstanceOutput, AWSError] = js.native
  def updateServiceInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceInstanceOutput, Unit]): Request[UpdateServiceInstanceOutput, AWSError] = js.native
  /**
    * Update a service instance. There are a few modes for updating a service instance. The deploymentType field defines the mode.  You can't update a service instance while its deployment status, or the deployment status of a component attached to it, is IN_PROGRESS. For more information about components, see Proton components in the Proton User Guide. 
    */
  def updateServiceInstance(params: UpdateServiceInstanceInput): Request[UpdateServiceInstanceOutput, AWSError] = js.native
  def updateServiceInstance(
    params: UpdateServiceInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceInstanceOutput, Unit]
  ): Request[UpdateServiceInstanceOutput, AWSError] = js.native
  
  /**
    * Update the service pipeline. There are four modes for updating a service pipeline. The deploymentType field defines the mode.     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include major or minor version parameters when you use this deployment-type.     MINOR_VERSION  In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and minor version of the current template by default. You can specify a different major version that's higher than the major version in use and a minor version.  
    */
  def updateServicePipeline(): Request[UpdateServicePipelineOutput, AWSError] = js.native
  def updateServicePipeline(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServicePipelineOutput, Unit]): Request[UpdateServicePipelineOutput, AWSError] = js.native
  /**
    * Update the service pipeline. There are four modes for updating a service pipeline. The deploymentType field defines the mode.     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include major or minor version parameters when you use this deployment-type.     MINOR_VERSION  In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and minor version of the current template by default. You can specify a different major version that's higher than the major version in use and a minor version.  
    */
  def updateServicePipeline(params: UpdateServicePipelineInput): Request[UpdateServicePipelineOutput, AWSError] = js.native
  def updateServicePipeline(
    params: UpdateServicePipelineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServicePipelineOutput, Unit]
  ): Request[UpdateServicePipelineOutput, AWSError] = js.native
  
  /**
    * Update a service template.
    */
  def updateServiceTemplate(): Request[UpdateServiceTemplateOutput, AWSError] = js.native
  def updateServiceTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceTemplateOutput, Unit]): Request[UpdateServiceTemplateOutput, AWSError] = js.native
  /**
    * Update a service template.
    */
  def updateServiceTemplate(params: UpdateServiceTemplateInput): Request[UpdateServiceTemplateOutput, AWSError] = js.native
  def updateServiceTemplate(
    params: UpdateServiceTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceTemplateOutput, Unit]
  ): Request[UpdateServiceTemplateOutput, AWSError] = js.native
  
  /**
    * Update a major or minor version of a service template.
    */
  def updateServiceTemplateVersion(): Request[UpdateServiceTemplateVersionOutput, AWSError] = js.native
  def updateServiceTemplateVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceTemplateVersionOutput, Unit]): Request[UpdateServiceTemplateVersionOutput, AWSError] = js.native
  /**
    * Update a major or minor version of a service template.
    */
  def updateServiceTemplateVersion(params: UpdateServiceTemplateVersionInput): Request[UpdateServiceTemplateVersionOutput, AWSError] = js.native
  def updateServiceTemplateVersion(
    params: UpdateServiceTemplateVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceTemplateVersionOutput, Unit]
  ): Request[UpdateServiceTemplateVersionOutput, AWSError] = js.native
  
  /**
    * Update template sync configuration parameters, except for the templateName and templateType. Repository details (branch, name, and provider) should be of a linked repository. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository.
    */
  def updateTemplateSyncConfig(): Request[UpdateTemplateSyncConfigOutput, AWSError] = js.native
  def updateTemplateSyncConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateSyncConfigOutput, Unit]): Request[UpdateTemplateSyncConfigOutput, AWSError] = js.native
  /**
    * Update template sync configuration parameters, except for the templateName and templateType. Repository details (branch, name, and provider) should be of a linked repository. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository.
    */
  def updateTemplateSyncConfig(params: UpdateTemplateSyncConfigInput): Request[UpdateTemplateSyncConfigOutput, AWSError] = js.native
  def updateTemplateSyncConfig(
    params: UpdateTemplateSyncConfigInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateSyncConfigOutput, Unit]
  ): Request[UpdateTemplateSyncConfigOutput, AWSError] = js.native
  
  /**
    * Waits for the componentDeleted state by periodically calling the underlying Proton.getComponentoperation every 5 seconds (at most 999 times). Wait until a Component is deleted. Use this after invoking DeleteComponent
    */
  @JSName("waitFor")
  def waitFor_componentDeleted(state: componentDeleted): Request[GetComponentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_componentDeleted(
    state: componentDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]
  ): Request[GetComponentOutput, AWSError] = js.native
  /**
    * Waits for the componentDeleted state by periodically calling the underlying Proton.getComponentoperation every 5 seconds (at most 999 times). Wait until a Component is deleted. Use this after invoking DeleteComponent
    */
  @JSName("waitFor")
  def waitFor_componentDeleted(state: componentDeleted, params: GetComponentInputwaiterWa): Request[GetComponentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_componentDeleted(
    state: componentDeleted,
    params: GetComponentInputwaiterWa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]
  ): Request[GetComponentOutput, AWSError] = js.native
  /**
    * Waits for the componentDeployed state by periodically calling the underlying Proton.getComponentoperation every 5 seconds (at most 999 times). Wait until a Component is deployed. Use this after invoking CreateComponent or UpdateComponent
    */
  @JSName("waitFor")
  def waitFor_componentDeployed(state: componentDeployed): Request[GetComponentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_componentDeployed(
    state: componentDeployed,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]
  ): Request[GetComponentOutput, AWSError] = js.native
  /**
    * Waits for the componentDeployed state by periodically calling the underlying Proton.getComponentoperation every 5 seconds (at most 999 times). Wait until a Component is deployed. Use this after invoking CreateComponent or UpdateComponent
    */
  @JSName("waitFor")
  def waitFor_componentDeployed(state: componentDeployed, params: GetComponentInputwaiterWa): Request[GetComponentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_componentDeployed(
    state: componentDeployed,
    params: GetComponentInputwaiterWa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentOutput, Unit]
  ): Request[GetComponentOutput, AWSError] = js.native
  /**
    * Waits for the environmentDeployed state by periodically calling the underlying Proton.getEnvironmentoperation every 5 seconds (at most 999 times). Wait until an Environment is deployed. Use this after invoking CreateEnvironment or UpdateEnvironment
    */
  @JSName("waitFor")
  def waitFor_environmentDeployed(state: environmentDeployed): Request[GetEnvironmentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_environmentDeployed(
    state: environmentDeployed,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentOutput, Unit]
  ): Request[GetEnvironmentOutput, AWSError] = js.native
  /**
    * Waits for the environmentDeployed state by periodically calling the underlying Proton.getEnvironmentoperation every 5 seconds (at most 999 times). Wait until an Environment is deployed. Use this after invoking CreateEnvironment or UpdateEnvironment
    */
  @JSName("waitFor")
  def waitFor_environmentDeployed(state: environmentDeployed, params: GetEnvironmentInputwaiter): Request[GetEnvironmentOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_environmentDeployed(
    state: environmentDeployed,
    params: GetEnvironmentInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentOutput, Unit]
  ): Request[GetEnvironmentOutput, AWSError] = js.native
  /**
    * Waits for the environmentTemplateVersionRegistered state by periodically calling the underlying Proton.getEnvironmentTemplateVersionoperation every 2 seconds (at most 150 times). Wait until an EnvironmentTemplateVersion is registered. Use this after invoking CreateEnvironmentTemplateVersion
    */
  @JSName("waitFor")
  def waitFor_environmentTemplateVersionRegistered(state: environmentTemplateVersionRegistered): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_environmentTemplateVersionRegistered(
    state: environmentTemplateVersionRegistered,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentTemplateVersionOutput, Unit]
  ): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  /**
    * Waits for the environmentTemplateVersionRegistered state by periodically calling the underlying Proton.getEnvironmentTemplateVersionoperation every 2 seconds (at most 150 times). Wait until an EnvironmentTemplateVersion is registered. Use this after invoking CreateEnvironmentTemplateVersion
    */
  @JSName("waitFor")
  def waitFor_environmentTemplateVersionRegistered(state: environmentTemplateVersionRegistered, params: GetEnvironmentTemplateVer): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_environmentTemplateVersionRegistered(
    state: environmentTemplateVersionRegistered,
    params: GetEnvironmentTemplateVer,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentTemplateVersionOutput, Unit]
  ): Request[GetEnvironmentTemplateVersionOutput, AWSError] = js.native
  /**
    * Waits for the serviceCreated state by periodically calling the underlying Proton.getServiceoperation every 5 seconds (at most 999 times). Wait until an Service has deployed its instances and possibly pipeline. Use this after invoking CreateService
    */
  @JSName("waitFor")
  def waitFor_serviceCreated(state: serviceCreated): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceCreated(
    state: serviceCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the serviceCreated state by periodically calling the underlying Proton.getServiceoperation every 5 seconds (at most 999 times). Wait until an Service has deployed its instances and possibly pipeline. Use this after invoking CreateService
    */
  @JSName("waitFor")
  def waitFor_serviceCreated(state: serviceCreated, params: GetServiceInputwaiterWait): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceCreated(
    state: serviceCreated,
    params: GetServiceInputwaiterWait,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the serviceDeleted state by periodically calling the underlying Proton.getServiceoperation every 5 seconds (at most 999 times). Wait until a Service, its instances, and possibly pipeline have been deleted after DeleteService is invoked
    */
  @JSName("waitFor")
  def waitFor_serviceDeleted(state: serviceDeleted): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceDeleted(
    state: serviceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the serviceDeleted state by periodically calling the underlying Proton.getServiceoperation every 5 seconds (at most 999 times). Wait until a Service, its instances, and possibly pipeline have been deleted after DeleteService is invoked
    */
  @JSName("waitFor")
  def waitFor_serviceDeleted(state: serviceDeleted, params: GetServiceInputwaiterWait): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceDeleted(
    state: serviceDeleted,
    params: GetServiceInputwaiterWait,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the serviceInstanceDeployed state by periodically calling the underlying Proton.getServiceInstanceoperation every 5 seconds (at most 999 times). Wait until a ServiceInstance is deployed. Use this after invoking CreateService or UpdateServiceInstance
    */
  @JSName("waitFor")
  def waitFor_serviceInstanceDeployed(state: serviceInstanceDeployed): Request[GetServiceInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceInstanceDeployed(
    state: serviceInstanceDeployed,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceInstanceOutput, Unit]
  ): Request[GetServiceInstanceOutput, AWSError] = js.native
  /**
    * Waits for the serviceInstanceDeployed state by periodically calling the underlying Proton.getServiceInstanceoperation every 5 seconds (at most 999 times). Wait until a ServiceInstance is deployed. Use this after invoking CreateService or UpdateServiceInstance
    */
  @JSName("waitFor")
  def waitFor_serviceInstanceDeployed(state: serviceInstanceDeployed, params: GetServiceInstanceInputwa): Request[GetServiceInstanceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceInstanceDeployed(
    state: serviceInstanceDeployed,
    params: GetServiceInstanceInputwa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceInstanceOutput, Unit]
  ): Request[GetServiceInstanceOutput, AWSError] = js.native
  /**
    * Waits for the servicePipelineDeployed state by periodically calling the underlying Proton.getServiceoperation every 10 seconds (at most 360 times). Wait until an ServicePipeline is deployed. Use this after invoking CreateService or UpdateServicePipeline
    */
  @JSName("waitFor")
  def waitFor_servicePipelineDeployed(state: servicePipelineDeployed): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_servicePipelineDeployed(
    state: servicePipelineDeployed,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the servicePipelineDeployed state by periodically calling the underlying Proton.getServiceoperation every 10 seconds (at most 360 times). Wait until an ServicePipeline is deployed. Use this after invoking CreateService or UpdateServicePipeline
    */
  @JSName("waitFor")
  def waitFor_servicePipelineDeployed(state: servicePipelineDeployed, params: GetServiceInputwaiterWait): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_servicePipelineDeployed(
    state: servicePipelineDeployed,
    params: GetServiceInputwaiterWait,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the serviceTemplateVersionRegistered state by periodically calling the underlying Proton.getServiceTemplateVersionoperation every 2 seconds (at most 150 times). Wait until a ServiceTemplateVersion is registered. Use this after invoking CreateServiceTemplateVersion
    */
  @JSName("waitFor")
  def waitFor_serviceTemplateVersionRegistered(state: serviceTemplateVersionRegistered): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceTemplateVersionRegistered(
    state: serviceTemplateVersionRegistered,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceTemplateVersionOutput, Unit]
  ): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  /**
    * Waits for the serviceTemplateVersionRegistered state by periodically calling the underlying Proton.getServiceTemplateVersionoperation every 2 seconds (at most 150 times). Wait until a ServiceTemplateVersion is registered. Use this after invoking CreateServiceTemplateVersion
    */
  @JSName("waitFor")
  def waitFor_serviceTemplateVersionRegistered(state: serviceTemplateVersionRegistered, params: GetServiceTemplateVersion): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceTemplateVersionRegistered(
    state: serviceTemplateVersionRegistered,
    params: GetServiceTemplateVersion,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceTemplateVersionOutput, Unit]
  ): Request[GetServiceTemplateVersionOutput, AWSError] = js.native
  /**
    * Waits for the serviceUpdated state by periodically calling the underlying Proton.getServiceoperation every 5 seconds (at most 999 times). Wait until a Service, its instances, and possibly pipeline have been deployed after UpdateService is invoked
    */
  @JSName("waitFor")
  def waitFor_serviceUpdated(state: serviceUpdated): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceUpdated(
    state: serviceUpdated,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
  /**
    * Waits for the serviceUpdated state by periodically calling the underlying Proton.getServiceoperation every 5 seconds (at most 999 times). Wait until a Service, its instances, and possibly pipeline have been deployed after UpdateService is invoked
    */
  @JSName("waitFor")
  def waitFor_serviceUpdated(state: serviceUpdated, params: GetServiceInputwaiterWait): Request[GetServiceOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serviceUpdated(
    state: serviceUpdated,
    params: GetServiceInputwaiterWait,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceOutput, Unit]
  ): Request[GetServiceOutput, AWSError] = js.native
}
