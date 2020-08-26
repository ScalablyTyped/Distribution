package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileInjectableMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[_]] = js.native
  var providedIn: js.UndefOr[StaticSymbol] = js.native
  var symbol: StaticSymbol = js.native
  var `type`: CompileTypeMetadata = js.native
  var useClass: js.UndefOr[StaticSymbol] = js.native
  var useExisting: js.UndefOr[StaticSymbol] = js.native
  var useFactory: js.UndefOr[StaticSymbol] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object CompileInjectableMetadata {
  @scala.inline
  def apply(symbol: StaticSymbol, `type`: CompileTypeMetadata): CompileInjectableMetadata = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileInjectableMetadata]
  }
  @scala.inline
  implicit class CompileInjectableMetadataOps[Self <: CompileInjectableMetadata] (val x: Self) extends AnyVal {
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
    def setSymbol(value: StaticSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[_]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    @scala.inline
    def setProvidedIn(value: StaticSymbol): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvidedIn: Self = this.set("providedIn", js.undefined)
    @scala.inline
    def setUseClass(value: StaticSymbol): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: StaticSymbol): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: StaticSymbol): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: js.Any): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
  }
  
}

