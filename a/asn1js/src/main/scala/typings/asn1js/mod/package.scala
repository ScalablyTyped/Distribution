package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Compare of two ASN.1 object trees
  * 
  * @param {*} root Root of input ASN.1 object tree
  * @param {*} inputData Input ASN.1 object tree
  * @param {*} inputSchema Input ASN.1 schema to compare with
  * @returns {{ verified: boolean, result?: any }}
  */
inline def compareSchema(root: js.Any, inputData: js.Any, inputSchema: js.Any): typings.asn1js.anon.Result = (typings.asn1js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compareSchema")(root.asInstanceOf[js.Any], inputData.asInstanceOf[js.Any], inputSchema.asInstanceOf[js.Any])).asInstanceOf[typings.asn1js.anon.Result]

/**
  * Major function for decoding ASN.1 BER array into internal library structuries
  * 
  * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array of bytes
  * @returns {{ offset: number; result: LocalBaseBlock }}
  */
inline def fromBER(inputBuffer: typings.std.ArrayBuffer): typings.asn1js.anon.Offset = typings.asn1js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromBER")(inputBuffer.asInstanceOf[js.Any]).asInstanceOf[typings.asn1js.anon.Offset]

/**
  * ASN.1 schema verification for ArrayBuffer data
  * 
  * @param {ArrayBuffer} inputBuffer Input BER-encoded ASN.1 data
  * @param {*} inputSchema Input ASN.1 schema to verify against to
  * @returns {{ verified: boolean, result?: any }}
  */
inline def verifySchema(inputBuffer: typings.std.ArrayBuffer, inputSchema: js.Any): typings.asn1js.anon.Result = (typings.asn1js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verifySchema")(inputBuffer.asInstanceOf[js.Any], inputSchema.asInstanceOf[js.Any])).asInstanceOf[typings.asn1js.anon.Result]

type LocalEndOfContentValueBlockParams = typings.asn1js.mod.LocalBaseBlockParams
