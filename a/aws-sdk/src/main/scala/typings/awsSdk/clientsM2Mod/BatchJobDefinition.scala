package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchJobDefinition extends StObject {
  
  /**
    * Specifies a file containing a batch job definition.
    */
  var fileBatchJobDefinition: js.UndefOr[FileBatchJobDefinition] = js.undefined
  
  /**
    * A script containing a batch job definition.
    */
  var scriptBatchJobDefinition: js.UndefOr[ScriptBatchJobDefinition] = js.undefined
}
object BatchJobDefinition {
  
  inline def apply(): BatchJobDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchJobDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchJobDefinition] (val x: Self) extends AnyVal {
    
    inline def setFileBatchJobDefinition(value: FileBatchJobDefinition): Self = StObject.set(x, "fileBatchJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setFileBatchJobDefinitionUndefined: Self = StObject.set(x, "fileBatchJobDefinition", js.undefined)
    
    inline def setScriptBatchJobDefinition(value: ScriptBatchJobDefinition): Self = StObject.set(x, "scriptBatchJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setScriptBatchJobDefinitionUndefined: Self = StObject.set(x, "scriptBatchJobDefinition", js.undefined)
  }
}
