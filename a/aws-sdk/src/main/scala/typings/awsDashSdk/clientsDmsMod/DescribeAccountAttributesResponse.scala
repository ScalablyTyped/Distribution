package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesResponse extends js.Object {
  /**
    * Account quota information.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
  /**
    * A unique AWS DMS identifier for an account in a particular AWS Region. The value of this identifier has the following format: c99999999999. DMS uses this identifier to name artifacts. For example, DMS uses this identifier to name the default Amazon S3 bucket for storing task assessment reports in a given AWS Region. The format of this S3 bucket name is the following: dms-AccountNumber-UniqueAccountIdentifier. Here is an example name for this default S3 bucket: dms-111122223333-c44445555666.  AWS DMS supports UniqueAccountIdentifier in versions 3.1.4 and later. 
    */
  var UniqueAccountIdentifier: js.UndefOr[String] = js.undefined
}

object DescribeAccountAttributesResponse {
  @scala.inline
  def apply(AccountQuotas: AccountQuotaList = null, UniqueAccountIdentifier: String = null): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountQuotas != null) __obj.updateDynamic("AccountQuotas")(AccountQuotas)
    if (UniqueAccountIdentifier != null) __obj.updateDynamic("UniqueAccountIdentifier")(UniqueAccountIdentifier)
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
}

