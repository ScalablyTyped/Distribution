package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileProviderMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[CompileDiDependencyMetadata]] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var token: CompileTokenMetadata = js.native
  var useClass: js.UndefOr[CompileTypeMetadata] = js.native
  var useExisting: js.UndefOr[CompileTokenMetadata] = js.native
  var useFactory: js.UndefOr[CompileFactoryMetadata] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object CompileProviderMetadata {
  @scala.inline
  def apply(token: CompileTokenMetadata): CompileProviderMetadata = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileProviderMetadata]
  }
  @scala.inline
  implicit class CompileProviderMetadataOps[Self <: CompileProviderMetadata] (val x: Self) extends AnyVal {
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
    def setToken(value: CompileTokenMetadata): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: CompileDiDependencyMetadata*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[CompileDiDependencyMetadata]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setUseClass(value: CompileTypeMetadata): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: CompileTokenMetadata): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: CompileFactoryMetadata): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: js.Any): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
  }
  
}

