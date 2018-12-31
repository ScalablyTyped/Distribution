package typings
package acceptsLib.acceptsMod.acceptsNs

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
  def charset(): js.Array[java.lang.String] = js.native
  def charset(charsets: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def charset(charsets: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted charset. If nothing in `charsets` is accepted, then `false` is returned.
    * If no charsets are supplied, all accepted charsets are returned, in the order of the client's preference
    * (most preferred first).
    */
  def charsets(): js.Array[java.lang.String] = js.native
  def charsets(charsets: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def charsets(charsets: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted encoding. If nothing in `encodings` is accepted, then `false` is returned.
    * If no encodings are supplied, all accepted encodings are returned, in the order of the client's preference
    * (most preferred first).
    */
  def encoding(): js.Array[java.lang.String] = js.native
  def encoding(encodings: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def encoding(encodings: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted encoding. If nothing in `encodings` is accepted, then `false` is returned.
    * If no encodings are supplied, all accepted encodings are returned, in the order of the client's preference
    * (most preferred first).
    */
  def encodings(): js.Array[java.lang.String] = js.native
  def encodings(encodings: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def encodings(encodings: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def lang(): js.Array[java.lang.String] = js.native
  def lang(languages: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def lang(languages: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def langs(): js.Array[java.lang.String] = js.native
  def langs(languages: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def langs(languages: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def language(): js.Array[java.lang.String] = js.native
  def language(languages: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def language(languages: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted language. If nothing in `languages` is accepted, then `false` is returned.
    * If no languaes are supplied, all accepted languages are returned, in the order of the client's preference
    * (most preferred first).
    */
  def languages(): js.Array[java.lang.String] = js.native
  def languages(languages: java.lang.String*): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def languages(languages: js.Array[java.lang.String]): java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def `type`(types: java.lang.String*): js.Array[java.lang.String] | java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  /**
    * Return the first accepted type (and it is returned as the same text as what appears in the `types` array). If nothing in `types` is accepted, then `false` is returned.
    * If no types are supplied, return the entire set of acceptable types.
    *
    * The `types` array can contain full MIME types or file extensions. Any value that is not a full MIME types is passed to `require('mime-types').lookup`.
    */
  def `type`(types: js.Array[java.lang.String]): js.Array[java.lang.String] | java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def types(types: java.lang.String*): js.Array[java.lang.String] | java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
  def types(types: js.Array[java.lang.String]): js.Array[java.lang.String] | java.lang.String | acceptsLib.acceptsLibNumbers.`false` = js.native
}

