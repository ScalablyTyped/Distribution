package typings
package adoneLib.adoneNs.semverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.semver.SemVer")
@js.native
class SemVer protected () extends js.Object {
  def this(version: SemVer) = this()
  def this(version: java.lang.String) = this()
  def this(version: SemVer, loose: scala.Boolean) = this()
  def this(version: java.lang.String, loose: scala.Boolean) = this()
  var build: js.Array[java.lang.String] = js.native
  var loose: scala.Boolean = js.native
  var major: scala.Double = js.native
  var minor: scala.Double = js.native
  var patch: scala.Double = js.native
  var prerelease: js.Array[java.lang.String] = js.native
  var raw: java.lang.String = js.native
  var version: java.lang.String = js.native
  def compare(other: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(other: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compareMain(other: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compareMain(other: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def comparePre(other: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def comparePre(other: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def format(): java.lang.String = js.native
  def inc(release: adoneLib.adoneNs.semverNs.INs.ReleaseType): SemVer = js.native
  def inc(release: adoneLib.adoneNs.semverNs.INs.ReleaseType, identifier: java.lang.String): SemVer = js.native
  def inspect(): java.lang.String = js.native
}

