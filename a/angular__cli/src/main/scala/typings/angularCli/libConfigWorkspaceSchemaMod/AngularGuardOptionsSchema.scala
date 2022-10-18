package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularGuardOptionsSchema extends StObject {
  
  /**
    * When true (the default), creates the new files at the top level of the current project.
    */
  var flat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies which interfaces to implement.
    */
  var implements: js.UndefOr[js.Array[Implement]] = js.undefined
  
  /**
    * The name of the new route guard.
    */
  var name: String
  
  /**
    * The path at which to create the interface that defines the guard, relative to the current
    * workspace.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Do not create "spec.ts" test files for the new guard.
    */
  var skipTests: js.UndefOr[Boolean] = js.undefined
}
object AngularGuardOptionsSchema {
  
  inline def apply(name: String): AngularGuardOptionsSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularGuardOptionsSchema]
  }
  
  extension [Self <: AngularGuardOptionsSchema](x: Self) {
    
    inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setImplements(value: js.Array[Implement]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    inline def setImplementsVarargs(value: Implement*): Self = StObject.set(x, "implements", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
    
    inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
  }
}
