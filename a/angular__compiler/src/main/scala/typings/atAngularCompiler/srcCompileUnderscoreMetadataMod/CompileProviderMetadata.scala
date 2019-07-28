package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileProviderMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[CompileDiDependencyMetadata]] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var token: CompileTokenMetadata
  var useClass: js.UndefOr[CompileTypeMetadata] = js.undefined
  var useExisting: js.UndefOr[CompileTokenMetadata] = js.undefined
  var useFactory: js.UndefOr[CompileFactoryMetadata] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object CompileProviderMetadata {
  @scala.inline
  def apply(
    token: CompileTokenMetadata,
    deps: js.Array[CompileDiDependencyMetadata] = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    useClass: CompileTypeMetadata = null,
    useExisting: CompileTokenMetadata = null,
    useFactory: CompileFactoryMetadata = null,
    useValue: js.Any = null
  ): CompileProviderMetadata = {
    val __obj = js.Dynamic.literal(token = token)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (useClass != null) __obj.updateDynamic("useClass")(useClass)
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting)
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory)
    if (useValue != null) __obj.updateDynamic("useValue")(useValue)
    __obj.asInstanceOf[CompileProviderMetadata]
  }
}

