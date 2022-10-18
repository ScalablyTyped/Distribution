package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseStringBlock[T /* <: LocalStringValueBlock */, J /* <: BaseStringBlockJson */]
  extends StObject
     with BaseBlock[T, J]
     with IStringConvertible {
  
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * @param inputBuffer ASN.1 BER encoded array
    */
  def fromBuffer(inputBuffer: js.typedarray.ArrayBuffer): Unit = js.native
  def fromBuffer(inputBuffer: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * String value
    * @since 3.0.0
    */
  def getValue(): String = js.native
  
  /**
    * String value
    * @param value String value
    * @since 3.0.0
    */
  def setValue(value: String): Unit = js.native
}
