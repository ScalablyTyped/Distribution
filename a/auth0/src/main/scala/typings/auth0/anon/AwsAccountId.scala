package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAccountId extends StObject {
  
  var awsAccountId: String
  
  var awsPartnerEventSource: String
  
  var awsRegion: String
}
object AwsAccountId {
  
  inline def apply(awsAccountId: String, awsPartnerEventSource: String, awsRegion: String): AwsAccountId = {
    val __obj = js.Dynamic.literal(awsAccountId = awsAccountId.asInstanceOf[js.Any], awsPartnerEventSource = awsPartnerEventSource.asInstanceOf[js.Any], awsRegion = awsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsAccountId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsAccountId] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: String): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsPartnerEventSource(value: String): Self = StObject.set(x, "awsPartnerEventSource", value.asInstanceOf[js.Any])
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
  }
}
