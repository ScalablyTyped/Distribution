package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Selector
import typings.angularCompiler.anon.UsesOnChanges
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3ComponentMetadataFacade extends R3DirectiveMetadataFacade {
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  var directives: js.Array[Selector]
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
    directives: js.Array[Selector],
    encapsulation: ViewEncapsulation,
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
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
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], exportAs = exportAs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (!js.isUndefined(changeDetection)) __obj.updateDynamic("changeDetection")(changeDetection.get.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadataFacade]
  }
}

