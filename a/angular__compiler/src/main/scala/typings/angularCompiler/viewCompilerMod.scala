package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.ClassAttr
import typings.angularCompiler.apiMod.R3ComponentDef
import typings.angularCompiler.apiMod.R3ComponentMetadata
import typings.angularCompiler.apiMod.R3DirectiveDef
import typings.angularCompiler.apiMod.R3DirectiveMetadata
import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.constantPoolMod.ConstantPool
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3TemplateTransformMod.Render3ParseResult
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewCompilerMod {
  
  @JSImport("@angular/compiler/src/render3/view/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileComponentFromMetadata(meta: R3ComponentMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3ComponentDef = (^.asInstanceOf[js.Dynamic].applyDynamic("compileComponentFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[R3ComponentDef]
  
  inline def compileComponentFromRender2(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    render3Ast: Render3ParseResult,
    reflector: CompileReflector,
    bindingParser: BindingParser,
    directiveTypeBySel: Map[String, js.Any],
    pipeTypeByName: Map[String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compileComponentFromRender2")(outputCtx.asInstanceOf[js.Any], component.asInstanceOf[js.Any], render3Ast.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any], directiveTypeBySel.asInstanceOf[js.Any], pipeTypeByName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compileDirectiveFromMetadata(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3DirectiveDef = (^.asInstanceOf[js.Dynamic].applyDynamic("compileDirectiveFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[R3DirectiveDef]
  
  inline def compileDirectiveFromRender2(
    outputCtx: OutputContext,
    directive: CompileDirectiveMetadata,
    reflector: CompileReflector,
    bindingParser: BindingParser
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compileDirectiveFromRender2")(outputCtx.asInstanceOf[js.Any], directive.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseHostBindings(host: StringDictionary[String | Expression]): ParsedHostBindings = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHostBindings")(host.asInstanceOf[js.Any]).asInstanceOf[ParsedHostBindings]
  
  inline def verifyHostBindings(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyHostBindings")(bindings.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseError]]
  
  trait ParsedHostBindings extends StObject {
    
    var attributes: StringDictionary[Expression]
    
    var listeners: StringDictionary[String]
    
    var properties: StringDictionary[String]
    
    var specialAttributes: ClassAttr
  }
  object ParsedHostBindings {
    
    inline def apply(
      attributes: StringDictionary[Expression],
      listeners: StringDictionary[String],
      properties: StringDictionary[String],
      specialAttributes: ClassAttr
    ): ParsedHostBindings = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHostBindings]
    }
    
    extension [Self <: ParsedHostBindings](x: Self) {
      
      inline def setAttributes(value: StringDictionary[Expression]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSpecialAttributes(value: ClassAttr): Self = StObject.set(x, "specialAttributes", value.asInstanceOf[js.Any])
    }
  }
}
