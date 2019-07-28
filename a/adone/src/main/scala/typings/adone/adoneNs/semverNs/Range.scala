package typings.adone.adoneNs.semverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.semver.Range")
@js.native
class Range protected () extends js.Object {
  def this(range: String) = this()
  def this(range: Range) = this()
  def this(range: String, loose: Boolean) = this()
  def this(range: Range, loose: Boolean) = this()
  var loose: Boolean = js.native
  var range: String = js.native
  var raw: String = js.native
  var set: js.Array[js.Array[Comparator]] = js.native
  def format(): String = js.native
  def inspect(): String = js.native
  def intersects(range: Range): Boolean = js.native
  def intersects(range: Range, loose: Boolean): Boolean = js.native
  def parseRange(range: String): js.Array[Comparator] = js.native
  def test(version: String): Boolean = js.native
  def test(version: SemVer): Boolean = js.native
}

