package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSchema extends js.Object {
  /**
    * The label key.
    */
  var labelKey: String = js.native
  /**
    * The label mapper maps the Amazon Fraud Detector supported label to the appropriate source labels. For example, if "FRAUD" and "LEGIT" are Amazon Fraud Detector supported labels, this mapper could be: {"FRAUD" =&gt; ["0"], "LEGIT" =&gt; ["1"]} or {"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]} or {"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}. The value part of the mapper is a list, because you may have multiple variants for a single Amazon Fraud Detector label. 
    */
  var labelMapper: LabelMapper = js.native
}

object LabelSchema {
  @scala.inline
  def apply(labelKey: String, labelMapper: LabelMapper): LabelSchema = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], labelMapper = labelMapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelSchema]
  }
}

