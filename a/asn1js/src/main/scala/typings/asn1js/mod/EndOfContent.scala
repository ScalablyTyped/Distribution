package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "EndOfContent")
@js.native
open class EndOfContent ()
  extends BaseBlock[LocalEndOfContentValueBlock, ValueBlockJson]
     with _AsnType {
  def this(parameters: EndOfContentParams) = this()
}
object EndOfContent {
  
  @JSImport("asn1js", "EndOfContent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "EndOfContent.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
