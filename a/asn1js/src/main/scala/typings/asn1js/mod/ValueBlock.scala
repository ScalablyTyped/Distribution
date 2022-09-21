package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "ValueBlock")
@js.native
open class ValueBlock ()
  extends StObject
     with LocalBaseBlock
     with IBerConvertible {
  
  /* CompleteClass */
  var blockLength: Double = js.native
  
  /* CompleteClass */
  var error: String = js.native
  
  def toBER(sizeOnly: scala.Boolean, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: Unit, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var warnings: js.Array[String] = js.native
}
object ValueBlock {
  
  @JSImport("asn1js", "ValueBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "ValueBlock.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
