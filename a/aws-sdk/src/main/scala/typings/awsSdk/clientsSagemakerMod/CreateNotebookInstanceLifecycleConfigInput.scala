package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotebookInstanceLifecycleConfigInput extends StObject {
  
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName
  
  /**
    * A shell script that runs only once, when you create a notebook instance. The shell script must be a base64-encoded string.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  
  /**
    * A shell script that runs every time you start a notebook instance, including when you create the notebook instance. The shell script must be a base64-encoded string.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
}
object CreateNotebookInstanceLifecycleConfigInput {
  
  inline def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): CreateNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigInput]
  }
  
  extension [Self <: CreateNotebookInstanceLifecycleConfigInput](x: Self) {
    
    inline def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setOnCreate(value: NotebookInstanceLifecycleConfigList): Self = StObject.set(x, "OnCreate", value.asInstanceOf[js.Any])
    
    inline def setOnCreateUndefined: Self = StObject.set(x, "OnCreate", js.undefined)
    
    inline def setOnCreateVarargs(value: NotebookInstanceLifecycleHook*): Self = StObject.set(x, "OnCreate", js.Array(value*))
    
    inline def setOnStart(value: NotebookInstanceLifecycleConfigList): Self = StObject.set(x, "OnStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartUndefined: Self = StObject.set(x, "OnStart", js.undefined)
    
    inline def setOnStartVarargs(value: NotebookInstanceLifecycleHook*): Self = StObject.set(x, "OnStart", js.Array(value*))
  }
}
