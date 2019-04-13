package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ali-oss", "Cluster")
@js.native
class Cluster protected () extends js.Object {
  def this(options: ClusterOptions) = this()
  def copy(name: java.lang.String, sourceName: java.lang.String): js.Promise[CopyAndPutMetaResult] = js.native
  def copy(name: java.lang.String, sourceName: java.lang.String, options: CopyObjectOptions): js.Promise[CopyAndPutMetaResult] = js.native
  def delete(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def delete(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def deleteMulti(names: js.Array[java.lang.String]): js.Promise[DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[java.lang.String], options: DeleteMultiOptions): js.Promise[DeleteMultiResult] = js.native
  def get(name: java.lang.String): js.Promise[GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any): js.Promise[GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any, options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  def getStream(): js.Promise[GetStreamResult] = js.native
  def getStream(name: java.lang.String): js.Promise[GetStreamResult] = js.native
  def getStream(name: java.lang.String, options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  def head(name: java.lang.String): js.Promise[HeadObjectResult] = js.native
  def head(name: java.lang.String, options: HeadObjectOptions): js.Promise[HeadObjectResult] = js.native
  def list(query: ListObjectsQuery, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def list(query: scala.Null, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any): js.Promise[PutObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any, options: PutObjectOptions): js.Promise[PutObjectResult] = js.native
  def putACL(name: java.lang.String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putACL(name: java.lang.String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def putMeta(name: java.lang.String, meta: UserMeta, options: RequestOptions): js.Promise[CopyAndPutMetaResult] = js.native
  def putStream(name: java.lang.String, stream: js.Any): js.Promise[aliDashOssLib.Anon_Name] = js.native
  def putStream(name: java.lang.String, stream: js.Any, options: PutStreamOptions): js.Promise[aliDashOssLib.Anon_Name] = js.native
  def restore(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def restore(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def signatureUrl(name: java.lang.String): java.lang.String = js.native
  def signatureUrl(name: java.lang.String, options: SignatureUrlOptions): java.lang.String = js.native
}

