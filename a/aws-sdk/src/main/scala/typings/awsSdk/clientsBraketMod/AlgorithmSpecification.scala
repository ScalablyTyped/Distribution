package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmSpecification extends StObject {
  
  /**
    * The container image used to create an Amazon Braket job.
    */
  var containerImage: js.UndefOr[ContainerImage] = js.undefined
  
  /**
    * Configures the paths to the Python scripts used for entry and training.
    */
  var scriptModeConfig: js.UndefOr[ScriptModeConfig] = js.undefined
}
object AlgorithmSpecification {
  
  inline def apply(): AlgorithmSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgorithmSpecification] (val x: Self) extends AnyVal {
    
    inline def setContainerImage(value: ContainerImage): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setScriptModeConfig(value: ScriptModeConfig): Self = StObject.set(x, "scriptModeConfig", value.asInstanceOf[js.Any])
    
    inline def setScriptModeConfigUndefined: Self = StObject.set(x, "scriptModeConfig", js.undefined)
  }
}
