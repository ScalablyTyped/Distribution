package typings
package aliDashOssLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ali-oss/Cluster", "Cluster")
@js.native
class Cluster protected () extends js.Object {
  def this(options: ClusterOptions) = this()
  def copy(name: java.lang.String, sourceName: java.lang.String): stdLib.Promise[aliDashOssLib.aliDashOssMod.CopyAndPutMetaResult] = js.native
  def copy(
    name: java.lang.String,
    sourceName: java.lang.String,
    options: aliDashOssLib.aliDashOssMod.CopyObjectOptions
  ): stdLib.Promise[aliDashOssLib.aliDashOssMod.CopyAndPutMetaResult] = js.native
  def delete(name: java.lang.String): stdLib.Promise[aliDashOssLib.aliDashOssMod.NormalSuccessResponse] = js.native
  def delete(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.RequestOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.NormalSuccessResponse] = js.native
  def deleteMulti(names: js.Array[java.lang.String]): stdLib.Promise[aliDashOssLib.aliDashOssMod.DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[java.lang.String], options: aliDashOssLib.aliDashOssMod.DeleteMultiOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.DeleteMultiResult] = js.native
  def get(name: java.lang.String): stdLib.Promise[aliDashOssLib.aliDashOssMod.GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any): stdLib.Promise[aliDashOssLib.aliDashOssMod.GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any, options: aliDashOssLib.aliDashOssMod.GetObjectOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.GetObjectResult] = js.native
  def getStream(): stdLib.Promise[aliDashOssLib.aliDashOssMod.GetStreamResult] = js.native
  def getStream(name: java.lang.String): stdLib.Promise[aliDashOssLib.aliDashOssMod.GetStreamResult] = js.native
  def getStream(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.GetStreamOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.GetStreamResult] = js.native
  def head(name: java.lang.String): stdLib.Promise[aliDashOssLib.aliDashOssMod.HeadObjectResult] = js.native
  def head(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.HeadObjectOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.HeadObjectResult] = js.native
  def list(
    query: aliDashOssLib.aliDashOssMod.ListObjectsQuery,
    options: aliDashOssLib.aliDashOssMod.RequestOptions
  ): stdLib.Promise[aliDashOssLib.aliDashOssMod.ListObjectResult] = js.native
  def list(query: scala.Null, options: aliDashOssLib.aliDashOssMod.RequestOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.ListObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any): stdLib.Promise[aliDashOssLib.aliDashOssMod.PutObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any, options: aliDashOssLib.aliDashOssMod.PutObjectOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.PutObjectResult] = js.native
  def putACL(name: java.lang.String, acl: aliDashOssLib.aliDashOssMod.ACLType): stdLib.Promise[aliDashOssLib.aliDashOssMod.NormalSuccessResponse] = js.native
  def putACL(
    name: java.lang.String,
    acl: aliDashOssLib.aliDashOssMod.ACLType,
    options: aliDashOssLib.aliDashOssMod.RequestOptions
  ): stdLib.Promise[aliDashOssLib.aliDashOssMod.NormalSuccessResponse] = js.native
  def putMeta(
    name: java.lang.String,
    meta: aliDashOssLib.aliDashOssMod.UserMeta,
    options: aliDashOssLib.aliDashOssMod.RequestOptions
  ): stdLib.Promise[aliDashOssLib.aliDashOssMod.CopyAndPutMetaResult] = js.native
  def putStream(name: java.lang.String, stream: js.Any): stdLib.Promise[aliDashOssLib.Anon_Name] = js.native
  def putStream(name: java.lang.String, stream: js.Any, options: aliDashOssLib.aliDashOssMod.PutStreamOptions): stdLib.Promise[aliDashOssLib.Anon_Name] = js.native
  def restore(name: java.lang.String): stdLib.Promise[aliDashOssLib.aliDashOssMod.NormalSuccessResponse] = js.native
  def restore(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.RequestOptions): stdLib.Promise[aliDashOssLib.aliDashOssMod.NormalSuccessResponse] = js.native
  def signatureUrl(name: java.lang.String): java.lang.String = js.native
  def signatureUrl(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.SignatureUrlOptions): java.lang.String = js.native
}

