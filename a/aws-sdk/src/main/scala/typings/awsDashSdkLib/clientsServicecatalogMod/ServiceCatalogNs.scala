package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/servicecatalog", "ServiceCatalog")
@js.native
object ServiceCatalogNs extends js.Object {
  
  trait AcceptPortfolioShareInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The type of shared portfolios to accept. The default is to accept imported portfolios.    AWS_ORGANIZATIONS - Accept portfolios shared by the master account of your organization.    IMPORTED - Accept imported portfolios.    AWS_SERVICECATALOG - Not supported. (Throws ResourceNotFoundException.)   For example, aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS 
         */
    var PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
  }
  
  
  trait AcceptPortfolioShareOutput extends js.Object
  
  
  trait AccessLevelFilter extends js.Object {
    /**
         * The access level.    Account - Filter results based on the account.    Role - Filter results based on the federated role of the specified user.    User - Filter results based on the specified user.  
         */
    var Key: js.UndefOr[AccessLevelFilterKey] = js.undefined
    /**
         * The user to which the access level applies. The only supported value is Self.
         */
    var Value: js.UndefOr[AccessLevelFilterValue] = js.undefined
  }
  
  
  trait AssociatePrincipalWithPortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The ARN of the principal (IAM user, role, or group).
         */
    var PrincipalARN: PrincipalARN
    /**
         * The principal type. The supported value is IAM.
         */
    var PrincipalType: PrincipalType
  }
  
  
  trait AssociatePrincipalWithPortfolioOutput extends js.Object
  
  
  trait AssociateProductWithPortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * The identifier of the source portfolio.
         */
    var SourcePortfolioId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait AssociateProductWithPortfolioOutput extends js.Object
  
  
  trait AssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier. For example, prod-abcdzk7xy33qa.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
         */
    var ProvisioningArtifactId: Id
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var ServiceActionId: Id
  }
  
  
  trait AssociateServiceActionWithProvisioningArtifactOutput extends js.Object
  
  
  trait AssociateTagOptionWithResourceInput extends js.Object {
    /**
         * The resource identifier.
         */
    var ResourceId: ResourceId
    /**
         * The TagOption identifier.
         */
    var TagOptionId: TagOptionId
  }
  
  
  trait AssociateTagOptionWithResourceOutput extends js.Object
  
  
  trait BatchAssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
         */
    var ServiceActionAssociations: ServiceActionAssociations
  }
  
  
  trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
    /**
         * An object that contains a list of errors, along with information to help you identify the self-service action.
         */
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
  }
  
  
  trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
         */
    var ServiceActionAssociations: ServiceActionAssociations
  }
  
  
  trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
    /**
         * An object that contains a list of errors, along with information to help you identify the self-service action.
         */
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CloudWatchDashboard extends js.Object {
    /**
         * The name of the CloudWatch dashboard.
         */
    var Name: js.UndefOr[CloudWatchDashboardName] = js.undefined
  }
  
  
  trait ConstraintDetail extends js.Object {
    /**
         * The identifier of the constraint.
         */
    var ConstraintId: js.UndefOr[Id] = js.undefined
    /**
         * The description of the constraint.
         */
    var Description: js.UndefOr[ConstraintDescription] = js.undefined
    /**
         * The owner of the constraint.
         */
    var Owner: js.UndefOr[AccountId] = js.undefined
    /**
         * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
         */
    var Type: js.UndefOr[ConstraintType] = js.undefined
  }
  
  
  trait ConstraintSummary extends js.Object {
    /**
         * The description of the constraint.
         */
    var Description: js.UndefOr[ConstraintDescription] = js.undefined
    /**
         * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
         */
    var Type: js.UndefOr[ConstraintType] = js.undefined
  }
  
  
  trait CopyProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The copy options. If the value is CopyTags, the tags from the source product are copied to the target product.
         */
    var CopyOptions: js.UndefOr[CopyOptions] = js.undefined
    /**
         *  A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request. 
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The Amazon Resource Name (ARN) of the source product.
         */
    var SourceProductArn: ProductArn
    /**
         * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all provisioning artifacts are copied.
         */
    var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.undefined
    /**
         * The identifier of the target product. By default, a new product is created.
         */
    var TargetProductId: js.UndefOr[Id] = js.undefined
    /**
         * A name for the target product. The default is the name of the source product.
         */
    var TargetProductName: js.UndefOr[ProductViewName] = js.undefined
  }
  
  
  trait CopyProductOutput extends js.Object {
    /**
         * The token to use to track the progress of the operation.
         */
    var CopyProductToken: js.UndefOr[Id] = js.undefined
  }
  
  
  trait CreateConstraintInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The description of the constraint.
         */
    var Description: js.UndefOr[ConstraintDescription] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:  LAUNCH  Specify the RoleArn property as follows:  {"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one LAUNCH constraint on a product and portfolio.  NOTIFICATION  Specify the NotificationArns property as follows:  {"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}   STACKSET  Specify the Parameters property as follows:  {"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one STACKSET constraint on a product and portfolio. Products with a STACKSET constraint will launch an AWS CloudFormation stack set.  TEMPLATE  Specify the Rules property. For more information, see Template Constraint Rules.  
         */
    var Parameters: ConstraintParameters
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * The type of constraint.    LAUNCH     NOTIFICATION     STACKSET     TEMPLATE   
         */
    var Type: ConstraintType
  }
  
  
  trait CreateConstraintOutput extends js.Object {
    /**
         * Information about the constraint.
         */
    var ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined
    /**
         * The constraint parameters.
         */
    var ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined
    /**
         * The status of the current request.
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait CreatePortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The description of the portfolio.
         */
    var Description: js.UndefOr[PortfolioDescription] = js.undefined
    /**
         * The name to use for display purposes.
         */
    var DisplayName: PortfolioDisplayName
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The name of the portfolio provider.
         */
    var ProviderName: ProviderName
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[AddTags] = js.undefined
  }
  
  
  trait CreatePortfolioOutput extends js.Object {
    /**
         * Information about the portfolio.
         */
    var PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined
    /**
         * Information about the tags associated with the portfolio.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait CreatePortfolioShareInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The AWS account ID. For example, 123456789012.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The organization node to whom you are going to share. If OrganizationNode is passed in, PortfolioShare will be created for the node and its children (when applies), and a PortfolioShareToken will be returned in the output in order for the administrator to monitor the status of the PortfolioShare creation process.
         */
    var OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
  }
  
  
  trait CreatePortfolioShareOutput extends js.Object {
    /**
         * The portfolio share unique identifier. This will only be returned if portfolio is shared to an organization node.
         */
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
  }
  
  
  trait CreateProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The description of the product.
         */
    var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
    /**
         * The distributor of the product.
         */
    var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The name of the product.
         */
    var Name: ProductViewName
    /**
         * The owner of the product.
         */
    var Owner: ProductViewOwner
    /**
         * The type of product.
         */
    var ProductType: ProductType
    /**
         * The configuration of the provisioning artifact.
         */
    var ProvisioningArtifactParameters: ProvisioningArtifactProperties
    /**
         * The support information about the product.
         */
    var SupportDescription: js.UndefOr[SupportDescription] = js.undefined
    /**
         * The contact email for product support.
         */
    var SupportEmail: js.UndefOr[SupportEmail] = js.undefined
    /**
         * The contact URL for product support.
         */
    var SupportUrl: js.UndefOr[SupportUrl] = js.undefined
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[AddTags] = js.undefined
  }
  
  
  trait CreateProductOutput extends js.Object {
    /**
         * Information about the product view.
         */
    var ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined
    /**
         * Information about the provisioning artifact.
         */
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined
    /**
         * Information about the tags associated with the product.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait CreateProvisionedProductPlanInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
         */
    var NotificationArns: js.UndefOr[NotificationArns] = js.undefined
    /**
         * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
         */
    var PathId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the plan.
         */
    var PlanName: ProvisionedProductPlanName
    /**
         * The plan type.
         */
    var PlanType: ProvisionedProductPlanType
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
         */
    var ProvisionedProductName: ProvisionedProductName
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: Id
    /**
         * Parameters specified by the administrator that are required for provisioning the product.
         */
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait CreateProvisionedProductPlanOutput extends js.Object {
    /**
         * The plan identifier.
         */
    var PlanId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the plan.
         */
    var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
    /**
         * The product identifier.
         */
    var ProvisionProductId: js.UndefOr[Id] = js.undefined
    /**
         * The user-friendly name of the provisioned product.
         */
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait CreateProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The configuration for the provisioning artifact.
         */
    var Parameters: ProvisioningArtifactProperties
    /**
         * The product identifier.
         */
    var ProductId: Id
  }
  
  
  trait CreateProvisioningArtifactOutput extends js.Object {
    /**
         * The URL of the CloudFormation template in Amazon S3, in JSON format.
         */
    var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
    /**
         * Information about the provisioning artifact.
         */
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined
    /**
         * The status of the current request.
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait CreateServiceActionInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The self-service action definition. Can be one of the following:  Name  The name of the AWS Systems Manager Document. For example, AWS-RestartEC2Instance.  Version  The AWS Systems Manager automation document version. For example, "Version": "1"   AssumeRole  The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example, "AssumeRole": "arn:aws:iam::12345678910:role/ActionRole". To reuse the provisioned product launch role, set to "AssumeRole": "LAUNCH_ROLE".  Parameters  The list of parameters in JSON format. For example: [{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}].  
         */
    var Definition: ServiceActionDefinitionMap
    /**
         * The service action definition type. For example, SSM_AUTOMATION.
         */
    var DefinitionType: ServiceActionDefinitionType
    /**
         * The self-service action description.
         */
    var Description: js.UndefOr[ServiceActionDescription] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The self-service action name.
         */
    var Name: ServiceActionName
  }
  
  
  trait CreateServiceActionOutput extends js.Object {
    /**
         * An object containing information about the self-service action.
         */
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
  }
  
  
  trait CreateTagOptionInput extends js.Object {
    /**
         * The TagOption key.
         */
    var Key: TagOptionKey
    /**
         * The TagOption value.
         */
    var Value: TagOptionValue
  }
  
  
  trait CreateTagOptionOutput extends js.Object {
    /**
         * Information about the TagOption.
         */
    var TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
  }
  
  
  trait DeleteConstraintInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The identifier of the constraint.
         */
    var Id: Id
  }
  
  
  trait DeleteConstraintOutput extends js.Object
  
  
  trait DeletePortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var Id: Id
  }
  
  
  trait DeletePortfolioOutput extends js.Object
  
  
  trait DeletePortfolioShareInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The AWS account ID.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The organization node to whom you are going to stop sharing.
         */
    var OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
  }
  
  
  trait DeletePortfolioShareOutput extends js.Object {
    /**
         * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
         */
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
  }
  
  
  trait DeleteProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier.
         */
    var Id: Id
  }
  
  
  trait DeleteProductOutput extends js.Object
  
  
  trait DeleteProvisionedProductPlanInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
         */
    var IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined
    /**
         * The plan identifier.
         */
    var PlanId: Id
  }
  
  
  trait DeleteProvisionedProductPlanOutput extends js.Object
  
  
  trait DeleteProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: Id
  }
  
  
  trait DeleteProvisioningArtifactOutput extends js.Object
  
  
  trait DeleteServiceActionInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var Id: Id
  }
  
  
  trait DeleteServiceActionOutput extends js.Object
  
  
  trait DeleteTagOptionInput extends js.Object {
    /**
         * The TagOption identifier.
         */
    var Id: TagOptionId
  }
  
  
  trait DeleteTagOptionOutput extends js.Object
  
  
  trait DescribeConstraintInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The identifier of the constraint.
         */
    var Id: Id
  }
  
  
  trait DescribeConstraintOutput extends js.Object {
    /**
         * Information about the constraint.
         */
    var ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined
    /**
         * The constraint parameters.
         */
    var ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined
    /**
         * The status of the current request.
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait DescribeCopyProductStatusInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The token for the copy product operation. This token is returned by CopyProduct.
         */
    var CopyProductToken: Id
  }
  
  
  trait DescribeCopyProductStatusOutput extends js.Object {
    /**
         * The status of the copy product operation.
         */
    var CopyProductStatus: js.UndefOr[CopyProductStatus] = js.undefined
    /**
         * The status message.
         */
    var StatusDetail: js.UndefOr[StatusDetail] = js.undefined
    /**
         * The identifier of the copied product.
         */
    var TargetProductId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait DescribePortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var Id: Id
  }
  
  
  trait DescribePortfolioOutput extends js.Object {
    /**
         * Information about the portfolio.
         */
    var PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined
    /**
         * Information about the TagOptions associated with the portfolio.
         */
    var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
    /**
         * Information about the tags associated with the portfolio.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait DescribePortfolioShareStatusInput extends js.Object {
    /**
         * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by DeletePortfolioShare.
         */
    var PortfolioShareToken: PortfolioShareToken
  }
  
  
  trait DescribePortfolioShareStatusOutput extends js.Object {
    /**
         * Organization node identifier. It can be either account id, organizational unit id or organization id.
         */
    var OrganizationNodeValue: js.UndefOr[OrganizationNodeValue] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: js.UndefOr[Id] = js.undefined
    /**
         * The token for the portfolio share operation. For example, share-6v24abcdefghi.
         */
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined
    /**
         * Information about the portfolio share operation.
         */
    var ShareDetails: js.UndefOr[ShareDetails] = js.undefined
    /**
         * Status of the portfolio share operation.
         */
    var Status: js.UndefOr[ShareStatus] = js.undefined
  }
  
  
  trait DescribeProductAsAdminInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier.
         */
    var Id: Id
  }
  
  
  trait DescribeProductAsAdminOutput extends js.Object {
    /**
         * Information about the product view.
         */
    var ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined
    /**
         * Information about the provisioning artifacts (also known as versions) for the specified product.
         */
    var ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries] = js.undefined
    /**
         * Information about the TagOptions associated with the product.
         */
    var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
    /**
         * Information about the tags associated with the product.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait DescribeProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier.
         */
    var Id: Id
  }
  
  
  trait DescribeProductOutput extends js.Object {
    /**
         * Summary information about the product view.
         */
    var ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined
    /**
         * Information about the provisioning artifacts for the specified product.
         */
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
  }
  
  
  trait DescribeProductViewInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product view identifier.
         */
    var Id: Id
  }
  
  
  trait DescribeProductViewOutput extends js.Object {
    /**
         * Summary information about the product.
         */
    var ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined
    /**
         * Information about the provisioning artifacts for the product.
         */
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
  }
  
  
  trait DescribeProvisionedProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The provisioned product identifier.
         */
    var Id: Id
  }
  
  
  trait DescribeProvisionedProductOutput extends js.Object {
    /**
         * Any CloudWatch dashboards that were created when provisioning the product.
         */
    var CloudWatchDashboards: js.UndefOr[CloudWatchDashboards] = js.undefined
    /**
         * Information about the provisioned product.
         */
    var ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail] = js.undefined
  }
  
  
  trait DescribeProvisionedProductPlanInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The plan identifier.
         */
    var PlanId: Id
  }
  
  
  trait DescribeProvisionedProductPlanOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the plan.
         */
    var ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails] = js.undefined
    /**
         * Information about the resource changes that will occur when the plan is executed.
         */
    var ResourceChanges: js.UndefOr[ResourceChanges] = js.undefined
  }
  
  
  trait DescribeProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: Id
    /**
         * Indicates whether a verbose level of detail is enabled.
         */
    var Verbose: js.UndefOr[Verbose] = js.undefined
  }
  
  
  trait DescribeProvisioningArtifactOutput extends js.Object {
    /**
         * The URL of the CloudFormation template in Amazon S3.
         */
    var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
    /**
         * Information about the provisioning artifact.
         */
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined
    /**
         * The status of the current request.
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait DescribeProvisioningParametersInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
         */
    var PathId: js.UndefOr[Id] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: Id
  }
  
  
  trait DescribeProvisioningParametersOutput extends js.Object {
    /**
         * Information about the constraints used to provision the product.
         */
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined
    /**
         * Information about the parameters used to provision the product.
         */
    var ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters] = js.undefined
    /**
         * An object that contains information about preferences, such as regions and accounts, for the provisioning artifact.
         */
    var ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences] = js.undefined
    /**
         * Information about the TagOptions associated with the resource.
         */
    var TagOptions: js.UndefOr[TagOptionSummaries] = js.undefined
    /**
         * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
         */
    var UsageInstructions: js.UndefOr[UsageInstructions] = js.undefined
  }
  
  
  trait DescribeRecordInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The record identifier of the provisioned product. This identifier is returned by the request operation.
         */
    var Id: Id
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait DescribeRecordOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the product.
         */
    var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    /**
         * Information about the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
         */
    var RecordOutputs: js.UndefOr[RecordOutputs] = js.undefined
  }
  
  
  trait DescribeServiceActionInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The self-service action identifier.
         */
    var Id: Id
  }
  
  
  trait DescribeServiceActionOutput extends js.Object {
    /**
         * Detailed information about the self-service action.
         */
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
  }
  
  
  trait DescribeTagOptionInput extends js.Object {
    /**
         * The TagOption identifier.
         */
    var Id: TagOptionId
  }
  
  
  trait DescribeTagOptionOutput extends js.Object {
    /**
         * Information about the TagOption.
         */
    var TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
  }
  
  
  trait DisableAWSOrganizationsAccessInput extends js.Object
  
  
  trait DisableAWSOrganizationsAccessOutput extends js.Object
  
  
  trait DisassociatePrincipalFromPortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The ARN of the principal (IAM user, role, or group).
         */
    var PrincipalARN: PrincipalARN
  }
  
  
  trait DisassociatePrincipalFromPortfolioOutput extends js.Object
  
  
  trait DisassociateProductFromPortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The product identifier.
         */
    var ProductId: Id
  }
  
  
  trait DisassociateProductFromPortfolioOutput extends js.Object
  
  
  trait DisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier. For example, prod-abcdzk7xy33qa.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
         */
    var ProvisioningArtifactId: Id
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var ServiceActionId: Id
  }
  
  
  trait DisassociateServiceActionFromProvisioningArtifactOutput extends js.Object
  
  
  trait DisassociateTagOptionFromResourceInput extends js.Object {
    /**
         * The resource identifier.
         */
    var ResourceId: ResourceId
    /**
         * The TagOption identifier.
         */
    var TagOptionId: TagOptionId
  }
  
  
  trait DisassociateTagOptionFromResourceOutput extends js.Object
  
  
  trait EnableAWSOrganizationsAccessInput extends js.Object
  
  
  trait EnableAWSOrganizationsAccessOutput extends js.Object
  
  
  trait ExecuteProvisionedProductPlanInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The plan identifier.
         */
    var PlanId: Id
  }
  
  
  trait ExecuteProvisionedProductPlanOutput extends js.Object {
    /**
         * Information about the result of provisioning the product.
         */
    var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
  }
  
  
  trait ExecuteProvisionedProductServiceActionInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * An idempotency token that uniquely identifies the execute request.
         */
    var ExecuteToken: IdempotencyToken
    /**
         * The identifier of the provisioned product.
         */
    var ProvisionedProductId: Id
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var ServiceActionId: Id
  }
  
  
  trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
    /**
         * An object containing detailed information about the result of provisioning the product.
         */
    var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
  }
  
  
  trait FailedServiceActionAssociation extends js.Object {
    /**
         * The error code. Valid values are listed below.
         */
    var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.undefined
    /**
         * A text description of the error.
         */
    var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.undefined
    /**
         * The product identifier. For example, prod-abcdzk7xy33qa.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var ServiceActionId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait GetAWSOrganizationsAccessStatusInput extends js.Object
  
  
  trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
    /**
         * The status of the portfolio share feature.
         */
    var AccessStatus: js.UndefOr[AccessStatus] = js.undefined
  }
  
  
  trait LaunchPathSummary extends js.Object {
    /**
         * The constraints on the portfolio-product relationship.
         */
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined
    /**
         * The identifier of the product path.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The name of the portfolio to which the user was assigned.
         */
    var Name: js.UndefOr[PortfolioName] = js.undefined
    /**
         * The tags associated with this product path.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait ListAcceptedPortfolioSharesInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The type of shared portfolios to list. The default is to list imported portfolios.    AWS_ORGANIZATIONS - List portfolios shared by the master account of your organization    AWS_SERVICECATALOG - List default portfolios    IMPORTED - List imported portfolios  
         */
    var PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
  }
  
  
  trait ListAcceptedPortfolioSharesOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the portfolios.
         */
    var PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
  }
  
  
  trait ListConstraintsForPortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The product identifier.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait ListConstraintsForPortfolioOutput extends js.Object {
    /**
         * Information about the constraints.
         */
    var ConstraintDetails: js.UndefOr[ConstraintDetails] = js.undefined
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListLaunchPathsInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
  }
  
  
  trait ListLaunchPathsOutput extends js.Object {
    /**
         * Information about the launch path.
         */
    var LaunchPathSummaries: js.UndefOr[LaunchPathSummaries] = js.undefined
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListOrganizationPortfolioAccessInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The organization node type that will be returned in the output.    ORGANIZATION - Organization that has access to the portfolio.     ORGANIZATIONAL_UNIT - Organizational unit that has access to the portfolio within your organization.    ACCOUNT - Account that has access to the portfolio within your organization.  
         */
    var OrganizationNodeType: OrganizationNodeType
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The portfolio identifier. For example, port-2abcdext3y5fk.
         */
    var PortfolioId: Id
  }
  
  
  trait ListOrganizationPortfolioAccessOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Displays information about the organization nodes.
         */
    var OrganizationNodes: js.UndefOr[OrganizationNodes] = js.undefined
  }
  
  
  trait ListPortfolioAccessInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
  }
  
  
  trait ListPortfolioAccessOutput extends js.Object {
    /**
         * Information about the AWS accounts with access to the portfolio.
         */
    var AccountIds: js.UndefOr[AccountIds] = js.undefined
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListPortfoliosForProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
  }
  
  
  trait ListPortfoliosForProductOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the portfolios.
         */
    var PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
  }
  
  
  trait ListPortfoliosInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListPortfoliosOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the portfolios.
         */
    var PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
  }
  
  
  trait ListPrincipalsForPortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
  }
  
  
  trait ListPrincipalsForPortfolioOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The IAM principals (users or roles) associated with the portfolio.
         */
    var Principals: js.UndefOr[Principals] = js.undefined
  }
  
  
  trait ListProvisionedProductPlansInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The access level to use to obtain results. The default is User.
         */
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The product identifier.
         */
    var ProvisionProductId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait ListProvisionedProductPlansOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the plans.
         */
    var ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans] = js.undefined
  }
  
  
  trait ListProvisioningArtifactsForServiceActionInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var ServiceActionId: Id
  }
  
  
  trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * An array of objects with information about product views and provisioning artifacts.
         */
    var ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews] = js.undefined
  }
  
  
  trait ListProvisioningArtifactsInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
  }
  
  
  trait ListProvisioningArtifactsOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the provisioning artifacts.
         */
    var ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails] = js.undefined
  }
  
  
  trait ListRecordHistoryInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The access level to use to obtain results. The default is User.
         */
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The search filter to scope the results.
         */
    var SearchFilter: js.UndefOr[ListRecordHistorySearchFilter] = js.undefined
  }
  
  
  trait ListRecordHistoryOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The records, in reverse chronological order.
         */
    var RecordDetails: js.UndefOr[RecordDetails] = js.undefined
  }
  
  
  trait ListRecordHistorySearchFilter extends js.Object {
    /**
         * The filter key.    product - Filter results based on the specified product identifier.    provisionedproduct - Filter results based on the provisioned product identifier.  
         */
    var Key: js.UndefOr[SearchFilterKey] = js.undefined
    /**
         * The filter value.
         */
    var Value: js.UndefOr[SearchFilterValue] = js.undefined
  }
  
  
  trait ListResourcesForTagOptionInput extends js.Object {
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The resource type.    Portfolio     Product   
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
         * The TagOption identifier.
         */
    var TagOptionId: TagOptionId
  }
  
  
  trait ListResourcesForTagOptionOutput extends js.Object {
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the resources.
         */
    var ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined
  }
  
  
  trait ListServiceActionsForProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The product identifier. For example, prod-abcdzk7xy33qa.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
         */
    var ProvisioningArtifactId: Id
  }
  
  
  trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * An object containing information about the self-service actions associated with the provisioning artifact.
         */
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
  }
  
  
  trait ListServiceActionsInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListServiceActionsOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * An object containing information about the service actions associated with the provisioning artifact.
         */
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
  }
  
  
  trait ListTagOptionsFilters extends js.Object {
    /**
         * The active state.
         */
    var Active: js.UndefOr[TagOptionActive] = js.undefined
    /**
         * The TagOption key.
         */
    var Key: js.UndefOr[TagOptionKey] = js.undefined
    /**
         * The TagOption value.
         */
    var Value: js.UndefOr[TagOptionValue] = js.undefined
  }
  
  
  trait ListTagOptionsInput extends js.Object {
    /**
         * The search filters. If no search filters are specified, the output includes all TagOptions.
         */
    var Filters: js.UndefOr[ListTagOptionsFilters] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListTagOptionsOutput extends js.Object {
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the TagOptions.
         */
    var TagOptionDetails: js.UndefOr[TagOptionDetails] = js.undefined
  }
  
  
  trait OrganizationNode extends js.Object {
    /**
         * 
         */
    var Type: js.UndefOr[OrganizationNodeType] = js.undefined
    /**
         * 
         */
    var Value: js.UndefOr[OrganizationNodeValue] = js.undefined
  }
  
  
  trait ParameterConstraints extends js.Object {
    /**
         * The values that the administrator has allowed for the parameter.
         */
    var AllowedValues: js.UndefOr[AllowedValues] = js.undefined
  }
  
  
  trait PortfolioDetail extends js.Object {
    /**
         * The ARN assigned to the portfolio.
         */
    var ARN: js.UndefOr[ResourceARN] = js.undefined
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * The description of the portfolio.
         */
    var Description: js.UndefOr[PortfolioDescription] = js.undefined
    /**
         * The name to use for display purposes.
         */
    var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
    /**
         * The portfolio identifier.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The name of the portfolio provider.
         */
    var ProviderName: js.UndefOr[ProviderName] = js.undefined
  }
  
  
  trait Principal extends js.Object {
    /**
         * The ARN of the principal (IAM user, role, or group).
         */
    var PrincipalARN: js.UndefOr[PrincipalARN] = js.undefined
    /**
         * The principal type. The supported value is IAM.
         */
    var PrincipalType: js.UndefOr[PrincipalType] = js.undefined
  }
  
  
  trait ProductViewAggregationValue extends js.Object {
    /**
         * An approximate count of the products that match the value.
         */
    var ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined
    /**
         * The value of the product view aggregation.
         */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  
  
  trait ProductViewAggregations
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ProductViewAggregationValues]
  
  
  trait ProductViewDetail extends js.Object {
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
         * The ARN of the product.
         */
    var ProductARN: js.UndefOr[ResourceARN] = js.undefined
    /**
         * Summary information about the product view.
         */
    var ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined
    /**
         * The status of the product.    AVAILABLE - The product is ready for use.    CREATING - Product creation has started; the product is not ready for use.    FAILED - An action failed.  
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait ProductViewFilters
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ProductViewFilterValues]
  
  
  trait ProductViewSummary extends js.Object {
    /**
         * The distributor of the product. Contact the product administrator for the significance of this value.
         */
    var Distributor: js.UndefOr[ProductViewDistributor] = js.undefined
    /**
         * Indicates whether the product has a default path. If the product does not have a default path, call ListLaunchPaths to disambiguate between paths. Otherwise, ListLaunchPaths is not required, and the output of ProductViewSummary can be used directly with DescribeProvisioningParameters.
         */
    var HasDefaultPath: js.UndefOr[HasDefaultPath] = js.undefined
    /**
         * The product view identifier.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The name of the product.
         */
    var Name: js.UndefOr[ProductViewName] = js.undefined
    /**
         * The owner of the product. Contact the product administrator for the significance of this value.
         */
    var Owner: js.UndefOr[ProductViewOwner] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * Short description of the product.
         */
    var ShortDescription: js.UndefOr[ProductViewShortDescription] = js.undefined
    /**
         * The description of the support for this Product.
         */
    var SupportDescription: js.UndefOr[SupportDescription] = js.undefined
    /**
         * The email contact information to obtain support for this Product.
         */
    var SupportEmail: js.UndefOr[SupportEmail] = js.undefined
    /**
         * The URL information to obtain support for this Product.
         */
    var SupportUrl: js.UndefOr[SupportUrl] = js.undefined
    /**
         * The product type. Contact the product administrator for the significance of this value. If this value is MARKETPLACE, the product was created by AWS Marketplace.
         */
    var Type: js.UndefOr[ProductType] = js.undefined
  }
  
  
  trait ProvisionProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
         */
    var NotificationArns: js.UndefOr[NotificationArns] = js.undefined
    /**
         * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
         */
    var PathId: js.UndefOr[Id] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * An idempotency token that uniquely identifies the provisioning request.
         */
    var ProvisionToken: IdempotencyToken
    /**
         * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
         */
    var ProvisionedProductName: ProvisionedProductName
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: Id
    /**
         * Parameters specified by the administrator that are required for provisioning the product.
         */
    var ProvisioningParameters: js.UndefOr[ProvisioningParameters] = js.undefined
    /**
         * An object that contains information about the provisioning preferences for a stack set.
         */
    var ProvisioningPreferences: js.UndefOr[ProvisioningPreferences] = js.undefined
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait ProvisionProductOutput extends js.Object {
    /**
         * Information about the result of provisioning the product.
         */
    var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
  }
  
  
  trait ProvisionedProductAttribute extends js.Object {
    /**
         * The ARN of the provisioned product.
         */
    var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
         * The identifier of the provisioned product.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
         * The record identifier of the last request performed on this provisioned product.
         */
    var LastRecordId: js.UndefOr[Id] = js.undefined
    /**
         * The user-friendly name of the provisioned product.
         */
    var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    /**
         * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
         */
    var PhysicalId: js.UndefOr[PhysicalId] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    /**
         * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state, operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred, the provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.  
         */
    var Status: js.UndefOr[ProvisionedProductStatus] = js.undefined
    /**
         * The current status message of the provisioned product.
         */
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
         * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
         */
    var Type: js.UndefOr[ProvisionedProductType] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM user.
         */
    var UserArn: js.UndefOr[UserArn] = js.undefined
    /**
         * The ARN of the IAM user in the session. This ARN might contain a session ID.
         */
    var UserArnSession: js.UndefOr[UserArnSession] = js.undefined
  }
  
  
  trait ProvisionedProductDetail extends js.Object {
    /**
         * The ARN of the provisioned product.
         */
    var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
         * The identifier of the provisioned product.
         */
    var Id: js.UndefOr[ProvisionedProductId] = js.undefined
    /**
         * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
         */
    var IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
         * The record identifier of the last request performed on this provisioned product.
         */
    var LastRecordId: js.UndefOr[LastRequestId] = js.undefined
    /**
         * The user-friendly name of the provisioned product.
         */
    var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    /**
         * The product identifier. For example, prod-abcdzk7xy33qa.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    /**
         * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state, operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred, the provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.  
         */
    var Status: js.UndefOr[ProvisionedProductStatus] = js.undefined
    /**
         * The current status message of the provisioned product.
         */
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined
    /**
         * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
         */
    var Type: js.UndefOr[ProvisionedProductType] = js.undefined
  }
  
  
  trait ProvisionedProductFilters
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ProvisionedProductViewFilterValues]
  
  
  trait ProvisionedProductPlanDetails extends js.Object {
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
         * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
         */
    var NotificationArns: js.UndefOr[NotificationArns] = js.undefined
    /**
         * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
         */
    var PathId: js.UndefOr[Id] = js.undefined
    /**
         * The plan identifier.
         */
    var PlanId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the plan.
         */
    var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
    /**
         * The plan type.
         */
    var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * The product identifier.
         */
    var ProvisionProductId: js.UndefOr[Id] = js.undefined
    /**
         * The user-friendly name of the provisioned product.
         */
    var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    /**
         * Parameters specified by the administrator that are required for provisioning the product.
         */
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
    /**
         * The status.
         */
    var Status: js.UndefOr[ProvisionedProductPlanStatus] = js.undefined
    /**
         * The status message.
         */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
         * The time when the plan was last updated.
         */
    var UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
  }
  
  
  trait ProvisionedProductPlanSummary extends js.Object {
    /**
         * The plan identifier.
         */
    var PlanId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the plan.
         */
    var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
    /**
         * The plan type.
         */
    var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined
    /**
         * The product identifier.
         */
    var ProvisionProductId: js.UndefOr[Id] = js.undefined
    /**
         * The user-friendly name of the provisioned product.
         */
    var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  }
  
  
  trait ProvisioningArtifact extends js.Object {
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined
    /**
         * The description of the provisioning artifact.
         */
    var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The name of the provisioning artifact.
         */
    var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  }
  
  
  trait ProvisioningArtifactDetail extends js.Object {
    /**
         * Indicates whether the product version is active.
         */
    var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreationTime] = js.undefined
    /**
         * The description of the provisioning artifact.
         */
    var Description: js.UndefOr[ProvisioningArtifactName] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The name of the provisioning artifact.
         */
    var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    /**
         * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
         */
    var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
  }
  
  
  trait ProvisioningArtifactInfo
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ProvisioningArtifactInfoValue]
  
  
  trait ProvisioningArtifactParameter extends js.Object {
    /**
         * The default value.
         */
    var DefaultValue: js.UndefOr[DefaultValue] = js.undefined
    /**
         * The description of the parameter.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This parameter is used to hide sensitive information.
         */
    var IsNoEcho: js.UndefOr[NoEcho] = js.undefined
    /**
         * Constraints that the administrator has put on a parameter.
         */
    var ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined
    /**
         * The parameter key.
         */
    var ParameterKey: js.UndefOr[ParameterKey] = js.undefined
    /**
         * The parameter type.
         */
    var ParameterType: js.UndefOr[ParameterType] = js.undefined
  }
  
  
  trait ProvisioningArtifactPreferences extends js.Object {
    /**
         * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in ProvisioningPreferences$StackSetAccounts and UpdateProvisioningPreferences$StackSetAccounts. Applicable only to a CFN_STACKSET provisioned product type.
         */
    var StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined
    /**
         * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in ProvisioningPreferences$StackSetRegions and UpdateProvisioningPreferences$StackSetRegions. Applicable only to a CFN_STACKSET provisioned product type.
         */
    var StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
  }
  
  
  trait ProvisioningArtifactProperties extends js.Object {
    /**
         * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
         */
    var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
    /**
         * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:  "LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..." 
         */
    var Info: ProvisioningArtifactInfo
    /**
         * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
         */
    var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    /**
         * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
         */
    var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
  }
  
  
  trait ProvisioningArtifactSummary extends js.Object {
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined
    /**
         * The description of the provisioning artifact.
         */
    var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The name of the provisioning artifact.
         */
    var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    /**
         * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
         */
    var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
  }
  
  
  trait ProvisioningArtifactView extends js.Object {
    /**
         * Summary information about a product view.
         */
    var ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined
    /**
         * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
         */
    var ProvisioningArtifact: js.UndefOr[ProvisioningArtifact] = js.undefined
  }
  
  
  trait ProvisioningParameter extends js.Object {
    /**
         * The parameter key.
         */
    var Key: js.UndefOr[ParameterKey] = js.undefined
    /**
         * The parameter value.
         */
    var Value: js.UndefOr[ParameterValue] = js.undefined
  }
  
  
  trait ProvisioningPreferences extends js.Object {
    /**
         * One or more AWS accounts that will have access to the provisioned product. Applicable only to a CFN_STACKSET provisioned product type. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all accounts from the STACKSET constraint.
         */
    var StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined
    /**
         * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both. The default value is 0 if no value is specified.
         */
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined
    /**
         * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both.
         */
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined
    /**
         * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of StackSetFailureToleranceCount. StackSetMaxConcurrentCount is at most one more than the StackSetFailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
         */
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined
    /**
         * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
         */
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined
    /**
         * One or more AWS Regions where the provisioned product will be available. Applicable only to a CFN_STACKSET provisioned product type. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all regions from the STACKSET constraint.
         */
    var StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
  }
  
  
  trait RecordDetail extends js.Object {
    /**
         * The UTC time stamp of the creation time.
         */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
         * The path identifier.
         */
    var PathId: js.UndefOr[Id] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * The identifier of the provisioned product.
         */
    var ProvisionedProductId: js.UndefOr[Id] = js.undefined
    /**
         * The user-friendly name of the provisioned product.
         */
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined
    /**
         * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
         */
    var ProvisionedProductType: js.UndefOr[ProvisionedProductType] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    /**
         * The errors that occurred.
         */
    var RecordErrors: js.UndefOr[RecordErrors] = js.undefined
    /**
         * The identifier of the record.
         */
    var RecordId: js.UndefOr[Id] = js.undefined
    /**
         * One or more tags.
         */
    var RecordTags: js.UndefOr[RecordTags] = js.undefined
    /**
         * The record type.    PROVISION_PRODUCT     UPDATE_PROVISIONED_PRODUCT     TERMINATE_PROVISIONED_PRODUCT   
         */
    var RecordType: js.UndefOr[RecordType] = js.undefined
    /**
         * The status of the provisioned product.    CREATED - The request was created but the operation has not started.    IN_PROGRESS - The requested operation is in progress.    IN_PROGRESS_IN_ERROR - The provisioned product is under change but the requested operation failed and some remediation is occurring. For example, a rollback.    SUCCEEDED - The requested operation has successfully completed.    FAILED - The requested operation has unsuccessfully completed. Investigate using the error messages returned.  
         */
    var Status: js.UndefOr[RecordStatus] = js.undefined
    /**
         * The time when the record was last updated.
         */
    var UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
  }
  
  
  trait RecordError extends js.Object {
    /**
         * The numeric value of the error.
         */
    var Code: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The description of the error.
         */
    var Description: js.UndefOr[ErrorDescription] = js.undefined
  }
  
  
  trait RecordOutput extends js.Object {
    /**
         * The description of the output.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The output key.
         */
    var OutputKey: js.UndefOr[OutputKey] = js.undefined
    /**
         * The output value.
         */
    var OutputValue: js.UndefOr[OutputValue] = js.undefined
  }
  
  
  trait RecordTag extends js.Object {
    /**
         * The key for this tag.
         */
    var Key: js.UndefOr[RecordTagKey] = js.undefined
    /**
         * The value for this tag.
         */
    var Value: js.UndefOr[RecordTagValue] = js.undefined
  }
  
  
  trait RejectPortfolioShareInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: Id
    /**
         * The type of shared portfolios to reject. The default is to reject imported portfolios.    AWS_ORGANIZATIONS - Reject portfolios shared by the master account of your organization.    IMPORTED - Reject imported portfolios.    AWS_SERVICECATALOG - Not supported. (Throws ResourceNotFoundException.)   For example, aws servicecatalog reject-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS 
         */
    var PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
  }
  
  
  trait RejectPortfolioShareOutput extends js.Object
  
  
  trait ResourceChange extends js.Object {
    /**
         * The change action.
         */
    var Action: js.UndefOr[ChangeAction] = js.undefined
    /**
         * Information about the resource changes.
         */
    var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
    /**
         * The ID of the resource, as defined in the CloudFormation template.
         */
    var LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    /**
         * The ID of the resource, if it was already created.
         */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
         * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
         */
    var Replacement: js.UndefOr[Replacement] = js.undefined
    /**
         * The type of resource.
         */
    var ResourceType: js.UndefOr[PlanResourceType] = js.undefined
    /**
         * The change scope.
         */
    var Scope: js.UndefOr[Scope] = js.undefined
  }
  
  
  trait ResourceChangeDetail extends js.Object {
    /**
         * The ID of the entity that caused the change.
         */
    var CausingEntity: js.UndefOr[CausingEntity] = js.undefined
    /**
         * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic evaluations, the value might change, and any new value will be determined when the plan is updated.
         */
    var Evaluation: js.UndefOr[EvaluationType] = js.undefined
    /**
         * Information about the resource attribute to be modified.
         */
    var Target: js.UndefOr[ResourceTargetDefinition] = js.undefined
  }
  
  
  trait ResourceDetail extends js.Object {
    /**
         * The ARN of the resource.
         */
    var ARN: js.UndefOr[ResourceDetailARN] = js.undefined
    /**
         * The creation time of the resource.
         */
    var CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.undefined
    /**
         * The description of the resource.
         */
    var Description: js.UndefOr[ResourceDetailDescription] = js.undefined
    /**
         * The identifier of the resource.
         */
    var Id: js.UndefOr[ResourceDetailId] = js.undefined
    /**
         * The name of the resource.
         */
    var Name: js.UndefOr[ResourceDetailName] = js.undefined
  }
  
  
  trait ResourceTargetDefinition extends js.Object {
    /**
         * The attribute to be changed.
         */
    var Attribute: js.UndefOr[ResourceAttribute] = js.undefined
    /**
         * If the attribute is Properties, the value is the name of the property. Otherwise, the value is null.
         */
    var Name: js.UndefOr[PropertyName] = js.undefined
    /**
         * If the attribute is Properties, indicates whether a change to this property causes the resource to be re-created.
         */
    var RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined
  }
  
  
  trait ScanProvisionedProductsInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The access level to use to obtain results. The default is User.
         */
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ScanProvisionedProductsOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the provisioned products.
         */
    var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.undefined
  }
  
  
  trait SearchProductsAsAdminInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The search filters. If no search filters are specified, the output includes all products to which the administrator has access.
         */
    var Filters: js.UndefOr[ProductViewFilters] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The portfolio identifier.
         */
    var PortfolioId: js.UndefOr[Id] = js.undefined
    /**
         * Access level of the source of the product.
         */
    var ProductSource: js.UndefOr[ProductSource] = js.undefined
    /**
         * The sort field. If no value is specified, the results are not sorted.
         */
    var SortBy: js.UndefOr[ProductViewSortBy] = js.undefined
    /**
         * The sort order. If no value is specified, the results are not sorted.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait SearchProductsAsAdminOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the product views.
         */
    var ProductViewDetails: js.UndefOr[ProductViewDetails] = js.undefined
  }
  
  
  trait SearchProductsInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The search filters. If no search filters are specified, the output includes all products to which the caller has access.
         */
    var Filters: js.UndefOr[ProductViewFilters] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The sort field. If no value is specified, the results are not sorted.
         */
    var SortBy: js.UndefOr[ProductViewSortBy] = js.undefined
    /**
         * The sort order. If no value is specified, the results are not sorted.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait SearchProductsOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The product view aggregations.
         */
    var ProductViewAggregations: js.UndefOr[ProductViewAggregations] = js.undefined
    /**
         * Information about the product views.
         */
    var ProductViewSummaries: js.UndefOr[ProductViewSummaries] = js.undefined
  }
  
  
  trait SearchProvisionedProductsInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The access level to use to obtain results. The default is User.
         */
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined
    /**
         * The search filters. When the key is SearchQuery, the searchable fields are arn, createdTime, id, lastRecordId, idempotencyToken, name, physicalId, productId, provisioningArtifact, type, status, tags, userArn, and userArnSession. Example: "SearchQuery":["status:AVAILABLE"] 
         */
    var Filters: js.UndefOr[ProvisionedProductFilters] = js.undefined
    /**
         * The maximum number of items to return with this call.
         */
    var PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.undefined
    /**
         * The page token for the next set of results. To retrieve the first set of results, use null.
         */
    var PageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The sort field. If no value is specified, the results are not sorted. The valid values are arn, id, name, and lastRecordId.
         */
    var SortBy: js.UndefOr[SortField] = js.undefined
    /**
         * The sort order. If no value is specified, the results are not sorted.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait SearchProvisionedProductsOutput extends js.Object {
    /**
         * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
         */
    var NextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Information about the provisioned products.
         */
    var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.undefined
    /**
         * The number of provisioned products found.
         */
    var TotalResultsCount: js.UndefOr[TotalResultsCount] = js.undefined
  }
  
  
  trait ServiceActionAssociation extends js.Object {
    /**
         * The product identifier. For example, prod-abcdzk7xy33qa.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
         */
    var ProvisioningArtifactId: Id
    /**
         * The self-service action identifier. For example, act-fs7abcd89wxyz.
         */
    var ServiceActionId: Id
  }
  
  
  trait ServiceActionDefinitionMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ServiceActionDefinitionValue]
  
  
  trait ServiceActionDetail extends js.Object {
    /**
         * A map that defines the self-service action.
         */
    var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined
    /**
         * Summary information about the self-service action.
         */
    var ServiceActionSummary: js.UndefOr[ServiceActionSummary] = js.undefined
  }
  
  
  trait ServiceActionSummary extends js.Object {
    /**
         * The self-service action definition type. For example, SSM_AUTOMATION.
         */
    var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.undefined
    /**
         * The self-service action description.
         */
    var Description: js.UndefOr[ServiceActionDescription] = js.undefined
    /**
         * The self-service action identifier.
         */
    var Id: js.UndefOr[Id] = js.undefined
    /**
         * The self-service action name.
         */
    var Name: js.UndefOr[ServiceActionName] = js.undefined
  }
  
  
  trait ShareDetails extends js.Object {
    /**
         * List of errors.
         */
    var ShareErrors: js.UndefOr[ShareErrors] = js.undefined
    /**
         * List of accounts for whom the operation succeeded.
         */
    var SuccessfulShares: js.UndefOr[SuccessfulShares] = js.undefined
  }
  
  
  trait ShareError extends js.Object {
    /**
         * List of accounts impacted by the error.
         */
    var Accounts: js.UndefOr[Namespaces] = js.undefined
    /**
         * Error type that happened when processing the operation.
         */
    var Error: js.UndefOr[Error] = js.undefined
    /**
         * Information about the error.
         */
    var Message: js.UndefOr[Message] = js.undefined
  }
  
  
  trait SourceProvisioningArtifactPropertiesMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ProvisioningArtifactPropertyValue]
  
  
  trait Tag extends js.Object {
    /**
         * The tag key.
         */
    var Key: TagKey
    /**
         * The value for this key.
         */
    var Value: TagValue
  }
  
  
  trait TagOptionDetail extends js.Object {
    /**
         * The TagOption active state.
         */
    var Active: js.UndefOr[TagOptionActive] = js.undefined
    /**
         * The TagOption identifier.
         */
    var Id: js.UndefOr[TagOptionId] = js.undefined
    /**
         * The TagOption key.
         */
    var Key: js.UndefOr[TagOptionKey] = js.undefined
    /**
         * The TagOption value.
         */
    var Value: js.UndefOr[TagOptionValue] = js.undefined
  }
  
  
  trait TagOptionSummary extends js.Object {
    /**
         * The TagOption key.
         */
    var Key: js.UndefOr[TagOptionKey] = js.undefined
    /**
         * The TagOption value.
         */
    var Values: js.UndefOr[TagOptionValues] = js.undefined
  }
  
  
  trait TerminateProvisionedProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
         */
    var IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined
    /**
         * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
         */
    var ProvisionedProductId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
         */
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    /**
         * An idempotency token that uniquely identifies the termination request. This token is only valid during the termination process. After the provisioned product is terminated, subsequent requests to terminate the same provisioned product always return ResourceNotFound.
         */
    var TerminateToken: IdempotencyToken
  }
  
  
  trait TerminateProvisionedProductOutput extends js.Object {
    /**
         * Information about the result of this request.
         */
    var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Accepts an offer to share the specified portfolio.
       */
    def acceptPortfolioShare(): awsDashSdkLib.libRequestMod.Request[AcceptPortfolioShareOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts an offer to share the specified portfolio.
       */
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
    /**
       * Accepts an offer to share the specified portfolio.
       */
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
    /**
       * Associates the specified principal ARN with the specified portfolio.
       */
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
    /**
       * Associates the specified principal ARN with the specified portfolio.
       */
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
    /**
       * Associates the specified product with the specified portfolio.
       */
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
    /**
       * Associates the specified product with the specified portfolio.
       */
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
    /**
       * Associates a self-service action with a provisioning artifact.
       */
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
    /**
       * Associates a self-service action with a provisioning artifact.
       */
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
    /**
       * Associate the specified TagOption with the specified portfolio or product.
       */
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
    /**
       * Associate the specified TagOption with the specified portfolio or product.
       */
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
    /**
       * Associates multiple self-service actions with provisioning artifacts.
       */
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
    /**
       * Associates multiple self-service actions with provisioning artifacts.
       */
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
    /**
       * Disassociates a batch of self-service actions from the specified provisioning artifact.
       */
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
    /**
       * Disassociates a batch of self-service actions from the specified provisioning artifact.
       */
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
    /**
       * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
       */
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
    /**
       * Copies the specified source product to the specified target product or a new product. You can copy a product to the same account or another account. You can copy a product to the same region or another region. This operation is performed asynchronously. To track the progress of the operation, use DescribeCopyProductStatus.
       */
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
    /**
       * Creates a constraint.
       */
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
    /**
       * Creates a constraint.
       */
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
    /**
       * Creates a portfolio.
       */
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
    /**
       * Creates a portfolio.
       */
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
    /**
       * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
       */
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
    /**
       * Shares the specified portfolio with the specified account or organization node. Shares to an organization node can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
       */
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
    /**
       * Creates a product.
       */
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
    /**
       * Creates a product.
       */
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
    /**
       * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
       */
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
    /**
       * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified (when updating a provisioned product) when the plan is executed. You can create one plan per provisioned product. To create a plan for an existing provisioned product, the product status must be AVAILBLE or TAINTED. To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify the provisioned product, use ExecuteProvisionedProductPlan.
       */
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
    /**
       * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
       */
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
    /**
       * Creates a provisioning artifact (also known as a version) for the specified product. You cannot create a provisioning artifact for a product that was shared with you.
       */
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
    /**
       * Creates a self-service action.
       */
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
    /**
       * Creates a self-service action.
       */
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
    /**
       * Creates a TagOption.
       */
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
    /**
       * Creates a TagOption.
       */
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
    /**
       * Deletes the specified constraint.
       */
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
    /**
       * Deletes the specified constraint.
       */
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
    /**
       * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
       */
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
    /**
       * Deletes the specified portfolio. You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or shared accounts.
       */
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
    /**
       * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
       */
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
    /**
       * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization node can only be deleted by the master account of an Organization.
       */
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
    /**
       * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
       */
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
    /**
       * Deletes the specified product. You cannot delete a product if it was shared with you or is associated with a portfolio.
       */
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
    /**
       * Deletes the specified plan.
       */
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
    /**
       * Deletes the specified plan.
       */
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
    /**
       * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
       */
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
    /**
       * Deletes the specified provisioning artifact (also known as a version) for the specified product. You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
       */
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
    /**
       * Deletes a self-service action.
       */
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
    /**
       * Deletes a self-service action.
       */
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
    /**
       * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
       */
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
    /**
       * Deletes the specified TagOption. You cannot delete a TagOption if it is associated with a product or portfolio.
       */
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
    /**
       * Gets information about the specified constraint.
       */
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
    /**
       * Gets information about the specified constraint.
       */
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
    /**
       * Gets the status of the specified copy product operation.
       */
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
    /**
       * Gets the status of the specified copy product operation.
       */
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
    /**
       * Gets information about the specified portfolio.
       */
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
    /**
       * Gets information about the specified portfolio.
       */
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
    /**
       * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
       */
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
    /**
       * Gets the status of the specified portfolio share operation. This API can only be called by the master account in the organization.
       */
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
    /**
       * Gets information about the specified product.
       */
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
    /**
       * Gets information about the specified product.
       */
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
    /**
       * Gets information about the specified product. This operation is run with administrator access.
       */
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
    /**
       * Gets information about the specified product. This operation is run with administrator access.
       */
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
    /**
       * Gets information about the specified product.
       */
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
    /**
       * Gets information about the specified product.
       */
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
    /**
       * Gets information about the specified provisioned product.
       */
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
    /**
       * Gets information about the specified provisioned product.
       */
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
    /**
       * Gets information about the resource changes for the specified plan.
       */
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
    /**
       * Gets information about the resource changes for the specified plan.
       */
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
    /**
       * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
       */
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
    /**
       * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
       */
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
    /**
       * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
       */
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
    /**
       * Gets information about the configuration required to provision the specified product using the specified provisioning artifact. If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key. The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value". Tag the provisioned product with the value sc-tagoption-conflict-portfolioId-productId.
       */
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
    /**
       * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
       */
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
    /**
       * Gets information about the specified request operation. Use this operation after calling a request operation (for example, ProvisionProduct, TerminateProvisionedProduct, or UpdateProvisionedProduct). 
       */
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
    /**
       * Describes a self-service action.
       */
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
    /**
       * Describes a self-service action.
       */
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
    /**
       * Gets information about the specified TagOption.
       */
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
    /**
       * Gets information about the specified TagOption.
       */
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
    /**
       * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
       */
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
    /**
       * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but it will prevent you from creating new shares throughout your organization. Current shares will not be in sync with your organization structure if it changes after calling this API. This API can only be called by the master account in the organization.
       */
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
    /**
       * Disassociates a previously associated principal ARN from a specified portfolio.
       */
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
    /**
       * Disassociates a previously associated principal ARN from a specified portfolio.
       */
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
    /**
       * Disassociates the specified product from the specified portfolio. 
       */
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
    /**
       * Disassociates the specified product from the specified portfolio. 
       */
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
    /**
       * Disassociates the specified self-service action association from the specified provisioning artifact.
       */
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
    /**
       * Disassociates the specified self-service action association from the specified provisioning artifact.
       */
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
    /**
       * Disassociates the specified TagOption from the specified resource.
       */
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
    /**
       * Disassociates the specified TagOption from the specified resource.
       */
    def disassociateTagOptionFromResource(
      params: DisassociateTagOptionFromResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateTagOptionFromResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateTagOptionFromResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will use FAS credentials to call organizations:EnableAWSServiceAccess so that your shares can be in sync with any changes in your AWS Organizations.
       */
    def enableAWSOrganizationsAccess(): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will use FAS credentials to call organizations:EnableAWSServiceAccess so that your shares can be in sync with any changes in your AWS Organizations.
       */
    def enableAWSOrganizationsAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableAWSOrganizationsAccessOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will use FAS credentials to call organizations:EnableAWSServiceAccess so that your shares can be in sync with any changes in your AWS Organizations.
       */
    def enableAWSOrganizationsAccess(params: EnableAWSOrganizationsAccessInput): awsDashSdkLib.libRequestMod.Request[EnableAWSOrganizationsAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This API can only be called by the master account in the organization. By calling this API Service Catalog will use FAS credentials to call organizations:EnableAWSServiceAccess so that your shares can be in sync with any changes in your AWS Organizations.
       */
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
    /**
       * Provisions or modifies a product based on the resource changes for the specified plan.
       */
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
    /**
       * Provisions or modifies a product based on the resource changes for the specified plan.
       */
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
    /**
       * Executes a self-service action against a provisioned product.
       */
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
    /**
       * Executes a self-service action against a provisioned product.
       */
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
    /**
       * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
       */
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
    /**
       * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master account in the organization.
       */
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
    /**
       * Lists all portfolios for which sharing was accepted by this account.
       */
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
    /**
       * Lists all portfolios for which sharing was accepted by this account.
       */
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
    /**
       * Lists the constraints for the specified portfolio and product.
       */
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
    /**
       * Lists the constraints for the specified portfolio and product.
       */
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
    /**
       * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
       */
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
    /**
       * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
       */
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
    /**
       * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
       */
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
    /**
       * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the master account in the organization.
       */
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
    /**
       * Lists the account IDs that have access to the specified portfolio.
       */
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
    /**
       * Lists the account IDs that have access to the specified portfolio.
       */
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
    /**
       * Lists all portfolios in the catalog.
       */
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
    /**
       * Lists all portfolios in the catalog.
       */
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
    /**
       * Lists all portfolios that the specified product is associated with.
       */
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
    /**
       * Lists all portfolios that the specified product is associated with.
       */
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
    /**
       * Lists all principal ARNs associated with the specified portfolio.
       */
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
    /**
       * Lists all principal ARNs associated with the specified portfolio.
       */
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
    /**
       * Lists the plans for the specified provisioned product or all plans to which the user has access.
       */
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
    /**
       * Lists the plans for the specified provisioned product or all plans to which the user has access.
       */
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
    /**
       * Lists all provisioning artifacts (also known as versions) for the specified product.
       */
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
    /**
       * Lists all provisioning artifacts (also known as versions) for the specified product.
       */
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
    /**
       * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
       */
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
    /**
       * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
       */
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
    /**
       * Lists the specified requests or all performed requests.
       */
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
    /**
       * Lists the specified requests or all performed requests.
       */
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
    /**
       * Lists the resources associated with the specified TagOption.
       */
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
    /**
       * Lists the resources associated with the specified TagOption.
       */
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
    /**
       * Lists all self-service actions.
       */
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
    /**
       * Lists all self-service actions.
       */
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
    /**
       * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
       */
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
    /**
       * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning Artifact ID.
       */
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
    /**
       * Lists the specified TagOptions or all TagOptions.
       */
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
    /**
       * Lists the specified TagOptions or all TagOptions.
       */
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
    /**
       * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
       */
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
    /**
       * Provisions the specified product. A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of this request using DescribeRecord. If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed: Missing required parameter in Tags[N]:Value".
       */
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
    /**
       * Rejects an offer to share the specified portfolio.
       */
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
    /**
       * Rejects an offer to share the specified portfolio.
       */
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
    /**
       * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
       */
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
    /**
       * Lists the provisioned products that are available (not terminated). To use additional filtering, see SearchProvisionedProducts.
       */
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
    /**
       * Gets information about the products to which the caller has access.
       */
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
    /**
       * Gets information about the products to which the caller has access.
       */
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
    /**
       * Gets information about the products for the specified portfolio or all products.
       */
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
    /**
       * Gets information about the products for the specified portfolio or all products.
       */
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
    /**
       * Gets information about the provisioned products that meet the specified criteria.
       */
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
    /**
       * Gets information about the provisioned products that meet the specified criteria.
       */
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
    /**
       * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
       */
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
    /**
       * Terminates the specified provisioned product. This operation does not delete any records associated with the provisioned product. You can check the status of this request using DescribeRecord.
       */
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
    /**
       * Updates the specified constraint.
       */
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
    /**
       * Updates the specified constraint.
       */
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
    /**
       * Updates the specified portfolio. You cannot update a product that was shared with you.
       */
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
    /**
       * Updates the specified portfolio. You cannot update a product that was shared with you.
       */
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
    /**
       * Updates the specified product.
       */
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
    /**
       * Updates the specified product.
       */
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
    /**
       * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
       */
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
    /**
       * Requests updates to the configuration of the specified provisioned product. If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates requested, this operation can update with no interruption, with some interruption, or replace the provisioned product entirely. You can check the status of this request using DescribeRecord.
       */
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
    /**
       * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
       */
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
    /**
       * Updates the specified provisioning artifact (also known as a version) for the specified product. You cannot update a provisioning artifact for a product that was shared with you.
       */
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
    /**
       * Updates a self-service action.
       */
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
    /**
       * Updates a self-service action.
       */
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
    /**
       * Updates the specified TagOption.
       */
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
    /**
       * Updates the specified TagOption.
       */
    def updateTagOption(
      params: UpdateTagOptionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTagOptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTagOptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateConstraintInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The updated description of the constraint.
         */
    var Description: js.UndefOr[ConstraintDescription] = js.undefined
    /**
         * The identifier of the constraint.
         */
    var Id: Id
  }
  
  
  trait UpdateConstraintOutput extends js.Object {
    /**
         * Information about the constraint.
         */
    var ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined
    /**
         * The constraint parameters.
         */
    var ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined
    /**
         * The status of the current request.
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait UpdatePortfolioInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The tags to add.
         */
    var AddTags: js.UndefOr[AddTags] = js.undefined
    /**
         * The updated description of the portfolio.
         */
    var Description: js.UndefOr[PortfolioDescription] = js.undefined
    /**
         * The name to use for display purposes.
         */
    var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
    /**
         * The portfolio identifier.
         */
    var Id: Id
    /**
         * The updated name of the portfolio provider.
         */
    var ProviderName: js.UndefOr[ProviderName] = js.undefined
    /**
         * The tags to remove.
         */
    var RemoveTags: js.UndefOr[TagKeys] = js.undefined
  }
  
  
  trait UpdatePortfolioOutput extends js.Object {
    /**
         * Information about the portfolio.
         */
    var PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined
    /**
         * Information about the tags associated with the portfolio.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait UpdateProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The tags to add to the product.
         */
    var AddTags: js.UndefOr[AddTags] = js.undefined
    /**
         * The updated description of the product.
         */
    var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
    /**
         * The updated distributor of the product.
         */
    var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
    /**
         * The product identifier.
         */
    var Id: Id
    /**
         * The updated product name.
         */
    var Name: js.UndefOr[ProductViewName] = js.undefined
    /**
         * The updated owner of the product.
         */
    var Owner: js.UndefOr[ProductViewOwner] = js.undefined
    /**
         * The tags to remove from the product.
         */
    var RemoveTags: js.UndefOr[TagKeys] = js.undefined
    /**
         * The updated support description for the product.
         */
    var SupportDescription: js.UndefOr[SupportDescription] = js.undefined
    /**
         * The updated support email for the product.
         */
    var SupportEmail: js.UndefOr[SupportEmail] = js.undefined
    /**
         * The updated support URL for the product.
         */
    var SupportUrl: js.UndefOr[SupportUrl] = js.undefined
  }
  
  
  trait UpdateProductOutput extends js.Object {
    /**
         * Information about the product view.
         */
    var ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined
    /**
         * Information about the tags associated with the product.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait UpdateProvisionedProductInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * The new path identifier. This value is optional if the product has a default path, and required if the product has more than one path.
         */
    var PathId: js.UndefOr[Id] = js.undefined
    /**
         * The identifier of the product.
         */
    var ProductId: js.UndefOr[Id] = js.undefined
    /**
         * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
         */
    var ProvisionedProductId: js.UndefOr[Id] = js.undefined
    /**
         * The updated name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
         */
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    /**
         * The new parameters.
         */
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
    /**
         * An object that contains information about the provisioning preferences for a stack set.
         */
    var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.undefined
    /**
         * The idempotency token that uniquely identifies the provisioning update request.
         */
    var UpdateToken: IdempotencyToken
  }
  
  
  trait UpdateProvisionedProductOutput extends js.Object {
    /**
         * Information about the result of the request.
         */
    var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
  }
  
  
  trait UpdateProvisioningArtifactInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * Indicates whether the product version is active.
         */
    var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
    /**
         * The updated description of the provisioning artifact.
         */
    var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
    /**
         * The updated name of the provisioning artifact.
         */
    var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    /**
         * The product identifier.
         */
    var ProductId: Id
    /**
         * The identifier of the provisioning artifact.
         */
    var ProvisioningArtifactId: Id
  }
  
  
  trait UpdateProvisioningArtifactOutput extends js.Object {
    /**
         * The URL of the CloudFormation template in Amazon S3.
         */
    var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
    /**
         * Information about the provisioning artifact.
         */
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined
    /**
         * The status of the current request.
         */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  
  trait UpdateProvisioningParameter extends js.Object {
    /**
         * The parameter key.
         */
    var Key: js.UndefOr[ParameterKey] = js.undefined
    /**
         * If set to true, Value is ignored and the previous parameter value is kept.
         */
    var UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined
    /**
         * The parameter value.
         */
    var Value: js.UndefOr[ParameterValue] = js.undefined
  }
  
  
  trait UpdateProvisioningPreferences extends js.Object {
    /**
         * One or more AWS accounts that will have access to the provisioned product. Applicable only to a CFN_STACKSET provisioned product type. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all accounts from the STACKSET constraint.
         */
    var StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined
    /**
         * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both. The default value is 0 if no value is specified.
         */
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined
    /**
         * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both.
         */
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined
    /**
         * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of StackSetFailureToleranceCount. StackSetMaxConcurrentCount is at most one more than the StackSetFailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
         */
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined
    /**
         * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
         */
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined
    /**
         * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the provisioned product. The default value is UPDATE if nothing is specified. Applicable only to a CFN_STACKSET provisioned product type.  CREATE  Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed, they will be ignored.  UPDATE  Updates the stack set represented by the provisioned product and also its stack instances.  DELETE  Deletes a stack instance in the stack set represented by the provisioned product.  
         */
    var StackSetOperationType: js.UndefOr[StackSetOperationType] = js.undefined
    /**
         * One or more AWS Regions where the provisioned product will be available. Applicable only to a CFN_STACKSET provisioned product type. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all regions from the STACKSET constraint.
         */
    var StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
  }
  
  
  trait UpdateServiceActionInput extends js.Object {
    /**
         * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
         */
    var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    /**
         * A map that defines the self-service action.
         */
    var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined
    /**
         * The self-service action description.
         */
    var Description: js.UndefOr[ServiceActionDescription] = js.undefined
    /**
         * The self-service action identifier.
         */
    var Id: Id
    /**
         * The self-service action name.
         */
    var Name: js.UndefOr[ServiceActionName] = js.undefined
  }
  
  
  trait UpdateServiceActionOutput extends js.Object {
    /**
         * Detailed information about the self-service action.
         */
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
  }
  
  
  trait UpdateTagOptionInput extends js.Object {
    /**
         * The updated active state.
         */
    var Active: js.UndefOr[TagOptionActive] = js.undefined
    /**
         * The TagOption identifier.
         */
    var Id: TagOptionId
    /**
         * The updated value.
         */
    var Value: js.UndefOr[TagOptionValue] = js.undefined
  }
  
  
  trait UpdateTagOptionOutput extends js.Object {
    /**
         * Information about the TagOption.
         */
    var TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
  }
  
  
  trait UsageInstruction extends js.Object {
    /**
         * The usage instruction type for the value.
         */
    var Type: js.UndefOr[InstructionType] = js.undefined
    /**
         * The usage instruction value for this type.
         */
    var Value: js.UndefOr[InstructionValue] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AcceptLanguage = java.lang.String
  type AccessLevelFilterKey = awsDashSdkLib.awsDashSdkLibStrings.Account | awsDashSdkLib.awsDashSdkLibStrings.Role | awsDashSdkLib.awsDashSdkLibStrings.User | java.lang.String
  type AccessLevelFilterValue = java.lang.String
  type AccessStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.UNDER_CHANGE | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type AccountId = java.lang.String
  type AccountIds = js.Array[AccountId]
  type AddTags = js.Array[Tag]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[AllowedValue]
  type ApproximateCount = scala.Double
  type AttributeValue = java.lang.String
  type CausingEntity = java.lang.String
  type ChangeAction = awsDashSdkLib.awsDashSdkLibStrings.ADD | awsDashSdkLib.awsDashSdkLibStrings.MODIFY | awsDashSdkLib.awsDashSdkLibStrings.REMOVE | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDashboardName = java.lang.String
  type CloudWatchDashboards = js.Array[CloudWatchDashboard]
  type ConstraintDescription = java.lang.String
  type ConstraintDetails = js.Array[ConstraintDetail]
  type ConstraintParameters = java.lang.String
  type ConstraintSummaries = js.Array[ConstraintSummary]
  type ConstraintType = java.lang.String
  type CopyOption = awsDashSdkLib.awsDashSdkLibStrings.CopyTags | java.lang.String
  type CopyOptions = js.Array[CopyOption]
  type CopyProductStatus = awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type CreatedTime = stdLib.Date
  type CreationTime = stdLib.Date
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type Error = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorDescription = java.lang.String
  type EvaluationType = awsDashSdkLib.awsDashSdkLibStrings.STATIC | awsDashSdkLib.awsDashSdkLibStrings.DYNAMIC | java.lang.String
  type FailedServiceActionAssociations = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath = scala.Boolean
  type Id = java.lang.String
  type IdempotencyToken = java.lang.String
  type IgnoreErrors = scala.Boolean
  type InstructionType = java.lang.String
  type InstructionValue = java.lang.String
  type LastRequestId = java.lang.String
  type LaunchPathSummaries = js.Array[LaunchPathSummary]
  type LogicalResourceId = java.lang.String
  type Message = java.lang.String
  type Namespaces = js.Array[AccountId]
  type NoEcho = scala.Boolean
  type NotificationArn = java.lang.String
  type NotificationArns = js.Array[NotificationArn]
  type OrganizationNodeType = awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT | awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  type OrganizationNodeValue = java.lang.String
  type OrganizationNodes = js.Array[OrganizationNode]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type PhysicalId = java.lang.String
  type PhysicalResourceId = java.lang.String
  type PlanResourceType = java.lang.String
  type PortfolioDescription = java.lang.String
  type PortfolioDetails = js.Array[PortfolioDetail]
  type PortfolioDisplayName = java.lang.String
  type PortfolioName = java.lang.String
  type PortfolioShareToken = java.lang.String
  type PortfolioShareType = awsDashSdkLib.awsDashSdkLibStrings.IMPORTED | awsDashSdkLib.awsDashSdkLibStrings.AWS_SERVICECATALOG | awsDashSdkLib.awsDashSdkLibStrings.AWS_ORGANIZATIONS | java.lang.String
  type PrincipalARN = java.lang.String
  type PrincipalType = awsDashSdkLib.awsDashSdkLibStrings.IAM | java.lang.String
  type Principals = js.Array[Principal]
  type ProductArn = java.lang.String
  type ProductSource = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  type ProductType = awsDashSdkLib.awsDashSdkLibStrings.CLOUD_FORMATION_TEMPLATE | awsDashSdkLib.awsDashSdkLibStrings.MARKETPLACE | java.lang.String
  type ProductViewAggregationType = java.lang.String
  type ProductViewAggregationValues = js.Array[ProductViewAggregationValue]
  type ProductViewDetails = js.Array[ProductViewDetail]
  type ProductViewDistributor = java.lang.String
  type ProductViewFilterBy = awsDashSdkLib.awsDashSdkLibStrings.FullTextSearch | awsDashSdkLib.awsDashSdkLibStrings.Owner | awsDashSdkLib.awsDashSdkLibStrings.ProductType | awsDashSdkLib.awsDashSdkLibStrings.SourceProductId | java.lang.String
  type ProductViewFilterValue = java.lang.String
  type ProductViewFilterValues = js.Array[ProductViewFilterValue]
  type ProductViewName = java.lang.String
  type ProductViewOwner = java.lang.String
  type ProductViewShortDescription = java.lang.String
  type ProductViewSortBy = awsDashSdkLib.awsDashSdkLibStrings.Title | awsDashSdkLib.awsDashSdkLibStrings.VersionCount | awsDashSdkLib.awsDashSdkLibStrings.CreationDate | java.lang.String
  type ProductViewSummaries = js.Array[ProductViewSummary]
  type PropertyName = java.lang.String
  type ProviderName = java.lang.String
  type ProvisionedProductAttributes = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[ProvisionedProductDetail]
  type ProvisionedProductId = java.lang.String
  type ProvisionedProductName = java.lang.String
  type ProvisionedProductNameOrArn = java.lang.String
  type ProvisionedProductPlanName = java.lang.String
  type ProvisionedProductPlanStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.CREATE_SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED | awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_FAILED | java.lang.String
  type ProvisionedProductPlanType = awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION | java.lang.String
  type ProvisionedProductPlans = js.Array[ProvisionedProductPlanSummary]
  type ProvisionedProductStatus = awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.UNDER_CHANGE | awsDashSdkLib.awsDashSdkLibStrings.TAINTED | awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.PLAN_IN_PROGRESS | java.lang.String
  type ProvisionedProductStatusMessage = java.lang.String
  type ProvisionedProductType = java.lang.String
  type ProvisionedProductViewFilterBy = awsDashSdkLib.awsDashSdkLibStrings.SearchQuery | java.lang.String
  type ProvisionedProductViewFilterValue = java.lang.String
  type ProvisionedProductViewFilterValues = js.Array[ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive = scala.Boolean
  type ProvisioningArtifactCreatedTime = stdLib.Date
  type ProvisioningArtifactDescription = java.lang.String
  type ProvisioningArtifactDetails = js.Array[ProvisioningArtifactDetail]
  type ProvisioningArtifactInfoKey = java.lang.String
  type ProvisioningArtifactInfoValue = java.lang.String
  type ProvisioningArtifactName = java.lang.String
  type ProvisioningArtifactParameters = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName = awsDashSdkLib.awsDashSdkLibStrings.Id | java.lang.String
  type ProvisioningArtifactPropertyValue = java.lang.String
  type ProvisioningArtifactSummaries = js.Array[ProvisioningArtifactSummary]
  type ProvisioningArtifactType = awsDashSdkLib.awsDashSdkLibStrings.CLOUD_FORMATION_TEMPLATE | awsDashSdkLib.awsDashSdkLibStrings.MARKETPLACE_AMI | awsDashSdkLib.awsDashSdkLibStrings.MARKETPLACE_CAR | java.lang.String
  type ProvisioningArtifactViews = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[ProvisioningArtifact]
  type ProvisioningParameters = js.Array[ProvisioningParameter]
  type RecordDetails = js.Array[RecordDetail]
  type RecordErrors = js.Array[RecordError]
  type RecordOutputs = js.Array[RecordOutput]
  type RecordStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS_IN_ERROR | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type RecordTagKey = java.lang.String
  type RecordTagValue = java.lang.String
  type RecordTags = js.Array[RecordTag]
  type RecordType = java.lang.String
  type Region = java.lang.String
  type Replacement = awsDashSdkLib.awsDashSdkLibStrings.TRUE | awsDashSdkLib.awsDashSdkLibStrings.FALSE | awsDashSdkLib.awsDashSdkLibStrings.CONDITIONAL | java.lang.String
  type RequiresRecreation = awsDashSdkLib.awsDashSdkLibStrings.NEVER | awsDashSdkLib.awsDashSdkLibStrings.CONDITIONALLY | awsDashSdkLib.awsDashSdkLibStrings.ALWAYS | java.lang.String
  type ResourceARN = java.lang.String
  type ResourceAttribute = awsDashSdkLib.awsDashSdkLibStrings.PROPERTIES | awsDashSdkLib.awsDashSdkLibStrings.METADATA | awsDashSdkLib.awsDashSdkLibStrings.CREATIONPOLICY | awsDashSdkLib.awsDashSdkLibStrings.UPDATEPOLICY | awsDashSdkLib.awsDashSdkLibStrings.DELETIONPOLICY | awsDashSdkLib.awsDashSdkLibStrings.TAGS | java.lang.String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceChanges = js.Array[ResourceChange]
  type ResourceDetailARN = java.lang.String
  type ResourceDetailCreatedTime = stdLib.Date
  type ResourceDetailDescription = java.lang.String
  type ResourceDetailId = java.lang.String
  type ResourceDetailName = java.lang.String
  type ResourceDetails = js.Array[ResourceDetail]
  type ResourceId = java.lang.String
  type ResourceType = java.lang.String
  type Scope = js.Array[ResourceAttribute]
  type SearchFilterKey = java.lang.String
  type SearchFilterValue = java.lang.String
  type SearchProvisionedProductsPageSize = scala.Double
  type ServiceActionAssociationErrorCode = awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_RESOURCE | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.THROTTLING | java.lang.String
  type ServiceActionAssociationErrorMessage = java.lang.String
  type ServiceActionAssociations = js.Array[ServiceActionAssociation]
  type ServiceActionDefinitionKey = awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.Version | awsDashSdkLib.awsDashSdkLibStrings.AssumeRole | awsDashSdkLib.awsDashSdkLibStrings.Parameters | java.lang.String
  type ServiceActionDefinitionType = awsDashSdkLib.awsDashSdkLibStrings.SSM_AUTOMATION | java.lang.String
  type ServiceActionDefinitionValue = java.lang.String
  type ServiceActionDescription = java.lang.String
  type ServiceActionName = java.lang.String
  type ServiceActionSummaries = js.Array[ServiceActionSummary]
  type ShareErrors = js.Array[ShareError]
  type ShareStatus = awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_WITH_ERRORS | awsDashSdkLib.awsDashSdkLibStrings.ERROR | java.lang.String
  type SortField = java.lang.String
  type SortOrder = awsDashSdkLib.awsDashSdkLibStrings.ASCENDING | awsDashSdkLib.awsDashSdkLibStrings.DESCENDING | java.lang.String
  type SourceProvisioningArtifactProperties = js.Array[SourceProvisioningArtifactPropertiesMap]
  type StackSetAccounts = js.Array[AccountId]
  type StackSetFailureToleranceCount = scala.Double
  type StackSetFailureTolerancePercentage = scala.Double
  type StackSetMaxConcurrencyCount = scala.Double
  type StackSetMaxConcurrencyPercentage = scala.Double
  type StackSetOperationType = awsDashSdkLib.awsDashSdkLibStrings.CREATE | awsDashSdkLib.awsDashSdkLibStrings.UPDATE | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
  type StackSetRegions = js.Array[Region]
  type Status = awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type StatusDetail = java.lang.String
  type StatusMessage = java.lang.String
  type SuccessfulShares = js.Array[AccountId]
  type SupportDescription = java.lang.String
  type SupportEmail = java.lang.String
  type SupportUrl = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagOptionActive = scala.Boolean
  type TagOptionDetails = js.Array[TagOptionDetail]
  type TagOptionId = java.lang.String
  type TagOptionKey = java.lang.String
  type TagOptionSummaries = js.Array[TagOptionSummary]
  type TagOptionValue = java.lang.String
  type TagOptionValues = js.Array[TagOptionValue]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TotalResultsCount = scala.Double
  type UpdateProvisioningParameters = js.Array[UpdateProvisioningParameter]
  type UpdatedTime = stdLib.Date
  type UsageInstructions = js.Array[UsageInstruction]
  type UsePreviousValue = scala.Boolean
  type UserArn = java.lang.String
  type UserArnSession = java.lang.String
  type Verbose = scala.Boolean
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-12-10` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

