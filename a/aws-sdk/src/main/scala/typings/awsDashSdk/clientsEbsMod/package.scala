package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEbsMod {
  import typings.awsDashSdk.awsDashSdkStrings.SHA256
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Date
  import typings.std.Uint8Array

  type BlockData = Buffer | Uint8Array | Blob | String | Readable
  type BlockIndex = Double
  type BlockSize = Double
  type BlockToken = String
  type Blocks = js.Array[Block]
  type ChangedBlocks = js.Array[ChangedBlock]
  type Checksum = String
  type ChecksumAlgorithm = SHA256 | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DataLength = Double
  type MaxResults = Double
  type PageToken = String
  type SnapshotId = String
  type TimeStamp = Date
  type VolumeSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-11-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
