package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-lambda.aws-lambda/trigger/codepipeline.EncryptionKey & {  type :'KMS'} */
trait EncryptionKeytypeKMS extends StObject {
  
  var id: String
  
  var `type`: String
}
object EncryptionKeytypeKMS {
  
  inline def apply(id: String, `type`: String): EncryptionKeytypeKMS = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKeytypeKMS]
  }
  
  extension [Self <: EncryptionKeytypeKMS](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
