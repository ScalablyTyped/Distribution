package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.NgContentSelectors
import typings.angularCompiler.anon.UsesOnChanges
import typings.angularCompiler.mod.ChangeDetectionStrategy
import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.InterpolationConfig
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompiler.mod.R3HostMetadata
import typings.angularCompiler.mod.R3QueryMetadata
import typings.angularCompiler.mod.R3Reference
import typings.angularCompiler.mod.ViewEncapsulation
import typings.angularCompilerCli.angularCompilerCliStrings.invalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@angular/compiler.@angular/compiler.R3ComponentMetadata<@angular/compiler.@angular/compiler.R3TemplateDependencyMetadata>, @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/component/src/metadata.ComponentMetadataResolvedFields> */
trait OmitR3ComponentMetadataR3 extends StObject {
  
  var animations: js.UndefOr[Expression | Null] = js.undefined
  
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  var deps: js.UndefOr[js.Array[R3DependencyMetadata] | invalid | Null] = js.undefined
  
  var encapsulation: ViewEncapsulation
  
  var exportAs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var fullInheritance: Boolean
  
  var host: R3HostMetadata
  
  var i18nUseExternalIds: Boolean
  
  var inputs: StringDictionary[String | (js.Tuple2[String, String])]
  
  var internalType: Expression
  
  var interpolation: InterpolationConfig
  
  var isStandalone: Boolean
  
  var lifecycle: UsesOnChanges
  
  var name: String
  
  var outputs: StringDictionary[String]
  
  var providers: js.UndefOr[Expression | Null] = js.undefined
  
  var queries: js.Array[R3QueryMetadata]
  
  var relativeContextFilePath: String
  
  var selector: js.UndefOr[String | Null] = js.undefined
  
  var styles: js.Array[String]
  
  var template: NgContentSelectors
  
  var `type`: R3Reference
  
  var typeArgumentCount: Double
  
  var typeSourceSpan: ParseSourceSpan
  
  var usesInheritance: Boolean
  
  var viewProviders: js.UndefOr[Expression | Null] = js.undefined
  
  var viewQueries: js.Array[R3QueryMetadata]
}
object OmitR3ComponentMetadataR3 {
  
  inline def apply(
    encapsulation: ViewEncapsulation,
    fullInheritance: Boolean,
    host: R3HostMetadata,
    i18nUseExternalIds: Boolean,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    internalType: Expression,
    interpolation: InterpolationConfig,
    isStandalone: Boolean,
    lifecycle: UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    queries: js.Array[R3QueryMetadata],
    relativeContextFilePath: String,
    styles: js.Array[String],
    template: NgContentSelectors,
    `type`: R3Reference,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata]
  ): OmitR3ComponentMetadataR3 = {
    val __obj = js.Dynamic.literal(encapsulation = encapsulation.asInstanceOf[js.Any], fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], i18nUseExternalIds = i18nUseExternalIds.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], relativeContextFilePath = relativeContextFilePath.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitR3ComponentMetadataR3]
  }
  
  extension [Self <: OmitR3ComponentMetadataR3](x: Self) {
    
    inline def setAnimations(value: Expression): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsNull: Self = StObject.set(x, "animations", null)
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setFullInheritance(value: Boolean): Self = StObject.set(x, "fullInheritance", value.asInstanceOf[js.Any])
    
    inline def setHost(value: R3HostMetadata): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setI18nUseExternalIds(value: Boolean): Self = StObject.set(x, "i18nUseExternalIds", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
    
    inline def setInterpolation(value: InterpolationConfig): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: UsesOnChanges): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setQueries(value: js.Array[R3QueryMetadata]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: R3QueryMetadata*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setRelativeContextFilePath(value: String): Self = StObject.set(x, "relativeContextFilePath", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: NgContentSelectors): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    
    inline def setTypeSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "typeSourceSpan", value.asInstanceOf[js.Any])
    
    inline def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
    
    inline def setViewProviders(value: Expression): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersNull: Self = StObject.set(x, "viewProviders", null)
    
    inline def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
    
    inline def setViewQueries(value: js.Array[R3QueryMetadata]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    inline def setViewQueriesVarargs(value: R3QueryMetadata*): Self = StObject.set(x, "viewQueries", js.Array(value*))
  }
}
