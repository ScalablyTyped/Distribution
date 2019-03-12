package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs

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
    expand: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XMacroExpander => java.lang.String,
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
  ): XVndSunStarExpandUrlReference = {
    val __obj = js.Dynamic.literal(Authority = Authority, Fragment = Fragment, Path = Path, PathSegmentCount = PathSegmentCount, Query = Query, Scheme = Scheme, SchemeSpecificPart = SchemeSpecificPart, UriReference = UriReference, acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), expand = js.Any.fromFunction1(expand), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment))
  
    __obj.asInstanceOf[XVndSunStarExpandUrlReference]
  }
}

