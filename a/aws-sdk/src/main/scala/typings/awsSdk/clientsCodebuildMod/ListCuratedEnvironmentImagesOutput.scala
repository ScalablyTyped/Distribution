package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCuratedEnvironmentImagesOutput extends StObject {
  
  /**
    * Information about supported platforms for Docker images that are managed by CodeBuild.
    */
  var platforms: js.UndefOr[EnvironmentPlatforms] = js.undefined
}
object ListCuratedEnvironmentImagesOutput {
  
  inline def apply(): ListCuratedEnvironmentImagesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCuratedEnvironmentImagesOutput]
  }
  
  extension [Self <: ListCuratedEnvironmentImagesOutput](x: Self) {
    
    inline def setPlatforms(value: EnvironmentPlatforms): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: EnvironmentPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
  }
}
