package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBuildInput extends StObject {
  
  /**
    * A unique identifier for the build to update. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn
  
  /**
    * A descriptive label associated with a build. Build names don't need to be unique. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Version information associated with a build or script. Version strings don't need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object UpdateBuildInput {
  
  inline def apply(BuildId: BuildIdOrArn): UpdateBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBuildInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBuildInput] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: NonZeroAndMaxString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
