package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactLocation extends StObject {
  
  /**
    * The S3 bucket that contains the artifact.
    */
  var s3Location: js.UndefOr[S3ArtifactLocation] = js.undefined
  
  /**
    * The type of artifact in the location.
    */
  var `type`: js.UndefOr[ArtifactLocationType] = js.undefined
}
object ArtifactLocation {
  
  inline def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
    
    inline def setS3Location(value: S3ArtifactLocation): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
    
    inline def setType(value: ArtifactLocationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
