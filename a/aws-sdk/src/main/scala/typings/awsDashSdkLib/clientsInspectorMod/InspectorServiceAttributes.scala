package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectorServiceAttributes extends js.Object {
  /**
    * The ARN of the assessment run during which the finding is generated.
    */
  var assessmentRunArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the rules package that is used to generate the finding.
    */
  var rulesPackageArn: js.UndefOr[Arn] = js.undefined
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion
}

object InspectorServiceAttributes {
  @scala.inline
  def apply(schemaVersion: NumericVersion, assessmentRunArn: Arn = null, rulesPackageArn: Arn = null): InspectorServiceAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion)
    if (assessmentRunArn != null) __obj.updateDynamic("assessmentRunArn")(assessmentRunArn)
    if (rulesPackageArn != null) __obj.updateDynamic("rulesPackageArn")(rulesPackageArn)
    __obj.asInstanceOf[InspectorServiceAttributes]
  }
}

