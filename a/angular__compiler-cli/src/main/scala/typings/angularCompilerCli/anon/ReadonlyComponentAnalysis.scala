package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.AnimationTriggerNames
import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.dynamic
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcResourcesMod.ParsedTemplateWithSource
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcResourcesMod.StyleUrlMeta
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.ComponentResources
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.std.Set
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/component/src/metadata.ComponentAnalysisData> */
trait ReadonlyComponentAnalysis extends StObject {
  
  val animationTriggerNames: js.UndefOr[AnimationTriggerNames | Null] = js.undefined
  
  val baseClass: js.UndefOr[Reference[ClassDeclaration[DeclarationNode]] | dynamic | Null] = js.undefined
  
  val classMetadata: js.UndefOr[R3ClassMetadata | Null] = js.undefined
  
  val decorator: js.UndefOr[typings.typescript.mod.Decorator | Null] = js.undefined
  
  val inlineStyles: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  val inputs: ClassPropertyMapping
  
  val isPoisoned: Boolean
  
  val meta: OmitR3ComponentMetadataR3
  
  val outputs: ClassPropertyMapping
  
  val providersRequiringFactory: js.UndefOr[Set[Reference[ClassDeclaration[DeclarationNode]]] | Null] = js.undefined
  
  val rawImports: js.UndefOr[Expression | Null] = js.undefined
  
  val resolvedImports: js.UndefOr[js.Array[Reference[ClassDeclaration[DeclarationNode]]] | Null] = js.undefined
  
  val resources: ComponentResources
  
  val schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  
  val styleUrls: js.UndefOr[js.Array[StyleUrlMeta] | Null] = js.undefined
  
  val template: ParsedTemplateWithSource
  
  val typeCheckMeta: DirectiveTypeCheckMeta
  
  val viewProvidersRequiringFactory: js.UndefOr[Set[Reference[ClassDeclaration[DeclarationNode]]] | Null] = js.undefined
}
object ReadonlyComponentAnalysis {
  
  inline def apply(
    inputs: ClassPropertyMapping,
    isPoisoned: Boolean,
    meta: OmitR3ComponentMetadataR3,
    outputs: ClassPropertyMapping,
    resources: ComponentResources,
    template: ParsedTemplateWithSource,
    typeCheckMeta: DirectiveTypeCheckMeta
  ): ReadonlyComponentAnalysis = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeCheckMeta = typeCheckMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentAnalysis]
  }
  
  extension [Self <: ReadonlyComponentAnalysis](x: Self) {
    
    inline def setAnimationTriggerNames(value: AnimationTriggerNames): Self = StObject.set(x, "animationTriggerNames", value.asInstanceOf[js.Any])
    
    inline def setAnimationTriggerNamesNull: Self = StObject.set(x, "animationTriggerNames", null)
    
    inline def setAnimationTriggerNamesUndefined: Self = StObject.set(x, "animationTriggerNames", js.undefined)
    
    inline def setBaseClass(value: Reference[ClassDeclaration[DeclarationNode]] | dynamic): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
    
    inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
    
    inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
    
    inline def setClassMetadataUndefined: Self = StObject.set(x, "classMetadata", js.undefined)
    
    inline def setDecorator(value: typings.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    inline def setInlineStyles(value: js.Array[String]): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
    
    inline def setInlineStylesNull: Self = StObject.set(x, "inlineStyles", null)
    
    inline def setInlineStylesUndefined: Self = StObject.set(x, "inlineStyles", js.undefined)
    
    inline def setInlineStylesVarargs(value: String*): Self = StObject.set(x, "inlineStyles", js.Array(value*))
    
    inline def setInputs(value: ClassPropertyMapping): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: OmitR3ComponentMetadataR3): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: ClassPropertyMapping): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
    
    inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
    
    inline def setProvidersRequiringFactoryUndefined: Self = StObject.set(x, "providersRequiringFactory", js.undefined)
    
    inline def setRawImports(value: Expression): Self = StObject.set(x, "rawImports", value.asInstanceOf[js.Any])
    
    inline def setRawImportsNull: Self = StObject.set(x, "rawImports", null)
    
    inline def setRawImportsUndefined: Self = StObject.set(x, "rawImports", js.undefined)
    
    inline def setResolvedImports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "resolvedImports", value.asInstanceOf[js.Any])
    
    inline def setResolvedImportsNull: Self = StObject.set(x, "resolvedImports", null)
    
    inline def setResolvedImportsUndefined: Self = StObject.set(x, "resolvedImports", js.undefined)
    
    inline def setResolvedImportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "resolvedImports", js.Array(value*))
    
    inline def setResources(value: ComponentResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setStyleUrls(value: js.Array[StyleUrlMeta]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsNull: Self = StObject.set(x, "styleUrls", null)
    
    inline def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    inline def setStyleUrlsVarargs(value: StyleUrlMeta*): Self = StObject.set(x, "styleUrls", js.Array(value*))
    
    inline def setTemplate(value: ParsedTemplateWithSource): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTypeCheckMeta(value: DirectiveTypeCheckMeta): Self = StObject.set(x, "typeCheckMeta", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "viewProvidersRequiringFactory", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersRequiringFactoryNull: Self = StObject.set(x, "viewProvidersRequiringFactory", null)
    
    inline def setViewProvidersRequiringFactoryUndefined: Self = StObject.set(x, "viewProvidersRequiringFactory", js.undefined)
  }
}
