package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  def copy(name: java.lang.String, sourceName: java.lang.String): stdLib.Promise[CopyAndPutMetaResult] = js.native
  def copy(name: java.lang.String, sourceName: java.lang.String, options: CopyObjectOptions): stdLib.Promise[CopyAndPutMetaResult] = js.native
  def delete(name: java.lang.String): stdLib.Promise[NormalSuccessResponse] = js.native
  def delete(name: java.lang.String, options: RequestOptions): stdLib.Promise[NormalSuccessResponse] = js.native
  def deleteMulti(names: js.Array[java.lang.String]): stdLib.Promise[DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[java.lang.String], options: DeleteMultiOptions): stdLib.Promise[DeleteMultiResult] = js.native
  def get(name: java.lang.String): stdLib.Promise[GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any): stdLib.Promise[GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any, options: GetObjectOptions): stdLib.Promise[GetObjectResult] = js.native
  def getStream(): stdLib.Promise[GetStreamResult] = js.native
  def getStream(name: java.lang.String): stdLib.Promise[GetStreamResult] = js.native
  def getStream(name: java.lang.String, options: GetStreamOptions): stdLib.Promise[GetStreamResult] = js.native
  def head(name: java.lang.String): stdLib.Promise[HeadObjectResult] = js.native
  def head(name: java.lang.String, options: HeadObjectOptions): stdLib.Promise[HeadObjectResult] = js.native
  def list(query: ListObjectsQuery, options: RequestOptions): stdLib.Promise[ListObjectResult] = js.native
  def list(query: scala.Null, options: RequestOptions): stdLib.Promise[ListObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any): stdLib.Promise[PutObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any, options: PutObjectOptions): stdLib.Promise[PutObjectResult] = js.native
  def putACL(name: java.lang.String, acl: ACLType): stdLib.Promise[NormalSuccessResponse] = js.native
  def putACL(name: java.lang.String, acl: ACLType, options: RequestOptions): stdLib.Promise[NormalSuccessResponse] = js.native
  def putMeta(name: java.lang.String, meta: UserMeta, options: RequestOptions): stdLib.Promise[CopyAndPutMetaResult] = js.native
  def putStream(name: java.lang.String, stream: js.Any): stdLib.Promise[aliDashOssLib.Anon_Name] = js.native
  def putStream(name: java.lang.String, stream: js.Any, options: PutStreamOptions): stdLib.Promise[aliDashOssLib.Anon_Name] = js.native
  def restore(name: java.lang.String): stdLib.Promise[NormalSuccessResponse] = js.native
  def restore(name: java.lang.String, options: RequestOptions): stdLib.Promise[NormalSuccessResponse] = js.native
  def signatureUrl(name: java.lang.String): java.lang.String = js.native
  def signatureUrl(name: java.lang.String, options: SignatureUrlOptions): java.lang.String = js.native
}

