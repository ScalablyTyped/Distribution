package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivityOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the activity.
    */
  var activityArn: Arn
  /**
    * The date the activity is created.
    */
  var creationDate: Timestamp
  /**
    * The name of the activity. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name
}

object DescribeActivityOutput {
  @scala.inline
  def apply(activityArn: Arn, creationDate: Timestamp, name: Name): DescribeActivityOutput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn, creationDate = creationDate, name = name)
  
    __obj.asInstanceOf[DescribeActivityOutput]
  }
}

