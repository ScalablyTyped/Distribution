package typings.accepts.acceptsMod

import typings.accepts.acceptsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accepts extends js.Object {
  /**
    * Return the first accepted charset. If nothing in `charsets` is accepted, then `false` is returned.
    * If no charsets are supplied, all accepted charsets are returned, in the order of the client's preference
    * (most preferred first).
    */
  def charset(): js.Array[String] = js.native
  def charset(charsets: String*): String | `false` = js.native
  def charset(charsets: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted charset. If nothing in `charsets` is accepted, then `false` is returned.
    * If no charsets are supplied, all accepted charsets are returned, in the order of the client's preference
    * (most preferred first).
    */
  def charsets(): js.Array[String] = js.native
  def charsets(charsets: String*): String | `false` = js.native
  def charsets(charsets: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted encoding. If nothing in `encodings` is accepted, then `false` is returned.
    * If no encodings are supplied, all accepted encodings are returned, in the order of the client's preference
    * (most preferred first).
    */
  def encoding(): js.Array[String] = js.native
  def encoding(encodings: String*): String | `false` = js.native
  def encoding(encodings: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted encoding. If nothing in `encodings` is accepted, then `false` is returned.
    * If no encodings are supplied, all accepted encodings are returned, in the order of the client's preference
    * (most preferred first).
    */
  def encodings(): js.Array[String] = js.native
  def encodings(encodings: String*): String | `false` = js.native
  def encodings(encodings: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def lang(): js.Array[String] = js.native
  def lang(languages: String*): String | `false` = js.native
  def lang(languages: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def langs(): js.Array[String] = js.native
  def langs(languages: String*): String | `false` = js.native
  def langs(languages: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def language(): js.Array[String] = js.native
  def language(languages: String*): String | `false` = js.native
  def language(languages: js.Array[String]): String | `false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def languages(): js.Array[String] = js.native
  def languages(languages: String*): String | `false` = js.native
  def languages(languages: js.Array[String]): String | `false` = js.native
  def `type`(types: String*): js.Array[String] | String | `false` = js.native
  /**
    * Return the first accepted type (and it is returned as the same text as what appears in the `types` array). If nothing in `types` is accepted, then `false` is returned.
    * If no types are supplied, return the entire set of acceptable types.
    *
    * The `types` array can contain full MIME types or file extensions. Any value that is not a full MIME types is passed to `require('mime-types').lookup`.
    */
  def `type`(types: js.Array[String]): js.Array[String] | String | `false` = js.native
  def types(types: String*): js.Array[String] | String | `false` = js.native
  def types(types: js.Array[String]): js.Array[String] | String | `false` = js.native
}

