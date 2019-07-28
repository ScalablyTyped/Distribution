package typings.accept

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("accept", JSImport.Namespace)
@js.native
object acceptMod extends js.Object {
  def charset(): String = js.native
  def charset(charsetHeader: String): String = js.native
  def charset(charsetHeader: String, preferences: js.Array[String]): String = js.native
  def charsets(): js.Array[String] = js.native
  def charsets(charsetHeader: String): js.Array[String] = js.native
  def encoding(): String = js.native
  def encoding(encodingHeader: String): String = js.native
  def encoding(encodingHeader: String, preferences: js.Array[String]): String = js.native
  def encodings(): js.Array[String] = js.native
  def encodings(encodingHeader: String): js.Array[String] = js.native
  def language(): String = js.native
  def language(languageHeader: String): String = js.native
  def language(languageHeader: String, preferences: js.Array[String]): String = js.native
  def languages(): js.Array[String] = js.native
  def languages(languageHeader: String): js.Array[String] = js.native
  def mediaType(): String = js.native
  def mediaType(mediaTypeHeader: String): String = js.native
  def mediaType(mediaTypeHeader: String, preferences: js.Array[String]): String = js.native
  def mediaTypes(): js.Array[String] = js.native
  def mediaTypes(mediaTypeHeader: String): js.Array[String] = js.native
  def parseAll(headers: Record[String, js.UndefOr[String | js.Array[String]]]): Anon_Charsets = js.native
}

