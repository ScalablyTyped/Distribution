package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalValueBlock")
@js.native
class LocalValueBlock () extends LocalBaseBlock {
  def this(params: LocalBaseBlockParams) = this()
  
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Unit = js.native
  
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}
