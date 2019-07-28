package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHsmClientCertificatesMessage extends js.Object {
  /**
    * The identifier of a specific HSM client certificate for which you want information. If no identifier is specified, information is returned for all HSM client certificates owned by your AWS customer account.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeHsmClientCertificates request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A tag key or keys for which you want to return all matching HSM client certificates that are associated with the specified key or keys. For example, suppose that you have HSM client certificates that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the HSM client certificates that have either or both of these tag keys associated with them.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
  /**
    * A tag value or values for which you want to return all matching HSM client certificates that are associated with the specified tag value or values. For example, suppose that you have HSM client certificates that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the HSM client certificates that have either or both of these tag values associated with them.
    */
  var TagValues: js.UndefOr[TagValueList] = js.undefined
}

object DescribeHsmClientCertificatesMessage {
  @scala.inline
  def apply(
    HsmClientCertificateIdentifier: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    TagKeys: TagKeyList = null,
    TagValues: TagValueList = null
  ): DescribeHsmClientCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    if (HsmClientCertificateIdentifier != null) __obj.updateDynamic("HsmClientCertificateIdentifier")(HsmClientCertificateIdentifier)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues)
    __obj.asInstanceOf[DescribeHsmClientCertificatesMessage]
  }
}

