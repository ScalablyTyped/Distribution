package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryAnalysis extends StObject {
  
  /**
    * A SourceCodeType that specifies the tip of a branch in an associated repository.
    */
  var RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType] = js.undefined
  
  var SourceCodeType: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.SourceCodeType] = js.undefined
}
object RepositoryAnalysis {
  
  inline def apply(): RepositoryAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryAnalysis] (val x: Self) extends AnyVal {
    
    inline def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = StObject.set(x, "RepositoryHead", value.asInstanceOf[js.Any])
    
    inline def setRepositoryHeadUndefined: Self = StObject.set(x, "RepositoryHead", js.undefined)
    
    inline def setSourceCodeType(value: SourceCodeType): Self = StObject.set(x, "SourceCodeType", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeTypeUndefined: Self = StObject.set(x, "SourceCodeType", js.undefined)
  }
}
