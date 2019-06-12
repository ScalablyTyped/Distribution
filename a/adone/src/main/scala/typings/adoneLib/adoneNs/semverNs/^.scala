package typings
package adoneLib.adoneNs.semverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.semver")
@js.native
object ^ extends js.Object {
  val SEMVER_SPEC_VERSION: adoneLib.adoneLibStrings.`2DOT0DOT0` = js.native
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  def clean(version: java.lang.String): java.lang.String | scala.Null = js.native
  def clean(version: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def cmp(v1: SemVer, operator: adoneLib.adoneNs.semverNs.INs.Operator, v2: SemVer): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: adoneLib.adoneNs.semverNs.INs.Operator, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: adoneLib.adoneNs.semverNs.INs.Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(
    v1: SemVer,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: java.lang.String,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: adoneLib.adoneNs.semverNs.INs.Operator, v2: SemVer): scala.Boolean = js.native
  def cmp(
    v1: java.lang.String,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: SemVer,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  def cmp(v1: java.lang.String, operator: adoneLib.adoneNs.semverNs.INs.Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(
    v1: java.lang.String,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: java.lang.String,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def coerce(version: SemVer): SemVer | scala.Null = js.native
  // Coercion
  /**
    * Coerces a string to semver if possible
    */
  def coerce(version: java.lang.String): SemVer | scala.Null = js.native
  def compare(v1: SemVer, v2: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  /**
    * Returns 0 if v1 == v2, or 1 if v1 is greater, or -1 if v2 is greater. Sorts in ascending order if passed to Array.sort().
    */
  def compare(v1: java.lang.String, v2: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compareIdentifiers(): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  /**
    * Compares two identifiers, must be numeric strings or truthy/falsy values. Sorts in ascending order if passed to Array.sort().
    */
  def compareIdentifiers(a: java.lang.String, b: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compareIdentifiers(a: scala.Null, b: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  def diff(v1: java.lang.String, v2: java.lang.String): adoneLib.adoneNs.semverNs.INs.ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneNs.semverNs.INs.ReleaseType | scala.Null = js.native
  def eq(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def eq(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  def eq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  // Comparison
  /**
    * v1 > v2
    */
  def gt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 >= v2
    */
  def gte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if version is greater than all the versions possible in the range.
    */
  def gtr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def inc(v: SemVer, release: adoneLib.adoneNs.semverNs.INs.ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: adoneLib.adoneNs.semverNs.INs.ReleaseType, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(
    v: SemVer,
    release: adoneLib.adoneNs.semverNs.INs.ReleaseType,
    loose: scala.Boolean,
    identifier: java.lang.String
  ): java.lang.String | scala.Null = js.native
  /**
    * Returns the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  def inc(v: java.lang.String, release: adoneLib.adoneNs.semverNs.INs.ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: adoneLib.adoneNs.semverNs.INs.ReleaseType, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(
    v: java.lang.String,
    release: adoneLib.adoneNs.semverNs.INs.ReleaseType,
    loose: scala.Boolean,
    identifier: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def intersects(range1: Range, range2: Range): scala.Boolean = js.native
  def intersects(range1: Range, range2: Range, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if any of the ranges comparators intersect
    */
  def intersects(range1: java.lang.String, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 < v2
    */
  def lt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 <= v2
    */
  def lte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if version is less than all the versions possible in the range.
    */
  def ltr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def major(v: SemVer): scala.Double = js.native
  def major(v: SemVer, loose: scala.Boolean): scala.Double = js.native
  /**
    * Returns the major version number.
    */
  def major(v: java.lang.String): scala.Double = js.native
  def major(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: Range): java.lang.String = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: Range, loose: scala.Boolean): java.lang.String = js.native
  /**
    * Returns the highest version in the list that satisfies the range, or null if none of them do.
    */
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String): java.lang.String = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
  /**
    * Returns the lowest version in the list that satisfies the range, or null if none of them do.
    */
  def minSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String): java.lang.String = js.native
  def minSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
  def minor(v: SemVer): scala.Double = js.native
  def minor(v: SemVer, loose: scala.Boolean): scala.Double = js.native
  /**
    * Returns the minor version number.
    */
  def minor(v: java.lang.String): scala.Double = js.native
  def minor(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def neq(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def neq(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 != v2 The opposite of eq.
    */
  def neq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: adoneLib.adoneLibStrings.`<`): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: adoneLib.adoneLibStrings.`<`, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: adoneLib.adoneLibStrings.`>`): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: adoneLib.adoneLibStrings.`>`, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: SemVer, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`<`): scala.Boolean = js.native
  def outside(version: SemVer, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`<`, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: SemVer, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`>`): scala.Boolean = js.native
  def outside(version: SemVer, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`>`, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: java.lang.String, range: Range, hilo: adoneLib.adoneLibStrings.`<`): scala.Boolean = js.native
  def outside(version: java.lang.String, range: Range, hilo: adoneLib.adoneLibStrings.`<`, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: java.lang.String, range: Range, hilo: adoneLib.adoneLibStrings.`>`): scala.Boolean = js.native
  def outside(version: java.lang.String, range: Range, hilo: adoneLib.adoneLibStrings.`>`, loose: scala.Boolean): scala.Boolean = js.native
  def outside(version: java.lang.String, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`<`): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Returns true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  def outside(version: java.lang.String, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`>`): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def parse(v: SemVer): SemVer | scala.Null = js.native
  def parse(v: SemVer, loose: scala.Boolean): SemVer | scala.Null = js.native
  /**
    * Returns the parsed version as a SemVer object, or null if it's not valid.
    */
  def parse(v: java.lang.String): SemVer | scala.Null = js.native
  def parse(v: java.lang.String, loose: scala.Boolean): SemVer | scala.Null = js.native
  def patch(v: SemVer): scala.Double = js.native
  def patch(v: SemVer, loose: scala.Boolean): scala.Double = js.native
  /**
    * Returns the patch version number.
    */
  def patch(v: java.lang.String): scala.Double = js.native
  def patch(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def prerelease(v: SemVer): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: SemVer, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  def prerelease(v: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: java.lang.String, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def rcompare(v1: SemVer, v2: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  /**
    * The reverse of compare. Sorts an array of versions in descending order when passed to Array.sort().
    */
  def rcompare(v1: java.lang.String, v2: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompareIdentifiers(): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  /**
    * The reverse of compareIdentifiers. Sorts in descending order when passed to Array.sort().
    */
  def rcompareIdentifiers(a: java.lang.String, b: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: scala.Null, b: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  /**
    * Sorts an array of semver entries in descending order.
    */
  def rsort(list: js.Array[java.lang.String | SemVer]): js.Array[java.lang.String | SemVer] = js.native
  def rsort(list: js.Array[java.lang.String | SemVer], loose: scala.Boolean): js.Array[java.lang.String | SemVer] = js.native
  def satisfies(version: SemVer, range: Range): scala.Boolean = js.native
  def satisfies(version: SemVer, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if the version satisfies the range.
    */
  def satisfies(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Sorts an array of semver entries in ascending order.
    */
  def sort(list: js.Array[java.lang.String | SemVer]): js.Array[java.lang.String | SemVer] = js.native
  def sort(list: js.Array[java.lang.String | SemVer], loose: scala.Boolean): js.Array[java.lang.String | SemVer] = js.native
  def valid(v: SemVer): java.lang.String | scala.Null = js.native
  def valid(v: SemVer, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  /**
    * Returns the parsed version, or null if it's not valid.
    */
  def valid(v: java.lang.String): java.lang.String | scala.Null = js.native
  def valid(v: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def validRange(range: Range): java.lang.String = js.native
  def validRange(range: Range, loose: scala.Boolean): java.lang.String = js.native
  // Ranges
  /**
    * Returns the valid range or null if it's not valid
    */
  def validRange(range: java.lang.String): java.lang.String = js.native
  def validRange(range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
}

