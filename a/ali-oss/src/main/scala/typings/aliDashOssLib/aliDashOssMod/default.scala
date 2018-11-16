package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ali-oss", JSImport.Default)
@js.native
class default protected () extends OSS {
  def this(options: Options) = this()
}

@JSImport("ali-oss", JSImport.Default)
@js.native
object default extends js.Object {
  def Cluster(options: aliDashOssLib.clusterMod.ClusterOptions): aliDashOssLib.clusterMod.Cluster = js.native
  // the image client
  def ImageClient(options: aliDashOssLib.imageclientMod.ImageClientOptions): aliDashOssLib.imageclientMod.ImageClient = js.native
}

