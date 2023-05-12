package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNotebookExecutionInput extends StObject {
  
  /**
    * The unique identifier of the Amazon EMR Notebook to use for notebook execution.
    */
  var EditorId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The environment variables associated with the notebook execution.
    */
  var EnvironmentVariables: js.UndefOr[EnvironmentVariablesMap] = js.undefined
  
  /**
    * Specifies the execution engine (cluster) that runs the notebook execution.
    */
  var ExecutionEngine: ExecutionEngineConfig
  
  /**
    * An optional name for the notebook execution.
    */
  var NotebookExecutionName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this notebook execution.
    */
  var NotebookInstanceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
    */
  var NotebookParams: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The Amazon S3 location for the notebook execution input.
    */
  var NotebookS3Location: js.UndefOr[NotebookS3LocationFromInput] = js.undefined
  
  /**
    * The output format for the notebook execution.
    */
  var OutputNotebookFormat: js.UndefOr[typings.awsSdk.clientsEmrMod.OutputNotebookFormat] = js.undefined
  
  /**
    * The Amazon S3 location for the notebook execution output.
    */
  var OutputNotebookS3Location: js.UndefOr[OutputNotebookS3LocationFromInput] = js.undefined
  
  /**
    * The path and file name of the notebook file for this execution, relative to the path specified for the Amazon EMR Notebook. For example, if you specify a path of s3://MyBucket/MyNotebooks when you create an Amazon EMR Notebook for a notebook with an ID of e-ABCDEFGHIJK1234567890ABCD (the EditorID of this request), and you specify a RelativePath of my_notebook_executions/notebook_execution.ipynb, the location of the file for the notebook execution is s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb.
    */
  var RelativePath: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for the notebook execution.
    */
  var ServiceRole: XmlString
  
  /**
    * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a required key string with a maximum of 128 characters and an optional value string with a maximum of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object StartNotebookExecutionInput {
  
  inline def apply(ExecutionEngine: ExecutionEngineConfig, ServiceRole: XmlString): StartNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(ExecutionEngine = ExecutionEngine.asInstanceOf[js.Any], ServiceRole = ServiceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNotebookExecutionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartNotebookExecutionInput] (val x: Self) extends AnyVal {
    
    inline def setEditorId(value: XmlStringMaxLen256): Self = StObject.set(x, "EditorId", value.asInstanceOf[js.Any])
    
    inline def setEditorIdUndefined: Self = StObject.set(x, "EditorId", js.undefined)
    
    inline def setEnvironmentVariables(value: EnvironmentVariablesMap): Self = StObject.set(x, "EnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "EnvironmentVariables", js.undefined)
    
    inline def setExecutionEngine(value: ExecutionEngineConfig): Self = StObject.set(x, "ExecutionEngine", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionName(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionName", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionNameUndefined: Self = StObject.set(x, "NotebookExecutionName", js.undefined)
    
    inline def setNotebookInstanceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookInstanceSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceSecurityGroupIdUndefined: Self = StObject.set(x, "NotebookInstanceSecurityGroupId", js.undefined)
    
    inline def setNotebookParams(value: XmlString): Self = StObject.set(x, "NotebookParams", value.asInstanceOf[js.Any])
    
    inline def setNotebookParamsUndefined: Self = StObject.set(x, "NotebookParams", js.undefined)
    
    inline def setNotebookS3Location(value: NotebookS3LocationFromInput): Self = StObject.set(x, "NotebookS3Location", value.asInstanceOf[js.Any])
    
    inline def setNotebookS3LocationUndefined: Self = StObject.set(x, "NotebookS3Location", js.undefined)
    
    inline def setOutputNotebookFormat(value: OutputNotebookFormat): Self = StObject.set(x, "OutputNotebookFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputNotebookFormatUndefined: Self = StObject.set(x, "OutputNotebookFormat", js.undefined)
    
    inline def setOutputNotebookS3Location(value: OutputNotebookS3LocationFromInput): Self = StObject.set(x, "OutputNotebookS3Location", value.asInstanceOf[js.Any])
    
    inline def setOutputNotebookS3LocationUndefined: Self = StObject.set(x, "OutputNotebookS3Location", js.undefined)
    
    inline def setRelativePath(value: XmlString): Self = StObject.set(x, "RelativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "RelativePath", js.undefined)
    
    inline def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
