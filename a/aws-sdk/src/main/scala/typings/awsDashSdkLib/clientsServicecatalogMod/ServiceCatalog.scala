package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceCatalog
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ServiceCatalog: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ClientConfiguration = js.native
  /**
     * Accepts an offer to share the specified portfolio.
     */
  def acceptPortfolioShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts an offer to share the specified portfolio.
     */
  def acceptPortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts an offer to share the specified portfolio.
     */
  def acceptPortfolioShare(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts an offer to share the specified portfolio.
     */
  def acceptPortfolioShare(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AcceptPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified principal ARN with the specified portfolio.
     */
  def associatePrincipalWithPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified principal ARN with the specified portfolio.
     */
  def associatePrincipalWithPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified principal ARN with the specified portfolio.
     */
  def associatePrincipalWithPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified principal ARN with the specified portfolio.
     */
  def associatePrincipalWithPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociatePrincipalWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified product with the specified portfolio.
     */
  def associateProductWithPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified product with the specified portfolio.
     */
  def associateProductWithPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified product with the specified portfolio.
     */
  def associateProductWithPortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified product with the specified portfolio.
     */
  def associateProductWithPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateProductWithPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a self-service action with a provisioning artifact.
     */
  def associateServiceActionWithProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a self-service action with a provisioning artifact.
     */
  def associateServiceActionWithProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a self-service action with a provisioning artifact.
     */
  def associateServiceActionWithProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a self-service action with a provisioning artifact.
     */
  def associateServiceActionWithProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate the specified TagOption with the specified portfolio or product.
     */
  def associateTagOptionWithResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate the specified TagOption with the specified portfolio or product.
     */
  def associateTagOptionWithResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate the specified TagOption with the specified portfolio or product.
     */
  def associateTagOptionWithResource(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate the specified TagOption with the specified portfolio or product.
     */
  def associateTagOptionWithResource(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.AssociateTagOptionWithResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates multiple self-service actions with provisioning artifacts.
     */
  def batchAssociateServiceActionWithProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates multiple self-service actions with provisioning artifacts.
     */
  def batchAssociateServiceActionWithProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates multiple self-service actions with provisioning artifacts.
     */
  def batchAssociateServiceActionWithProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates multiple self-service actions with provisioning artifacts.
     */
  def batchAssociateServiceActionWithProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchAssociateServiceActionWithProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     */
  def batchDisassociateServiceActionFromProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     */
  def batchDisassociateServiceActionFromProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     */
  def batchDisassociateServiceActionFromProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     */
  def batchDisassociateServiceActionFromProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.BatchDisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
     */
  def copyProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
     */
  def copyProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
     */
  def copyProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
     */
  def copyProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CopyProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a constraint.
     */
  def createConstraint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a constraint.
     */
  def createConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a constraint.
     */
  def createConstraint(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a constraint.
     */
  def createConstraint(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a portfolio.
     */
  def createPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a portfolio.
     */
  def createPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a portfolio.
     */
  def createPortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a portfolio.
     */
  def createPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
     */
  def createPortfolioShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
     */
  def createPortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
     */
  def createPortfolioShare(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
     */
  def createPortfolioShare(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreatePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a product.
     */
  def createProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a product.
     */
  def createProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a product.
     */
  def createProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a product.
     */
  def createProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
     */
  def createProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
     */
  def createProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
     */
  def createProvisionedProductPlan(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
     */
  def createProvisionedProductPlan(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
     */
  def createProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
     */
  def createProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
     */
  def createProvisioningArtifact(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
     */
  def createProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a self-service action.
     */
  def createServiceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a self-service action.
     */
  def createServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a self-service action.
     */
  def createServiceAction(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a self-service action.
     */
  def createServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TagOption.
     */
  def createTagOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TagOption.
     */
  def createTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TagOption.
     */
  def createTagOption(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TagOption.
     */
  def createTagOption(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.CreateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified constraint.
     */
  def deleteConstraint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified constraint.
     */
  def deleteConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified constraint.
     */
  def deleteConstraint(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified constraint.
     */
  def deleteConstraint(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
     */
  def deletePortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
     */
  def deletePortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
     */
  def deletePortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
     */
  def deletePortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
     */
  def deletePortfolioShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
     */
  def deletePortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
     */
  def deletePortfolioShare(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
     */
  def deletePortfolioShare(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeletePortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
     */
  def deleteProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
     */
  def deleteProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
     */
  def deleteProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
     */
  def deleteProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified plan.
     */
  def deleteProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified plan.
     */
  def deleteProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified plan.
     */
  def deleteProvisionedProductPlan(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified plan.
     */
  def deleteProvisionedProductPlan(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     */
  def deleteProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     */
  def deleteProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     */
  def deleteProvisioningArtifact(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     */
  def deleteProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a self-service action.
     */
  def deleteServiceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a self-service action.
     */
  def deleteServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a self-service action.
     */
  def deleteServiceAction(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a self-service action.
     */
  def deleteServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
     */
  def deleteTagOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
     */
  def deleteTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
     */
  def deleteTagOption(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
     */
  def deleteTagOption(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DeleteTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified constraint.
     */
  def describeConstraint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified constraint.
     */
  def describeConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified constraint.
     */
  def describeConstraint(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified constraint.
     */
  def describeConstraint(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified copy product operation.
     */
  def describeCopyProductStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified copy product operation.
     */
  def describeCopyProductStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified copy product operation.
     */
  def describeCopyProductStatus(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified copy product operation.
     */
  def describeCopyProductStatus(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeCopyProductStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified portfolio.
     */
  def describePortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified portfolio.
     */
  def describePortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified portfolio.
     */
  def describePortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified portfolio.
     */
  def describePortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
     */
  def describePortfolioShareStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
     */
  def describePortfolioShareStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
     */
  def describePortfolioShareStatus(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
     */
  def describePortfolioShareStatus(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribePortfolioShareStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product. This operation is run with administrator access.
     */
  def describeProductAsAdmin(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product. This operation is run with administrator access.
     */
  def describeProductAsAdmin(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product. This operation is run with administrator access.
     */
  def describeProductAsAdmin(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product. This operation is run with administrator access.
     */
  def describeProductAsAdmin(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProductView(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProductView(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProductView(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified product.
     */
  def describeProductView(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProductViewOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioned product.
     */
  def describeProvisionedProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioned product.
     */
  def describeProvisionedProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioned product.
     */
  def describeProvisionedProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioned product.
     */
  def describeProvisionedProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the resource changes for the specified plan.
     */
  def describeProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the resource changes for the specified plan.
     */
  def describeProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the resource changes for the specified plan.
     */
  def describeProvisionedProductPlan(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the resource changes for the specified plan.
     */
  def describeProvisionedProductPlan(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     */
  def describeProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     */
  def describeProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     */
  def describeProvisioningArtifact(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     */
  def describeProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
     */
  def describeProvisioningParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
     */
  def describeProvisioningParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
     */
  def describeProvisioningParameters(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
     */
  def describeProvisioningParameters(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeProvisioningParametersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
     */
  def describeRecord(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
     */
  def describeRecord(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
     */
  def describeRecord(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
     */
  def describeRecord(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeRecordOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a self-service action.
     */
  def describeServiceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a self-service action.
     */
  def describeServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a self-service action.
     */
  def describeServiceAction(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a self-service action.
     */
  def describeServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified TagOption.
     */
  def describeTagOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified TagOption.
     */
  def describeTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified TagOption.
     */
  def describeTagOption(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the specified TagOption.
     */
  def describeTagOption(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DescribeTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
     */
  def disableAWSOrganizationsAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
     */
  def disableAWSOrganizationsAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
     */
  def disableAWSOrganizationsAccess(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
     */
  def disableAWSOrganizationsAccess(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a previously associated principal ARN from a specified portfolio.
     */
  def disassociatePrincipalFromPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a previously associated principal ARN from a specified portfolio.
     */
  def disassociatePrincipalFromPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a previously associated principal ARN from a specified portfolio.
     */
  def disassociatePrincipalFromPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a previously associated principal ARN from a specified portfolio.
     */
  def disassociatePrincipalFromPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociatePrincipalFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified product from the specified portfolio. 
     */
  def disassociateProductFromPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified product from the specified portfolio. 
     */
  def disassociateProductFromPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified product from the specified portfolio. 
     */
  def disassociateProductFromPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified product from the specified portfolio. 
     */
  def disassociateProductFromPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateProductFromPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     */
  def disassociateServiceActionFromProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     */
  def disassociateServiceActionFromProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     */
  def disassociateServiceActionFromProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     */
  def disassociateServiceActionFromProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateServiceActionFromProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified TagOption from the specified resource.
     */
  def disassociateTagOptionFromResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified TagOption from the specified resource.
     */
  def disassociateTagOptionFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified TagOption from the specified resource.
     */
  def disassociateTagOptionFromResource(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified TagOption from the specified resource.
     */
  def disassociateTagOptionFromResource(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.DisassociateTagOptionFromResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
     */
  def enableAWSOrganizationsAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
     */
  def enableAWSOrganizationsAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
     */
  def enableAWSOrganizationsAccess(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
     */
  def enableAWSOrganizationsAccess(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.EnableAWSOrganizationsAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions or modifies a product based on the resource changes for the specified plan.
     */
  def executeProvisionedProductPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions or modifies a product based on the resource changes for the specified plan.
     */
  def executeProvisionedProductPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions or modifies a product based on the resource changes for the specified plan.
     */
  def executeProvisionedProductPlan(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions or modifies a product based on the resource changes for the specified plan.
     */
  def executeProvisionedProductPlan(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes a self-service action against a provisioned product.
     */
  def executeProvisionedProductServiceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes a self-service action against a provisioned product.
     */
  def executeProvisionedProductServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes a self-service action against a provisioned product.
     */
  def executeProvisionedProductServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes a self-service action against a provisioned product.
     */
  def executeProvisionedProductServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ExecuteProvisionedProductServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
     */
  def getAWSOrganizationsAccessStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
     */
  def getAWSOrganizationsAccessStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
     */
  def getAWSOrganizationsAccessStatus(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
     */
  def getAWSOrganizationsAccessStatus(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.GetAWSOrganizationsAccessStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios for which sharing was accepted by this account.
     */
  def listAcceptedPortfolioShares(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios for which sharing was accepted by this account.
     */
  def listAcceptedPortfolioShares(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios for which sharing was accepted by this account.
     */
  def listAcceptedPortfolioShares(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios for which sharing was accepted by this account.
     */
  def listAcceptedPortfolioShares(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListAcceptedPortfolioSharesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the constraints for the specified portfolio and product.
     */
  def listConstraintsForPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the constraints for the specified portfolio and product.
     */
  def listConstraintsForPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the constraints for the specified portfolio and product.
     */
  def listConstraintsForPortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the constraints for the specified portfolio and product.
     */
  def listConstraintsForPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListConstraintsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     */
  def listLaunchPaths(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     */
  def listLaunchPaths(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     */
  def listLaunchPaths(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     */
  def listLaunchPaths(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListLaunchPathsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
     */
  def listOrganizationPortfolioAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
     */
  def listOrganizationPortfolioAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
     */
  def listOrganizationPortfolioAccess(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
     */
  def listOrganizationPortfolioAccess(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListOrganizationPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account IDs that have access to the specified portfolio.
     */
  def listPortfolioAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account IDs that have access to the specified portfolio.
     */
  def listPortfolioAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account IDs that have access to the specified portfolio.
     */
  def listPortfolioAccess(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account IDs that have access to the specified portfolio.
     */
  def listPortfolioAccess(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfolioAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios in the catalog.
     */
  def listPortfolios(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios in the catalog.
     */
  def listPortfolios(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios in the catalog.
     */
  def listPortfolios(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios in the catalog.
     */
  def listPortfolios(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios that the specified product is associated with.
     */
  def listPortfoliosForProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios that the specified product is associated with.
     */
  def listPortfoliosForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios that the specified product is associated with.
     */
  def listPortfoliosForProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all portfolios that the specified product is associated with.
     */
  def listPortfoliosForProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPortfoliosForProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all principal ARNs associated with the specified portfolio.
     */
  def listPrincipalsForPortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all principal ARNs associated with the specified portfolio.
     */
  def listPrincipalsForPortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all principal ARNs associated with the specified portfolio.
     */
  def listPrincipalsForPortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all principal ARNs associated with the specified portfolio.
     */
  def listPrincipalsForPortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListPrincipalsForPortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     */
  def listProvisionedProductPlans(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     */
  def listProvisionedProductPlans(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     */
  def listProvisionedProductPlans(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     */
  def listProvisionedProductPlans(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisionedProductPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     */
  def listProvisioningArtifacts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     */
  def listProvisioningArtifacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     */
  def listProvisioningArtifacts(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     */
  def listProvisioningArtifacts(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     */
  def listProvisioningArtifactsForServiceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     */
  def listProvisioningArtifactsForServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     */
  def listProvisioningArtifactsForServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     */
  def listProvisioningArtifactsForServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListProvisioningArtifactsForServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified requests or all performed requests.
     */
  def listRecordHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified requests or all performed requests.
     */
  def listRecordHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified requests or all performed requests.
     */
  def listRecordHistory(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified requests or all performed requests.
     */
  def listRecordHistory(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListRecordHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources associated with the specified TagOption.
     */
  def listResourcesForTagOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources associated with the specified TagOption.
     */
  def listResourcesForTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources associated with the specified TagOption.
     */
  def listResourcesForTagOption(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources associated with the specified TagOption.
     */
  def listResourcesForTagOption(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListResourcesForTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all self-service actions.
     */
  def listServiceActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all self-service actions.
     */
  def listServiceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all self-service actions.
     */
  def listServiceActions(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all self-service actions.
     */
  def listServiceActions(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
     */
  def listServiceActionsForProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
     */
  def listServiceActionsForProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
     */
  def listServiceActionsForProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
     */
  def listServiceActionsForProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListServiceActionsForProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified TagOptions or all TagOptions.
     */
  def listTagOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified TagOptions or all TagOptions.
     */
  def listTagOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified TagOptions or all TagOptions.
     */
  def listTagOptions(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified TagOptions or all TagOptions.
     */
  def listTagOptions(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ListTagOptionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
     */
  def provisionProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
     */
  def provisionProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
     */
  def provisionProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
     */
  def provisionProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ProvisionProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an offer to share the specified portfolio.
     */
  def rejectPortfolioShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an offer to share the specified portfolio.
     */
  def rejectPortfolioShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an offer to share the specified portfolio.
     */
  def rejectPortfolioShare(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an offer to share the specified portfolio.
     */
  def rejectPortfolioShare(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.RejectPortfolioShareOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
     */
  def scanProvisionedProducts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
     */
  def scanProvisionedProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
     */
  def scanProvisionedProducts(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
     */
  def scanProvisionedProducts(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.ScanProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products to which the caller has access.
     */
  def searchProducts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products to which the caller has access.
     */
  def searchProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products to which the caller has access.
     */
  def searchProducts(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products to which the caller has access.
     */
  def searchProducts(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products for the specified portfolio or all products.
     */
  def searchProductsAsAdmin(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products for the specified portfolio or all products.
     */
  def searchProductsAsAdmin(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products for the specified portfolio or all products.
     */
  def searchProductsAsAdmin(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the products for the specified portfolio or all products.
     */
  def searchProductsAsAdmin(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProductsAsAdminOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the provisioned products that meet the specified criteria.
     */
  def searchProvisionedProducts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the provisioned products that meet the specified criteria.
     */
  def searchProvisionedProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the provisioned products that meet the specified criteria.
     */
  def searchProvisionedProducts(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the provisioned products that meet the specified criteria.
     */
  def searchProvisionedProducts(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.SearchProvisionedProductsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
     */
  def terminateProvisionedProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
     */
  def terminateProvisionedProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
     */
  def terminateProvisionedProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
     */
  def terminateProvisionedProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.TerminateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified constraint.
     */
  def updateConstraint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified constraint.
     */
  def updateConstraint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified constraint.
     */
  def updateConstraint(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified constraint.
     */
  def updateConstraint(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateConstraintOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified portfolio. You cannot update a product that was shared with you.
     */
  def updatePortfolio(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified portfolio. You cannot update a product that was shared with you.
     */
  def updatePortfolio(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified portfolio. You cannot update a product that was shared with you.
     */
  def updatePortfolio(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified portfolio. You cannot update a product that was shared with you.
     */
  def updatePortfolio(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdatePortfolioOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified product.
     */
  def updateProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified product.
     */
  def updateProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified product.
     */
  def updateProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified product.
     */
  def updateProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
     */
  def updateProvisionedProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
     */
  def updateProvisionedProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
     */
  def updateProvisionedProduct(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
     */
  def updateProvisionedProduct(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisionedProductOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
     */
  def updateProvisioningArtifact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
     */
  def updateProvisioningArtifact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
     */
  def updateProvisioningArtifact(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
     */
  def updateProvisioningArtifact(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateProvisioningArtifactOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a self-service action.
     */
  def updateServiceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a self-service action.
     */
  def updateServiceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a self-service action.
     */
  def updateServiceAction(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a self-service action.
     */
  def updateServiceAction(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateServiceActionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified TagOption.
     */
  def updateTagOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified TagOption.
     */
  def updateTagOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified TagOption.
     */
  def updateTagOption(params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified TagOption.
     */
  def updateTagOption(
    params: awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicecatalogMod.ServiceCatalogNs.UpdateTagOptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

