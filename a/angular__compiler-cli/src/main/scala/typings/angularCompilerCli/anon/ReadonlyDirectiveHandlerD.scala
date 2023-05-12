package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3DirectiveMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.dynamic
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.HostDirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import typings.std.Set
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/directive/src/handler.DirectiveHandlerData> */
trait ReadonlyDirectiveHandlerD extends StObject {
  
  val baseClass: js.UndefOr[Reference[ClassDeclarationDeclarati] | dynamic | Null] = js.undefined
  
  val classMetadata: js.UndefOr[R3ClassMetadata | Null] = js.undefined
  
  val decorator: js.UndefOr[typings.typescript.mod.Decorator | Null] = js.undefined
  
  val hostDirectives: js.UndefOr[js.Array[HostDirectiveMeta] | Null] = js.undefined
  
  val inputs: ClassPropertyMapping[InputMapping]
  
  val isPoisoned: Boolean
  
  val isStructural: Boolean
  
  val meta: R3DirectiveMetadata
  
  val outputs: ClassPropertyMapping[InputOrOutput]
  
  val providersRequiringFactory: js.UndefOr[Set[Reference[ClassDeclarationDeclarati]] | Null] = js.undefined
  
  val rawHostDirectives: js.UndefOr[Expression | Null] = js.undefined
  
  val typeCheckMeta: DirectiveTypeCheckMeta
}
object ReadonlyDirectiveHandlerD {
  
  inline def apply(
    inputs: ClassPropertyMapping[InputMapping],
    isPoisoned: Boolean,
    isStructural: Boolean,
    meta: R3DirectiveMetadata,
    outputs: ClassPropertyMapping[InputOrOutput],
    typeCheckMeta: DirectiveTypeCheckMeta
  ): ReadonlyDirectiveHandlerD = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], typeCheckMeta = typeCheckMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDirectiveHandlerD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyDirectiveHandlerD] (val x: Self) extends AnyVal {
    
    inline def setBaseClass(value: Reference[ClassDeclarationDeclarati] | dynamic): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
    
    inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
    
    inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
    
    inline def setClassMetadataUndefined: Self = StObject.set(x, "classMetadata", js.undefined)
    
    inline def setDecorator(value: typings.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    inline def setHostDirectives(value: js.Array[HostDirectiveMeta]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
    
    inline def setHostDirectivesNull: Self = StObject.set(x, "hostDirectives", null)
    
    inline def setHostDirectivesUndefined: Self = StObject.set(x, "hostDirectives", js.undefined)
    
    inline def setHostDirectivesVarargs(value: HostDirectiveMeta*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
    
    inline def setInputs(value: ClassPropertyMapping[InputMapping]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
    
    inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: R3DirectiveMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: ClassPropertyMapping[InputOrOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
    
    inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
    
    inline def setProvidersRequiringFactoryUndefined: Self = StObject.set(x, "providersRequiringFactory", js.undefined)
    
    inline def setRawHostDirectives(value: Expression): Self = StObject.set(x, "rawHostDirectives", value.asInstanceOf[js.Any])
    
    inline def setRawHostDirectivesNull: Self = StObject.set(x, "rawHostDirectives", null)
    
    inline def setRawHostDirectivesUndefined: Self = StObject.set(x, "rawHostDirectives", js.undefined)
    
    inline def setTypeCheckMeta(value: DirectiveTypeCheckMeta): Self = StObject.set(x, "typeCheckMeta", value.asInstanceOf[js.Any])
  }
}
