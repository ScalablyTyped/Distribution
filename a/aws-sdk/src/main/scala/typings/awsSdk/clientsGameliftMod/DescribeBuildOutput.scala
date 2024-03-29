package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBuildOutput extends StObject {
  
  /**
    * Set of properties describing the requested build.
    */
  var Build: js.UndefOr[typings.awsSdk.clientsGameliftMod.Build] = js.undefined
}
object DescribeBuildOutput {
  
  inline def apply(): DescribeBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBuildOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBuildOutput] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "Build", js.undefined)
  }
}
