package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPullRequestOverrideStateOutput extends StObject {
  
  /**
    * A Boolean value that indicates whether a pull request has had its rules set aside (TRUE) or whether all approval rules still apply (FALSE).
    */
  var overridden: js.UndefOr[Overridden] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the pull request.
    */
  var overrider: js.UndefOr[Arn] = js.undefined
}
object GetPullRequestOverrideStateOutput {
  
  inline def apply(): GetPullRequestOverrideStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestOverrideStateOutput]
  }
  
  extension [Self <: GetPullRequestOverrideStateOutput](x: Self) {
    
    inline def setOverridden(value: Overridden): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    inline def setOverriddenUndefined: Self = StObject.set(x, "overridden", js.undefined)
    
    inline def setOverrider(value: Arn): Self = StObject.set(x, "overrider", value.asInstanceOf[js.Any])
    
    inline def setOverriderUndefined: Self = StObject.set(x, "overrider", js.undefined)
  }
}
