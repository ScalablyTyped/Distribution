package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriftCheckExplainability extends StObject {
  
  /**
    * The explainability config file for the model.
    */
  var ConfigFile: js.UndefOr[FileSource] = js.undefined
  
  /**
    * The drift check explainability constraints.
    */
  var Constraints: js.UndefOr[MetricsSource] = js.undefined
}
object DriftCheckExplainability {
  
  inline def apply(): DriftCheckExplainability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriftCheckExplainability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriftCheckExplainability] (val x: Self) extends AnyVal {
    
    inline def setConfigFile(value: FileSource): Self = StObject.set(x, "ConfigFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "ConfigFile", js.undefined)
    
    inline def setConstraints(value: MetricsSource): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
  }
}
