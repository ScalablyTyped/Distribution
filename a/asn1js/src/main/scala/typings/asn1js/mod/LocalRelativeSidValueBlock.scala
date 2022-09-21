package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalRelativeSidValueBlock
  extends StObject
     with LocalBaseBlock
     with ILocalRelativeSidValueBlock {
  
  def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def fromBER(inputBuffer: js.typedarray.Uint8Array, inputOffset: Double, inputLength: Double): Double = js.native
  
  def toBER(): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
}
