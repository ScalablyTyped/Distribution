package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", JSImport.Namespace)
@js.native
object asn1jsModMembers extends js.Object {
  /**
    * Compare of two ASN.1 object trees
    * 
    * @param {*} root Root of input ASN.1 object tree
    * @param {*} inputData Input ASN.1 object tree
    * @param {*} inputSchema Input ASN.1 schema to compare with
    * @returns {{ verified: boolean, result?: any }}
    */
  def compareSchema(root: js.Any, inputData: js.Any, inputSchema: js.Any): asn1jsLib.Anon_Result = js.native
  /**
    * Major function for decoding ASN.1 BER array into internal library structuries
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array of bytes
    * @returns {{ offset: number; result: LocalBaseBlock }}
    */
  def fromBER(inputBuffer: stdLib.ArrayBuffer): asn1jsLib.Anon_ResultOffset = js.native
  /**
    * ASN.1 schema verification for ArrayBuffer data
    * 
    * @param {ArrayBuffer} inputBuffer Input BER-encoded ASN.1 data
    * @param {*} inputSchema Input ASN.1 schema to verify against to
    * @returns {{ verified: boolean, result?: any }}
    */
  def verifySchema(inputBuffer: stdLib.ArrayBuffer, inputSchema: js.Any): asn1jsLib.Anon_Result = js.native
}

