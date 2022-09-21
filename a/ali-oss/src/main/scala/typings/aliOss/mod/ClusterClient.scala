package typings.aliOss.mod

import typings.aliOss.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ali-oss", "ClusterClient")
@js.native
open class ClusterClient protected () extends StObject {
  def this(options: ClusterOptions) = this()
  
  def copy(name: String, sourceName: String): js.Promise[CopyAndPutMetaResult] = js.native
  def copy(name: String, sourceName: String, options: CopyObjectOptions): js.Promise[CopyAndPutMetaResult] = js.native
  
  def delete(name: String): js.Promise[NormalSuccessResponse] = js.native
  def delete(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  def deleteMulti(names: js.Array[String]): js.Promise[DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[String], options: DeleteMultiOptions): js.Promise[DeleteMultiResult] = js.native
  
  def get(name: String): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: Any): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: Any, options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: Unit, options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  
  def getStream(): js.Promise[GetStreamResult] = js.native
  def getStream(name: String): js.Promise[GetStreamResult] = js.native
  def getStream(name: String, options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  def getStream(name: Unit, options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  
  def head(name: String): js.Promise[HeadObjectResult] = js.native
  def head(name: String, options: HeadObjectOptions): js.Promise[HeadObjectResult] = js.native
  
  def list(query: Null, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def list(query: ListObjectsQuery, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  
  def listV2(query: Null, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  /**
    * @since 6.12.0
    */
  def listV2(query: ListV2ObjectsQuery, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  
  def put(name: String, file: Any): js.Promise[PutObjectResult] = js.native
  def put(name: String, file: Any, options: PutObjectOptions): js.Promise[PutObjectResult] = js.native
  
  def putACL(name: String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putACL(name: String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  def putMeta(name: String, meta: UserMeta, options: RequestOptions): js.Promise[CopyAndPutMetaResult] = js.native
  
  def putStream(name: String, stream: Any): js.Promise[Name] = js.native
  def putStream(name: String, stream: Any, options: PutStreamOptions): js.Promise[Name] = js.native
  
  def restore(name: String): js.Promise[NormalSuccessResponse] = js.native
  def restore(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  def signatureUrl(name: String): String = js.native
  def signatureUrl(name: String, options: SignatureUrlOptions): String = js.native
}
