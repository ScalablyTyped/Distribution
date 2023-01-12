package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryBuildOutput extends StObject {
  
  var build: js.UndefOr[Build] = js.undefined
}
object RetryBuildOutput {
  
  inline def apply(): RetryBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryBuildOutput] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
