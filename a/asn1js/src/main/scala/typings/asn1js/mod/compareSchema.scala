package typings.asn1js.mod

import typings.asn1js.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "compareSchema")
@js.native
object compareSchema extends js.Object {
  /**
    * Compare of two ASN.1 object trees
    * 
    * @param {*} root Root of input ASN.1 object tree
    * @param {*} inputData Input ASN.1 object tree
    * @param {*} inputSchema Input ASN.1 schema to compare with
    * @returns {{ verified: boolean, result?: any }}
    */
  def apply(root: js.Any, inputData: js.Any, inputSchema: js.Any): Result = js.native
}

