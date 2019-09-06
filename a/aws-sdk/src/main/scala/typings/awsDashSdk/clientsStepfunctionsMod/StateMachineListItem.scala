package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMachineListItem extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: Timestamp
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn
}

object StateMachineListItem {
  @scala.inline
  def apply(creationDate: Timestamp, name: Name, stateMachineArn: Arn): StateMachineListItem = {
    val __obj = js.Dynamic.literal(creationDate = creationDate, name = name, stateMachineArn = stateMachineArn)
  
    __obj.asInstanceOf[StateMachineListItem]
  }
}

