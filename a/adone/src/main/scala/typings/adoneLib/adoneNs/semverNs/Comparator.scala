package typings
package adoneLib.adoneNs.semverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.semver.Comparator")
@js.native
class Comparator protected () extends js.Object {
  def this(comp: Comparator) = this()
  def this(comp: java.lang.String) = this()
  def this(comp: Comparator, loose: scala.Boolean) = this()
  def this(comp: java.lang.String, loose: scala.Boolean) = this()
  var operator: java.lang.String = js.native
  var semver: SemVer = js.native
  var value: scala.Boolean = js.native
  def intersects(comp: Comparator): scala.Boolean = js.native
  def intersects(comp: Comparator, loose: scala.Boolean): scala.Boolean = js.native
  def parse(comp: java.lang.String): scala.Unit = js.native
  def test(version: SemVer): scala.Boolean = js.native
  def test(version: java.lang.String): scala.Boolean = js.native
}

