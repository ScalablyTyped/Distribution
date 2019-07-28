package typings.adone.adoneNs.semverNs

import typings.adone.adoneNs.semverNs.INs.ReleaseType
import typings.adone.adoneNumbers.`-1`
import typings.adone.adoneNumbers.`0`
import typings.adone.adoneNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.semver.SemVer")
@js.native
class SemVer protected () extends js.Object {
  def this(version: String) = this()
  def this(version: SemVer) = this()
  def this(version: String, loose: Boolean) = this()
  def this(version: SemVer, loose: Boolean) = this()
  var build: js.Array[String] = js.native
  var loose: Boolean = js.native
  var major: Double = js.native
  var minor: Double = js.native
  var patch: Double = js.native
  var prerelease: js.Array[String] = js.native
  var raw: String = js.native
  var version: String = js.native
  def compare(other: String): `1` | `0` | `-1` = js.native
  def compare(other: SemVer): `1` | `0` | `-1` = js.native
  def compareMain(other: String): `1` | `0` | `-1` = js.native
  def compareMain(other: SemVer): `1` | `0` | `-1` = js.native
  def comparePre(other: String): `1` | `0` | `-1` = js.native
  def comparePre(other: SemVer): `1` | `0` | `-1` = js.native
  def format(): String = js.native
  def inc(release: ReleaseType): SemVer = js.native
  def inc(release: ReleaseType, identifier: String): SemVer = js.native
  def inspect(): String = js.native
}

