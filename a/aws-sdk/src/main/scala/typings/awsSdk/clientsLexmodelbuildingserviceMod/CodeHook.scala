package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeHook extends StObject {
  
  /**
    * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more information, see using-lambda.
    */
  var messageVersion: MessageVersion
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var uri: LambdaARN
}
object CodeHook {
  
  inline def apply(messageVersion: MessageVersion, uri: LambdaARN): CodeHook = {
    val __obj = js.Dynamic.literal(messageVersion = messageVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeHook]
  }
  
  extension [Self <: CodeHook](x: Self) {
    
    inline def setMessageVersion(value: MessageVersion): Self = StObject.set(x, "messageVersion", value.asInstanceOf[js.Any])
    
    inline def setUri(value: LambdaARN): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
