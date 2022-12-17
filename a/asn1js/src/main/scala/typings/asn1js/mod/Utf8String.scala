package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Utf8String")
@js.native
open class Utf8String ()
  extends LocalUtf8StringValueBlock
     with _AsnType {
  def this(parameters: Utf8StringParams) = this()
}
object Utf8String {
  
  @JSImport("asn1js", "Utf8String")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "Utf8String.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
