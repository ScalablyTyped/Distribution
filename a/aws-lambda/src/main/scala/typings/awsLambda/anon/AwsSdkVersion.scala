package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSdkVersion extends StObject {
  
  var awsSdkVersion: String
  
  var clientId: String
}
object AwsSdkVersion {
  
  inline def apply(awsSdkVersion: String, clientId: String): AwsSdkVersion = {
    val __obj = js.Dynamic.literal(awsSdkVersion = awsSdkVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSdkVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSdkVersion] (val x: Self) extends AnyVal {
    
    inline def setAwsSdkVersion(value: String): Self = StObject.set(x, "awsSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
  }
}
