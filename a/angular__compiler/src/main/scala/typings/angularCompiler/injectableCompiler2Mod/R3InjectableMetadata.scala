package typings.angularCompiler.injectableCompiler2Mod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3InjectableMetadata extends js.Object {
  var internalType: Expression = js.native
  var name: String = js.native
  var providedIn: Expression = js.native
  var `type`: R3Reference = js.native
  var typeArgumentCount: Double = js.native
  var useClass: js.UndefOr[Expression] = js.native
  var useExisting: js.UndefOr[Expression] = js.native
  var useFactory: js.UndefOr[Expression] = js.native
  var useValue: js.UndefOr[Expression] = js.native
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.native
}

object R3InjectableMetadata {
  @scala.inline
  def apply(
    internalType: Expression,
    name: String,
    providedIn: Expression,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3InjectableMetadata = {
    val __obj = js.Dynamic.literal(internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadata]
  }
  @scala.inline
  implicit class R3InjectableMetadataOps[Self <: R3InjectableMetadata] (val x: Self) extends AnyVal {
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
    def setInternalType(value: Expression): Self = this.set("internalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidedIn(value: Expression): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: R3Reference): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseClass(value: Expression): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: Expression): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: Expression): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: Expression): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
    @scala.inline
    def setUserDepsVarargs(value: R3DependencyMetadata*): Self = this.set("userDeps", js.Array(value :_*))
    @scala.inline
    def setUserDeps(value: js.Array[R3DependencyMetadata]): Self = this.set("userDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDeps: Self = this.set("userDeps", js.undefined)
  }
  
}

