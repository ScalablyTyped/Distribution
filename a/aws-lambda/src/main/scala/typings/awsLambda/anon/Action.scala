package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`read-only`
import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.replace
import typings.awsLambda.awsLambdaStrings.text_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  var action: `read-only` | replace = js.native
  
  var data: String = js.native
  
  var encoding: base64 | text_ = js.native
  
  val inputTruncated: Boolean = js.native
}
object Action {
  
  @scala.inline
  def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `read-only` | replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: base64 | text_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTruncated(value: Boolean): Self = StObject.set(x, "inputTruncated", value.asInstanceOf[js.Any])
  }
}
