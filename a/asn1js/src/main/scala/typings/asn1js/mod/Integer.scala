package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Integer")
@js.native
open class Integer ()
  extends BaseBlock[LocalIntegerValueBlock, LocalIntegerValueBlockJson]
     with _AsnType {
  def this(parameters: IntegerParams) = this()
  
  /**
    * Convert current Integer value from DER to BER format
    * @returns
    */
  def convertFromDER(): Integer = js.native
  
  def convertToDER(): Integer = js.native
  
  /**
    * Converts Integer into BigInt
    * @throws Throws Error if BigInt is not supported
    * @since 3.0.0
    */
  def toBigInt(): js.BigInt = js.native
}
object Integer {
  
  @JSImport("asn1js", "Integer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "Integer.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  
  inline def fromBigInt(value: String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[Integer]
  inline def fromBigInt(value: js.BigInt): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[Integer]
  inline def fromBigInt(value: scala.Boolean): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[Integer]
  /**
    * Creates Integer from BigInt value
    * @param value BigInt value
    * @returns ASN.1 Integer
    * @throws Throws Error if BigInt is not supported
    * @since 3.0.0
    */
  /* static member */
  inline def fromBigInt(value: Double): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[Integer]
}
