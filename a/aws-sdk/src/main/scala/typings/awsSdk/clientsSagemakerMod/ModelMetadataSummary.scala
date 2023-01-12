package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMetadataSummary extends StObject {
  
  /**
    * The machine learning domain of the model.
    */
  var Domain: String
  
  /**
    * The machine learning framework of the model.
    */
  var Framework: String
  
  /**
    * The framework version of the model.
    */
  var FrameworkVersion: String
  
  /**
    * The name of the model.
    */
  var Model: String
  
  /**
    * The machine learning task of the model.
    */
  var Task: String
}
object ModelMetadataSummary {
  
  inline def apply(Domain: String, Framework: String, FrameworkVersion: String, Model: String, Task: String): ModelMetadataSummary = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Framework = Framework.asInstanceOf[js.Any], FrameworkVersion = FrameworkVersion.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelMetadataSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelMetadataSummary] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: String): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersion(value: String): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setTask(value: String): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
  }
}
