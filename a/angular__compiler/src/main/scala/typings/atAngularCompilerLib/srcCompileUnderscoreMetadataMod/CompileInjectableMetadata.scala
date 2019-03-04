package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileInjectableMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  var providedIn: js.UndefOr[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol] = js.undefined
  var symbol: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol
  var `type`: CompileTypeMetadata
  var useClass: js.UndefOr[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol] = js.undefined
  var useExisting: js.UndefOr[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol] = js.undefined
  var useFactory: js.UndefOr[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object CompileInjectableMetadata {
  @scala.inline
  def apply(
    symbol: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol,
    `type`: CompileTypeMetadata,
    deps: js.Array[_] = null,
    providedIn: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = null,
    useClass: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = null,
    useExisting: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = null,
    useFactory: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = null,
    useValue: js.Any = null
  ): CompileInjectableMetadata = {
    val __obj = js.Dynamic.literal(symbol = symbol)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn)
    if (useClass != null) __obj.updateDynamic("useClass")(useClass)
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting)
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory)
    if (useValue != null) __obj.updateDynamic("useValue")(useValue)
    __obj.asInstanceOf[CompileInjectableMetadata]
  }
}

