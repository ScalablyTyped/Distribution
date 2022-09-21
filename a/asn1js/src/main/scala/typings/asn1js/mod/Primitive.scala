package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Primitive")
@js.native
open class Primitive ()
  extends BaseBlock[LocalPrimitiveValueBlock, LocalPrimitiveValueBlockJson]
     with _AsnType {
  def this(parameters: PrimitiveParams) = this()
}
object Primitive {
  
  @JSImport("asn1js", "Primitive")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "Primitive.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
