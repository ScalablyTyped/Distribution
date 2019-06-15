package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasICPRecordal extends js.Object {
  /**
    * A domain name associated with a distribution. 
    */
  var CNAME: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED for all CNAMEs (aliases) in regions outside of China.  The status values returned are the following:    APPROVED indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can be associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as APPROVED, that is, valid to use with China region, a CNAME must have one ICP recordal number associated with it.    SUSPENDED indicates that the associated CNAME does not have a valid ICP recordal number.    PENDING indicates that at least one CNAME associated with the distribution does not have a valid ICP recordal number.  
    */
  var ICPRecordalStatus: js.UndefOr[ICPRecordalStatus] = js.undefined
}

object AliasICPRecordal {
  @scala.inline
  def apply(CNAME: java.lang.String = null, ICPRecordalStatus: ICPRecordalStatus = null): AliasICPRecordal = {
    val __obj = js.Dynamic.literal()
    if (CNAME != null) __obj.updateDynamic("CNAME")(CNAME)
    if (ICPRecordalStatus != null) __obj.updateDynamic("ICPRecordalStatus")(ICPRecordalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasICPRecordal]
  }
}

