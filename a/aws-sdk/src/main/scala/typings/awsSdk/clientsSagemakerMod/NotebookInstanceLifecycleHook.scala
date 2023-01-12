package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookInstanceLifecycleHook extends StObject {
  
  /**
    * A base64-encoded string that contains a shell script for a notebook instance lifecycle configuration.
    */
  var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent] = js.undefined
}
object NotebookInstanceLifecycleHook {
  
  inline def apply(): NotebookInstanceLifecycleHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookInstanceLifecycleHook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookInstanceLifecycleHook] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NotebookInstanceLifecycleConfigContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
  }
}
