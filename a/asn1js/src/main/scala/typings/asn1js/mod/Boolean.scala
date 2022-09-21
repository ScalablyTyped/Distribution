package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Boolean")
@js.native
open class Boolean ()
  extends BaseBlock[LocalBooleanValueBlock, LocalBooleanValueBlockJson]
     with _AsnType {
  def this(parameters: BooleanParams) = this()
  
  /**
    * Gets value
    * @since 3.0.0
    */
  def getValue(): scala.Boolean = js.native
  
  /**
    * Sets value
    * @param value Boolean value
    * @since 3.0.0
    */
  def setValue(value: scala.Boolean): Unit = js.native
}
object Boolean {
  
  @JSImport("asn1js", "Boolean")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "Boolean.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
