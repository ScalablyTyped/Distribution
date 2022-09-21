package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "ObjectIdentifier")
@js.native
open class ObjectIdentifier ()
  extends BaseBlock[LocalObjectIdentifierValueBlock, LocalObjectIdentifierValueBlockJson]
     with _AsnType {
  def this(parameters: ObjectIdentifierParams) = this()
  
  /**
    * Gets string representation of Object Identifier
    * @since 3.0.0
    */
  def getValue(): String = js.native
  
  /**
    * Sets Object Identifier value from string
    * @param value String value
    * @since 3.0.0
    */
  def setValue(value: String): Unit = js.native
}
object ObjectIdentifier {
  
  @JSImport("asn1js", "ObjectIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "ObjectIdentifier.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
