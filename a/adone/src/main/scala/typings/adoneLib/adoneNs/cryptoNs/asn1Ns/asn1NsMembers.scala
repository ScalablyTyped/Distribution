package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1")
@js.native
object asn1NsMembers extends js.Object {
  /**
           * Compare of two ASN.1 object trees
           *
           * @param root Root of input ASN.1 object tree
           * @param inputData Input ASN.1 object tree
           * @param inputSchema Input ASN.1 schema to compare with
           */
  def compareSchema(root: js.Any, inputData: js.Any, inputSchema: js.Any): adoneLib.Anon_Result = js.native
  /**
           * Major function for decoding ASN.1 BER array into internal library structuries
           *
           * @param inputBuffer ASN.1 BER encoded array of bytes
           */
  def fromBER(inputBuffer: stdLib.ArrayBuffer): adoneLib.Anon_ResultOffset = js.native
  /**
           * ASN.1 schema verification for ArrayBuffer data
           *
           * @param inputBuffer Input BER-encoded ASN.1 data
           * @param inputSchema Input ASN.1 schema to verify against to
           */
  def verifySchema(inputBuffer: stdLib.ArrayBuffer, inputSchema: js.Any): adoneLib.Anon_Result = js.native
}

