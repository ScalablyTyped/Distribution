package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskExecutionRequest extends StObject {
  
  /**
    * Specifies a list of filter rules that determines which files to exclude from a task. The list contains a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2". 
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Specifies a list of filter rules that determines which files to include when running a task. The pattern should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2". 
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  
  var OverrideOptions: js.UndefOr[Options] = js.undefined
  
  /**
    * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task execution.  Tags are key-value pairs that help you manage, filter, and search for your DataSync resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the task that you want to start.
    */
  var TaskArn: typings.awsSdk.clientsDatasyncMod.TaskArn
}
object StartTaskExecutionRequest {
  
  inline def apply(TaskArn: TaskArn): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTaskExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    inline def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value*))
    
    inline def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    inline def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value*))
    
    inline def setOverrideOptions(value: Options): Self = StObject.set(x, "OverrideOptions", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionsUndefined: Self = StObject.set(x, "OverrideOptions", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
  }
}
