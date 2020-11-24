package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XUriReference extends XInterface {
  
  /**
    * returns the authority part of this (hierarchical) URI reference.
    * @returns the textual representation of the authority part (with the exact spelling retained), if this is a hierarchical URI reference that has an authorit
    */
  val Authority: String = js.native
  
  /**
    * returns the fragment part of this URI reference.
    * @returns the textual representation of the fragment part (with the exact spelling retained; without the delimiting "`#`" ), if this is a URI reference tha
    */
  var Fragment: String = js.native
  
  /**
    * returns the path part of this URI reference.
    * @returns the textual representation of the path part (with the exact spelling retained), if this is a hierarchical URI reference; for an opaque URI refere
    */
  val Path: String = js.native
  
  /**
    * returns the number of path segments of this (hierarchical) URI reference.
    *
    * For an opaque URI reference, and for a hierarchical URI reference with an empty path, the number of path segments is zero. For a hierarchical URI
    * reference with an absolute, non-empty path, the number of path segments equals the number of "`/`" delimiters. For a hierarchical URI reference with a
    * relative, non-empty path, the number of path segments equals the number of "`/`" delimiters, plus one.
    * @returns the number of path segments.
    */
  val PathSegmentCount: Double = js.native
  
  /**
    * returns the query part of this (hierarchical) URI reference.
    * @returns the textual representation of the query part (with the exact spelling retained; without the delimiting "`?`" ), if this is a hierarchical URI ref
    */
  val Query: String = js.native
  
  /**
    * returns the scheme part of this (absolute) URI reference.
    * @returns the textual representation of the scheme part (with the exact spelling retained; without the delimiting "`:`" ), if this is an absolute URI refer
    */
  val Scheme: String = js.native
  
  /**
    * returns the scheme-specific part of this URI reference.
    *
    * For an absolute URI reference, the scheme-specific part is everything after the scheme part and the delimiting "`:`" , and before the optional "`#`"
    * and fragment part. For a relative URI reference, the scheme-specific part is everything before the optional "`#`" and fragment part.
    * @returns the textual representation of the scheme-specific part (with the exact spelling retained).
    */
  val SchemeSpecificPart: String = js.native
  
  /**
    * returns the textual representation of the complete URI reference.
    * @returns the textual representation of the complete URI reference. The exact spelling of the URI reference is retained.
    */
  val UriReference: String = js.native
  
  /** clears the fragment part of this URI reference. */
  def clearFragment(): Unit = js.native
  
  /**
    * returns the authority part of this (hierarchical) URI reference.
    * @returns the textual representation of the authority part (with the exact spelling retained), if this is a hierarchical URI reference that has an authorit
    */
  def getAuthority(): String = js.native
  
  /**
    * returns the fragment part of this URI reference.
    * @returns the textual representation of the fragment part (with the exact spelling retained; without the delimiting "`#`" ), if this is a URI reference tha
    */
  def getFragment(): String = js.native
  
  /**
    * returns the path part of this URI reference.
    * @returns the textual representation of the path part (with the exact spelling retained), if this is a hierarchical URI reference; for an opaque URI refere
    */
  def getPath(): String = js.native
  
  /**
    * returns a given path segment of this (hierarchical) URI reference.
    * @param index the index of the path segment, starting at zero.
    * @returns the textual representation of the given path segment (with the exact spelling retained, without any delimiting "`/`" ), if this URI reference is
    */
  def getPathSegment(index: Double): String = js.native
  
  /**
    * returns the number of path segments of this (hierarchical) URI reference.
    *
    * For an opaque URI reference, and for a hierarchical URI reference with an empty path, the number of path segments is zero. For a hierarchical URI
    * reference with an absolute, non-empty path, the number of path segments equals the number of "`/`" delimiters. For a hierarchical URI reference with a
    * relative, non-empty path, the number of path segments equals the number of "`/`" delimiters, plus one.
    * @returns the number of path segments.
    */
  def getPathSegmentCount(): Double = js.native
  
  /**
    * returns the query part of this (hierarchical) URI reference.
    * @returns the textual representation of the query part (with the exact spelling retained; without the delimiting "`?`" ), if this is a hierarchical URI ref
    */
  def getQuery(): String = js.native
  
  /**
    * returns the scheme part of this (absolute) URI reference.
    * @returns the textual representation of the scheme part (with the exact spelling retained; without the delimiting "`:`" ), if this is an absolute URI refer
    */
  def getScheme(): String = js.native
  
  /**
    * returns the scheme-specific part of this URI reference.
    *
    * For an absolute URI reference, the scheme-specific part is everything after the scheme part and the delimiting "`:`" , and before the optional "`#`"
    * and fragment part. For a relative URI reference, the scheme-specific part is everything before the optional "`#`" and fragment part.
    * @returns the textual representation of the scheme-specific part (with the exact spelling retained).
    */
  def getSchemeSpecificPart(): String = js.native
  
  /**
    * returns the textual representation of the complete URI reference.
    * @returns the textual representation of the complete URI reference. The exact spelling of the URI reference is retained.
    */
  def getUriReference(): String = js.native
  
  /**
    * returns whether this (hierarchical) URI reference has an authority part.
    * @returns `TRUE` if this URI reference is hierarchical and has an authority part.
    */
  def hasAuthority(): Boolean = js.native
  
  /**
    * returns whether this URI reference has a fragment part.
    * @returns `TRUE` if this URI reference has a fragment part.
    */
  def hasFragment(): Boolean = js.native
  
  /**
    * returns whether this (hierarchical) URI reference has a query part.
    * @returns `TRUE` if this URI reference is hierarchical and has a query part.
    */
  def hasQuery(): Boolean = js.native
  
  /**
    * returns whether this (relative) URI reference has a relative path.
    * @returns `TRUE` if this URI reference is relative and has a relative path.
    */
  def hasRelativePath(): Boolean = js.native
  
  /**
    * returns whether this URI reference is absolute or relative.
    * @returns `TRUE` if this URI reference is absolute, `FALSE` if it is relative.
    */
  def isAbsolute(): Boolean = js.native
  
  /**
    * returns whether this URI reference is hierarchical or opaque.
    *
    * An absolute URI reference is hierarchical if its scheme-specific part starts with "`/`" . A relative URI reference is always hierarchical.
    * @returns `TRUE` if this URI reference is hierarchical, `FALSE` if it is opaque.
    */
  def isHierarchical(): Boolean = js.native
  
  /**
    * sets the fragment part of this URI reference.
    * @param fragment the textual representation of the new fragment part. The exact spelling will be preserved, and no escaping is performed.
    */
  def setFragment(fragment: String): Unit = js.native
}
object XUriReference {
  
  @scala.inline
  def apply(
    Authority: String,
    Fragment: String,
    Path: String,
    PathSegmentCount: Double,
    Query: String,
    Scheme: String,
    SchemeSpecificPart: String,
    UriReference: String,
    acquire: () => Unit,
    clearFragment: () => Unit,
    getAuthority: () => String,
    getFragment: () => String,
    getPath: () => String,
    getPathSegment: Double => String,
    getPathSegmentCount: () => Double,
    getQuery: () => String,
    getScheme: () => String,
    getSchemeSpecificPart: () => String,
    getUriReference: () => String,
    hasAuthority: () => Boolean,
    hasFragment: () => Boolean,
    hasQuery: () => Boolean,
    hasRelativePath: () => Boolean,
    isAbsolute: () => Boolean,
    isHierarchical: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFragment: String => Unit
  ): XUriReference = {
    val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Fragment = Fragment.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], PathSegmentCount = PathSegmentCount.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], SchemeSpecificPart = SchemeSpecificPart.asInstanceOf[js.Any], UriReference = UriReference.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment))
    __obj.asInstanceOf[XUriReference]
  }
  
  @scala.inline
  implicit class XUriReferenceOps[Self <: XUriReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthority(value: String): Self = this.set("Authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = this.set("Fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegmentCount(value: Double): Self = this.set("PathSegmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeSpecificPart(value: String): Self = this.set("SchemeSpecificPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriReference(value: String): Self = this.set("UriReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFragment(value: () => Unit): Self = this.set("clearFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAuthority(value: () => String): Self = this.set("getAuthority", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFragment(value: () => String): Self = this.set("getFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: () => String): Self = this.set("getPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPathSegment(value: Double => String): Self = this.set("getPathSegment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPathSegmentCount(value: () => Double): Self = this.set("getPathSegmentCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQuery(value: () => String): Self = this.set("getQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScheme(value: () => String): Self = this.set("getScheme", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSchemeSpecificPart(value: () => String): Self = this.set("getSchemeSpecificPart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUriReference(value: () => String): Self = this.set("getUriReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAuthority(value: () => Boolean): Self = this.set("hasAuthority", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasFragment(value: () => Boolean): Self = this.set("hasFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasQuery(value: () => Boolean): Self = this.set("hasQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasRelativePath(value: () => Boolean): Self = this.set("hasRelativePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAbsolute(value: () => Boolean): Self = this.set("isAbsolute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHierarchical(value: () => Boolean): Self = this.set("isHierarchical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFragment(value: String => Unit): Self = this.set("setFragment", js.Any.fromFunction1(value))
  }
}
