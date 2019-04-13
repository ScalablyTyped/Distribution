package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceCatalog
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ServiceCatalog: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts an offer to share the specified portfolio.
    */
  def acceptPortfolioShare(): awsDashSdkLib.libRequestMod.Request[AcceptPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptPortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts an offer to share the specified portfolio.
    */
  def acceptPortfolioShare(params: AcceptPortfolioShareInput): awsDashSdkLib.libRequestMod.Request[AcceptPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptPortfolioShare(
    params: AcceptPortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified principal ARN with the specified portfolio.
    */
  def associatePrincipalWithPortfolio(): awsDashSdkLib.libRequestMod.Request[AssociatePrincipalWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associatePrincipalWithPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociatePrincipalWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociatePrincipalWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified principal ARN with the specified portfolio.
    */
  def associatePrincipalWithPortfolio(params: AssociatePrincipalWithPortfolioInput): awsDashSdkLib.libRequestMod.Request[AssociatePrincipalWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associatePrincipalWithPortfolio(
    params: AssociatePrincipalWithPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociatePrincipalWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociatePrincipalWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified product with the specified portfolio.
    */
  def associateProductWithPortfolio(): awsDashSdkLib.libRequestMod.Request[AssociateProductWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateProductWithPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateProductWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateProductWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified product with the specified portfolio.
    */
  def associateProductWithPortfolio(params: AssociateProductWithPortfolioInput): awsDashSdkLib.libRequestMod.Request[AssociateProductWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateProductWithPortfolio(
    params: AssociateProductWithPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateProductWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateProductWithPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a self-service action with a provisioning artifact.
    */
  def associateServiceActionWithProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateServiceActionWithProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a self-service action with a provisioning artifact.
    */
  def associateServiceActionWithProvisioningArtifact(params: AssociateServiceActionWithProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateServiceActionWithProvisioningArtifact(
    params: AssociateServiceActionWithProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associate the specified TagOption with the specified portfolio or product.
    */
  def associateTagOptionWithResource(): awsDashSdkLib.libRequestMod.Request[AssociateTagOptionWithResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateTagOptionWithResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateTagOptionWithResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateTagOptionWithResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associate the specified TagOption with the specified portfolio or product.
    */
  def associateTagOptionWithResource(params: AssociateTagOptionWithResourceInput): awsDashSdkLib.libRequestMod.Request[AssociateTagOptionWithResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateTagOptionWithResource(
    params: AssociateTagOptionWithResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateTagOptionWithResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateTagOptionWithResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates multiple self-service actions with provisioning artifacts.
    */
  def batchAssociateServiceActionWithProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchAssociateServiceActionWithProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchAssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates multiple self-service actions with provisioning artifacts.
    */
  def batchAssociateServiceActionWithProvisioningArtifact(params: BatchAssociateServiceActionWithProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchAssociateServiceActionWithProvisioningArtifact(
    params: BatchAssociateServiceActionWithProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchAssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a batch of self-service actions from the specified provisioning artifact.
    */
  def batchDisassociateServiceActionFromProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDisassociateServiceActionFromProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a batch of self-service actions from the specified provisioning artifact.
    */
  def batchDisassociateServiceActionFromProvisioningArtifact(params: BatchDisassociateServiceActionFromProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDisassociateServiceActionFromProvisioningArtifact(
    params: BatchDisassociateServiceActionFromProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
    */
  def copyProduct(): awsDashSdkLib.libRequestMod.Request[CopyProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
    */
  def copyProduct(params: CopyProductInput): awsDashSdkLib.libRequestMod.Request[CopyProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyProduct(
    params: CopyProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a constraint.
    */
  def createConstraint(): awsDashSdkLib.libRequestMod.Request[CreateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a constraint.
    */
  def createConstraint(params: CreateConstraintInput): awsDashSdkLib.libRequestMod.Request[CreateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConstraint(
    params: CreateConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a portfolio.
    */
  def createPortfolio(): awsDashSdkLib.libRequestMod.Request[CreatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a portfolio.
    */
  def createPortfolio(params: CreatePortfolioInput): awsDashSdkLib.libRequestMod.Request[CreatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPortfolio(
    params: CreatePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
    */
  def createPortfolioShare(): awsDashSdkLib.libRequestMod.Request[CreatePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
    */
  def createPortfolioShare(params: CreatePortfolioShareInput): awsDashSdkLib.libRequestMod.Request[CreatePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPortfolioShare(
    params: CreatePortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a product.
    */
  def createProduct(): awsDashSdkLib.libRequestMod.Request[CreateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a product.
    */
  def createProduct(params: CreateProductInput): awsDashSdkLib.libRequestMod.Request[CreateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProduct(
    params: CreateProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
    */
  def createProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[CreateProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
    */
  def createProvisionedProductPlan(params: CreateProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[CreateProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProvisionedProductPlan(
    params: CreateProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
    */
  def createProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[CreateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
    */
  def createProvisioningArtifact(params: CreateProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[CreateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProvisioningArtifact(
    params: CreateProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a self-service action.
    */
  def createServiceAction(): awsDashSdkLib.libRequestMod.Request[CreateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a self-service action.
    */
  def createServiceAction(params: CreateServiceActionInput): awsDashSdkLib.libRequestMod.Request[CreateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createServiceAction(
    params: CreateServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a TagOption.
    */
  def createTagOption(): awsDashSdkLib.libRequestMod.Request[CreateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a TagOption.
    */
  def createTagOption(params: CreateTagOptionInput): awsDashSdkLib.libRequestMod.Request[CreateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTagOption(
    params: CreateTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified constraint.
    */
  def deleteConstraint(): awsDashSdkLib.libRequestMod.Request[DeleteConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified constraint.
    */
  def deleteConstraint(params: DeleteConstraintInput): awsDashSdkLib.libRequestMod.Request[DeleteConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConstraint(
    params: DeleteConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
    */
  def deletePortfolio(): awsDashSdkLib.libRequestMod.Request[DeletePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
    */
  def deletePortfolio(params: DeletePortfolioInput): awsDashSdkLib.libRequestMod.Request[DeletePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePortfolio(
    params: DeletePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
    */
  def deletePortfolioShare(): awsDashSdkLib.libRequestMod.Request[DeletePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
    */
  def deletePortfolioShare(params: DeletePortfolioShareInput): awsDashSdkLib.libRequestMod.Request[DeletePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePortfolioShare(
    params: DeletePortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
    */
  def deleteProduct(): awsDashSdkLib.libRequestMod.Request[DeleteProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
    */
  def deleteProduct(params: DeleteProductInput): awsDashSdkLib.libRequestMod.Request[DeleteProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProduct(
    params: DeleteProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified plan.
    */
  def deleteProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[DeleteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified plan.
    */
  def deleteProvisionedProductPlan(params: DeleteProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[DeleteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProvisionedProductPlan(
    params: DeleteProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
    */
  def deleteProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[DeleteProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
    */
  def deleteProvisioningArtifact(params: DeleteProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[DeleteProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProvisioningArtifact(
    params: DeleteProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a self-service action.
    */
  def deleteServiceAction(): awsDashSdkLib.libRequestMod.Request[DeleteServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a self-service action.
    */
  def deleteServiceAction(params: DeleteServiceActionInput): awsDashSdkLib.libRequestMod.Request[DeleteServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteServiceAction(
    params: DeleteServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
    */
  def deleteTagOption(): awsDashSdkLib.libRequestMod.Request[DeleteTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
    */
  def deleteTagOption(params: DeleteTagOptionInput): awsDashSdkLib.libRequestMod.Request[DeleteTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTagOption(
    params: DeleteTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified constraint.
    */
  def describeConstraint(): awsDashSdkLib.libRequestMod.Request[DescribeConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified constraint.
    */
  def describeConstraint(params: DescribeConstraintInput): awsDashSdkLib.libRequestMod.Request[DescribeConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConstraint(
    params: DescribeConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of the specified copy product operation.
    */
  def describeCopyProductStatus(): awsDashSdkLib.libRequestMod.Request[DescribeCopyProductStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCopyProductStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCopyProductStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCopyProductStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of the specified copy product operation.
    */
  def describeCopyProductStatus(params: DescribeCopyProductStatusInput): awsDashSdkLib.libRequestMod.Request[DescribeCopyProductStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCopyProductStatus(
    params: DescribeCopyProductStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCopyProductStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCopyProductStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified portfolio.
    */
  def describePortfolio(): awsDashSdkLib.libRequestMod.Request[DescribePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified portfolio.
    */
  def describePortfolio(params: DescribePortfolioInput): awsDashSdkLib.libRequestMod.Request[DescribePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePortfolio(
    params: DescribePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
    */
  def describePortfolioShareStatus(): awsDashSdkLib.libRequestMod.Request[DescribePortfolioShareStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePortfolioShareStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePortfolioShareStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePortfolioShareStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
    */
  def describePortfolioShareStatus(params: DescribePortfolioShareStatusInput): awsDashSdkLib.libRequestMod.Request[DescribePortfolioShareStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePortfolioShareStatus(
    params: DescribePortfolioShareStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePortfolioShareStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePortfolioShareStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified product.
    */
  def describeProduct(): awsDashSdkLib.libRequestMod.Request[DescribeProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified product.
    */
  def describeProduct(params: DescribeProductInput): awsDashSdkLib.libRequestMod.Request[DescribeProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProduct(
    params: DescribeProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified product. This operation is run with administrator access.
    */
  def describeProductAsAdmin(): awsDashSdkLib.libRequestMod.Request[DescribeProductAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProductAsAdmin(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified product. This operation is run with administrator access.
    */
  def describeProductAsAdmin(params: DescribeProductAsAdminInput): awsDashSdkLib.libRequestMod.Request[DescribeProductAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProductAsAdmin(
    params: DescribeProductAsAdminInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified product.
    */
  def describeProductView(): awsDashSdkLib.libRequestMod.Request[DescribeProductViewOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProductView(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductViewOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductViewOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified product.
    */
  def describeProductView(params: DescribeProductViewInput): awsDashSdkLib.libRequestMod.Request[DescribeProductViewOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProductView(
    params: DescribeProductViewInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductViewOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductViewOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified provisioned product.
    */
  def describeProvisionedProduct(): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisionedProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified provisioned product.
    */
  def describeProvisionedProduct(params: DescribeProvisionedProductInput): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisionedProduct(
    params: DescribeProvisionedProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the resource changes for the specified plan.
    */
  def describeProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the resource changes for the specified plan.
    */
  def describeProvisionedProductPlan(params: DescribeProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisionedProductPlan(
    params: DescribeProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
    */
  def describeProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
    */
  def describeProvisioningArtifact(params: DescribeProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisioningArtifact(
    params: DescribeProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
    */
  def describeProvisioningParameters(): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningParametersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisioningParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisioningParametersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningParametersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
    */
  def describeProvisioningParameters(params: DescribeProvisioningParametersInput): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningParametersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProvisioningParameters(
    params: DescribeProvisioningParametersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProvisioningParametersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProvisioningParametersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
    */
  def describeRecord(): awsDashSdkLib.libRequestMod.Request[DescribeRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRecord(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRecordOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
    */
  def describeRecord(params: DescribeRecordInput): awsDashSdkLib.libRequestMod.Request[DescribeRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRecord(
    params: DescribeRecordInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRecordOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a self-service action.
    */
  def describeServiceAction(): awsDashSdkLib.libRequestMod.Request[DescribeServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a self-service action.
    */
  def describeServiceAction(params: DescribeServiceActionInput): awsDashSdkLib.libRequestMod.Request[DescribeServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeServiceAction(
    params: DescribeServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified TagOption.
    */
  def describeTagOption(): awsDashSdkLib.libRequestMod.Request[DescribeTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the specified TagOption.
    */
  def describeTagOption(params: DescribeTagOptionInput): awsDashSdkLib.libRequestMod.Request[DescribeTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTagOption(
    params: DescribeTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
    */
  def disableAWSOrganizationsAccess(): awsDashSdkLib.libRequestMod.Request[DisableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAWSOrganizationsAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
    */
  def disableAWSOrganizationsAccess(params: DisableAWSOrganizationsAccessInput): awsDashSdkLib.libRequestMod.Request[DisableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAWSOrganizationsAccess(
    params: DisableAWSOrganizationsAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a previously associated principal ARN from a specified portfolio.
    */
  def disassociatePrincipalFromPortfolio(): awsDashSdkLib.libRequestMod.Request[DisassociatePrincipalFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociatePrincipalFromPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociatePrincipalFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociatePrincipalFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a previously associated principal ARN from a specified portfolio.
    */
  def disassociatePrincipalFromPortfolio(params: DisassociatePrincipalFromPortfolioInput): awsDashSdkLib.libRequestMod.Request[DisassociatePrincipalFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociatePrincipalFromPortfolio(
    params: DisassociatePrincipalFromPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociatePrincipalFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociatePrincipalFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified product from the specified portfolio. 
    */
  def disassociateProductFromPortfolio(): awsDashSdkLib.libRequestMod.Request[DisassociateProductFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateProductFromPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateProductFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateProductFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified product from the specified portfolio. 
    */
  def disassociateProductFromPortfolio(params: DisassociateProductFromPortfolioInput): awsDashSdkLib.libRequestMod.Request[DisassociateProductFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateProductFromPortfolio(
    params: DisassociateProductFromPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateProductFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateProductFromPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified self-service action association from the specified provisioning artifact.
    */
  def disassociateServiceActionFromProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateServiceActionFromProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified self-service action association from the specified provisioning artifact.
    */
  def disassociateServiceActionFromProvisioningArtifact(params: DisassociateServiceActionFromProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateServiceActionFromProvisioningArtifact(
    params: DisassociateServiceActionFromProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified TagOption from the specified resource.
    */
  def disassociateTagOptionFromResource(): awsDashSdkLib.libRequestMod.Request[DisassociateTagOptionFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateTagOptionFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateTagOptionFromResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateTagOptionFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified TagOption from the specified resource.
    */
  def disassociateTagOptionFromResource(params: DisassociateTagOptionFromResourceInput): awsDashSdkLib.libRequestMod.Request[DisassociateTagOptionFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateTagOptionFromResource(
    params: DisassociateTagOptionFromResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateTagOptionFromResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateTagOptionFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
    */
  def enableAWSOrganizationsAccess(): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAWSOrganizationsAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
    */
  def enableAWSOrganizationsAccess(params: EnableAWSOrganizationsAccessInput): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAWSOrganizationsAccess(
    params: EnableAWSOrganizationsAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions or modifies a product based on the resource changes for the specified plan.
    */
  def executeProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions or modifies a product based on the resource changes for the specified plan.
    */
  def executeProvisionedProductPlan(params: ExecuteProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeProvisionedProductPlan(
    params: ExecuteProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Executes a self-service action against a provisioned product.
    */
  def executeProvisionedProductServiceAction(): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeProvisionedProductServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteProvisionedProductServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Executes a self-service action against a provisioned product.
    */
  def executeProvisionedProductServiceAction(params: ExecuteProvisionedProductServiceActionInput): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeProvisionedProductServiceAction(
    params: ExecuteProvisionedProductServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteProvisionedProductServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteProvisionedProductServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
    */
  def getAWSOrganizationsAccessStatus(): awsDashSdkLib.libRequestMod.Request[GetAWSOrganizationsAccessStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAWSOrganizationsAccessStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAWSOrganizationsAccessStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAWSOrganizationsAccessStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
    */
  def getAWSOrganizationsAccessStatus(params: GetAWSOrganizationsAccessStatusInput): awsDashSdkLib.libRequestMod.Request[GetAWSOrganizationsAccessStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAWSOrganizationsAccessStatus(
    params: GetAWSOrganizationsAccessStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAWSOrganizationsAccessStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAWSOrganizationsAccessStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all portfolios for which sharing was accepted by this account.
    */
  def listAcceptedPortfolioShares(): awsDashSdkLib.libRequestMod.Request[ListAcceptedPortfolioSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAcceptedPortfolioShares(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAcceptedPortfolioSharesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAcceptedPortfolioSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all portfolios for which sharing was accepted by this account.
    */
  def listAcceptedPortfolioShares(params: ListAcceptedPortfolioSharesInput): awsDashSdkLib.libRequestMod.Request[ListAcceptedPortfolioSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAcceptedPortfolioShares(
    params: ListAcceptedPortfolioSharesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAcceptedPortfolioSharesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAcceptedPortfolioSharesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the constraints for the specified portfolio and product.
    */
  def listConstraintsForPortfolio(): awsDashSdkLib.libRequestMod.Request[ListConstraintsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConstraintsForPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConstraintsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConstraintsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the constraints for the specified portfolio and product.
    */
  def listConstraintsForPortfolio(params: ListConstraintsForPortfolioInput): awsDashSdkLib.libRequestMod.Request[ListConstraintsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConstraintsForPortfolio(
    params: ListConstraintsForPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConstraintsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConstraintsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
    */
  def listLaunchPaths(): awsDashSdkLib.libRequestMod.Request[ListLaunchPathsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLaunchPaths(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLaunchPathsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLaunchPathsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
    */
  def listLaunchPaths(params: ListLaunchPathsInput): awsDashSdkLib.libRequestMod.Request[ListLaunchPathsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLaunchPaths(
    params: ListLaunchPathsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLaunchPathsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLaunchPathsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
    */
  def listOrganizationPortfolioAccess(): awsDashSdkLib.libRequestMod.Request[ListOrganizationPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOrganizationPortfolioAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOrganizationPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOrganizationPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
    */
  def listOrganizationPortfolioAccess(params: ListOrganizationPortfolioAccessInput): awsDashSdkLib.libRequestMod.Request[ListOrganizationPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOrganizationPortfolioAccess(
    params: ListOrganizationPortfolioAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOrganizationPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOrganizationPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the account IDs that have access to the specified portfolio.
    */
  def listPortfolioAccess(): awsDashSdkLib.libRequestMod.Request[ListPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPortfolioAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the account IDs that have access to the specified portfolio.
    */
  def listPortfolioAccess(params: ListPortfolioAccessInput): awsDashSdkLib.libRequestMod.Request[ListPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPortfolioAccess(
    params: ListPortfolioAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPortfolioAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all portfolios in the catalog.
    */
  def listPortfolios(): awsDashSdkLib.libRequestMod.Request[ListPortfoliosOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPortfolios(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPortfoliosOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPortfoliosOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all portfolios in the catalog.
    */
  def listPortfolios(params: ListPortfoliosInput): awsDashSdkLib.libRequestMod.Request[ListPortfoliosOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPortfolios(
    params: ListPortfoliosInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPortfoliosOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPortfoliosOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all portfolios that the specified product is associated with.
    */
  def listPortfoliosForProduct(): awsDashSdkLib.libRequestMod.Request[ListPortfoliosForProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPortfoliosForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPortfoliosForProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPortfoliosForProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all portfolios that the specified product is associated with.
    */
  def listPortfoliosForProduct(params: ListPortfoliosForProductInput): awsDashSdkLib.libRequestMod.Request[ListPortfoliosForProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPortfoliosForProduct(
    params: ListPortfoliosForProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPortfoliosForProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPortfoliosForProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all principal ARNs associated with the specified portfolio.
    */
  def listPrincipalsForPortfolio(): awsDashSdkLib.libRequestMod.Request[ListPrincipalsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipalsForPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all principal ARNs associated with the specified portfolio.
    */
  def listPrincipalsForPortfolio(params: ListPrincipalsForPortfolioInput): awsDashSdkLib.libRequestMod.Request[ListPrincipalsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipalsForPortfolio(
    params: ListPrincipalsForPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalsForPortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the plans for the specified provisioned product or all plans to which the user has access.
    */
  def listProvisionedProductPlans(): awsDashSdkLib.libRequestMod.Request[ListProvisionedProductPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProvisionedProductPlans(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProvisionedProductPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProvisionedProductPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the plans for the specified provisioned product or all plans to which the user has access.
    */
  def listProvisionedProductPlans(params: ListProvisionedProductPlansInput): awsDashSdkLib.libRequestMod.Request[ListProvisionedProductPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProvisionedProductPlans(
    params: ListProvisionedProductPlansInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProvisionedProductPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProvisionedProductPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified product.
    */
  def listProvisioningArtifacts(): awsDashSdkLib.libRequestMod.Request[ListProvisioningArtifactsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProvisioningArtifacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProvisioningArtifactsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProvisioningArtifactsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified product.
    */
  def listProvisioningArtifacts(params: ListProvisioningArtifactsInput): awsDashSdkLib.libRequestMod.Request[ListProvisioningArtifactsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProvisioningArtifacts(
    params: ListProvisioningArtifactsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProvisioningArtifactsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProvisioningArtifactsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
    */
  def listProvisioningArtifactsForServiceAction(): awsDashSdkLib.libRequestMod.Request[
    ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProvisioningArtifactsForServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProvisioningArtifactsForServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
    */
  def listProvisioningArtifactsForServiceAction(params: ListProvisioningArtifactsForServiceActionInput): awsDashSdkLib.libRequestMod.Request[
    ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProvisioningArtifactsForServiceAction(
    params: ListProvisioningArtifactsForServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProvisioningArtifactsForServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the specified requests or all performed requests.
    */
  def listRecordHistory(): awsDashSdkLib.libRequestMod.Request[ListRecordHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecordHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecordHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecordHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the specified requests or all performed requests.
    */
  def listRecordHistory(params: ListRecordHistoryInput): awsDashSdkLib.libRequestMod.Request[ListRecordHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecordHistory(
    params: ListRecordHistoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecordHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecordHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resources associated with the specified TagOption.
    */
  def listResourcesForTagOption(): awsDashSdkLib.libRequestMod.Request[ListResourcesForTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourcesForTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourcesForTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourcesForTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resources associated with the specified TagOption.
    */
  def listResourcesForTagOption(params: ListResourcesForTagOptionInput): awsDashSdkLib.libRequestMod.Request[ListResourcesForTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourcesForTagOption(
    params: ListResourcesForTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourcesForTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourcesForTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all self-service actions.
    */
  def listServiceActions(): awsDashSdkLib.libRequestMod.Request[ListServiceActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listServiceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListServiceActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListServiceActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all self-service actions.
    */
  def listServiceActions(params: ListServiceActionsInput): awsDashSdkLib.libRequestMod.Request[ListServiceActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listServiceActions(
    params: ListServiceActionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListServiceActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListServiceActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
    */
  def listServiceActionsForProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServiceActionsForProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListServiceActionsForProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
    */
  def listServiceActionsForProvisioningArtifact(params: ListServiceActionsForProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServiceActionsForProvisioningArtifact(
    params: ListServiceActionsForProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListServiceActionsForProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the specified TagOptions or all TagOptions.
    */
  def listTagOptions(): awsDashSdkLib.libRequestMod.Request[ListTagOptionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagOptionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagOptionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the specified TagOptions or all TagOptions.
    */
  def listTagOptions(params: ListTagOptionsInput): awsDashSdkLib.libRequestMod.Request[ListTagOptionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagOptions(
    params: ListTagOptionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagOptionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagOptionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
    */
  def provisionProduct(): awsDashSdkLib.libRequestMod.Request[ProvisionProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def provisionProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ProvisionProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ProvisionProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
    */
  def provisionProduct(params: ProvisionProductInput): awsDashSdkLib.libRequestMod.Request[ProvisionProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def provisionProduct(
    params: ProvisionProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ProvisionProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ProvisionProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects an offer to share the specified portfolio.
    */
  def rejectPortfolioShare(): awsDashSdkLib.libRequestMod.Request[RejectPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectPortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects an offer to share the specified portfolio.
    */
  def rejectPortfolioShare(params: RejectPortfolioShareInput): awsDashSdkLib.libRequestMod.Request[RejectPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectPortfolioShare(
    params: RejectPortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
    */
  def scanProvisionedProducts(): awsDashSdkLib.libRequestMod.Request[ScanProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def scanProvisionedProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ScanProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ScanProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
    */
  def scanProvisionedProducts(params: ScanProvisionedProductsInput): awsDashSdkLib.libRequestMod.Request[ScanProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def scanProvisionedProducts(
    params: ScanProvisionedProductsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ScanProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ScanProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the products to which the caller has access.
    */
  def searchProducts(): awsDashSdkLib.libRequestMod.Request[SearchProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the products to which the caller has access.
    */
  def searchProducts(params: SearchProductsInput): awsDashSdkLib.libRequestMod.Request[SearchProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchProducts(
    params: SearchProductsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the products for the specified portfolio or all products.
    */
  def searchProductsAsAdmin(): awsDashSdkLib.libRequestMod.Request[SearchProductsAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchProductsAsAdmin(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchProductsAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchProductsAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the products for the specified portfolio or all products.
    */
  def searchProductsAsAdmin(params: SearchProductsAsAdminInput): awsDashSdkLib.libRequestMod.Request[SearchProductsAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchProductsAsAdmin(
    params: SearchProductsAsAdminInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchProductsAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchProductsAsAdminOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the provisioned products that meet the specified criteria.
    */
  def searchProvisionedProducts(): awsDashSdkLib.libRequestMod.Request[SearchProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchProvisionedProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the provisioned products that meet the specified criteria.
    */
  def searchProvisionedProducts(params: SearchProvisionedProductsInput): awsDashSdkLib.libRequestMod.Request[SearchProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchProvisionedProducts(
    params: SearchProvisionedProductsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchProvisionedProductsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
    */
  def terminateProvisionedProduct(): awsDashSdkLib.libRequestMod.Request[TerminateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateProvisionedProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TerminateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TerminateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
    */
  def terminateProvisionedProduct(params: TerminateProvisionedProductInput): awsDashSdkLib.libRequestMod.Request[TerminateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateProvisionedProduct(
    params: TerminateProvisionedProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TerminateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TerminateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified constraint.
    */
  def updateConstraint(): awsDashSdkLib.libRequestMod.Request[UpdateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified constraint.
    */
  def updateConstraint(params: UpdateConstraintInput): awsDashSdkLib.libRequestMod.Request[UpdateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConstraint(
    params: UpdateConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConstraintOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified portfolio. You cannot update a product that was shared with you.
    */
  def updatePortfolio(): awsDashSdkLib.libRequestMod.Request[UpdatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified portfolio. You cannot update a product that was shared with you.
    */
  def updatePortfolio(params: UpdatePortfolioInput): awsDashSdkLib.libRequestMod.Request[UpdatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePortfolio(
    params: UpdatePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePortfolioOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified product.
    */
  def updateProduct(): awsDashSdkLib.libRequestMod.Request[UpdateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified product.
    */
  def updateProduct(params: UpdateProductInput): awsDashSdkLib.libRequestMod.Request[UpdateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProduct(
    params: UpdateProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
    */
  def updateProvisionedProduct(): awsDashSdkLib.libRequestMod.Request[UpdateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProvisionedProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
    */
  def updateProvisionedProduct(params: UpdateProvisionedProductInput): awsDashSdkLib.libRequestMod.Request[UpdateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProvisionedProduct(
    params: UpdateProvisionedProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProvisionedProductOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
    */
  def updateProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[UpdateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
    */
  def updateProvisioningArtifact(params: UpdateProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[UpdateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProvisioningArtifact(
    params: UpdateProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProvisioningArtifactOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a self-service action.
    */
  def updateServiceAction(): awsDashSdkLib.libRequestMod.Request[UpdateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a self-service action.
    */
  def updateServiceAction(params: UpdateServiceActionInput): awsDashSdkLib.libRequestMod.Request[UpdateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceAction(
    params: UpdateServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceActionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified TagOption.
    */
  def updateTagOption(): awsDashSdkLib.libRequestMod.Request[UpdateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified TagOption.
    */
  def updateTagOption(params: UpdateTagOptionInput): awsDashSdkLib.libRequestMod.Request[UpdateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTagOption(
    params: UpdateTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

