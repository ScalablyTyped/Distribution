package typings.awsLambda

import typings.awsLambda.anon.Data
import typings.awsLambda.awsLambdaStrings.S3
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineMod {
  
  trait Artifact extends StObject {
    
    var location: ArtifactLocation
    
    var name: String
    
    var revision: String | Null
  }
  object Artifact {
    
    @scala.inline
    def apply(location: ArtifactLocation, name: String): Artifact = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = null)
      __obj.asInstanceOf[Artifact]
    }
    
    @scala.inline
    implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: ArtifactLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionNull: Self = StObject.set(x, "revision", null)
    }
  }
  
  type ArtifactLocation = S3ArtifactStore
  
  trait CodePipelineEvent extends StObject {
    
    @JSName("CodePipeline.job")
    var CodePipelineDotjob: Data
  }
  object CodePipelineEvent {
    
    @scala.inline
    def apply(CodePipelineDotjob: Data): CodePipelineEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("CodePipeline.job")(CodePipelineDotjob.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodePipelineEvent]
    }
    
    @scala.inline
    implicit class CodePipelineEventMutableBuilder[Self <: CodePipelineEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodePipelineDotjob(value: Data): Self = StObject.set(x, "CodePipeline.job", value.asInstanceOf[js.Any])
    }
  }
  
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  
  trait Credentials extends StObject {
    
    var accessKeyId: String
    
    var secretAccessKey: String
    
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    @scala.inline
    def apply(accessKeyId: String, secretAccessKey: String): Credentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  trait EncryptionKey extends StObject {
    
    var id: String
    
    var `type`: String
  }
  object EncryptionKey {
    
    @scala.inline
    def apply(id: String, `type`: String): EncryptionKey = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptionKey]
    }
    
    @scala.inline
    implicit class EncryptionKeyMutableBuilder[Self <: EncryptionKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3ArtifactLocation extends StObject {
    
    var bucketName: String
    
    var objectKey: String
  }
  object S3ArtifactLocation {
    
    @scala.inline
    def apply(bucketName: String, objectKey: String): S3ArtifactLocation = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3ArtifactLocation]
    }
    
    @scala.inline
    implicit class S3ArtifactLocationMutableBuilder[Self <: S3ArtifactLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3ArtifactStore extends StObject {
    
    var s3Location: S3ArtifactLocation
    
    var `type`: S3
  }
  object S3ArtifactStore {
    
    @scala.inline
    def apply(s3Location: S3ArtifactLocation): S3ArtifactStore = {
      val __obj = js.Dynamic.literal(s3Location = s3Location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("S3")
      __obj.asInstanceOf[S3ArtifactStore]
    }
    
    @scala.inline
    implicit class S3ArtifactStoreMutableBuilder[Self <: S3ArtifactStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3Location(value: S3ArtifactLocation): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: S3): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
