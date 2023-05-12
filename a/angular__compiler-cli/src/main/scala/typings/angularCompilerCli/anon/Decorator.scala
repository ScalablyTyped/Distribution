package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3DirectiveMetadata
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.HostDirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import typings.std.Map
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorator extends StObject {
  
  var decorator: Map[String, Expression]
  
  var hostDirectives: js.Array[HostDirectiveMeta] | Null
  
  var inputs: ClassPropertyMapping[InputMapping]
  
  var isStructural: Boolean
  
  var metadata: R3DirectiveMetadata
  
  var outputs: ClassPropertyMapping[InputOrOutput]
  
  var rawHostDirectives: Expression | Null
}
object Decorator {
  
  inline def apply(
    decorator: Map[String, Expression],
    inputs: ClassPropertyMapping[InputMapping],
    isStructural: Boolean,
    metadata: R3DirectiveMetadata,
    outputs: ClassPropertyMapping[InputOrOutput]
  ): Decorator = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], hostDirectives = null, rawHostDirectives = null)
    __obj.asInstanceOf[Decorator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decorator] (val x: Self) extends AnyVal {
    
    inline def setDecorator(value: Map[String, Expression]): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setHostDirectives(value: js.Array[HostDirectiveMeta]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
    
    inline def setHostDirectivesNull: Self = StObject.set(x, "hostDirectives", null)
    
    inline def setHostDirectivesVarargs(value: HostDirectiveMeta*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
    
    inline def setInputs(value: ClassPropertyMapping[InputMapping]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: R3DirectiveMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: ClassPropertyMapping[InputOrOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setRawHostDirectives(value: Expression): Self = StObject.set(x, "rawHostDirectives", value.asInstanceOf[js.Any])
    
    inline def setRawHostDirectivesNull: Self = StObject.set(x, "rawHostDirectives", null)
  }
}
