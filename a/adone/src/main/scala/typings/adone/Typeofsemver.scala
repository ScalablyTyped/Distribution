package typings.adone

import org.scalablytyped.runtime.Instantiable2
import typings.adone.adoneNs.semverNs.INs.Operator
import typings.adone.adoneNs.semverNs.INs.ReleaseType
import typings.adone.adoneNs.semverNs.Range
import typings.adone.adoneNs.semverNs.SemVer
import typings.adone.adoneNumbers.`-1`
import typings.adone.adoneNumbers.`0`
import typings.adone.adoneNumbers.`1`
import typings.adone.adoneStrings.`2DOT0DOT0`
import typings.adone.adoneStrings.`<`
import typings.adone.adoneStrings.`>`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsemver extends js.Object {
  var Comparator: Instantiable2[
    /* comp */ String | typings.adone.adoneNs.semverNs.Comparator, 
    js.UndefOr[/* loose */ Boolean], 
    typings.adone.adoneNs.semverNs.Comparator
  ] = js.native
  val INs: js.Any = js.native
  var Range: Instantiable2[
    /* range */ String | typings.adone.adoneNs.semverNs.Range, 
    js.UndefOr[/* loose */ Boolean], 
    typings.adone.adoneNs.semverNs.Range
  ] = js.native
  val SEMVER_SPEC_VERSION: `2DOT0DOT0` = js.native
  var SemVer: Instantiable2[
    /* version */ String | typings.adone.adoneNs.semverNs.SemVer, 
    js.UndefOr[/* loose */ Boolean], 
    typings.adone.adoneNs.semverNs.SemVer
  ] = js.native
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  def clean(version: String): String | Null = js.native
  def clean(version: String, loose: Boolean): String | Null = js.native
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  def cmp(v1: String, operator: Operator, v2: String): Boolean = js.native
  def cmp(v1: String, operator: Operator, v2: String, loose: Boolean): Boolean = js.native
  def cmp(v1: String, operator: Operator, v2: SemVer): Boolean = js.native
  def cmp(v1: String, operator: Operator, v2: SemVer, loose: Boolean): Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: String): Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: String, loose: Boolean): Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer): Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer, loose: Boolean): Boolean = js.native
  // Coercion
  /**
    * Coerces a string to semver if possible
    */
  def coerce(version: String): SemVer | Null = js.native
  def coerce(version: SemVer): SemVer | Null = js.native
  /**
    * Returns 0 if v1 == v2, or 1 if v1 is greater, or -1 if v2 is greater. Sorts in ascending order if passed to Array.sort().
    */
  def compare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def compare(v1: String, v2: String, loose: Boolean): `1` | `0` | `-1` = js.native
  def compare(v1: String, v2: SemVer): `1` | `0` | `-1` = js.native
  def compare(v1: String, v2: SemVer, loose: Boolean): `1` | `0` | `-1` = js.native
  def compare(v1: SemVer, v2: String): `1` | `0` | `-1` = js.native
  def compare(v1: SemVer, v2: String, loose: Boolean): `1` | `0` | `-1` = js.native
  def compare(v1: SemVer, v2: SemVer): `1` | `0` | `-1` = js.native
  def compare(v1: SemVer, v2: SemVer, loose: Boolean): `1` | `0` | `-1` = js.native
  def compareIdentifiers(): `1` | `0` | `-1` = js.native
  def compareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  /**
    * Compares two identifiers, must be numeric strings or truthy/falsy values. Sorts in ascending order if passed to Array.sort().
    */
  def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  def diff(v1: String, v2: String): ReleaseType | Null = js.native
  def diff(v1: String, v2: String, loose: Boolean): ReleaseType | Null = js.native
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  def eq(v1: String, v2: String): Boolean = js.native
  def eq(v1: String, v2: String, loose: Boolean): Boolean = js.native
  def eq(v1: String, v2: SemVer): Boolean = js.native
  def eq(v1: String, v2: SemVer, loose: Boolean): Boolean = js.native
  def eq(v1: SemVer, v2: String): Boolean = js.native
  def eq(v1: SemVer, v2: String, loose: Boolean): Boolean = js.native
  def eq(v1: SemVer, v2: SemVer): Boolean = js.native
  def eq(v1: SemVer, v2: SemVer, loose: Boolean): Boolean = js.native
  // Comparison
  /**
    * v1 > v2
    */
  def gt(v1: String, v2: String): Boolean = js.native
  def gt(v1: String, v2: String, loose: Boolean): Boolean = js.native
  def gt(v1: String, v2: SemVer): Boolean = js.native
  def gt(v1: String, v2: SemVer, loose: Boolean): Boolean = js.native
  def gt(v1: SemVer, v2: String): Boolean = js.native
  def gt(v1: SemVer, v2: String, loose: Boolean): Boolean = js.native
  def gt(v1: SemVer, v2: SemVer): Boolean = js.native
  def gt(v1: SemVer, v2: SemVer, loose: Boolean): Boolean = js.native
  /**
    * v1 >= v2
    */
  def gte(v1: String, v2: String): Boolean = js.native
  def gte(v1: String, v2: String, loose: Boolean): Boolean = js.native
  def gte(v1: String, v2: SemVer): Boolean = js.native
  def gte(v1: String, v2: SemVer, loose: Boolean): Boolean = js.native
  def gte(v1: SemVer, v2: String): Boolean = js.native
  def gte(v1: SemVer, v2: String, loose: Boolean): Boolean = js.native
  def gte(v1: SemVer, v2: SemVer): Boolean = js.native
  def gte(v1: SemVer, v2: SemVer, loose: Boolean): Boolean = js.native
  /**
    * Returns true if version is greater than all the versions possible in the range.
    */
  def gtr(version: String, range: String): Boolean = js.native
  def gtr(version: String, range: String, loose: Boolean): Boolean = js.native
  def gtr(version: String, range: Range): Boolean = js.native
  def gtr(version: String, range: Range, loose: Boolean): Boolean = js.native
  def gtr(version: SemVer, range: String): Boolean = js.native
  def gtr(version: SemVer, range: String, loose: Boolean): Boolean = js.native
  def gtr(version: SemVer, range: Range): Boolean = js.native
  def gtr(version: SemVer, range: Range, loose: Boolean): Boolean = js.native
  /**
    * Returns the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  def inc(v: String, release: ReleaseType): String | Null = js.native
  def inc(v: String, release: ReleaseType, loose: Boolean): String | Null = js.native
  def inc(v: String, release: ReleaseType, loose: Boolean, identifier: String): String | Null = js.native
  def inc(v: SemVer, release: ReleaseType): String | Null = js.native
  def inc(v: SemVer, release: ReleaseType, loose: Boolean): String | Null = js.native
  def inc(v: SemVer, release: ReleaseType, loose: Boolean, identifier: String): String | Null = js.native
  /**
    * Returns true if any of the ranges comparators intersect
    */
  def intersects(range1: String, range2: String): Boolean = js.native
  def intersects(range1: String, range2: String, loose: Boolean): Boolean = js.native
  def intersects(range1: String, range2: Range): Boolean = js.native
  def intersects(range1: String, range2: Range, loose: Boolean): Boolean = js.native
  def intersects(range1: Range, range2: String): Boolean = js.native
  def intersects(range1: Range, range2: String, loose: Boolean): Boolean = js.native
  def intersects(range1: Range, range2: Range): Boolean = js.native
  def intersects(range1: Range, range2: Range, loose: Boolean): Boolean = js.native
  /**
    * v1 < v2
    */
  def lt(v1: String, v2: String): Boolean = js.native
  def lt(v1: String, v2: String, loose: Boolean): Boolean = js.native
  def lt(v1: String, v2: SemVer): Boolean = js.native
  def lt(v1: String, v2: SemVer, loose: Boolean): Boolean = js.native
  def lt(v1: SemVer, v2: String): Boolean = js.native
  def lt(v1: SemVer, v2: String, loose: Boolean): Boolean = js.native
  def lt(v1: SemVer, v2: SemVer): Boolean = js.native
  def lt(v1: SemVer, v2: SemVer, loose: Boolean): Boolean = js.native
  /**
    * v1 <= v2
    */
  def lte(v1: String, v2: String): Boolean = js.native
  def lte(v1: String, v2: String, loose: Boolean): Boolean = js.native
  def lte(v1: String, v2: SemVer): Boolean = js.native
  def lte(v1: String, v2: SemVer, loose: Boolean): Boolean = js.native
  def lte(v1: SemVer, v2: String): Boolean = js.native
  def lte(v1: SemVer, v2: String, loose: Boolean): Boolean = js.native
  def lte(v1: SemVer, v2: SemVer): Boolean = js.native
  def lte(v1: SemVer, v2: SemVer, loose: Boolean): Boolean = js.native
  /**
    * Returns true if version is less than all the versions possible in the range.
    */
  def ltr(version: String, range: String): Boolean = js.native
  def ltr(version: String, range: String, loose: Boolean): Boolean = js.native
  def ltr(version: String, range: Range): Boolean = js.native
  def ltr(version: String, range: Range, loose: Boolean): Boolean = js.native
  def ltr(version: SemVer, range: String): Boolean = js.native
  def ltr(version: SemVer, range: String, loose: Boolean): Boolean = js.native
  def ltr(version: SemVer, range: Range): Boolean = js.native
  def ltr(version: SemVer, range: Range, loose: Boolean): Boolean = js.native
  /**
    * Returns the major version number.
    */
  def major(v: String): Double = js.native
  def major(v: String, loose: Boolean): Double = js.native
  def major(v: SemVer): Double = js.native
  def major(v: SemVer, loose: Boolean): Double = js.native
  /**
    * Returns the highest version in the list that satisfies the range, or null if none of them do.
    */
  def maxSatisfying(versions: js.Array[String | SemVer], range: String): String = js.native
  def maxSatisfying(versions: js.Array[String | SemVer], range: String, loose: Boolean): String = js.native
  def maxSatisfying(versions: js.Array[String | SemVer], range: Range): String = js.native
  def maxSatisfying(versions: js.Array[String | SemVer], range: Range, loose: Boolean): String = js.native
  /**
    * Returns the lowest version in the list that satisfies the range, or null if none of them do.
    */
  def minSatisfying(versions: js.Array[String | SemVer], range: String): String = js.native
  def minSatisfying(versions: js.Array[String | SemVer], range: String, loose: Boolean): String = js.native
  /**
    * Returns the minor version number.
    */
  def minor(v: String): Double = js.native
  def minor(v: String, loose: Boolean): Double = js.native
  def minor(v: SemVer): Double = js.native
  def minor(v: SemVer, loose: Boolean): Double = js.native
  /**
    * v1 != v2 The opposite of eq.
    */
  def neq(v1: String, v2: String): Boolean = js.native
  def neq(v1: String, v2: String, loose: Boolean): Boolean = js.native
  def neq(v1: String, v2: SemVer): Boolean = js.native
  def neq(v1: String, v2: SemVer, loose: Boolean): Boolean = js.native
  def neq(v1: SemVer, v2: String): Boolean = js.native
  def neq(v1: SemVer, v2: String, loose: Boolean): Boolean = js.native
  def neq(v1: SemVer, v2: SemVer): Boolean = js.native
  def neq(v1: SemVer, v2: SemVer, loose: Boolean): Boolean = js.native
  def outside(version: String, range: String, hilo: `<`): Boolean = js.native
  def outside(version: String, range: String, hilo: `<`, loose: Boolean): Boolean = js.native
  /**
    * Returns true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  def outside(version: String, range: String, hilo: `>`): Boolean = js.native
  def outside(version: String, range: String, hilo: `>`, loose: Boolean): Boolean = js.native
  def outside(version: String, range: Range, hilo: `<`): Boolean = js.native
  def outside(version: String, range: Range, hilo: `<`, loose: Boolean): Boolean = js.native
  def outside(version: String, range: Range, hilo: `>`): Boolean = js.native
  def outside(version: String, range: Range, hilo: `>`, loose: Boolean): Boolean = js.native
  def outside(version: SemVer, range: String, hilo: `<`): Boolean = js.native
  def outside(version: SemVer, range: String, hilo: `<`, loose: Boolean): Boolean = js.native
  def outside(version: SemVer, range: String, hilo: `>`): Boolean = js.native
  def outside(version: SemVer, range: String, hilo: `>`, loose: Boolean): Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: `<`): Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: `<`, loose: Boolean): Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: `>`): Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: `>`, loose: Boolean): Boolean = js.native
  /**
    * Returns the parsed version as a SemVer object, or null if it's not valid.
    */
  def parse(v: String): SemVer | Null = js.native
  def parse(v: String, loose: Boolean): SemVer | Null = js.native
  def parse(v: SemVer): SemVer | Null = js.native
  def parse(v: SemVer, loose: Boolean): SemVer | Null = js.native
  /**
    * Returns the patch version number.
    */
  def patch(v: String): Double = js.native
  def patch(v: String, loose: Boolean): Double = js.native
  def patch(v: SemVer): Double = js.native
  def patch(v: SemVer, loose: Boolean): Double = js.native
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  def prerelease(v: String): js.Array[String] | Null = js.native
  def prerelease(v: String, loose: Boolean): js.Array[String] | Null = js.native
  def prerelease(v: SemVer): js.Array[String] | Null = js.native
  def prerelease(v: SemVer, loose: Boolean): js.Array[String] | Null = js.native
  /**
    * The reverse of compare. Sorts an array of versions in descending order when passed to Array.sort().
    */
  def rcompare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def rcompare(v1: String, v2: String, loose: Boolean): `1` | `0` | `-1` = js.native
  def rcompare(v1: String, v2: SemVer): `1` | `0` | `-1` = js.native
  def rcompare(v1: String, v2: SemVer, loose: Boolean): `1` | `0` | `-1` = js.native
  def rcompare(v1: SemVer, v2: String): `1` | `0` | `-1` = js.native
  def rcompare(v1: SemVer, v2: String, loose: Boolean): `1` | `0` | `-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer): `1` | `0` | `-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer, loose: Boolean): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  /**
    * The reverse of compareIdentifiers. Sorts in descending order when passed to Array.sort().
    */
  def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  /**
    * Sorts an array of semver entries in descending order.
    */
  def rsort(list: js.Array[String | SemVer]): js.Array[String | SemVer] = js.native
  def rsort(list: js.Array[String | SemVer], loose: Boolean): js.Array[String | SemVer] = js.native
  /**
    * Returns true if the version satisfies the range.
    */
  def satisfies(version: String, range: String): Boolean = js.native
  def satisfies(version: String, range: String, loose: Boolean): Boolean = js.native
  def satisfies(version: String, range: Range): Boolean = js.native
  def satisfies(version: String, range: Range, loose: Boolean): Boolean = js.native
  def satisfies(version: SemVer, range: String): Boolean = js.native
  def satisfies(version: SemVer, range: String, loose: Boolean): Boolean = js.native
  def satisfies(version: SemVer, range: Range): Boolean = js.native
  def satisfies(version: SemVer, range: Range, loose: Boolean): Boolean = js.native
  /**
    * Sorts an array of semver entries in ascending order.
    */
  def sort(list: js.Array[String | SemVer]): js.Array[String | SemVer] = js.native
  def sort(list: js.Array[String | SemVer], loose: Boolean): js.Array[String | SemVer] = js.native
  /**
    * Returns the parsed version, or null if it's not valid.
    */
  def valid(v: String): String | Null = js.native
  def valid(v: String, loose: Boolean): String | Null = js.native
  def valid(v: SemVer): String | Null = js.native
  def valid(v: SemVer, loose: Boolean): String | Null = js.native
  // Ranges
  /**
    * Returns the valid range or null if it's not valid
    */
  def validRange(range: String): String = js.native
  def validRange(range: String, loose: Boolean): String = js.native
  def validRange(range: Range): String = js.native
  def validRange(range: Range, loose: Boolean): String = js.native
}

