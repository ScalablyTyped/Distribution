package typings
package acceptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("accept", JSImport.Namespace)
@js.native
object acceptMod extends js.Object {
  def charset(): java.lang.String = js.native
  def charset(charsetHeader: java.lang.String): java.lang.String = js.native
  def charset(charsetHeader: java.lang.String, preferences: js.Array[java.lang.String]): java.lang.String = js.native
  def charsets(): js.Array[java.lang.String] = js.native
  def charsets(charsetHeader: java.lang.String): js.Array[java.lang.String] = js.native
  def encoding(): java.lang.String = js.native
  def encoding(encodingHeader: java.lang.String): java.lang.String = js.native
  def encoding(encodingHeader: java.lang.String, preferences: js.Array[java.lang.String]): java.lang.String = js.native
  def encodings(): js.Array[java.lang.String] = js.native
  def encodings(encodingHeader: java.lang.String): js.Array[java.lang.String] = js.native
  def language(): java.lang.String = js.native
  def language(languageHeader: java.lang.String): java.lang.String = js.native
  def language(languageHeader: java.lang.String, preferences: js.Array[java.lang.String]): java.lang.String = js.native
  def languages(): js.Array[java.lang.String] = js.native
  def languages(languageHeader: java.lang.String): js.Array[java.lang.String] = js.native
  def mediaType(): java.lang.String = js.native
  def mediaType(mediaTypeHeader: java.lang.String): java.lang.String = js.native
  def mediaType(mediaTypeHeader: java.lang.String, preferences: js.Array[java.lang.String]): java.lang.String = js.native
  def mediaTypes(): js.Array[java.lang.String] = js.native
  def mediaTypes(mediaTypeHeader: java.lang.String): js.Array[java.lang.String] = js.native
  def parseAll(
    headers: stdLib.Record[java.lang.String, js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  ): acceptLib.Anon_Charsets = js.native
}

