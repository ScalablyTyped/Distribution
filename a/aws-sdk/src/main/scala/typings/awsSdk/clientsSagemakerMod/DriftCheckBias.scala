package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriftCheckBias extends StObject {
  
  /**
    * The bias config file for a model.
    */
  var ConfigFile: js.UndefOr[FileSource] = js.undefined
  
  /**
    * The post-training constraints.
    */
  var PostTrainingConstraints: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * The pre-training constraints.
    */
  var PreTrainingConstraints: js.UndefOr[MetricsSource] = js.undefined
}
object DriftCheckBias {
  
  inline def apply(): DriftCheckBias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriftCheckBias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriftCheckBias] (val x: Self) extends AnyVal {
    
    inline def setConfigFile(value: FileSource): Self = StObject.set(x, "ConfigFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "ConfigFile", js.undefined)
    
    inline def setPostTrainingConstraints(value: MetricsSource): Self = StObject.set(x, "PostTrainingConstraints", value.asInstanceOf[js.Any])
    
    inline def setPostTrainingConstraintsUndefined: Self = StObject.set(x, "PostTrainingConstraints", js.undefined)
    
    inline def setPreTrainingConstraints(value: MetricsSource): Self = StObject.set(x, "PreTrainingConstraints", value.asInstanceOf[js.Any])
    
    inline def setPreTrainingConstraintsUndefined: Self = StObject.set(x, "PreTrainingConstraints", js.undefined)
  }
}
