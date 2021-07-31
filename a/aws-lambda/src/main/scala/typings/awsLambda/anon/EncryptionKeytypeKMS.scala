package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.KMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-lambda.aws-lambda/trigger/codepipeline.EncryptionKey & {  type :'KMS'} */
trait EncryptionKeytypeKMS extends StObject {
  
  var id: String
  
  var `type`: String & KMS
}
object EncryptionKeytypeKMS {
  
  @scala.inline
  def apply(id: String, `type`: String & KMS): EncryptionKeytypeKMS = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKeytypeKMS]
  }
  
  @scala.inline
  implicit class EncryptionKeytypeKMSMutableBuilder[Self <: EncryptionKeytypeKMS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String & KMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
