package typings
package atAngularCompilerLib.srcRender3ViewTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "ValueConverter")
@js.native
class ValueConverter protected ()
  extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AstMemoryEfficientTransformer {
  def this(constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool, allocateSlot: js.Function0[scala.Double], allocatePureFunctionSlots: js.Function1[/* numSlots */ scala.Double, scala.Double], definePipe: js.Function4[
      /* name */ java.lang.String, 
      /* localName */ java.lang.String, 
      /* slot */ scala.Double, 
      /* value */ atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression, 
      scala.Unit
    ]) = this()
  var _pipeBindExprs: js.Any = js.native
  var allocatePureFunctionSlots: js.Any = js.native
  var allocateSlot: js.Any = js.native
  var constantPool: js.Any = js.native
  var definePipe: js.Any = js.native
  def updatePipeSlotOffsets(bindingSlots: scala.Double): scala.Unit = js.native
}

