package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_ExpressionSelector
import typings.atAngularCompiler.Anon_UsesOnChanges
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3ComponentMetadataFacade extends R3DirectiveMetadataFacade {
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  var directives: js.Array[Anon_ExpressionSelector]
  var encapsulation: ViewEncapsulation
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var pipes: Map[String, _]
  var preserveWhitespaces: Boolean
  var styles: js.Array[String]
  var template: String
  var viewProviders: js.Array[Provider] | Null
}

object R3ComponentMetadataFacade {
  @scala.inline
  def apply(
    directives: js.Array[Anon_ExpressionSelector],
    encapsulation: ViewEncapsulation,
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: Anon_UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    pipes: Map[String, _],
    preserveWhitespaces: Boolean,
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    styles: js.Array[String],
    template: String,
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade],
    animations: js.Array[_] = null,
    changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined,
    deps: js.Array[R3DependencyMetadataFacade] = null,
    exportAs: js.Array[String] = null,
    interpolation: js.Tuple2[String, String] = null,
    providers: js.Array[Provider] = null,
    selector: String = null,
    viewProviders: js.Array[Provider] = null
  ): R3ComponentMetadataFacade = {
    val __obj = js.Dynamic.literal(directives = directives, encapsulation = encapsulation, host = host, inputs = inputs, lifecycle = lifecycle, name = name, outputs = outputs, pipes = pipes, preserveWhitespaces = preserveWhitespaces, propMetadata = propMetadata, queries = queries, styles = styles, template = template, typeArgumentCount = typeArgumentCount, typeSourceSpan = typeSourceSpan, usesInheritance = usesInheritance, viewQueries = viewQueries)
    __obj.updateDynamic("type")(`type`)
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (!js.isUndefined(changeDetection)) __obj.updateDynamic("changeDetection")(changeDetection)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (viewProviders != null) __obj.updateDynamic("viewProviders")(viewProviders)
    __obj.asInstanceOf[R3ComponentMetadataFacade]
  }
}

