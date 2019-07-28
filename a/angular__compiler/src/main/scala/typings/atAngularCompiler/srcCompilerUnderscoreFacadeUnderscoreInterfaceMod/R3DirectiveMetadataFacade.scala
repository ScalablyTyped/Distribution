package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_UsesOnChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DirectiveMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  var exportAs: js.Array[String] | Null
  var host: StringDictionary[String]
  var inputs: js.Array[String]
  var lifecycle: Anon_UsesOnChanges
  var name: String
  var outputs: js.Array[String]
  var propMetadata: StringDictionary[js.Array[_]]
  var providers: js.Array[Provider] | Null
  var queries: js.Array[R3QueryMetadataFacade]
  var selector: String | Null
  var `type`: js.Any
  var typeArgumentCount: Double
  var typeSourceSpan: ParseSourceSpan
  var usesInheritance: Boolean
  var viewQueries: js.Array[R3QueryMetadataFacade]
}

object R3DirectiveMetadataFacade {
  @scala.inline
  def apply(
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: Anon_UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade],
    deps: js.Array[R3DependencyMetadataFacade] = null,
    exportAs: js.Array[String] = null,
    providers: js.Array[Provider] = null,
    selector: String = null
  ): R3DirectiveMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host, inputs = inputs, lifecycle = lifecycle, name = name, outputs = outputs, propMetadata = propMetadata, queries = queries, typeArgumentCount = typeArgumentCount, typeSourceSpan = typeSourceSpan, usesInheritance = usesInheritance, viewQueries = viewQueries)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[R3DirectiveMetadataFacade]
  }
}

