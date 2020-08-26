package typings.angularCompiler.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.ExpressionSelector
import typings.angularCompiler.anon.NgContentSelectors
import typings.angularCompiler.anon.UsesOnChanges
import typings.angularCompiler.coreMod.ChangeDetectionStrategy
import typings.angularCompiler.coreMod.ViewEncapsulation
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.render3UtilMod.R3Reference
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3ComponentMetadata extends R3DirectiveMetadata {
  /**
    * A collection of animation triggers that will be used in the component template.
    */
  var animations: Expression | Null = js.native
  /**
    * Strategy used for detecting changes in the component.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  /**
    * A list of directive selectors and an expression referencing the directive type which are in the
    * scope of the compilation.
    */
  var directives: js.Array[ExpressionSelector] = js.native
  /**
    * An encapsulation policy for the template and CSS styles. One of:
    * - `ViewEncapsulation.Native`: Use shadow roots. This works only if natively available on the
    *   platform (note that this is marked the as the "deprecated shadow DOM" as of Angular v6.1.
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use the latest ShadowDOM API to natively encapsulate styles
    * into a shadow root.
    */
  var encapsulation: ViewEncapsulation = js.native
  /**
    * Whether translation variable name should contain external message id
    * (used by Closure Compiler's output of `goog.getMsg` for transition period).
    */
  var i18nUseExternalIds: Boolean = js.native
  /**
    * Overrides the default interpolation start and end delimiters ({{ and }}).
    */
  var interpolation: InterpolationConfig = js.native
  /**
    * A map of pipe names to an expression referencing the pipe type which are in the scope of the
    * compilation.
    */
  var pipes: Map[String, Expression] = js.native
  /**
    * Path to the .ts file in which this template's generated code will be included, relative to
    * the compilation root. This will be used to generate identifiers that need to be globally
    * unique in certain contexts (such as g3).
    */
  var relativeContextFilePath: String = js.native
  /**
    * A collection of styling data that will be applied and scoped to the component.
    */
  var styles: js.Array[String] = js.native
  /**
    * Information about the component's template.
    */
  var template: NgContentSelectors = js.native
  /**
    * The list of view providers defined in the component.
    */
  var viewProviders: Expression | Null = js.native
  /**
    * Whether to wrap the 'directives' and/or `pipes` array, if one is generated, in a closure.
    *
    * This is done when the directives or pipes contain forward references.
    */
  var wrapDirectivesAndPipesInClosure: Boolean = js.native
}

object R3ComponentMetadata {
  @scala.inline
  def apply(
    directives: js.Array[ExpressionSelector],
    encapsulation: ViewEncapsulation,
    fullInheritance: Boolean,
    host: R3HostMetadata,
    i18nUseExternalIds: Boolean,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    internalType: Expression,
    interpolation: InterpolationConfig,
    lifecycle: UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    pipes: Map[String, Expression],
    queries: js.Array[R3QueryMetadata],
    relativeContextFilePath: String,
    styles: js.Array[String],
    template: NgContentSelectors,
    `type`: R3Reference,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata],
    wrapDirectivesAndPipesInClosure: Boolean
  ): R3ComponentMetadata = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], i18nUseExternalIds = i18nUseExternalIds.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], relativeContextFilePath = relativeContextFilePath.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], wrapDirectivesAndPipesInClosure = wrapDirectivesAndPipesInClosure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadata]
  }
  @scala.inline
  implicit class R3ComponentMetadataOps[Self <: R3ComponentMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectivesVarargs(value: ExpressionSelector*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[ExpressionSelector]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setI18nUseExternalIds(value: Boolean): Self = this.set("i18nUseExternalIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolation(value: InterpolationConfig): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipes(value: Map[String, Expression]): Self = this.set("pipes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeContextFilePath(value: String): Self = this.set("relativeContextFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: NgContentSelectors): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapDirectivesAndPipesInClosure(value: Boolean): Self = this.set("wrapDirectivesAndPipesInClosure", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimations(value: Expression): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationsNull: Self = this.set("animations", null)
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = this.set("changeDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeDetection: Self = this.set("changeDetection", js.undefined)
    @scala.inline
    def setViewProviders(value: Expression): Self = this.set("viewProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewProvidersNull: Self = this.set("viewProviders", null)
  }
  
}

