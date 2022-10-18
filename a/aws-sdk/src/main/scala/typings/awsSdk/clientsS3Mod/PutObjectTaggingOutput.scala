package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectTaggingOutput extends StObject {
  
  /**
    * The versionId of the object the tag-set was added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object PutObjectTaggingOutput {
  
  inline def apply(): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
  
  extension [Self <: PutObjectTaggingOutput](x: Self) {
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
