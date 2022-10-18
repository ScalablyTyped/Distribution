package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBuildOutput extends StObject {
  
  /**
    * The updated build resource.
    */
  var Build: js.UndefOr[typings.awsSdk.clientsGameliftMod.Build] = js.undefined
}
object UpdateBuildOutput {
  
  inline def apply(): UpdateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBuildOutput]
  }
  
  extension [Self <: UpdateBuildOutput](x: Self) {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "Build", js.undefined)
  }
}
