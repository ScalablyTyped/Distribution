package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMarketplaceentitlementserviceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Double = scala.Double
  type EntitlementList = js.Array[Entitlement]
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_IDENTIFIER
    - typings.awsDashSdk.awsDashSdkStrings.DIMENSION
    - java.lang.String
  */
  type GetEntitlementFilterName = _GetEntitlementFilterName | java.lang.String
  type GetEntitlementFilters = StringDictionary[FilterValueList]
  type Integer = scala.Double
  type NonEmptyString = java.lang.String
  type ProductCode = java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-01-11`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
