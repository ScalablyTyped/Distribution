package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Eq extends js.Object {
  def escape(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): nodeLib.querystringMod.ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String): nodeLib.querystringMod.ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): nodeLib.querystringMod.ParsedUrlQuery = js.native
  def parse(
    str: java.lang.String,
    sep: java.lang.String,
    eq: java.lang.String,
    options: nodeLib.querystringMod.ParseOptions
  ): nodeLib.querystringMod.ParsedUrlQuery = js.native
  def stringify(): java.lang.String = js.native
  def stringify(obj: js.Object): java.lang.String = js.native
  def stringify(obj: js.Object, sep: java.lang.String): java.lang.String = js.native
  def stringify(obj: js.Object, sep: java.lang.String, eq: java.lang.String): java.lang.String = js.native
  def stringify(
    obj: js.Object,
    sep: java.lang.String,
    eq: java.lang.String,
    options: nodeLib.querystringMod.StringifyOptions
  ): java.lang.String = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

