package typings.awsDashSdk.clientsCodegurureviewerMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGuruReviewer extends Service {
  @JSName("config")
  var config_CodeGuruReviewer: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When you associate an AWS CodeCommit repository with Amazon CodeGuru Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each pull request. You can view recommendations in the AWS CodeCommit repository. You can associate a GitHub repository using the Amazon CodeGuru Reviewer console.
    */
  def associateRepository(): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When you associate an AWS CodeCommit repository with Amazon CodeGuru Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each pull request. You can view recommendations in the AWS CodeCommit repository. You can associate a GitHub repository using the Amazon CodeGuru Reviewer console.
    */
  def associateRepository(params: AssociateRepositoryRequest): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(
    params: AssociateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]
  ): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    * Describes a repository association.
    */
  def describeRepositoryAssociation(): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  def describeRepositoryAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryAssociationResponse, Unit]): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Describes a repository association.
    */
  def describeRepositoryAssociation(params: DescribeRepositoryAssociationRequest): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  def describeRepositoryAssociation(
    params: DescribeRepositoryAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryAssociationResponse, Unit]
  ): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Removes the association between Amazon CodeGuru Reviewer and a repository.
    */
  def disassociateRepository(): Request[DisassociateRepositoryResponse, AWSError] = js.native
  def disassociateRepository(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateRepositoryResponse, Unit]): Request[DisassociateRepositoryResponse, AWSError] = js.native
  /**
    * Removes the association between Amazon CodeGuru Reviewer and a repository.
    */
  def disassociateRepository(params: DisassociateRepositoryRequest): Request[DisassociateRepositoryResponse, AWSError] = js.native
  def disassociateRepository(
    params: DisassociateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateRepositoryResponse, Unit]
  ): Request[DisassociateRepositoryResponse, AWSError] = js.native
  /**
    * Lists repository associations. You can optionally filter on one or more of the following recommendation properties: provider types, states, names, and owners.
    */
  def listRepositoryAssociations(): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  def listRepositoryAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoryAssociationsResponse, Unit]): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  /**
    * Lists repository associations. You can optionally filter on one or more of the following recommendation properties: provider types, states, names, and owners.
    */
  def listRepositoryAssociations(params: ListRepositoryAssociationsRequest): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  def listRepositoryAssociations(
    params: ListRepositoryAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoryAssociationsResponse, Unit]
  ): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
}

