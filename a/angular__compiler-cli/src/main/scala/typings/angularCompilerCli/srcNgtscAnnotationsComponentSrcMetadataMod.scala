package typings.angularCompilerCli

import typings.angularCompiler.mod.AnimationTriggerNames
import typings.angularCompiler.mod.DeclarationListEmitMode
import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3ComponentMetadata
import typings.angularCompiler.mod.R3TemplateDependencyMetadata
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.anon.OmitR3ComponentMetadataR3
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcResourcesMod.ParsedTemplateWithSource
import typings.angularCompilerCli.srcNgtscAnnotationsComponentSrcResourcesMod.StyleUrlMeta
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.ComponentResources
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SubsetOfKeys
import typings.std.Set
import typings.typescript.mod.Decorator
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsComponentSrcMetadataMod {
  
  trait ComponentAnalysisData extends StObject {
    
    var animationTriggerNames: AnimationTriggerNames | Null
    
    var baseClass: Reference[ClassDeclaration[DeclarationNode]] | "dynamic" | Null
    
    var classMetadata: R3ClassMetadata | Null
    
    var decorator: Decorator | Null
    
    /**
      * Inline stylesheets extracted from the decorator, if present.
      */
    var inlineStyles: js.Array[String] | Null
    
    var inputs: ClassPropertyMapping
    
    var isPoisoned: Boolean
    
    /**
      * `meta` includes those fields of `R3ComponentMetadata` which are calculated at `analyze` time
      * (not during resolve).
      */
    var meta: OmitR3ComponentMetadataR3
    
    var outputs: ClassPropertyMapping
    
    /**
      * Providers extracted from the `providers` field of the component annotation which will require
      * an Angular factory definition at runtime.
      */
    var providersRequiringFactory: Set[Reference[ClassDeclaration[DeclarationNode]]] | Null
    
    var rawImports: Expression | Null
    
    var resolvedImports: js.Array[Reference[ClassDeclaration[DeclarationNode]]] | Null
    
    var resources: ComponentResources
    
    var schemas: js.Array[SchemaMetadata] | Null
    
    /**
      * `styleUrls` extracted from the decorator, if present.
      */
    var styleUrls: js.Array[StyleUrlMeta] | Null
    
    var template: ParsedTemplateWithSource
    
    var typeCheckMeta: DirectiveTypeCheckMeta
    
    /**
      * Providers extracted from the `viewProviders` field of the component annotation which will
      * require an Angular factory definition at runtime.
      */
    var viewProvidersRequiringFactory: Set[Reference[ClassDeclaration[DeclarationNode]]] | Null
  }
  object ComponentAnalysisData {
    
    inline def apply(
      inputs: ClassPropertyMapping,
      isPoisoned: Boolean,
      meta: OmitR3ComponentMetadataR3,
      outputs: ClassPropertyMapping,
      resources: ComponentResources,
      template: ParsedTemplateWithSource,
      typeCheckMeta: DirectiveTypeCheckMeta
    ): ComponentAnalysisData = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeCheckMeta = typeCheckMeta.asInstanceOf[js.Any], animationTriggerNames = null, baseClass = null, classMetadata = null, decorator = null, inlineStyles = null, providersRequiringFactory = null, rawImports = null, resolvedImports = null, schemas = null, styleUrls = null, viewProvidersRequiringFactory = null)
      __obj.asInstanceOf[ComponentAnalysisData]
    }
    
    extension [Self <: ComponentAnalysisData](x: Self) {
      
      inline def setAnimationTriggerNames(value: AnimationTriggerNames): Self = StObject.set(x, "animationTriggerNames", value.asInstanceOf[js.Any])
      
      inline def setAnimationTriggerNamesNull: Self = StObject.set(x, "animationTriggerNames", null)
      
      inline def setBaseClass(value: Reference[ClassDeclaration[DeclarationNode]] | "dynamic"): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setInlineStyles(value: js.Array[String]): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
      
      inline def setInlineStylesNull: Self = StObject.set(x, "inlineStyles", null)
      
      inline def setInlineStylesVarargs(value: String*): Self = StObject.set(x, "inlineStyles", js.Array(value*))
      
      inline def setInputs(value: ClassPropertyMapping): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: OmitR3ComponentMetadataR3): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: ClassPropertyMapping): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
      
      inline def setRawImports(value: Expression): Self = StObject.set(x, "rawImports", value.asInstanceOf[js.Any])
      
      inline def setRawImportsNull: Self = StObject.set(x, "rawImports", null)
      
      inline def setResolvedImports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "resolvedImports", value.asInstanceOf[js.Any])
      
      inline def setResolvedImportsNull: Self = StObject.set(x, "resolvedImports", null)
      
      inline def setResolvedImportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "resolvedImports", js.Array(value*))
      
      inline def setResources(value: ComponentResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setStyleUrls(value: js.Array[StyleUrlMeta]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
      
      inline def setStyleUrlsNull: Self = StObject.set(x, "styleUrls", null)
      
      inline def setStyleUrlsVarargs(value: StyleUrlMeta*): Self = StObject.set(x, "styleUrls", js.Array(value*))
      
      inline def setTemplate(value: ParsedTemplateWithSource): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTypeCheckMeta(value: DirectiveTypeCheckMeta): Self = StObject.set(x, "typeCheckMeta", value.asInstanceOf[js.Any])
      
      inline def setViewProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "viewProvidersRequiringFactory", value.asInstanceOf[js.Any])
      
      inline def setViewProvidersRequiringFactoryNull: Self = StObject.set(x, "viewProvidersRequiringFactory", null)
    }
  }
  
  type ComponentMetadataResolvedFields = SubsetOfKeys[
    R3ComponentMetadata[R3TemplateDependencyMetadata], 
    "declarations" | "declarationListEmitMode"
  ]
  
  /* Inlined std.Pick<@angular/compiler.@angular/compiler.R3ComponentMetadata<@angular/compiler.@angular/compiler.R3TemplateDependencyMetadata>, @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/component/src/metadata.ComponentMetadataResolvedFields> */
  trait ComponentResolutionData extends StObject {
    
    var declarationListEmitMode: DeclarationListEmitMode
    
    var declarations: js.Array[R3TemplateDependencyMetadata]
  }
  object ComponentResolutionData {
    
    inline def apply(
      declarationListEmitMode: DeclarationListEmitMode,
      declarations: js.Array[R3TemplateDependencyMetadata]
    ): ComponentResolutionData = {
      val __obj = js.Dynamic.literal(declarationListEmitMode = declarationListEmitMode.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentResolutionData]
    }
    
    extension [Self <: ComponentResolutionData](x: Self) {
      
      inline def setDeclarationListEmitMode(value: DeclarationListEmitMode): Self = StObject.set(x, "declarationListEmitMode", value.asInstanceOf[js.Any])
      
      inline def setDeclarations(value: js.Array[R3TemplateDependencyMetadata]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsVarargs(value: R3TemplateDependencyMetadata*): Self = StObject.set(x, "declarations", js.Array(value*))
    }
  }
}
