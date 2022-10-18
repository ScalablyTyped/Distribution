package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRevisionResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The revision number.
    
    */
  var Revision: js.UndefOr[long] = js.undefined
  
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: js.UndefOr[_Blob] = js.undefined
}
object DescribeConfigurationRevisionResponse {
  
  inline def apply(): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
  
  extension [Self <: DescribeConfigurationRevisionResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
    
    inline def setServerProperties(value: _Blob): Self = StObject.set(x, "ServerProperties", value.asInstanceOf[js.Any])
    
    inline def setServerPropertiesUndefined: Self = StObject.set(x, "ServerProperties", js.undefined)
  }
}
