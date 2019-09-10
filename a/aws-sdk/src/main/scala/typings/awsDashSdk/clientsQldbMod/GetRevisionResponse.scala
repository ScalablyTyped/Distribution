package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRevisionResponse extends js.Object {
  /**
    * The proof object in Amazon Ion format returned by a GetRevision request. A proof contains the list of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the specified document revision.
    */
  var Proof: js.UndefOr[ValueHolder] = js.undefined
  /**
    * The document revision data object in Amazon Ion format.
    */
  var Revision: ValueHolder
}

object GetRevisionResponse {
  @scala.inline
  def apply(Revision: ValueHolder, Proof: ValueHolder = null): GetRevisionResponse = {
    val __obj = js.Dynamic.literal(Revision = Revision)
    if (Proof != null) __obj.updateDynamic("Proof")(Proof)
    __obj.asInstanceOf[GetRevisionResponse]
  }
}

