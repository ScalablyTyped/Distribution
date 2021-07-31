package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalPrimitiveValueBlock")
@js.native
class LocalPrimitiveValueBlock () extends LocalValueBlock {
  def this(params: LocalBaseBlockParams) = this()
  
  var isHexOnly: scala.Boolean = js.native
  
  var valueHex: ArrayBuffer = js.native
}
