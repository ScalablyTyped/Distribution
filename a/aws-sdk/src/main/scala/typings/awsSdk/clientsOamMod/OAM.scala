package typings.awsSdk.clientsOamMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAM extends Service {
  
  @JSName("config")
  var config_OAM: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a link between a source account and a sink that you have created in a monitoring account. Before you create a link, you must create a sink in the monitoring account and create a sink policy in that account. The sink policy must permit the source account to link to it. You can grant permission to source accounts by granting permission to an entire organization or to individual accounts. For more information, see CreateSink and PutSinkPolicy. Each monitoring account can be linked to as many as 100,000 source accounts. Each source account can be linked to as many as five monitoring accounts.
    */
  def createLink(): Request[CreateLinkOutput, AWSError] = js.native
  def createLink(callback: js.Function2[/* err */ AWSError, /* data */ CreateLinkOutput, Unit]): Request[CreateLinkOutput, AWSError] = js.native
  /**
    * Creates a link between a source account and a sink that you have created in a monitoring account. Before you create a link, you must create a sink in the monitoring account and create a sink policy in that account. The sink policy must permit the source account to link to it. You can grant permission to source accounts by granting permission to an entire organization or to individual accounts. For more information, see CreateSink and PutSinkPolicy. Each monitoring account can be linked to as many as 100,000 source accounts. Each source account can be linked to as many as five monitoring accounts.
    */
  def createLink(params: CreateLinkInput): Request[CreateLinkOutput, AWSError] = js.native
  def createLink(
    params: CreateLinkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLinkOutput, Unit]
  ): Request[CreateLinkOutput, AWSError] = js.native
  
  /**
    * Use this to create a sink in the current account, so that it can be used as a monitoring account in CloudWatch cross-account observability. A sink is a resource that represents an attachment point in a monitoring account. Source accounts can link to the sink to send observability data. After you create a sink, you must create a sink policy that allows source accounts to attach to it. For more information, see PutSinkPolicy. Each account can contain one sink. If you delete a sink, you can then create a new one in that account.
    */
  def createSink(): Request[CreateSinkOutput, AWSError] = js.native
  def createSink(callback: js.Function2[/* err */ AWSError, /* data */ CreateSinkOutput, Unit]): Request[CreateSinkOutput, AWSError] = js.native
  /**
    * Use this to create a sink in the current account, so that it can be used as a monitoring account in CloudWatch cross-account observability. A sink is a resource that represents an attachment point in a monitoring account. Source accounts can link to the sink to send observability data. After you create a sink, you must create a sink policy that allows source accounts to attach to it. For more information, see PutSinkPolicy. Each account can contain one sink. If you delete a sink, you can then create a new one in that account.
    */
  def createSink(params: CreateSinkInput): Request[CreateSinkOutput, AWSError] = js.native
  def createSink(
    params: CreateSinkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSinkOutput, Unit]
  ): Request[CreateSinkOutput, AWSError] = js.native
  
  /**
    * Deletes a link between a monitoring account sink and a source account. You must run this operation in the source account.
    */
  def deleteLink(): Request[DeleteLinkOutput, AWSError] = js.native
  def deleteLink(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLinkOutput, Unit]): Request[DeleteLinkOutput, AWSError] = js.native
  /**
    * Deletes a link between a monitoring account sink and a source account. You must run this operation in the source account.
    */
  def deleteLink(params: DeleteLinkInput): Request[DeleteLinkOutput, AWSError] = js.native
  def deleteLink(
    params: DeleteLinkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLinkOutput, Unit]
  ): Request[DeleteLinkOutput, AWSError] = js.native
  
  /**
    * Deletes a sink. You must delete all links to a sink before you can delete that sink.
    */
  def deleteSink(): Request[DeleteSinkOutput, AWSError] = js.native
  def deleteSink(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSinkOutput, Unit]): Request[DeleteSinkOutput, AWSError] = js.native
  /**
    * Deletes a sink. You must delete all links to a sink before you can delete that sink.
    */
  def deleteSink(params: DeleteSinkInput): Request[DeleteSinkOutput, AWSError] = js.native
  def deleteSink(
    params: DeleteSinkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSinkOutput, Unit]
  ): Request[DeleteSinkOutput, AWSError] = js.native
  
  /**
    * Returns complete information about one link. To use this operation, provide the link ARN. To retrieve a list of link ARNs, use ListLinks.
    */
  def getLink(): Request[GetLinkOutput, AWSError] = js.native
  def getLink(callback: js.Function2[/* err */ AWSError, /* data */ GetLinkOutput, Unit]): Request[GetLinkOutput, AWSError] = js.native
  /**
    * Returns complete information about one link. To use this operation, provide the link ARN. To retrieve a list of link ARNs, use ListLinks.
    */
  def getLink(params: GetLinkInput): Request[GetLinkOutput, AWSError] = js.native
  def getLink(params: GetLinkInput, callback: js.Function2[/* err */ AWSError, /* data */ GetLinkOutput, Unit]): Request[GetLinkOutput, AWSError] = js.native
  
  /**
    * Returns complete information about one monitoring account sink. To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use ListSinks.
    */
  def getSink(): Request[GetSinkOutput, AWSError] = js.native
  def getSink(callback: js.Function2[/* err */ AWSError, /* data */ GetSinkOutput, Unit]): Request[GetSinkOutput, AWSError] = js.native
  /**
    * Returns complete information about one monitoring account sink. To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use ListSinks.
    */
  def getSink(params: GetSinkInput): Request[GetSinkOutput, AWSError] = js.native
  def getSink(params: GetSinkInput, callback: js.Function2[/* err */ AWSError, /* data */ GetSinkOutput, Unit]): Request[GetSinkOutput, AWSError] = js.native
  
  /**
    * Returns the current sink policy attached to this sink. The sink policy specifies what accounts can attach to this sink as source accounts, and what types of data they can share.
    */
  def getSinkPolicy(): Request[GetSinkPolicyOutput, AWSError] = js.native
  def getSinkPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetSinkPolicyOutput, Unit]): Request[GetSinkPolicyOutput, AWSError] = js.native
  /**
    * Returns the current sink policy attached to this sink. The sink policy specifies what accounts can attach to this sink as source accounts, and what types of data they can share.
    */
  def getSinkPolicy(params: GetSinkPolicyInput): Request[GetSinkPolicyOutput, AWSError] = js.native
  def getSinkPolicy(
    params: GetSinkPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSinkPolicyOutput, Unit]
  ): Request[GetSinkPolicyOutput, AWSError] = js.native
  
  /**
    * Returns a list of source account links that are linked to this monitoring account sink. To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use ListSinks. To find a list of links for one source account, use ListLinks.
    */
  def listAttachedLinks(): Request[ListAttachedLinksOutput, AWSError] = js.native
  def listAttachedLinks(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedLinksOutput, Unit]): Request[ListAttachedLinksOutput, AWSError] = js.native
  /**
    * Returns a list of source account links that are linked to this monitoring account sink. To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use ListSinks. To find a list of links for one source account, use ListLinks.
    */
  def listAttachedLinks(params: ListAttachedLinksInput): Request[ListAttachedLinksOutput, AWSError] = js.native
  def listAttachedLinks(
    params: ListAttachedLinksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedLinksOutput, Unit]
  ): Request[ListAttachedLinksOutput, AWSError] = js.native
  
  /**
    * Use this operation in a source account to return a list of links to monitoring account sinks that this source account has. To find a list of links for one monitoring account sink, use ListAttachedLinks from within the monitoring account.
    */
  def listLinks(): Request[ListLinksOutput, AWSError] = js.native
  def listLinks(callback: js.Function2[/* err */ AWSError, /* data */ ListLinksOutput, Unit]): Request[ListLinksOutput, AWSError] = js.native
  /**
    * Use this operation in a source account to return a list of links to monitoring account sinks that this source account has. To find a list of links for one monitoring account sink, use ListAttachedLinks from within the monitoring account.
    */
  def listLinks(params: ListLinksInput): Request[ListLinksOutput, AWSError] = js.native
  def listLinks(
    params: ListLinksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLinksOutput, Unit]
  ): Request[ListLinksOutput, AWSError] = js.native
  
  /**
    * Use this operation in a monitoring account to return the list of sinks created in that account.
    */
  def listSinks(): Request[ListSinksOutput, AWSError] = js.native
  def listSinks(callback: js.Function2[/* err */ AWSError, /* data */ ListSinksOutput, Unit]): Request[ListSinksOutput, AWSError] = js.native
  /**
    * Use this operation in a monitoring account to return the list of sinks created in that account.
    */
  def listSinks(params: ListSinksInput): Request[ListSinksOutput, AWSError] = js.native
  def listSinks(
    params: ListSinksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSinksOutput, Unit]
  ): Request[ListSinksOutput, AWSError] = js.native
  
  /**
    * Displays the tags associated with a resource. Both sinks and links support tagging.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Displays the tags associated with a resource. Both sinks and links support tagging.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Creates or updates the resource policy that grants permissions to source accounts to link to the monitoring account sink. When you create a sink policy, you can grant permissions to all accounts in an organization or to individual accounts. You can also use a sink policy to limit the types of data that is shared. The three types that you can allow or deny are:    Metrics - Specify with AWS::CloudWatch::Metric     Log groups - Specify with AWS::Logs::LogGroup     Traces - Specify with AWS::XRay::Trace    See the examples in this section to see how to specify permitted source accounts and data types.
    */
  def putSinkPolicy(): Request[PutSinkPolicyOutput, AWSError] = js.native
  def putSinkPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutSinkPolicyOutput, Unit]): Request[PutSinkPolicyOutput, AWSError] = js.native
  /**
    * Creates or updates the resource policy that grants permissions to source accounts to link to the monitoring account sink. When you create a sink policy, you can grant permissions to all accounts in an organization or to individual accounts. You can also use a sink policy to limit the types of data that is shared. The three types that you can allow or deny are:    Metrics - Specify with AWS::CloudWatch::Metric     Log groups - Specify with AWS::Logs::LogGroup     Traces - Specify with AWS::XRay::Trace    See the examples in this section to see how to specify permitted source accounts and data types.
    */
  def putSinkPolicy(params: PutSinkPolicyInput): Request[PutSinkPolicyOutput, AWSError] = js.native
  def putSinkPolicy(
    params: PutSinkPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSinkPolicyOutput, Unit]
  ): Request[PutSinkPolicyOutput, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified resource. Both sinks and links can be tagged.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the alarm, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.  Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have the oam:ResourceTag permission. The iam:ResourceTag permission does not allow you to tag and untag links and sinks. 
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified resource. Both sinks and links can be tagged.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the alarm, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.  Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have the oam:ResourceTag permission. The iam:ResourceTag permission does not allow you to tag and untag links and sinks. 
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.  Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have the oam:ResourceTag permission. The iam:TagResource permission does not allow you to tag and untag links and sinks. 
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.  Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have the oam:ResourceTag permission. The iam:TagResource permission does not allow you to tag and untag links and sinks. 
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Use this operation to change what types of data are shared from a source account to its linked monitoring account sink. You can't change the sink or change the monitoring account with this operation. To update the list of tags associated with the sink, use TagResource.
    */
  def updateLink(): Request[UpdateLinkOutput, AWSError] = js.native
  def updateLink(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkOutput, Unit]): Request[UpdateLinkOutput, AWSError] = js.native
  /**
    * Use this operation to change what types of data are shared from a source account to its linked monitoring account sink. You can't change the sink or change the monitoring account with this operation. To update the list of tags associated with the sink, use TagResource.
    */
  def updateLink(params: UpdateLinkInput): Request[UpdateLinkOutput, AWSError] = js.native
  def updateLink(
    params: UpdateLinkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkOutput, Unit]
  ): Request[UpdateLinkOutput, AWSError] = js.native
}
