package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrRepositoryConfiguration extends StObject {
  
  /**
    * The JSON repository policy text to apply to the Amazon ECR repository. For more information, see Private repository policy examples in the Amazon ECR User Guide.
    */
  var repositoryPolicy: js.UndefOr[EcrRepositoryPolicy] = js.undefined
}
object EcrRepositoryConfiguration {
  
  inline def apply(): EcrRepositoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcrRepositoryConfiguration]
  }
  
  extension [Self <: EcrRepositoryConfiguration](x: Self) {
    
    inline def setRepositoryPolicy(value: EcrRepositoryPolicy): Self = StObject.set(x, "repositoryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRepositoryPolicyUndefined: Self = StObject.set(x, "repositoryPolicy", js.undefined)
  }
}
