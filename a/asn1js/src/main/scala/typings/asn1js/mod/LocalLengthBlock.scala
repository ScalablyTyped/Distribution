package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalLengthBlock")
@js.native
class LocalLengthBlock () extends LocalBaseBlock {
  def this(params: LocalLengthBlockParams) = this()
  
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Unit = js.native
  
  var isIndefiniteForm: scala.Boolean = js.native
  
  var length: Double = js.native
  
  var longFormUsed: scala.Boolean = js.native
  
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}
