package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "UniversalString")
@js.native
open class UniversalString ()
  extends LocalUniversalStringValueBlock
     with _AsnType {
  def this(hasParameters: UniversalStringParams) = this()
}
object UniversalString {
  
  @JSImport("asn1js", "UniversalString")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "UniversalString.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
