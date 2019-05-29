package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsemver extends js.Object {
  var Comparator: org.scalablytyped.runtime.Instantiable2[
    /* comp */ java.lang.String | adoneLib.adoneNs.semverNs.Comparator, 
    js.UndefOr[/* loose */ scala.Boolean], 
    adoneLib.adoneNs.semverNs.Comparator
  ] = js.native
  val INs: js.Any = js.native
  var Range: org.scalablytyped.runtime.Instantiable2[
    /* range */ java.lang.String | adoneLib.adoneNs.semverNs.Range, 
    js.UndefOr[/* loose */ scala.Boolean], 
    adoneLib.adoneNs.semverNs.Range
  ] = js.native
  val SEMVER_SPEC_VERSION: adoneLib.adoneLibStrings.`2DOT0DOT0` = js.native
  var SemVer: org.scalablytyped.runtime.Instantiable2[
    /* version */ java.lang.String | adoneLib.adoneNs.semverNs.SemVer, 
    js.UndefOr[/* loose */ scala.Boolean], 
    adoneLib.adoneNs.semverNs.SemVer
  ] = js.native
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  def clean(version: java.lang.String): java.lang.String | scala.Null = js.native
  def clean(version: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def cmp(
    v1: adoneLib.adoneNs.semverNs.SemVer,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: adoneLib.adoneNs.semverNs.SemVer
  ): scala.Boolean = js.native
  def cmp(
    v1: adoneLib.adoneNs.semverNs.SemVer,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: adoneLib.adoneNs.semverNs.SemVer,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def cmp(
    v1: adoneLib.adoneNs.semverNs.SemVer,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: java.lang.String
  ): scala.Boolean = js.native
  def cmp(
    v1: adoneLib.adoneNs.semverNs.SemVer,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: java.lang.String,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def cmp(
    v1: java.lang.String,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: adoneLib.adoneNs.semverNs.SemVer
  ): scala.Boolean = js.native
  def cmp(
    v1: java.lang.String,
    operator: adoneLib.adoneNs.semverNs.INs.Operator,
    v2: adoneLib.adoneNs.semverNs.SemVer,
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
  def coerce(version: adoneLib.adoneNs.semverNs.SemVer): adoneLib.adoneNs.semverNs.SemVer | scala.Null = js.native
  // Coercion
  /**
    * Coerces a string to semver if possible
    */
  def coerce(version: java.lang.String): adoneLib.adoneNs.semverNs.SemVer | scala.Null = js.native
  def compare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
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
  def eq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def eq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  def eq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def gt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  // Comparison
  /**
    * v1 > v2
    */
  def gt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def gte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 >= v2
    */
  def gte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: adoneLib.adoneNs.semverNs.SemVer, range: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def gtr(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def gtr(version: adoneLib.adoneNs.semverNs.SemVer, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: adoneLib.adoneNs.semverNs.SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: adoneLib.adoneNs.semverNs.Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if version is greater than all the versions possible in the range.
    */
  def gtr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def inc(v: adoneLib.adoneNs.semverNs.SemVer, release: adoneLib.adoneNs.semverNs.INs.ReleaseType): java.lang.String | scala.Null = js.native
  def inc(
    v: adoneLib.adoneNs.semverNs.SemVer,
    release: adoneLib.adoneNs.semverNs.INs.ReleaseType,
    loose: scala.Boolean
  ): java.lang.String | scala.Null = js.native
  def inc(
    v: adoneLib.adoneNs.semverNs.SemVer,
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
  def intersects(range1: adoneLib.adoneNs.semverNs.Range, range2: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def intersects(
    range1: adoneLib.adoneNs.semverNs.Range,
    range2: adoneLib.adoneNs.semverNs.Range,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def intersects(range1: adoneLib.adoneNs.semverNs.Range, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: adoneLib.adoneNs.semverNs.Range, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: adoneLib.adoneNs.semverNs.Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if any of the ranges comparators intersect
    */
  def intersects(range1: java.lang.String, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def lt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 < v2
    */
  def lt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def lte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 <= v2
    */
  def lte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: adoneLib.adoneNs.semverNs.SemVer, range: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def ltr(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def ltr(version: adoneLib.adoneNs.semverNs.SemVer, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: adoneLib.adoneNs.semverNs.SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: adoneLib.adoneNs.semverNs.Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if version is less than all the versions possible in the range.
    */
  def ltr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def major(v: adoneLib.adoneNs.semverNs.SemVer): scala.Double = js.native
  def major(v: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Double = js.native
  /**
    * Returns the major version number.
    */
  def major(v: java.lang.String): scala.Double = js.native
  def major(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def maxSatisfying(
    versions: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer],
    range: adoneLib.adoneNs.semverNs.Range
  ): java.lang.String = js.native
  def maxSatisfying(
    versions: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer],
    range: adoneLib.adoneNs.semverNs.Range,
    loose: scala.Boolean
  ): java.lang.String = js.native
  /**
    * Returns the highest version in the list that satisfies the range, or null if none of them do.
    */
  def maxSatisfying(versions: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer], range: java.lang.String): java.lang.String = js.native
  def maxSatisfying(
    versions: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer],
    range: java.lang.String,
    loose: scala.Boolean
  ): java.lang.String = js.native
  /**
    * Returns the lowest version in the list that satisfies the range, or null if none of them do.
    */
  def minSatisfying(versions: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer], range: java.lang.String): java.lang.String = js.native
  def minSatisfying(
    versions: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer],
    range: java.lang.String,
    loose: scala.Boolean
  ): java.lang.String = js.native
  def minor(v: adoneLib.adoneNs.semverNs.SemVer): scala.Double = js.native
  def minor(v: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Double = js.native
  /**
    * Returns the minor version number.
    */
  def minor(v: java.lang.String): scala.Double = js.native
  def minor(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def neq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def neq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * v1 != v2 The opposite of eq.
    */
  def neq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`<`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`<`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: java.lang.String,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`<`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: java.lang.String,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: java.lang.String, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: java.lang.String,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`>`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`>`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: java.lang.String,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`>`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: java.lang.String,
    range: adoneLib.adoneNs.semverNs.Range,
    hilo: adoneLib.adoneLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Returns true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  @JSName("outside")
  def `outside_>`(version: java.lang.String, range: java.lang.String, hilo: adoneLib.adoneLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: java.lang.String,
    range: java.lang.String,
    hilo: adoneLib.adoneLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def parse(v: adoneLib.adoneNs.semverNs.SemVer): adoneLib.adoneNs.semverNs.SemVer | scala.Null = js.native
  def parse(v: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): adoneLib.adoneNs.semverNs.SemVer | scala.Null = js.native
  /**
    * Returns the parsed version as a SemVer object, or null if it's not valid.
    */
  def parse(v: java.lang.String): adoneLib.adoneNs.semverNs.SemVer | scala.Null = js.native
  def parse(v: java.lang.String, loose: scala.Boolean): adoneLib.adoneNs.semverNs.SemVer | scala.Null = js.native
  def patch(v: adoneLib.adoneNs.semverNs.SemVer): scala.Double = js.native
  def patch(v: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): scala.Double = js.native
  /**
    * Returns the patch version number.
    */
  def patch(v: java.lang.String): scala.Double = js.native
  def patch(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def prerelease(v: adoneLib.adoneNs.semverNs.SemVer): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  def prerelease(v: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: java.lang.String, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def rcompare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: adoneLib.adoneNs.semverNs.SemVer, v2: java.lang.String, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): adoneLib.adoneLibNumbers.`1` | adoneLib.adoneLibNumbers.`0` | adoneLib.adoneLibNumbers.`-1` = js.native
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
  def rsort(list: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer]): js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer] = js.native
  def rsort(list: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer], loose: scala.Boolean): js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer] = js.native
  def satisfies(version: adoneLib.adoneNs.semverNs.SemVer, range: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def satisfies(
    version: adoneLib.adoneNs.semverNs.SemVer,
    range: adoneLib.adoneNs.semverNs.Range,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def satisfies(version: adoneLib.adoneNs.semverNs.SemVer, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: adoneLib.adoneNs.semverNs.SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: adoneLib.adoneNs.semverNs.Range): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: adoneLib.adoneNs.semverNs.Range, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if the version satisfies the range.
    */
  def satisfies(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  /**
    * Sorts an array of semver entries in ascending order.
    */
  def sort(list: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer]): js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer] = js.native
  def sort(list: js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer], loose: scala.Boolean): js.Array[java.lang.String | adoneLib.adoneNs.semverNs.SemVer] = js.native
  def valid(v: adoneLib.adoneNs.semverNs.SemVer): java.lang.String | scala.Null = js.native
  def valid(v: adoneLib.adoneNs.semverNs.SemVer, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  /**
    * Returns the parsed version, or null if it's not valid.
    */
  def valid(v: java.lang.String): java.lang.String | scala.Null = js.native
  def valid(v: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def validRange(range: adoneLib.adoneNs.semverNs.Range): java.lang.String = js.native
  def validRange(range: adoneLib.adoneNs.semverNs.Range, loose: scala.Boolean): java.lang.String = js.native
  // Ranges
  /**
    * Returns the valid range or null if it's not valid
    */
  def validRange(range: java.lang.String): java.lang.String = js.native
  def validRange(range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
}

