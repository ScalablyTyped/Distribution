package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JupyterServerAppSettings extends StObject {
  
  /**
    * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application.
    */
  var CodeRepositories: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CodeRepositories] = js.undefined
  
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the JupyterServer app. If you use the LifecycleConfigArns parameter, then this parameter is also required.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp. If you use this parameter, the DefaultResourceSpec parameter is also required.  To remove a Lifecycle Config, you must set LifecycleConfigArns to an empty list. 
    */
  var LifecycleConfigArns: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LifecycleConfigArns] = js.undefined
}
object JupyterServerAppSettings {
  
  inline def apply(): JupyterServerAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JupyterServerAppSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JupyterServerAppSettings] (val x: Self) extends AnyVal {
    
    inline def setCodeRepositories(value: CodeRepositories): Self = StObject.set(x, "CodeRepositories", value.asInstanceOf[js.Any])
    
    inline def setCodeRepositoriesUndefined: Self = StObject.set(x, "CodeRepositories", js.undefined)
    
    inline def setCodeRepositoriesVarargs(value: CodeRepository*): Self = StObject.set(x, "CodeRepositories", js.Array(value*))
    
    inline def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
    
    inline def setLifecycleConfigArns(value: LifecycleConfigArns): Self = StObject.set(x, "LifecycleConfigArns", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigArnsUndefined: Self = StObject.set(x, "LifecycleConfigArns", js.undefined)
    
    inline def setLifecycleConfigArnsVarargs(value: StudioLifecycleConfigArn*): Self = StObject.set(x, "LifecycleConfigArns", js.Array(value*))
  }
}
