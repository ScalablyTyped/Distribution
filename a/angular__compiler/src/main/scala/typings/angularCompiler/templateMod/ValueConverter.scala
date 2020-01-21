package typings.angularCompiler.templateMod

import typings.angularCompiler.astMod.AstMemoryEfficientTransformer
import typings.angularCompiler.constantPoolMod.ConstantPool
import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "ValueConverter")
@js.native
class ValueConverter protected () extends AstMemoryEfficientTransformer {
  def this(
    constantPool: ConstantPool,
    allocateSlot: js.Function0[Double],
    allocatePureFunctionSlots: js.Function1[/* numSlots */ Double, Double],
    definePipe: js.Function4[
        /* name */ String, 
        /* localName */ String, 
        /* slot */ Double, 
        /* value */ Expression, 
        Unit
      ]
  ) = this()
  var _pipeBindExprs: js.Any = js.native
  var allocatePureFunctionSlots: js.Any = js.native
  var allocateSlot: js.Any = js.native
  var constantPool: js.Any = js.native
  var definePipe: js.Any = js.native
  def updatePipeSlotOffsets(bindingSlots: Double): Unit = js.native
}

