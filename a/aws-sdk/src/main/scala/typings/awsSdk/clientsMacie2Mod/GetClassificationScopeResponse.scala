package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassificationScopeResponse extends StObject {
  
  /**
    * The unique identifier for the classification scope.
    */
  var id: js.UndefOr[ClassificationScopeId] = js.undefined
  
  /**
    * The name of the classification scope: automated-sensitive-data-discovery.
    */
  var name: js.UndefOr[ClassificationScopeName] = js.undefined
  
  /**
    * The S3 buckets that are excluded from automated sensitive data discovery.
    */
  var s3: js.UndefOr[S3ClassificationScope] = js.undefined
}
object GetClassificationScopeResponse {
  
  inline def apply(): GetClassificationScopeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassificationScopeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClassificationScopeResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: ClassificationScopeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ClassificationScopeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setS3(value: S3ClassificationScope): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
