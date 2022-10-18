package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectArtifactsDetails extends StObject {
  
  /**
    * An identifier for the artifact definition.
    */
  var ArtifactIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether to disable encryption on the artifact. Only valid when Type is S3.
    */
  var EncryptionDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only used when Type is S3. The name of the S3 bucket where the artifact is located.
    */
  var Location: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Only used when Type is S3. The name of the artifact. Used with NamepaceType and Path to determine the pattern for storing the artifact.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Only used when Type is S3. The value to use for the namespace. Used with Name and Path to determine the pattern for storing the artifact.
    */
  var NamespaceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the name specified in the buildspec file overrides the artifact name.
    */
  var OverrideArtifactName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only used when Type is S3. The type of output artifact to create.
    */
  var Packaging: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Only used when Type is S3. The path to the artifact. Used with Name and NamespaceType to determine the pattern for storing the artifact.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of build artifact.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectArtifactsDetails {
  
  inline def apply(): AwsCodeBuildProjectArtifactsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectArtifactsDetails]
  }
  
  extension [Self <: AwsCodeBuildProjectArtifactsDetails](x: Self) {
    
    inline def setArtifactIdentifier(value: NonEmptyString): Self = StObject.set(x, "ArtifactIdentifier", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdentifierUndefined: Self = StObject.set(x, "ArtifactIdentifier", js.undefined)
    
    inline def setEncryptionDisabled(value: Boolean): Self = StObject.set(x, "EncryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "EncryptionDisabled", js.undefined)
    
    inline def setLocation(value: NonEmptyString): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNamespaceType(value: NonEmptyString): Self = StObject.set(x, "NamespaceType", value.asInstanceOf[js.Any])
    
    inline def setNamespaceTypeUndefined: Self = StObject.set(x, "NamespaceType", js.undefined)
    
    inline def setOverrideArtifactName(value: Boolean): Self = StObject.set(x, "OverrideArtifactName", value.asInstanceOf[js.Any])
    
    inline def setOverrideArtifactNameUndefined: Self = StObject.set(x, "OverrideArtifactName", js.undefined)
    
    inline def setPackaging(value: NonEmptyString): Self = StObject.set(x, "Packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "Packaging", js.undefined)
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
