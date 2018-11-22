package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageClient extends js.Object {
  /**
           * todo
           */
  def deleteStyle(styleName: java.lang.String): stdLib.Promise[NormalSuccessResponse] = js.native
  /**
           * todo
           */
  def deleteStyle(styleName: java.lang.String, options: RequestOptions): stdLib.Promise[NormalSuccessResponse] = js.native
  /**
           * Get an image from the image channel.
           */
  def get(name: java.lang.String): stdLib.Promise[aliDashOssLib.Anon_Content] = js.native
  /**
           * Get an image from the image channel.
           */
  def get(name: java.lang.String, file: js.Any): stdLib.Promise[aliDashOssLib.Anon_Content] = js.native
  /**
           * Get an image from the image channel.
           */
  def get(name: java.lang.String, file: js.Any, options: ImageGetOptions): stdLib.Promise[aliDashOssLib.Anon_Content] = js.native
  /**
           * Get a image exif info by image object name from the image channel.
           */
  def getExif(name: java.lang.String): stdLib.Promise[aliDashOssLib.Anon_Data] = js.native
  /**
           * Get a image exif info by image object name from the image channel.
           */
  def getExif(name: java.lang.String, options: RequestOptions): stdLib.Promise[aliDashOssLib.Anon_Data] = js.native
  /**
           * Get a image info and exif info by image object name from the image channel.
           */
  def getInfo(name: java.lang.String): stdLib.Promise[aliDashOssLib.Anon_Data] = js.native
  /**
           * Get a image info and exif info by image object name from the image channel.
           */
  def getInfo(name: java.lang.String, options: RequestOptions): stdLib.Promise[aliDashOssLib.Anon_Data] = js.native
  /**
           * Get an image read stream.
           */
  def getStream(name: java.lang.String): stdLib.Promise[aliDashOssLib.Anon_Stream] = js.native
  /**
           * Get an image read stream.
           */
  def getStream(name: java.lang.String, options: ImageGetOptions): stdLib.Promise[aliDashOssLib.Anon_Stream] = js.native
  /**
           * Get a style by name from the image channel.
           */
  def getStyle(name: java.lang.String): stdLib.Promise[aliDashOssLib.Anon_DataRes] = js.native
  /**
           * Get a style by name from the image channel.
           */
  def getStyle(name: java.lang.String, options: RequestOptions): stdLib.Promise[aliDashOssLib.Anon_DataRes] = js.native
  /**
           * Get all styles from the image channel.
           */
  def listStyle(): stdLib.Promise[js.Array[StyleData]] = js.native
  /**
           * Get all styles from the image channel.
           */
  def listStyle(options: RequestOptions): stdLib.Promise[js.Array[StyleData]] = js.native
  /**
           * todo
           */
  def putStyle(name: java.lang.String, style: java.lang.String): stdLib.Promise[aliDashOssLib.Anon_Data] = js.native
  /**
           * todo
           */
  def putStyle(name: java.lang.String, style: java.lang.String, options: RequestOptions): stdLib.Promise[aliDashOssLib.Anon_Data] = js.native
  /**
           * Create a signature url for directly download.
           */
  def signatureUrl(name: java.lang.String): java.lang.String = js.native
  /**
           * Create a signature url for directly download.
           */
  def signatureUrl(name: java.lang.String, options: aliDashOssLib.Anon_Expires): java.lang.String = js.native
}

