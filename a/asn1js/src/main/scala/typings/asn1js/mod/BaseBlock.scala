package typings.asn1js.mod

import org.scalablytyped.runtime.Instantiable0
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "BaseBlock")
@js.native
class BaseBlock[T /* <: LocalValueBlock */] () extends LocalBaseBlock {
  def this(parameters: BaseBlockParams) = this()
  def this(parameters: js.UndefOr[scala.Nothing], valueBlockType: Instantiable0[LocalValueBlock]) = this()
  def this(parameters: BaseBlockParams, valueBlockType: Instantiable0[LocalValueBlock]) = this()
  
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  
  var idBlock: LocalIdentificationBlock = js.native
  
  var lenBlock: LocalLengthBlock = js.native
  
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
  
  var valueBlock: T = js.native
}
