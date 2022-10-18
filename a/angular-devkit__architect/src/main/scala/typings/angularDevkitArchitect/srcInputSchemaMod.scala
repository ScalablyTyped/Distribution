package typings.angularDevkitArchitect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInputSchemaMod {
  
  trait Schema extends StObject {
    
    var currentDirectory: String
    
    var id: Double
    
    var info: StringDictionary[Any]
    
    var options: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var target: js.UndefOr[Target] = js.undefined
    
    var workspaceRoot: String
  }
  object Schema {
    
    inline def apply(currentDirectory: String, id: Double, info: StringDictionary[Any], workspaceRoot: String): Schema = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setCurrentDirectory(value: String): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: StringDictionary[Any]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWorkspaceRoot(value: String): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var configuration: js.UndefOr[String] = js.undefined
    
    var project: String
    
    var target: String
  }
  object Target {
    
    inline def apply(project: String, target: String): Target = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
