package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalClusterMember extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) for each Aurora cluster. 
    */
  var DBClusterArn: js.UndefOr[String] = js.undefined
  /**
    *  Specifies whether the Aurora cluster is the primary cluster (that is, has read-write capability) for the Aurora global database with which it is associated. 
    */
  var IsWriter: js.UndefOr[Boolean] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the Aurora global database. 
    */
  var Readers: js.UndefOr[ReadersArnList] = js.undefined
}

object GlobalClusterMember {
  @scala.inline
  def apply(
    DBClusterArn: String = null,
    IsWriter: js.UndefOr[scala.Boolean] = js.undefined,
    Readers: ReadersArnList = null
  ): GlobalClusterMember = {
    val __obj = js.Dynamic.literal()
    if (DBClusterArn != null) __obj.updateDynamic("DBClusterArn")(DBClusterArn)
    if (!js.isUndefined(IsWriter)) __obj.updateDynamic("IsWriter")(IsWriter)
    if (Readers != null) __obj.updateDynamic("Readers")(Readers)
    __obj.asInstanceOf[GlobalClusterMember]
  }
}

