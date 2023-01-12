package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3PipeMetadata extends StObject {
  
  /**
    * Dependencies of the pipe's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | Null
  
  /**
    * An expression representing the pipe being compiled, intended for use within a class definition
    * itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside an
    * IIFE structure that uses a different name internally.
    */
  var internalType: Expression
  
  /**
    * Whether the pipe is standalone.
    */
  var isStandalone: Boolean
  
  /**
    * Name of the pipe type.
    */
  var name: String
  
  /**
    * Name of the pipe.
    */
  var pipeName: String
  
  /**
    * Whether the pipe is marked as pure.
    */
  var pure: Boolean
  
  /**
    * An expression representing a reference to the pipe itself.
    */
  var `type`: R3Reference
  
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double
}
object R3PipeMetadata {
  
  inline def apply(
    internalType: Expression,
    isStandalone: Boolean,
    name: String,
    pipeName: String,
    pure: Boolean,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3PipeMetadata = {
    val __obj = js.Dynamic.literal(internalType = internalType.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3PipeMetadata] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPipeName(value: String): Self = StObject.set(x, "pipeName", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
  }
}
