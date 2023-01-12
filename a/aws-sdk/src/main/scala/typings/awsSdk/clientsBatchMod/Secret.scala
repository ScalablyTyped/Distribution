package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secret extends StObject {
  
  /**
    * The name of the secret.
    */
  var name: String
  
  /**
    * The secret to expose to the container. The supported values are either the full Amazon Resource Name (ARN) of the Secrets Manager secret or the full ARN of the parameter in the Amazon Web Services Systems Manager Parameter Store.  If the Amazon Web Services Systems Manager Parameter Store parameter exists in the same Region as the job you're launching, then you can use either the full Amazon Resource Name (ARN) or name of the parameter. If the parameter exists in a different Region, then the full ARN must be specified. 
    */
  var valueFrom: String
}
object Secret {
  
  inline def apply(name: String, valueFrom: String): Secret = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], valueFrom = valueFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValueFrom(value: String): Self = StObject.set(x, "valueFrom", value.asInstanceOf[js.Any])
  }
}
