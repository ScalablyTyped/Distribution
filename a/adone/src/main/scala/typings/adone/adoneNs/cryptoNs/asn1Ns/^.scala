package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.Anon_Offset
import typings.adone.Anon_Result
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1")
@js.native
object ^ extends js.Object {
  /**
    * Compare of two ASN.1 object trees
    *
    * @param root Root of input ASN.1 object tree
    * @param inputData Input ASN.1 object tree
    * @param inputSchema Input ASN.1 schema to compare with
    */
  def compareSchema(root: js.Any, inputData: js.Any, inputSchema: js.Any): Anon_Result = js.native
  /**
    * Major function for decoding ASN.1 BER array into internal library structuries
    *
    * @param inputBuffer ASN.1 BER encoded array of bytes
    */
  def fromBER(inputBuffer: ArrayBuffer): Anon_Offset = js.native
  /**
    * ASN.1 schema verification for ArrayBuffer data
    *
    * @param inputBuffer Input BER-encoded ASN.1 data
    * @param inputSchema Input ASN.1 schema to verify against to
    */
  def verifySchema(inputBuffer: ArrayBuffer, inputSchema: js.Any): Anon_Result = js.native
}

