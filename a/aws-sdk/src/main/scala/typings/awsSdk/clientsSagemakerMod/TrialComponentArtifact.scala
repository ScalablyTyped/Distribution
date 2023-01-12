package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentArtifact extends StObject {
  
  /**
    * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of a type and a subtype concatenated with a slash (/) character, for example, text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
    */
  var MediaType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MediaType] = js.undefined
  
  /**
    * The location of the artifact.
    */
  var Value: TrialComponentArtifactValue
}
object TrialComponentArtifact {
  
  inline def apply(Value: TrialComponentArtifactValue): TrialComponentArtifact = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrialComponentArtifact] (val x: Self) extends AnyVal {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "MediaType", js.undefined)
    
    inline def setValue(value: TrialComponentArtifactValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
