package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents absolute " vnd.sun.star.script " URL references. */
trait XVndSunStarScriptUrlReference
  extends XUriReference
     with XVndSunStarScriptUrl

object XVndSunStarScriptUrlReference {
  @scala.inline
  def apply(
    Authority: java.lang.String,
    Fragment: java.lang.String,
    Name: java.lang.String,
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
    getName: js.Function0[java.lang.String],
    getParameter: js.Function1[java.lang.String, java.lang.String],
    getPath: js.Function0[java.lang.String],
    getPathSegment: js.Function1[scala.Double, java.lang.String],
    getPathSegmentCount: js.Function0[scala.Double],
    getQuery: js.Function0[java.lang.String],
    getScheme: js.Function0[java.lang.String],
    getSchemeSpecificPart: js.Function0[java.lang.String],
    getUriReference: js.Function0[java.lang.String],
    hasAuthority: js.Function0[scala.Boolean],
    hasFragment: js.Function0[scala.Boolean],
    hasParameter: js.Function1[java.lang.String, scala.Boolean],
    hasQuery: js.Function0[scala.Boolean],
    hasRelativePath: js.Function0[scala.Boolean],
    isAbsolute: js.Function0[scala.Boolean],
    isHierarchical: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFragment: js.Function1[java.lang.String, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParameter: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): XVndSunStarScriptUrlReference = {
    val __obj = js.Dynamic.literal(Authority = Authority, Fragment = Fragment, Name = Name, Path = Path, PathSegmentCount = PathSegmentCount, Query = Query, Scheme = Scheme, SchemeSpecificPart = SchemeSpecificPart, UriReference = UriReference, acquire = acquire, clearFragment = clearFragment, getAuthority = getAuthority, getFragment = getFragment, getName = getName, getParameter = getParameter, getPath = getPath, getPathSegment = getPathSegment, getPathSegmentCount = getPathSegmentCount, getQuery = getQuery, getScheme = getScheme, getSchemeSpecificPart = getSchemeSpecificPart, getUriReference = getUriReference, hasAuthority = hasAuthority, hasFragment = hasFragment, hasParameter = hasParameter, hasQuery = hasQuery, hasRelativePath = hasRelativePath, isAbsolute = isAbsolute, isHierarchical = isHierarchical, queryInterface = queryInterface, release = release, setFragment = setFragment, setName = setName, setParameter = setParameter)
  
    __obj.asInstanceOf[XVndSunStarScriptUrlReference]
  }
}

