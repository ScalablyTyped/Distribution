package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketsOutput extends js.Object {
  /**
    * 
    */
  var Buckets: js.UndefOr[Buckets] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[Owner] = js.undefined
}

object ListBucketsOutput {
  @scala.inline
  def apply(Buckets: Buckets = null, Owner: Owner = null): ListBucketsOutput = {
    val __obj = js.Dynamic.literal()
    if (Buckets != null) __obj.updateDynamic("Buckets")(Buckets)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    __obj.asInstanceOf[ListBucketsOutput]
  }
}

