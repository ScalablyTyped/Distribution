package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3ComponentMetadataFacade extends R3DirectiveMetadataFacade {
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  var directives: js.Array[atAngularCompilerLib.Anon_ExpressionSelector]
  var encapsulation: ViewEncapsulation
  var interpolation: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var pipes: stdLib.Map[java.lang.String, _]
  var preserveWhitespaces: scala.Boolean
  var styles: js.Array[java.lang.String]
  var template: java.lang.String
  var viewProviders: js.Array[Provider] | scala.Null
  var viewQueries: js.Array[R3QueryMetadataFacade]
}

object R3ComponentMetadataFacade {
  @scala.inline
  def apply(
    directives: js.Array[atAngularCompilerLib.Anon_ExpressionSelector],
    encapsulation: ViewEncapsulation,
    host: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputs: js.Array[java.lang.String],
    lifecycle: atAngularCompilerLib.Anon_UsesOnChanges,
    name: java.lang.String,
    outputs: js.Array[java.lang.String],
    pipes: stdLib.Map[java.lang.String, _],
    preserveWhitespaces: scala.Boolean,
    propMetadata: org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    styles: js.Array[java.lang.String],
    template: java.lang.String,
    `type`: js.Any,
    typeArgumentCount: scala.Double,
    typeSourceSpan: scala.Null,
    usesInheritance: scala.Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade],
    animations: js.Array[_] = null,
    changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined,
    deps: js.Array[R3DependencyMetadataFacade] = null,
    exportAs: java.lang.String = null,
    interpolation: js.Tuple2[java.lang.String, java.lang.String] = null,
    providers: js.Array[Provider] = null,
    selector: java.lang.String = null,
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

