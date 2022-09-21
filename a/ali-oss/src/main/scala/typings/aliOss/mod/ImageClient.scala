package typings.aliOss.mod

import typings.aliOss.anon.Content
import typings.aliOss.anon.Data
import typings.aliOss.anon.DataRes
import typings.aliOss.anon.Expires
import typings.aliOss.anon.Res
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ali-oss", "ImageClient")
@js.native
open class ImageClient protected () extends StObject {
  def this(options: ImageClientOptions) = this()
  
  /**
    * todo
    */
  def deleteStyle(styleName: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteStyle(styleName: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Get an image from the image channel.
    */
  def get(name: String): js.Promise[Content] = js.native
  def get(name: String, file: Any): js.Promise[Content] = js.native
  def get(name: String, file: Any, options: ImageGetOptions): js.Promise[Content] = js.native
  def get(name: String, file: Unit, options: ImageGetOptions): js.Promise[Content] = js.native
  
  /**
    * Get a image exif info by image object name from the image channel.
    */
  def getExif(name: String): js.Promise[Data] = js.native
  def getExif(name: String, options: RequestOptions): js.Promise[Data] = js.native
  
  /**
    * Get a image info and exif info by image object name from the image channel.
    */
  def getInfo(name: String): js.Promise[Data] = js.native
  def getInfo(name: String, options: RequestOptions): js.Promise[Data] = js.native
  
  /**
    * Get an image read stream.
    */
  def getStream(name: String): js.Promise[Res] = js.native
  def getStream(name: String, options: ImageGetOptions): js.Promise[Res] = js.native
  
  /**
    * Get a style by name from the image channel.
    */
  def getStyle(name: String): js.Promise[DataRes] = js.native
  def getStyle(name: String, options: RequestOptions): js.Promise[DataRes] = js.native
  
  /**
    * Get all styles from the image channel.
    */
  def listStyle(): js.Promise[js.Array[StyleData]] = js.native
  def listStyle(options: RequestOptions): js.Promise[js.Array[StyleData]] = js.native
  
  /**
    * todo
    */
  def putStyle(name: String, style: String): js.Promise[Data] = js.native
  def putStyle(name: String, style: String, options: RequestOptions): js.Promise[Data] = js.native
  
  /**
    * Create a signature url for directly download.
    */
  def signatureUrl(name: String): String = js.native
  def signatureUrl(name: String, options: Expires): String = js.native
}
