package typings.atAngularCompiler.srcRender3ViewApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_ExpressionSelectorString
import typings.atAngularCompiler.Anon_Nodes
import typings.atAngularCompiler.Anon_UsesOnChanges
import typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy
import typings.atAngularCompiler.srcCoreMod.ViewEncapsulation
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3ComponentMetadata extends R3DirectiveMetadata {
  /**
    * A collection of animation triggers that will be used in the component template.
    */
  var animations: Expression | Null
  /**
    * Strategy used for detecting changes in the component.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  /**
    * A list of directive selectors and an expression referencing the directive type which are in the
    * scope of the compilation.
    */
  var directives: js.Array[Anon_ExpressionSelectorString]
  /**
    * An encapsulation policy for the template and CSS styles. One of:
    * - `ViewEncapsulation.Native`: Use shadow roots. This works only if natively available on the
    *   platform (note that this is marked the as the "deprecated shadow DOM" as of Angular v6.1.
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use the latest ShadowDOM API to natively encapsulate styles
    * into a shadow root.
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
    * A map of pipe names to an expression referencing the pipe type which are in the scope of the
    * compilation.
    */
  var pipes: Map[String, Expression]
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
  var template: Anon_Nodes
  /**
    * The list of view providers defined in the component.
    */
  var viewProviders: Expression | Null
  /**
    * Whether to wrap the 'directives' and/or `pipes` array, if one is generated, in a closure.
    *
    * This is done when the directives or pipes contain forward references.
    */
  var wrapDirectivesAndPipesInClosure: Boolean
}

object R3ComponentMetadata {
  @scala.inline
  def apply(
    directives: js.Array[Anon_ExpressionSelectorString],
    encapsulation: ViewEncapsulation,
    host: R3HostMetadata,
    i18nUseExternalIds: Boolean,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    interpolation: InterpolationConfig,
    lifecycle: Anon_UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    pipes: Map[String, Expression],
    queries: js.Array[R3QueryMetadata],
    relativeContextFilePath: String,
    styles: js.Array[String],
    template: Anon_Nodes,
    `type`: Expression,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata],
    wrapDirectivesAndPipesInClosure: Boolean,
    animations: Expression = null,
    changeDetection: ChangeDetectionStrategy = null,
    deps: js.Array[R3DependencyMetadata] = null,
    exportAs: js.Array[String] = null,
    providers: Expression = null,
    selector: String = null,
    viewProviders: Expression = null
  ): R3ComponentMetadata = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], i18nUseExternalIds = i18nUseExternalIds.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], relativeContextFilePath = relativeContextFilePath.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], wrapDirectivesAndPipesInClosure = wrapDirectivesAndPipesInClosure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (viewProviders != null) __obj.updateDynamic("viewProviders")(viewProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadata]
  }
}

