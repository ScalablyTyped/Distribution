package typings.angularCompiler.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.anon.UsesOnChanges
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3DirectiveMetadata extends js.Object {
  /**
    * Dependencies of the directive's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | invalid | Null = js.native
  /**
    * Reference name under which to export the directive's type in a template,
    * if any.
    */
  var exportAs: js.Array[String] | Null = js.native
  /**
    * Whether or not the component or directive inherits its entire decorator from its base class.
    */
  var fullInheritance: Boolean = js.native
  /**
    * Mappings indicating how the directive interacts with its host element (host bindings,
    * listeners, etc).
    */
  var host: R3HostMetadata = js.native
  /**
    * A mapping of input field names to the property names.
    */
  var inputs: StringDictionary[String | (js.Tuple2[String, String])] = js.native
  /**
    * An expression representing a reference to the directive being compiled, intended for use within
    * a class definition itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var internalType: Expression = js.native
  /**
    * Information about usage of specific lifecycle events which require special treatment in the
    * code generator.
    */
  var lifecycle: UsesOnChanges = js.native
  /**
    * Name of the directive type.
    */
  var name: String = js.native
  /**
    * A mapping of output field names to the property names.
    */
  var outputs: StringDictionary[String] = js.native
  /**
    * The list of providers defined in the directive.
    */
  var providers: Expression | Null = js.native
  /**
    * Information about the content queries made by the directive.
    */
  var queries: js.Array[R3QueryMetadata] = js.native
  /**
    * Unparsed selector of the directive, or `null` if there was no selector.
    */
  var selector: String | Null = js.native
  /**
    * An expression representing a reference to the directive itself.
    */
  var `type`: R3Reference = js.native
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double = js.native
  /**
    * A source span for the directive type.
    */
  var typeSourceSpan: ParseSourceSpan = js.native
  /**
    * Whether or not the component or directive inherits from another class
    */
  var usesInheritance: Boolean = js.native
  /**
    * Information about the view queries made by the directive.
    */
  var viewQueries: js.Array[R3QueryMetadata] = js.native
}

object R3DirectiveMetadata {
  @scala.inline
  def apply(
    fullInheritance: Boolean,
    host: R3HostMetadata,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    internalType: Expression,
    lifecycle: UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    queries: js.Array[R3QueryMetadata],
    `type`: R3Reference,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata]
  ): R3DirectiveMetadata = {
    val __obj = js.Dynamic.literal(fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadata]
  }
  @scala.inline
  implicit class R3DirectiveMetadataOps[Self <: R3DirectiveMetadata] (val x: Self) extends AnyVal {
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
    def setFullInheritance(value: Boolean): Self = this.set("fullInheritance", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: R3HostMetadata): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalType(value: Expression): Self = this.set("internalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecycle(value: UsesOnChanges): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueriesVarargs(value: R3QueryMetadata*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[R3QueryMetadata]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: R3Reference): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeSourceSpan(value: ParseSourceSpan): Self = this.set("typeSourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsesInheritance(value: Boolean): Self = this.set("usesInheritance", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewQueriesVarargs(value: R3QueryMetadata*): Self = this.set("viewQueries", js.Array(value :_*))
    @scala.inline
    def setViewQueries(value: js.Array[R3QueryMetadata]): Self = this.set("viewQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadata*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
    @scala.inline
    def setExportAsVarargs(value: String*): Self = this.set("exportAs", js.Array(value :_*))
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportAsNull: Self = this.set("exportAs", null)
    @scala.inline
    def setProviders(value: Expression): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersNull: Self = this.set("providers", null)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorNull: Self = this.set("selector", null)
  }
  
}

