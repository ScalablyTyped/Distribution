package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.AWS
import typings.awsLambda.awsLambdaStrings.ThirdParty
import typings.awsLambda.triggerCodepipelineCloudwatchActionMod.CodePipelineActionCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var category: CodePipelineActionCategory
  
  var owner: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty
  
  var provider: String
  
  var version: Double
}
object Category {
  
  inline def apply(
    category: CodePipelineActionCategory,
    owner: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty,
    provider: String,
    version: Double
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodePipelineActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
