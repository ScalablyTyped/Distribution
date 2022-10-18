package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNotebookExecutionInput extends StObject {
  
  /**
    * The unique identifier of the EMR Notebook to use for notebook execution.
    */
  var EditorId: XmlStringMaxLen256
  
  /**
    * Specifies the execution engine (cluster) that runs the notebook execution.
    */
  var ExecutionEngine: ExecutionEngineConfig
  
  /**
    * An optional name for the notebook execution.
    */
  var NotebookExecutionName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The unique identifier of the Amazon EC2 security group to associate with the EMR Notebook for this notebook execution.
    */
  var NotebookInstanceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
    */
  var NotebookParams: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The path and file name of the notebook file for this execution, relative to the path specified for the EMR Notebook. For example, if you specify a path of s3://MyBucket/MyNotebooks when you create an EMR Notebook for a notebook with an ID of e-ABCDEFGHIJK1234567890ABCD (the EditorID of this request), and you specify a RelativePath of my_notebook_executions/notebook_execution.ipynb, the location of the file for the notebook execution is s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb.
    */
  var RelativePath: XmlString
  
  /**
    * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the EMR role) for the notebook execution.
    */
  var ServiceRole: XmlString
  
  /**
    * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a required key string with a maximum of 128 characters and an optional value string with a maximum of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object StartNotebookExecutionInput {
  
  inline def apply(
    EditorId: XmlStringMaxLen256,
    ExecutionEngine: ExecutionEngineConfig,
    RelativePath: XmlString,
    ServiceRole: XmlString
  ): StartNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(EditorId = EditorId.asInstanceOf[js.Any], ExecutionEngine = ExecutionEngine.asInstanceOf[js.Any], RelativePath = RelativePath.asInstanceOf[js.Any], ServiceRole = ServiceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNotebookExecutionInput]
  }
  
  extension [Self <: StartNotebookExecutionInput](x: Self) {
    
    inline def setEditorId(value: XmlStringMaxLen256): Self = StObject.set(x, "EditorId", value.asInstanceOf[js.Any])
    
    inline def setExecutionEngine(value: ExecutionEngineConfig): Self = StObject.set(x, "ExecutionEngine", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionName(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionName", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionNameUndefined: Self = StObject.set(x, "NotebookExecutionName", js.undefined)
    
    inline def setNotebookInstanceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookInstanceSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceSecurityGroupIdUndefined: Self = StObject.set(x, "NotebookInstanceSecurityGroupId", js.undefined)
    
    inline def setNotebookParams(value: XmlString): Self = StObject.set(x, "NotebookParams", value.asInstanceOf[js.Any])
    
    inline def setNotebookParamsUndefined: Self = StObject.set(x, "NotebookParams", js.undefined)
    
    inline def setRelativePath(value: XmlString): Self = StObject.set(x, "RelativePath", value.asInstanceOf[js.Any])
    
    inline def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
