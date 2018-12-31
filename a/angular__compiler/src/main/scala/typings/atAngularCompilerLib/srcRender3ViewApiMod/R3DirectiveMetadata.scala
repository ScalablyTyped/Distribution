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

