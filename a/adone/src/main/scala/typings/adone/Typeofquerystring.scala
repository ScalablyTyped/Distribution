package typings.adone

import typings.node.querystringMod.ParseOptions
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.querystringMod.ParsedUrlQueryInput
import typings.node.querystringMod.StringifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofquerystring extends js.Object {
  /**
    * The querystring.decode() function is an alias for querystring.parse().
    */
  def decode(str: String): ParsedUrlQuery = js.native
  def decode(str: String, sep: String): ParsedUrlQuery = js.native
  def decode(str: String, sep: String, eq: String): ParsedUrlQuery = js.native
  def decode(str: String, sep: String, eq: String, options: ParseOptions): ParsedUrlQuery = js.native
  /**
    * The querystring.encode() function is an alias for querystring.stringify().
    */
  def encode(): String = js.native
  def encode(obj: ParsedUrlQueryInput): String = js.native
  def encode(obj: ParsedUrlQueryInput, sep: String): String = js.native
  def encode(obj: ParsedUrlQueryInput, sep: String, eq: String): String = js.native
  def encode(obj: ParsedUrlQueryInput, sep: String, eq: String, options: StringifyOptions): String = js.native
  def escape(str: String): String = js.native
  def parse(str: String): ParsedUrlQuery = js.native
  def parse(str: String, sep: String): ParsedUrlQuery = js.native
  def parse(str: String, sep: String, eq: String): ParsedUrlQuery = js.native
  def parse(str: String, sep: String, eq: String, options: ParseOptions): ParsedUrlQuery = js.native
  def stringify(): String = js.native
  def stringify(obj: ParsedUrlQueryInput): String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: String): String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: String, eq: String): String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: String, eq: String, options: StringifyOptions): String = js.native
  def unescape(str: String): String = js.native
}

