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
    acquire: js.Function0[scala.Unit],
    clearFragment: js.Function0[scala.Unit],
    expand: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XMacroExpander, 
      java.lang.String
    ],
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
  ): XVndSunStarExpandUrlReference = {
    val __obj = js.Dynamic.literal(Authority = Authority, Fragment = Fragment, Path = Path, PathSegmentCount = PathSegmentCount, Query = Query, Scheme = Scheme, SchemeSpecificPart = SchemeSpecificPart, UriReference = UriReference, acquire = acquire, clearFragment = clearFragment, expand = expand, getAuthority = getAuthority, getFragment = getFragment, getPath = getPath, getPathSegment = getPathSegment, getPathSegmentCount = getPathSegmentCount, getQuery = getQuery, getScheme = getScheme, getSchemeSpecificPart = getSchemeSpecificPart, getUriReference = getUriReference, hasAuthority = hasAuthority, hasFragment = hasFragment, hasQuery = hasQuery, hasRelativePath = hasRelativePath, isAbsolute = isAbsolute, isHierarchical = isHierarchical, queryInterface = queryInterface, release = release, setFragment = setFragment)
  
    __obj.asInstanceOf[XVndSunStarExpandUrlReference]
  }
}

