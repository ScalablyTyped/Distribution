package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`read-only`
import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.replace
import typings.awsLambda.awsLambdaStrings.text_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: `read-only` | replace
  
  var data: String
  
  var encoding: base64 | text_
  
  val inputTruncated: Boolean
}
object Action {
  
  inline def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: `read-only` | replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: base64 | text_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setInputTruncated(value: Boolean): Self = StObject.set(x, "inputTruncated", value.asInstanceOf[js.Any])
  }
}
