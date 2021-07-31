package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSdkVersion extends StObject {
  
  var awsSdkVersion: String
  
  var clientId: String
}
object AwsSdkVersion {
  
  @scala.inline
  def apply(awsSdkVersion: String, clientId: String): AwsSdkVersion = {
    val __obj = js.Dynamic.literal(awsSdkVersion = awsSdkVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSdkVersion]
  }
  
  @scala.inline
  implicit class AwsSdkVersionMutableBuilder[Self <: AwsSdkVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsSdkVersion(value: String): Self = StObject.set(x, "awsSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
  }
}
