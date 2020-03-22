package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.KMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/trigger/codepipeline.EncryptionKey & {  type  :'KMS'} */
trait EncryptionKeytypeKMS extends js.Object {
  var id: String
  var `type`: String with KMS
}

object EncryptionKeytypeKMS {
  @scala.inline
  def apply(id: String, `type`: String with KMS): EncryptionKeytypeKMS = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKeytypeKMS]
  }
}

