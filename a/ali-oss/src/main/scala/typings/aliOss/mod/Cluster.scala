package typings.aliOss.mod

import typings.aliOss.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ali-oss", "Cluster")
@js.native
class Cluster protected () extends js.Object {
  def this(options: ClusterOptions) = this()
  def copy(name: String, sourceName: String): js.Promise[CopyAndPutMetaResult] = js.native
  def copy(name: String, sourceName: String, options: CopyObjectOptions): js.Promise[CopyAndPutMetaResult] = js.native
  def delete(name: String): js.Promise[NormalSuccessResponse] = js.native
  def delete(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def deleteMulti(names: js.Array[String]): js.Promise[DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[String], options: DeleteMultiOptions): js.Promise[DeleteMultiResult] = js.native
  def get(name: String): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: js.Any): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: js.Any, options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  def getStream(): js.Promise[GetStreamResult] = js.native
  def getStream(name: String): js.Promise[GetStreamResult] = js.native
  def getStream(name: String, options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  def head(name: String): js.Promise[HeadObjectResult] = js.native
  def head(name: String, options: HeadObjectOptions): js.Promise[HeadObjectResult] = js.native
  def list(query: Null, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def list(query: ListObjectsQuery, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def put(name: String, file: js.Any): js.Promise[PutObjectResult] = js.native
  def put(name: String, file: js.Any, options: PutObjectOptions): js.Promise[PutObjectResult] = js.native
  def putACL(name: String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putACL(name: String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def putMeta(name: String, meta: UserMeta, options: RequestOptions): js.Promise[CopyAndPutMetaResult] = js.native
  def putStream(name: String, stream: js.Any): js.Promise[Name] = js.native
  def putStream(name: String, stream: js.Any, options: PutStreamOptions): js.Promise[Name] = js.native
  def restore(name: String): js.Promise[NormalSuccessResponse] = js.native
  def restore(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def signatureUrl(name: String): String = js.native
  def signatureUrl(name: String, options: SignatureUrlOptions): String = js.native
}

