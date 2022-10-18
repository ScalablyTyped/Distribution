package typings.angularDevkitArchitect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOutputSchemaMod {
  
  trait Schema extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var success: Boolean
    
    var target: js.UndefOr[Target] = js.undefined
  }
  object Schema {
    
    inline def apply(success: Boolean): Schema = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: StringDictionary[Any]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Target extends StObject {
    
    var configuration: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Target {
    
    inline def apply(): Target = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
