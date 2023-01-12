package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDecoderManifestResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the decoder manifest that was imported. 
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The name of the imported decoder manifest. 
    */
  var name: resourceName
}
object ImportDecoderManifestResponse {
  
  inline def apply(arn: arn, name: resourceName): ImportDecoderManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDecoderManifestResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportDecoderManifestResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
