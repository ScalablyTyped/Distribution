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
}
object Pipe {
  
  @JSImport("@angular/core", "Pipe")
  @js.native
  val ^ : PipeDecorator = js.native
  
  @scala.inline
  implicit class PipeMutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
