package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.NgContentSelectors
import typings.angularCompiler.anon.UsesOnChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3ComponentMetadata[DeclarationT /* <: R3TemplateDependency */]
  extends StObject
     with R3DirectiveMetadata {
  
  /**
    * A collection of animation triggers that will be used in the component template.
    */
  var animations: Expression | Null
  
  /**
    * Strategy used for detecting changes in the component.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  /**
    * Specifies how the 'directives' and/or `pipes` array, if generated, need to be emitted.
    */
  var declarationListEmitMode: DeclarationListEmitMode
  
  var declarations: js.Array[DeclarationT]
  
  /**
    * An encapsulation policy for the component's styling.
    * Possible values:
    * - `ViewEncapsulation.Emulated`: Apply modified component styles in order to emulate
    *                                 a native Shadow DOM CSS encapsulation behavior.
    * - `ViewEncapsulation.None`: Apply component styles globally without any sort of encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use the browser's native Shadow DOM API to encapsulate styles.
    */
  var encapsulation: ViewEncapsulation
  
  /**
    * Whether translation variable name should contain external message id
    * (used by Closure Compiler's output of `goog.getMsg` for transition period).
    */
  var i18nUseExternalIds: Boolean
  
  /**
    * Overrides the default interpolation start and end delimiters ({{ and }}).
    */
  var interpolation: InterpolationConfig
  
  /**
    * Path to the .ts file in which this template's generated code will be included, relative to
    * the compilation root. This will be used to generate identifiers that need to be globally
    * unique in certain contexts (such as g3).
    */
  var relativeContextFilePath: String
  
  /**
    * A collection of styling data that will be applied and scoped to the component.
    */
  var styles: js.Array[String]
  
  /**
    * Information about the component's template.
    */
  var template: NgContentSelectors
  
  /**
    * The list of view providers defined in the component.
    */
  var viewProviders: Expression | Null
}
object R3ComponentMetadata {
  
  inline def apply[DeclarationT /* <: R3TemplateDependency */](
    declarationListEmitMode: DeclarationListEmitMode,
    declarations: js.Array[DeclarationT],
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
  ): R3ComponentMetadata[DeclarationT] = {
    val __obj = js.Dynamic.literal(declarationListEmitMode = declarationListEmitMode.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], i18nUseExternalIds = i18nUseExternalIds.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], relativeContextFilePath = relativeContextFilePath.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], animations = null, deps = null, exportAs = null, providers = null, selector = null, viewProviders = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadata[DeclarationT]]
  }
  
  extension [Self <: R3ComponentMetadata[?], DeclarationT /* <: R3TemplateDependency */](x: Self & R3ComponentMetadata[DeclarationT]) {
    
    inline def setAnimations(value: Expression): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsNull: Self = StObject.set(x, "animations", null)
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setDeclarationListEmitMode(value: DeclarationListEmitMode): Self = StObject.set(x, "declarationListEmitMode", value.asInstanceOf[js.Any])
    
    inline def setDeclarations(value: js.Array[DeclarationT]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: DeclarationT*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setI18nUseExternalIds(value: Boolean): Self = StObject.set(x, "i18nUseExternalIds", value.asInstanceOf[js.Any])
    
    inline def setInterpolation(value: InterpolationConfig): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setRelativeContextFilePath(value: String): Self = StObject.set(x, "relativeContextFilePath", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: NgContentSelectors): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setViewProviders(value: Expression): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersNull: Self = StObject.set(x, "viewProviders", null)
  }
}
