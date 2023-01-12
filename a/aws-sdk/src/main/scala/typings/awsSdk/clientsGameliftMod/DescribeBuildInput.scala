package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBuildInput extends StObject {
  
  /**
    * A unique identifier for the build to retrieve properties for. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn
}
object DescribeBuildInput {
  
  inline def apply(BuildId: BuildIdOrArn): DescribeBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBuildInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBuildInput] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
  }
}
