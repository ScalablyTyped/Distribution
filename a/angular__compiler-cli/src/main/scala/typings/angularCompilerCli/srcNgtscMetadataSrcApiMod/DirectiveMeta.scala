package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompiler.mod.InputOutputPropertySet
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.dynamic
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Directive
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typings.std.Set
import typings.typescript.mod.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveMeta
  extends StObject
     with typings.angularCompiler.mod.DirectiveMeta
     with DirectiveTypeCheckMeta {
  
  /**
    * Whether the directive should be assumed to export providers if imported as a standalone type.
    */
  var assumedToExportProviders: Boolean
  
  /**
    * A `Reference` to the base class for the directive, if one was detected.
    *
    * A value of `'dynamic'` indicates that while the analyzer detected that this directive extends
    * another type, it could not statically determine the base class.
    */
  var baseClass: Reference[ClassDeclarationDeclarati] | dynamic | Null
  
  /**
    * The primary decorator associated with this directive.
    *
    * If this is `null`, no decorator exists, meaning it's probably from a .d.ts file.
    */
  var decorator: Decorator | Null
  
  /** Additional directives applied to the directive host. */
  var hostDirectives: js.Array[HostDirectiveMeta] | Null
  
  /**
    * For standalone components, the list of imported types.
    */
  var imports: js.Array[Reference[ClassDeclarationDeclarati]] | Null
  
  /**
    * Whether the directive had some issue with its declaration that means it might not have complete
    * and reliable metadata.
    */
  var isPoisoned: Boolean
  
  /**
    * Whether the directive is a standalone entity.
    */
  var isStandalone: Boolean
  
  var kind: Directive
  
  /** Way in which the directive was matched. */
  var matchSource: MatchSource
  
  var queries: js.Array[String]
  
  var ref: Reference[ClassDeclarationDeclarati]
  
  /**
    * For standalone components, the list of schemas declared.
    */
  var schemas: js.Array[SchemaMetadata] | Null
}
object DirectiveMeta {
  
  inline def apply(
    assumedToExportProviders: Boolean,
    coercedInputFields: Set[ClassPropertyName],
    hasNgTemplateContextGuard: Boolean,
    inputs: InputOutputPropertySet,
    isComponent: Boolean,
    isGeneric: Boolean,
    isPoisoned: Boolean,
    isStandalone: Boolean,
    isStructural: Boolean,
    kind: Directive,
    matchSource: MatchSource,
    name: String,
    ngTemplateGuards: js.Array[TemplateGuardMeta],
    outputs: InputOutputPropertySet,
    queries: js.Array[String],
    ref: Reference[ClassDeclarationDeclarati],
    restrictedInputFields: Set[ClassPropertyName],
    stringLiteralInputFields: Set[ClassPropertyName],
    undeclaredInputFields: Set[ClassPropertyName]
  ): DirectiveMeta = {
    val __obj = js.Dynamic.literal(assumedToExportProviders = assumedToExportProviders.asInstanceOf[js.Any], coercedInputFields = coercedInputFields.asInstanceOf[js.Any], hasNgTemplateContextGuard = hasNgTemplateContextGuard.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchSource = matchSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ngTemplateGuards = ngTemplateGuards.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], restrictedInputFields = restrictedInputFields.asInstanceOf[js.Any], stringLiteralInputFields = stringLiteralInputFields.asInstanceOf[js.Any], undeclaredInputFields = undeclaredInputFields.asInstanceOf[js.Any], animationTriggerNames = null, baseClass = null, decorator = null, exportAs = null, hostDirectives = null, imports = null, schemas = null, selector = null)
    __obj.asInstanceOf[DirectiveMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveMeta] (val x: Self) extends AnyVal {
    
    inline def setAssumedToExportProviders(value: Boolean): Self = StObject.set(x, "assumedToExportProviders", value.asInstanceOf[js.Any])
    
    inline def setBaseClass(value: Reference[ClassDeclarationDeclarati] | dynamic): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
    
    inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setHostDirectives(value: js.Array[HostDirectiveMeta]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
    
    inline def setHostDirectivesNull: Self = StObject.set(x, "hostDirectives", null)
    
    inline def setHostDirectivesVarargs(value: HostDirectiveMeta*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
    
    inline def setImports(value: js.Array[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsNull: Self = StObject.set(x, "imports", null)
    
    inline def setImportsVarargs(value: Reference[ClassDeclarationDeclarati]*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Directive): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMatchSource(value: MatchSource): Self = StObject.set(x, "matchSource", value.asInstanceOf[js.Any])
    
    inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
