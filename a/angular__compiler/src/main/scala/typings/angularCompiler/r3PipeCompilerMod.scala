package typings.angularCompiler

import typings.angularCompiler.anon.Expression
import typings.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3PipeCompilerMod {
  
  @JSImport("@angular/compiler/src/render3/r3_pipe_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compilePipeFromMetadata(metadata: R3PipeMetadata): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("compilePipeFromMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def compilePipeFromRender2(outputCtx: OutputContext, pipe: CompilePipeMetadata, reflector: CompileReflector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compilePipeFromRender2")(outputCtx.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    var internalType: typings.angularCompiler.outputAstMod.Expression
    
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
      internalType: typings.angularCompiler.outputAstMod.Expression,
      name: String,
      pipeName: String,
      pure: Boolean,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3PipeMetadata = {
      val __obj = js.Dynamic.literal(internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3PipeMetadata]
    }
    
    extension [Self <: R3PipeMetadata](x: Self) {
      
      inline def setDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsNull: Self = StObject.set(x, "deps", null)
      
      inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      inline def setInternalType(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPipeName(value: String): Self = StObject.set(x, "pipeName", value.asInstanceOf[js.Any])
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    }
  }
}
