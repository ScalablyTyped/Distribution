package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.Succeeded_
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3BatchMod {
  
  type S3BatchCallback = Callback[S3BatchResult]
  
  trait S3BatchEvent extends StObject {
    
    var invocationId: String
    
    var invocationSchemaVersion: String
    
    var job: S3BatchEventJob
    
    var tasks: js.Array[S3BatchEventTask]
  }
  object S3BatchEvent {
    
    @scala.inline
    def apply(
      invocationId: String,
      invocationSchemaVersion: String,
      job: S3BatchEventJob,
      tasks: js.Array[S3BatchEventTask]
    ): S3BatchEvent = {
      val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3BatchEvent]
    }
    
    @scala.inline
    implicit class S3BatchEventMutableBuilder[Self <: S3BatchEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvocationId(value: String): Self = StObject.set(x, "invocationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationSchemaVersion(value: String): Self = StObject.set(x, "invocationSchemaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJob(value: S3BatchEventJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: js.Array[S3BatchEventTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksVarargs(value: S3BatchEventTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    }
  }
  
  trait S3BatchEventJob extends StObject {
    
    var id: String
  }
  object S3BatchEventJob {
    
    @scala.inline
    def apply(id: String): S3BatchEventJob = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3BatchEventJob]
    }
    
    @scala.inline
    implicit class S3BatchEventJobMutableBuilder[Self <: S3BatchEventJob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3BatchEventTask extends StObject {
    
    var s3BucketArn: String
    
    var s3Key: String
    
    var s3VersionId: String | Null
    
    var taskId: String
  }
  object S3BatchEventTask {
    
    @scala.inline
    def apply(s3BucketArn: String, s3Key: String, taskId: String): S3BatchEventTask = {
      val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], s3VersionId = null)
      __obj.asInstanceOf[S3BatchEventTask]
    }
    
    @scala.inline
    implicit class S3BatchEventTaskMutableBuilder[Self <: S3BatchEventTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3BucketArn(value: String): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Key(value: String): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3VersionId(value: String): Self = StObject.set(x, "s3VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3VersionIdNull: Self = StObject.set(x, "s3VersionId", null)
      
      @scala.inline
      def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
  
  type S3BatchHandler = Handler[S3BatchEvent, S3BatchResult]
  
  trait S3BatchResult extends StObject {
    
    var invocationId: String
    
    var invocationSchemaVersion: String
    
    var results: js.Array[S3BatchResultResult]
    
    var treatMissingKeysAs: S3BatchResultResultCode
  }
  object S3BatchResult {
    
    @scala.inline
    def apply(
      invocationId: String,
      invocationSchemaVersion: String,
      results: js.Array[S3BatchResultResult],
      treatMissingKeysAs: S3BatchResultResultCode
    ): S3BatchResult = {
      val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], treatMissingKeysAs = treatMissingKeysAs.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3BatchResult]
    }
    
    @scala.inline
    implicit class S3BatchResultMutableBuilder[Self <: S3BatchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvocationId(value: String): Self = StObject.set(x, "invocationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationSchemaVersion(value: String): Self = StObject.set(x, "invocationSchemaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[S3BatchResultResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: S3BatchResultResult*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setTreatMissingKeysAs(value: S3BatchResultResultCode): Self = StObject.set(x, "treatMissingKeysAs", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3BatchResultResult extends StObject {
    
    var resultCode: S3BatchResultResultCode
    
    var resultString: String
    
    var taskId: String
  }
  object S3BatchResultResult {
    
    @scala.inline
    def apply(resultCode: S3BatchResultResultCode, resultString: String, taskId: String): S3BatchResultResult = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], resultString = resultString.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3BatchResultResult]
    }
    
    @scala.inline
    implicit class S3BatchResultResultMutableBuilder[Self <: S3BatchResultResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResultCode(value: S3BatchResultResultCode): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultString(value: String): Self = StObject.set(x, "resultString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.Succeeded_
    - typings.awsLambda.awsLambdaStrings.TemporaryFailure
    - typings.awsLambda.awsLambdaStrings.PermanentFailure
  */
  trait S3BatchResultResultCode extends StObject
  object S3BatchResultResultCode {
    
    @scala.inline
    def PermanentFailure: typings.awsLambda.awsLambdaStrings.PermanentFailure = "PermanentFailure".asInstanceOf[typings.awsLambda.awsLambdaStrings.PermanentFailure]
    
    @scala.inline
    def Succeeded: Succeeded_ = "Succeeded".asInstanceOf[Succeeded_]
    
    @scala.inline
    def TemporaryFailure: typings.awsLambda.awsLambdaStrings.TemporaryFailure = "TemporaryFailure".asInstanceOf[typings.awsLambda.awsLambdaStrings.TemporaryFailure]
  }
}
