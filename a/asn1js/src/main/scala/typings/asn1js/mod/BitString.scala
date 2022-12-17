package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "BitString")
@js.native
open class BitString ()
  extends BaseBlock[LocalBitStringValueBlock, LocalBitStringValueBlockJson]
     with _AsnType {
  def this(param0: BitStringParams) = this()
}
object BitString {
  
  @JSImport("asn1js", "BitString")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "BitString.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
