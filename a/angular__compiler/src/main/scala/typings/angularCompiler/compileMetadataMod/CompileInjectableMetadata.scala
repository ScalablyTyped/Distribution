package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileInjectableMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  var providedIn: js.UndefOr[StaticSymbol] = js.undefined
  var symbol: StaticSymbol
  var `type`: CompileTypeMetadata
  var useClass: js.UndefOr[StaticSymbol] = js.undefined
  var useExisting: js.UndefOr[StaticSymbol] = js.undefined
  var useFactory: js.UndefOr[StaticSymbol] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object CompileInjectableMetadata {
  @scala.inline
  def apply(
    symbol: StaticSymbol,
    `type`: CompileTypeMetadata,
    deps: js.Array[_] = null,
    providedIn: StaticSymbol = null,
    useClass: StaticSymbol = null,
    useExisting: StaticSymbol = null,
    useFactory: StaticSymbol = null,
    useValue: js.Any = null
  ): CompileInjectableMetadata = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileInjectableMetadata]
  }
}

