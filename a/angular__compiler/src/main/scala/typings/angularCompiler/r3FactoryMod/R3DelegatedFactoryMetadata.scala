package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ @js.native
trait R3DelegatedFactoryMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression = js.native
  var delegateType: Factory = js.native
}

object R3DelegatedFactoryMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateType: Factory,
    injectFn: ExternalReference,
    internalType: Expression,
    name: String,
    target: R3FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3DelegatedFactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFactoryMetadata]
  }
  @scala.inline
  implicit class R3DelegatedFactoryMetadataOps[Self <: R3DelegatedFactoryMetadata] (val x: Self) extends AnyVal {
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
    def setDelegate(value: Expression): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelegateType(value: Factory): Self = this.set("delegateType", value.asInstanceOf[js.Any])
  }
  
}

