package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeModelSummary extends StObject {
  
  /**
    * The name of the model.
    */
  var ModelName: EntityName
  
  /**
    * The version model.
    */
  var ModelVersion: EdgeVersion
}
object EdgeModelSummary {
  
  inline def apply(ModelName: EntityName, ModelVersion: EdgeVersion): EdgeModelSummary = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeModelSummary]
  }
  
  extension [Self <: EdgeModelSummary](x: Self) {
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelVersion(value: EdgeVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
  }
}
