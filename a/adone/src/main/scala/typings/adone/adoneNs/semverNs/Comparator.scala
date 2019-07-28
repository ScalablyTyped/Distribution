package typings.adone.adoneNs.semverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.semver.Comparator")
@js.native
class Comparator protected () extends js.Object {
  def this(comp: String) = this()
  def this(comp: Comparator) = this()
  def this(comp: String, loose: Boolean) = this()
  def this(comp: Comparator, loose: Boolean) = this()
  var operator: String = js.native
  var semver: SemVer = js.native
  var value: Boolean = js.native
  def intersects(comp: Comparator): Boolean = js.native
  def intersects(comp: Comparator, loose: Boolean): Boolean = js.native
  def parse(comp: String): Unit = js.native
  def test(version: String): Boolean = js.native
  def test(version: SemVer): Boolean = js.native
}

