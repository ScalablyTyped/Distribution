package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStateMachineInput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition
  /**
    * The name of the state machine.  A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  var roleArn: Arn
  /**
    * Tags to be added when creating a state machine. An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide, and Controlling Access Using IAM Tags. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateStateMachineInput {
  @scala.inline
  def apply(definition: Definition, name: Name, roleArn: Arn, tags: TagList = null): CreateStateMachineInput = {
    val __obj = js.Dynamic.literal(definition = definition, name = name, roleArn = roleArn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateStateMachineInput]
  }
}

