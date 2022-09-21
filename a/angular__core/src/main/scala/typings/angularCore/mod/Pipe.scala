package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipe extends StObject {
  
  /**
    * The pipe name to use in template bindings.
    * Typically uses [lowerCamelCase](guide/glossary#case-types)
    * because the name cannot contain hyphens.
    */
  var name: String
  
  /**
    * When true, the pipe is pure, meaning that the
    * `transform()` method is invoked only when its input arguments
    * change. Pipes are pure by default.
    *
    * If the pipe has internal state (that is, the result
    * depends on state other than its arguments), set `pure` to false.
    * In this case, the pipe is invoked on each change-detection cycle,
    * even if the arguments have not changed.
    */
  var pure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Angular pipes marked as `standalone` do not need to be declared in an NgModule. Such
    * pipes don't depend on any "intermediate context" of an NgModule (ex. configured providers).
    *
    * More information about standalone components, directives and pipes can be found in [this
    * guide](guide/standalone-components).
    */
  var standalone: js.UndefOr[Boolean] = js.undefined
}
object Pipe {
  
  @JSImport("@angular/core", "Pipe")
  @js.native
  val ^ : PipeDecorator = js.native
  
  extension [Self <: Pipe](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
  }
}
