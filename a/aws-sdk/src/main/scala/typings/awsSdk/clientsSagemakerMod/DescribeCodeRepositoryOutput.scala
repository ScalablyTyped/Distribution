package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCodeRepositoryOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.clientsSagemakerMod.CodeRepositoryArn
  
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName
  
  /**
    * The date and time that the repository was created.
    */
  var CreationTime: js.Date
  
  /**
    * Configuration details about the repository, including the URL where the repository is located, the default branch, and the Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.GitConfig] = js.undefined
  
  /**
    * The date and time that the repository was last changed.
    */
  var LastModifiedTime: js.Date
}
object DescribeCodeRepositoryOutput {
  
  inline def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: js.Date,
    LastModifiedTime: js.Date
  ): DescribeCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any], CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCodeRepositoryOutput] (val x: Self) extends AnyVal {
    
    inline def setCodeRepositoryArn(value: CodeRepositoryArn): Self = StObject.set(x, "CodeRepositoryArn", value.asInstanceOf[js.Any])
    
    inline def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setGitConfig(value: GitConfig): Self = StObject.set(x, "GitConfig", value.asInstanceOf[js.Any])
    
    inline def setGitConfigUndefined: Self = StObject.set(x, "GitConfig", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
