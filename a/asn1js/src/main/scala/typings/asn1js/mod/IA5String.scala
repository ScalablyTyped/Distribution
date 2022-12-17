package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "IA5String")
@js.native
open class IA5String ()
  extends LocalSimpleStringBlock
     with _AsnType {
  def this(parameters: IA5StringParams) = this()
}
object IA5String {
  
  @JSImport("asn1js", "IA5String")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "IA5String.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
