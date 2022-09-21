package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3DirectiveMetadata
import typings.angularCompilerCli.ngtscMetadataMod.ClassPropertyMapping
import typings.std.Map
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorator extends StObject {
  
  var decorator: Map[String, Expression]
  
  var inputs: ClassPropertyMapping
  
  var isStructural: Boolean
  
  var metadata: R3DirectiveMetadata
  
  var outputs: ClassPropertyMapping
}
object Decorator {
  
  inline def apply(
    decorator: Map[String, Expression],
    inputs: ClassPropertyMapping,
    isStructural: Boolean,
    metadata: R3DirectiveMetadata,
    outputs: ClassPropertyMapping
  ): Decorator = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator]
  }
  
  extension [Self <: Decorator](x: Self) {
    
    inline def setDecorator(value: Map[String, Expression]): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ClassPropertyMapping): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: R3DirectiveMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: ClassPropertyMapping): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
