package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBuildInput extends StObject {
  
  /**
    * A unique identifier for the build to delete. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn
}
object DeleteBuildInput {
  
  inline def apply(BuildId: BuildIdOrArn): DeleteBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBuildInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBuildInput] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
  }
}
