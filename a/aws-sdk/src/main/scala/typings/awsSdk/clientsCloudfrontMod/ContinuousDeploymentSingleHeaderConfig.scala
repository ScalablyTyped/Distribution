package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentSingleHeaderConfig extends StObject {
  
  /**
    * The request header name that you want CloudFront to send to your staging distribution. The header must contain the prefix aws-cf-cd-.
    */
  var Header: String
  
  /**
    * The request header value.
    */
  var Value: String
}
object ContinuousDeploymentSingleHeaderConfig {
  
  inline def apply(Header: String, Value: String): ContinuousDeploymentSingleHeaderConfig = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentSingleHeaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousDeploymentSingleHeaderConfig] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
