package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "OctetString")
@js.native
open class OctetString ()
  extends BaseBlock[LocalOctetStringValueBlock, LocalOctetStringValueBlockJson]
     with _AsnType {
  def this(param0: OctetStringParams) = this()
  
  /**
    * Returns OctetString value. If OctetString is constructed, returns concatenated internal OctetString values
    * @returns Array buffer
    * @since 3.0.0
    */
  def getValue(): js.typedarray.ArrayBuffer = js.native
}
object OctetString {
  
  @JSImport("asn1js", "OctetString")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "OctetString.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
