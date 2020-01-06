package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSourceAnalysis extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsDashSdk.clientsQuicksightMod.Arn = js.native
  /**
    * A structure containing information about the dataset references used as placeholders in the template.
    */
  var DataSetReferences: DataSetReferenceList = js.native
}

object TemplateSourceAnalysis {
  @scala.inline
  def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): TemplateSourceAnalysis = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateSourceAnalysis]
  }
}

