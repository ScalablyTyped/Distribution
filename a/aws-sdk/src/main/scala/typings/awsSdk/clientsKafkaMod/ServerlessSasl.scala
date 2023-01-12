package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerlessSasl extends StObject {
  
  /**
    * 
    Indicates whether IAM access control is enabled.
    
    */
  var Iam: js.UndefOr[typings.awsSdk.clientsKafkaMod.Iam] = js.undefined
}
object ServerlessSasl {
  
  inline def apply(): ServerlessSasl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerlessSasl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerlessSasl] (val x: Self) extends AnyVal {
    
    inline def setIam(value: Iam): Self = StObject.set(x, "Iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "Iam", js.undefined)
  }
}
