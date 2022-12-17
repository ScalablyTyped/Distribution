package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Constructed")
@js.native
open class Constructed ()
  extends BaseBlock[LocalConstructedValueBlock, LocalConstructedValueBlockJson]
     with _AsnType {
  def this(parameters: ConstructedParams) = this()
}
object Constructed {
  
  @JSImport("asn1js", "Constructed")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "Constructed.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
