package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularInterceptorOptionsSchema extends StObject {
  
  /**
    * When true (the default), creates files at the top level of the project.
    */
  var flat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the interceptor.
    */
  var name: String
  
  /**
    * The path at which to create the interceptor, relative to the workspace root.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Do not create "spec.ts" test files for the new interceptor.
    */
  var skipTests: js.UndefOr[Boolean] = js.undefined
}
object AngularInterceptorOptionsSchema {
  
  inline def apply(name: String): AngularInterceptorOptionsSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularInterceptorOptionsSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngularInterceptorOptionsSchema] (val x: Self) extends AnyVal {
    
    inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
    
    inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
  }
}
