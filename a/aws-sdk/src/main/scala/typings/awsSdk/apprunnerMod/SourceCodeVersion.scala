package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeVersion extends StObject {
  
  /**
    * The type of version identifier. For a git-based repository, branches represent versions.
    */
  var Type: SourceCodeVersionType
  
  /**
    * A source code version. For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to the branch.
    */
  var Value: String
}
object SourceCodeVersion {
  
  inline def apply(Type: SourceCodeVersionType, Value: String): SourceCodeVersion = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeVersion]
  }
  
  extension [Self <: SourceCodeVersion](x: Self) {
    
    inline def setType(value: SourceCodeVersionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
