package typings
package atAngularCompilerLib.srcRender3ViewApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3ComponentMetadata extends R3DirectiveMetadata {
  /**
    * A collection of animation triggers that will be used in the component template.
    */
  var animations: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
  /**
    * Strategy used for detecting changes in the component.
    */
  var changeDetection: js.UndefOr[atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy] = js.undefined
  /**
    * A list of directive selectors and an expression referencing the directive type which are in the
    * scope of the compilation.
    */
  var directives: js.Array[atAngularCompilerLib.Anon_ExpressionSelectorString]
  /**
    * An encapsulation policy for the template and CSS styles. One of:
    * - `ViewEncapsulation.Native`: Use shadow roots. This works only if natively available on the
    *   platform (note that this is marked the as the "deprecated shadow DOM" as of Angular v6.1.
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use the latest ShadowDOM API to natively encapsulate styles
    * into a shadow root.
    */
  var encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation
  /**
    * Whether translation variable name should contain external message id
    * (used by Closure Compiler's output of `goog.getMsg` for transition period).
    */
  var i18nUseExternalIds: scala.Boolean
  /**
    * Overrides the default interpolation start and end delimiters ({{ and }}).
    */
  var interpolation: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  /**
    * A map of pipe names to an expression referencing the pipe type which are in the scope of the
    * compilation.
    */
  var pipes: stdLib.Map[java.lang.String, atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  /**
    * Path to the .ts file in which this template's generated code will be included, relative to
    * the compilation root. This will be used to generate identifiers that need to be globally
    * unique in certain contexts (such as g3).
    */
  var relativeContextFilePath: java.lang.String
  /**
    * A collection of styling data that will be applied and scoped to the component.
    */
  var styles: js.Array[java.lang.String]
  /**
    * Information about the component's template.
    */
  var template: atAngularCompilerLib.Anon_Nodes
  /**
    * The list of view providers defined in the component.
    */
  var viewProviders: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
  /**
    * Information about the view queries made by the component.
    */
  var viewQueries: js.Array[R3QueryMetadata]
  /**
    * Whether to wrap the 'directives' and/or `pipes` array, if one is generated, in a closure.
    *
    * This is done when the directives or pipes contain forward references.
    */
  var wrapDirectivesAndPipesInClosure: scala.Boolean
}

