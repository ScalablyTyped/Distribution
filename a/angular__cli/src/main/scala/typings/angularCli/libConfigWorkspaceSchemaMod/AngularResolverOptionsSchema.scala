package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularResolverOptionsSchema extends StObject {
  
  /**
    * When true (the default), creates the new files at the top level of the current project.
    */
  var flat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Creates the resolver as a `ResolveFn`.
    */
  var functional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the new resolver.
    */
  var name: String
  
  /**
    * The path at which to create the interface that defines the resolver, relative to the
    * current workspace.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project.
    */
  var project: String
  
  /**
    * Do not create "spec.ts" test files for the new resolver.
    */
  var skipTests: js.UndefOr[Boolean] = js.undefined
}
object AngularResolverOptionsSchema {
  
  inline def apply(name: String, project: String): AngularResolverOptionsSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularResolverOptionsSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngularResolverOptionsSchema] (val x: Self) extends AnyVal {
    
    inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
    
    inline def setFunctionalUndefined: Self = StObject.set(x, "functional", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
    
    inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
  }
}
