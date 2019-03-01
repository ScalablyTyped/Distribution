package typings
package atAngularCompilerLib.srcRender3ViewApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DirectiveMetadata extends js.Object {
  /**
    * Dependencies of the directive's constructor.
    */
  var deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] | scala.Null
  /**
    * Reference name under which to export the directive's type in a template,
    * if any.
    */
  var exportAs: java.lang.String | scala.Null
  /**
    * Mappings indicating how the directive interacts with its host element (host bindings,
    * listeners, etc).
    */
  var host: atAngularCompilerLib.Anon_Attributes
  /**
    * A mapping of input field names to the property names.
    */
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  /**
    * Information about usage of specific lifecycle events which require special treatment in the
    * code generator.
    */
  var lifecycle: atAngularCompilerLib.Anon_UsesOnChanges
  /**
    * Name of the directive type.
    */
  var name: java.lang.String
  /**
    * A mapping of output field names to the property names.
    */
  var outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The list of providers defined in the directive.
    */
  var providers: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
  /**
    * Information about the content queries made by the directive.
    */
  var queries: js.Array[R3QueryMetadata]
  /**
    * Unparsed selector of the directive, or `null` if there was no selector.
    */
  var selector: java.lang.String | scala.Null
  /**
    * An expression representing a reference to the directive itself.
    */
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: scala.Double
  /**
    * A source span for the directive type.
    */
  var typeSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  /**
    * Whether or not the component or directive inherits from another class
    */
  var usesInheritance: scala.Boolean
}

object R3DirectiveMetadata {
  @scala.inline
  def apply(
    host: atAngularCompilerLib.Anon_Attributes,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])],
    lifecycle: atAngularCompilerLib.Anon_UsesOnChanges,
    name: java.lang.String,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queries: js.Array[R3QueryMetadata],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    typeArgumentCount: scala.Double,
    typeSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    usesInheritance: scala.Boolean,
    deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null,
    exportAs: java.lang.String = null,
    providers: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null,
    selector: java.lang.String = null
  ): R3DirectiveMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("lifecycle")(lifecycle)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outputs")(outputs)
    __obj.updateDynamic("queries")(queries)
    __obj.updateDynamic("typeArgumentCount")(typeArgumentCount)
    __obj.updateDynamic("typeSourceSpan")(typeSourceSpan)
    __obj.updateDynamic("usesInheritance")(usesInheritance)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[R3DirectiveMetadata]
  }
}

