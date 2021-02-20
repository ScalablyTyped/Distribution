package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailAuthentication extends StObject {
  
  var challengeName: String = js.native
  
  var failAuthentication: Boolean = js.native
  
  var issueTokens: Boolean = js.native
}
object FailAuthentication {
  
  @scala.inline
  def apply(challengeName: String, failAuthentication: Boolean, issueTokens: Boolean): FailAuthentication = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], failAuthentication = failAuthentication.asInstanceOf[js.Any], issueTokens = issueTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailAuthentication]
  }
  
  @scala.inline
  implicit class FailAuthenticationMutableBuilder[Self <: FailAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeName(value: String): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailAuthentication(value: Boolean): Self = StObject.set(x, "failAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueTokens(value: Boolean): Self = StObject.set(x, "issueTokens", value.asInstanceOf[js.Any])
  }
}
