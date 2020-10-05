package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.UsesOnChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3DirectiveMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  var exportAs: js.Array[String] | Null = js.native
  var host: StringDictionary[String] = js.native
  var inputs: js.Array[String] = js.native
  var lifecycle: UsesOnChanges = js.native
  var name: String = js.native
  var outputs: js.Array[String] = js.native
  var propMetadata: StringDictionary[js.Array[_]] = js.native
  var providers: js.Array[Provider] | Null = js.native
  var queries: js.Array[R3QueryMetadataFacade] = js.native
  var selector: String | Null = js.native
  var `type`: js.Any = js.native
  var typeArgumentCount: Double = js.native
  var typeSourceSpan: ParseSourceSpan = js.native
  var usesInheritance: Boolean = js.native
  var viewQueries: js.Array[R3QueryMetadataFacade] = js.native
}

object R3DirectiveMetadataFacade {
  @scala.inline
  def apply(
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3DirectiveMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadataFacade]
  }
  @scala.inline
  implicit class R3DirectiveMetadataFacadeOps[Self <: R3DirectiveMetadataFacade] (val x: Self) extends AnyVal {
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
    def setHost(value: StringDictionary[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: String*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecycle(value: UsesOnChanges): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: String*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropMetadata(value: StringDictionary[js.Array[_]]): Self = this.set("propMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueriesVarargs(value: R3QueryMetadataFacade*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[R3QueryMetadataFacade]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeSourceSpan(value: ParseSourceSpan): Self = this.set("typeSourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsesInheritance(value: Boolean): Self = this.set("usesInheritance", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewQueriesVarargs(value: R3QueryMetadataFacade*): Self = this.set("viewQueries", js.Array(value :_*))
    @scala.inline
    def setViewQueries(value: js.Array[R3QueryMetadataFacade]): Self = this.set("viewQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
    @scala.inline
    def setExportAsVarargs(value: String*): Self = this.set("exportAs", js.Array(value :_*))
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportAsNull: Self = this.set("exportAs", null)
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersNull: Self = this.set("providers", null)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorNull: Self = this.set("selector", null)
  }
  
}

