package typings.atAngularCompiler.srcRender3ViewApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_UsesOnChanges
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DirectiveMetadata extends js.Object {
  /**
    * Dependencies of the directive's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | Null
  /**
    * Reference name under which to export the directive's type in a template,
    * if any.
    */
  var exportAs: js.Array[String] | Null
  /**
    * Mappings indicating how the directive interacts with its host element (host bindings,
    * listeners, etc).
    */
  var host: R3HostMetadata
  /**
    * A mapping of input field names to the property names.
    */
  var inputs: StringDictionary[String | (js.Tuple2[String, String])]
  /**
    * Information about usage of specific lifecycle events which require special treatment in the
    * code generator.
    */
  var lifecycle: Anon_UsesOnChanges
  /**
    * Name of the directive type.
    */
  var name: String
  /**
    * A mapping of output field names to the property names.
    */
  var outputs: StringDictionary[String]
  /**
    * The list of providers defined in the directive.
    */
  var providers: Expression | Null
  /**
    * Information about the content queries made by the directive.
    */
  var queries: js.Array[R3QueryMetadata]
  /**
    * Unparsed selector of the directive, or `null` if there was no selector.
    */
  var selector: String | Null
  /**
    * An expression representing a reference to the directive itself.
    */
  var `type`: Expression
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double
  /**
    * A source span for the directive type.
    */
  var typeSourceSpan: ParseSourceSpan
  /**
    * Whether or not the component or directive inherits from another class
    */
  var usesInheritance: Boolean
  /**
    * Information about the view queries made by the directive.
    */
  var viewQueries: js.Array[R3QueryMetadata]
}

object R3DirectiveMetadata {
  @scala.inline
  def apply(
    host: R3HostMetadata,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    lifecycle: Anon_UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    queries: js.Array[R3QueryMetadata],
    `type`: Expression,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata],
    deps: js.Array[R3DependencyMetadata] = null,
    exportAs: js.Array[String] = null,
    providers: Expression = null,
    selector: String = null
  ): R3DirectiveMetadata = {
    val __obj = js.Dynamic.literal(host = host, inputs = inputs, lifecycle = lifecycle, name = name, outputs = outputs, queries = queries, typeArgumentCount = typeArgumentCount, typeSourceSpan = typeSourceSpan, usesInheritance = usesInheritance, viewQueries = viewQueries)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[R3DirectiveMetadata]
  }
}

