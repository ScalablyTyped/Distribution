package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificatesMessage extends js.Object {
  /**
    * The user-supplied certificate identifier. If this parameter is specified, information for only the identified certificate is returned. This parameter isn't case-sensitive. Constraints:   Must match an existing CertificateIdentifier.  
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeCertificates request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeCertificatesMessage {
  @scala.inline
  def apply(
    CertificateIdentifier: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    if (CertificateIdentifier != null) __obj.updateDynamic("CertificateIdentifier")(CertificateIdentifier)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeCertificatesMessage]
  }
}

