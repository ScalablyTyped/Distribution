package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPermissionInput extends js.Object {
  /**
    * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must have AWS accounts, but do not need to be signed up for this service.
    */
  var AWSAccountId: DelegatesList
  /**
    * The action you want to allow for the specified principal(s). Valid values: any Amazon SNS action name.
    */
  var ActionName: ActionsList
  /**
    * A unique identifier for the new policy statement.
    */
  var Label: label
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN
}

object AddPermissionInput {
  @scala.inline
  def apply(AWSAccountId: DelegatesList, ActionName: ActionsList, Label: label, TopicArn: topicARN): AddPermissionInput = {
    val __obj = js.Dynamic.literal(AWSAccountId = AWSAccountId, ActionName = ActionName, Label = Label, TopicArn = TopicArn)
  
    __obj.asInstanceOf[AddPermissionInput]
  }
}

