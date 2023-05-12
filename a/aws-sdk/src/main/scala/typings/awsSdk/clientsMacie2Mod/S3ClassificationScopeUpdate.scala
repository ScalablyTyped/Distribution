package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ClassificationScopeUpdate extends StObject {
  
  /**
    * The names of the S3 buckets to add or remove from the list.
    */
  var excludes: S3ClassificationScopeExclusionUpdate
}
object S3ClassificationScopeUpdate {
  
  inline def apply(excludes: S3ClassificationScopeExclusionUpdate): S3ClassificationScopeUpdate = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ClassificationScopeUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ClassificationScopeUpdate] (val x: Self) extends AnyVal {
    
    inline def setExcludes(value: S3ClassificationScopeExclusionUpdate): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
  }
}
