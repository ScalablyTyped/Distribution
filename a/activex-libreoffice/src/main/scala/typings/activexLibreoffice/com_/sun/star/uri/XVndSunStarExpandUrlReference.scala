package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XMacroExpander
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents absolute " vnd.sun.star.expand " URL references.
  * @since OOo 2.3
  */
trait XVndSunStarExpandUrlReference
  extends XUriReference
     with XVndSunStarExpandUrl

object XVndSunStarExpandUrlReference {
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
    expand: XMacroExpander => String,
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
  ): XVndSunStarExpandUrlReference = {
    val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Fragment = Fragment.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], PathSegmentCount = PathSegmentCount.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], SchemeSpecificPart = SchemeSpecificPart.asInstanceOf[js.Any], UriReference = UriReference.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), expand = js.Any.fromFunction1(expand), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment))
    __obj.asInstanceOf[XVndSunStarExpandUrlReference]
  }
}

