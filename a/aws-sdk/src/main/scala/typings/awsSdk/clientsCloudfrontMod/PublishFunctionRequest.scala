package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishFunctionRequest extends StObject {
  
  /**
    * The current version (ETag value) of the function that you are publishing, which you can get using DescribeFunction.
    */
  var IfMatch: String
  
  /**
    * The name of the function that you are publishing.
    */
  var Name: String
}
object PublishFunctionRequest {
  
  inline def apply(IfMatch: String, Name: String): PublishFunctionRequest = {
    val __obj = js.Dynamic.literal(IfMatch = IfMatch.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFunctionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishFunctionRequest] (val x: Self) extends AnyVal {
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
