package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ClassificationScope extends StObject {
  
  /**
    * The S3 buckets that are excluded.
    */
  var excludes: S3ClassificationScopeExclusion
}
object S3ClassificationScope {
  
  inline def apply(excludes: S3ClassificationScopeExclusion): S3ClassificationScope = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ClassificationScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ClassificationScope] (val x: Self) extends AnyVal {
    
    inline def setExcludes(value: S3ClassificationScopeExclusion): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
  }
}
