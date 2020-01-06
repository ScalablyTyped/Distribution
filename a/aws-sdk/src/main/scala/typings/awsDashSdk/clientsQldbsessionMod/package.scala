package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsQldbsessionMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CommitDigest = Buffer | Uint8Array | Blob | String
  type IonBinary = Buffer | Uint8Array | Blob | String
  type IonText = String
  type LedgerName = String
  type PageToken = String
  type SessionToken = String
  type Statement = String
  type StatementParameters = js.Array[ValueHolder]
  type TransactionId = String
  type ValueHolders = js.Array[ValueHolder]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-07-11`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
