package typings.angularCli.workspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  var cli: js.UndefOr[CliOptions] = js.undefined
  
  /**
    * Default project name used in commands.
    * @deprecated The project to use will be determined from the current working directory.
    */
  var defaultProject: js.UndefOr[String] = js.undefined
  
  /**
    * Path where new projects will be created.
    */
  var newProjectRoot: js.UndefOr[String] = js.undefined
  
  var projects: js.UndefOr[Projects] = js.undefined
  
  var schematics: js.UndefOr[SchematicOptions] = js.undefined
  
  var version: Double
}
object Schema {
  
  inline def apply(version: Double): Schema = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setCli(value: CliOptions): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
    
    inline def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
    
    inline def setDefaultProject(value: String): Self = StObject.set(x, "defaultProject", value.asInstanceOf[js.Any])
    
    inline def setDefaultProjectUndefined: Self = StObject.set(x, "defaultProject", js.undefined)
    
    inline def setNewProjectRoot(value: String): Self = StObject.set(x, "newProjectRoot", value.asInstanceOf[js.Any])
    
    inline def setNewProjectRootUndefined: Self = StObject.set(x, "newProjectRoot", js.undefined)
    
    inline def setProjects(value: Projects): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setSchematics(value: SchematicOptions): Self = StObject.set(x, "schematics", value.asInstanceOf[js.Any])
    
    inline def setSchematicsUndefined: Self = StObject.set(x, "schematics", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
