package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Integer
  extends StObject
     with BaseBlock[LocalIntegerValueBlock, LocalIntegerValueBlockJson]
     with _AsnType {
  
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
