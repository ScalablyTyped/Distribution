package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents generic, mutable URI references.
  *
  * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URI references and related terms.
  *
  * This interface only handles generic URI references (both absolute and relative). For specific URI schemes, there will be additional interfaces that
  * offer extra, scheme-specific functionality.
  * @see com.sun.star.uri.UriReferenceFactory which allows to create URI reference objects that support com.sun.star.uri.XUriReference and additional, sch
  * @since OOo 2.0
  */
trait XUriReference
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the authority part of this (hierarchical) URI reference.
    * @returns the textual representation of the authority part (with the exact spelling retained), if this is a hierarchical URI reference that has an authorit
    */
  val Authority: java.lang.String
  /**
    * returns the fragment part of this URI reference.
    * @returns the textual representation of the fragment part (with the exact spelling retained; without the delimiting "`#`" ), if this is a URI reference tha
    */
  var Fragment: java.lang.String
  /**
    * returns the path part of this URI reference.
    * @returns the textual representation of the path part (with the exact spelling retained), if this is a hierarchical URI reference; for an opaque URI refere
    */
  val Path: java.lang.String
  /**
    * returns the number of path segments of this (hierarchical) URI reference.
    *
    * For an opaque URI reference, and for a hierarchical URI reference with an empty path, the number of path segments is zero. For a hierarchical URI
    * reference with an absolute, non-empty path, the number of path segments equals the number of "`/`" delimiters. For a hierarchical URI reference with a
    * relative, non-empty path, the number of path segments equals the number of "`/`" delimiters, plus one.
    * @returns the number of path segments.
    */
  val PathSegmentCount: scala.Double
  /**
    * returns the query part of this (hierarchical) URI reference.
    * @returns the textual representation of the query part (with the exact spelling retained; without the delimiting "`?`" ), if this is a hierarchical URI ref
    */
  val Query: java.lang.String
  /**
    * returns the scheme part of this (absolute) URI reference.
    * @returns the textual representation of the scheme part (with the exact spelling retained; without the delimiting "`:`" ), if this is an absolute URI refer
    */
  val Scheme: java.lang.String
  /**
    * returns the scheme-specific part of this URI reference.
    *
    * For an absolute URI reference, the scheme-specific part is everything after the scheme part and the delimiting "`:`" , and before the optional "`#`"
    * and fragment part. For a relative URI reference, the scheme-specific part is everything before the optional "`#`" and fragment part.
    * @returns the textual representation of the scheme-specific part (with the exact spelling retained).
    */
  val SchemeSpecificPart: java.lang.String
  /**
    * returns the textual representation of the complete URI reference.
    * @returns the textual representation of the complete URI reference. The exact spelling of the URI reference is retained.
    */
  val UriReference: java.lang.String
  /** clears the fragment part of this URI reference. */
  def clearFragment(): scala.Unit
  /**
    * returns the authority part of this (hierarchical) URI reference.
    * @returns the textual representation of the authority part (with the exact spelling retained), if this is a hierarchical URI reference that has an authorit
    */
  def getAuthority(): java.lang.String
  /**
    * returns the fragment part of this URI reference.
    * @returns the textual representation of the fragment part (with the exact spelling retained; without the delimiting "`#`" ), if this is a URI reference tha
    */
  def getFragment(): java.lang.String
  /**
    * returns the path part of this URI reference.
    * @returns the textual representation of the path part (with the exact spelling retained), if this is a hierarchical URI reference; for an opaque URI refere
    */
  def getPath(): java.lang.String
  /**
    * returns a given path segment of this (hierarchical) URI reference.
    * @param index the index of the path segment, starting at zero.
    * @returns the textual representation of the given path segment (with the exact spelling retained, without any delimiting "`/`" ), if this URI reference is
    */
  def getPathSegment(index: scala.Double): java.lang.String
  /**
    * returns the number of path segments of this (hierarchical) URI reference.
    *
    * For an opaque URI reference, and for a hierarchical URI reference with an empty path, the number of path segments is zero. For a hierarchical URI
    * reference with an absolute, non-empty path, the number of path segments equals the number of "`/`" delimiters. For a hierarchical URI reference with a
    * relative, non-empty path, the number of path segments equals the number of "`/`" delimiters, plus one.
    * @returns the number of path segments.
    */
  def getPathSegmentCount(): scala.Double
  /**
    * returns the query part of this (hierarchical) URI reference.
    * @returns the textual representation of the query part (with the exact spelling retained; without the delimiting "`?`" ), if this is a hierarchical URI ref
    */
  def getQuery(): java.lang.String
  /**
    * returns the scheme part of this (absolute) URI reference.
    * @returns the textual representation of the scheme part (with the exact spelling retained; without the delimiting "`:`" ), if this is an absolute URI refer
    */
  def getScheme(): java.lang.String
  /**
    * returns the scheme-specific part of this URI reference.
    *
    * For an absolute URI reference, the scheme-specific part is everything after the scheme part and the delimiting "`:`" , and before the optional "`#`"
    * and fragment part. For a relative URI reference, the scheme-specific part is everything before the optional "`#`" and fragment part.
    * @returns the textual representation of the scheme-specific part (with the exact spelling retained).
    */
  def getSchemeSpecificPart(): java.lang.String
  /**
    * returns the textual representation of the complete URI reference.
    * @returns the textual representation of the complete URI reference. The exact spelling of the URI reference is retained.
    */
  def getUriReference(): java.lang.String
  /**
    * returns whether this (hierarchical) URI reference has an authority part.
    * @returns `TRUE` if this URI reference is hierarchical and has an authority part.
    */
  def hasAuthority(): scala.Boolean
  /**
    * returns whether this URI reference has a fragment part.
    * @returns `TRUE` if this URI reference has a fragment part.
    */
  def hasFragment(): scala.Boolean
  /**
    * returns whether this (hierarchical) URI reference has a query part.
    * @returns `TRUE` if this URI reference is hierarchical and has a query part.
    */
  def hasQuery(): scala.Boolean
  /**
    * returns whether this (relative) URI reference has a relative path.
    * @returns `TRUE` if this URI reference is relative and has a relative path.
    */
  def hasRelativePath(): scala.Boolean
  /**
    * returns whether this URI reference is absolute or relative.
    * @returns `TRUE` if this URI reference is absolute, `FALSE` if it is relative.
    */
  def isAbsolute(): scala.Boolean
  /**
    * returns whether this URI reference is hierarchical or opaque.
    *
    * An absolute URI reference is hierarchical if its scheme-specific part starts with "`/`" . A relative URI reference is always hierarchical.
    * @returns `TRUE` if this URI reference is hierarchical, `FALSE` if it is opaque.
    */
  def isHierarchical(): scala.Boolean
  /**
    * sets the fragment part of this URI reference.
    * @param fragment the textual representation of the new fragment part. The exact spelling will be preserved, and no escaping is performed.
    */
  def setFragment(fragment: java.lang.String): scala.Unit
}

object XUriReference {
  @scala.inline
  def apply(
    Authority: java.lang.String,
    Fragment: java.lang.String,
    Path: java.lang.String,
    PathSegmentCount: scala.Double,
    Query: java.lang.String,
    Scheme: java.lang.String,
    SchemeSpecificPart: java.lang.String,
    UriReference: java.lang.String,
    acquire: js.Function0[scala.Unit],
    clearFragment: js.Function0[scala.Unit],
    getAuthority: js.Function0[java.lang.String],
    getFragment: js.Function0[java.lang.String],
    getPath: js.Function0[java.lang.String],
    getPathSegment: js.Function1[scala.Double, java.lang.String],
    getPathSegmentCount: js.Function0[scala.Double],
    getQuery: js.Function0[java.lang.String],
    getScheme: js.Function0[java.lang.String],
    getSchemeSpecificPart: js.Function0[java.lang.String],
    getUriReference: js.Function0[java.lang.String],
    hasAuthority: js.Function0[scala.Boolean],
    hasFragment: js.Function0[scala.Boolean],
    hasQuery: js.Function0[scala.Boolean],
    hasRelativePath: js.Function0[scala.Boolean],
    isAbsolute: js.Function0[scala.Boolean],
    isHierarchical: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFragment: js.Function1[java.lang.String, scala.Unit]
  ): XUriReference = {
    val __obj = js.Dynamic.literal(Authority = Authority, Fragment = Fragment, Path = Path, PathSegmentCount = PathSegmentCount, Query = Query, Scheme = Scheme, SchemeSpecificPart = SchemeSpecificPart, UriReference = UriReference, acquire = acquire, clearFragment = clearFragment, getAuthority = getAuthority, getFragment = getFragment, getPath = getPath, getPathSegment = getPathSegment, getPathSegmentCount = getPathSegmentCount, getQuery = getQuery, getScheme = getScheme, getSchemeSpecificPart = getSchemeSpecificPart, getUriReference = getUriReference, hasAuthority = hasAuthority, hasFragment = hasFragment, hasQuery = hasQuery, hasRelativePath = hasRelativePath, isAbsolute = isAbsolute, isHierarchical = isHierarchical, queryInterface = queryInterface, release = release, setFragment = setFragment)
  
    __obj.asInstanceOf[XUriReference]
  }
}

