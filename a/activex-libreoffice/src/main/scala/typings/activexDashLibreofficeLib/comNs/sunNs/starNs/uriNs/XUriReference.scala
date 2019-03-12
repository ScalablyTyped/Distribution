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
    acquire: () => scala.Unit,
    clearFragment: () => scala.Unit,
    getAuthority: () => java.lang.String,
    getFragment: () => java.lang.String,
    getPath: () => java.lang.String,
    getPathSegment: scala.Double => java.lang.String,
    getPathSegmentCount: () => scala.Double,
    getQuery: () => java.lang.String,
    getScheme: () => java.lang.String,
    getSchemeSpecificPart: () => java.lang.String,
    getUriReference: () => java.lang.String,
    hasAuthority: () => scala.Boolean,
    hasFragment: () => scala.Boolean,
    hasQuery: () => scala.Boolean,
    hasRelativePath: () => scala.Boolean,
    isAbsolute: () => scala.Boolean,
    isHierarchical: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFragment: java.lang.String => scala.Unit
  ): XUriReference = {
    val __obj = js.Dynamic.literal(Authority = Authority, Fragment = Fragment, Path = Path, PathSegmentCount = PathSegmentCount, Query = Query, Scheme = Scheme, SchemeSpecificPart = SchemeSpecificPart, UriReference = UriReference, acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment))
  
    __obj.asInstanceOf[XUriReference]
  }
}

