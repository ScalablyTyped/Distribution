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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Authority")(Authority)
    __obj.updateDynamic("Fragment")(Fragment)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("PathSegmentCount")(PathSegmentCount)
    __obj.updateDynamic("Query")(Query)
    __obj.updateDynamic("Scheme")(Scheme)
    __obj.updateDynamic("SchemeSpecificPart")(SchemeSpecificPart)
    __obj.updateDynamic("UriReference")(UriReference)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clearFragment")(clearFragment)
    __obj.updateDynamic("getAuthority")(getAuthority)
    __obj.updateDynamic("getFragment")(getFragment)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParameter")(getParameter)
    __obj.updateDynamic("getPath")(getPath)
    __obj.updateDynamic("getPathSegment")(getPathSegment)
    __obj.updateDynamic("getPathSegmentCount")(getPathSegmentCount)
    __obj.updateDynamic("getQuery")(getQuery)
    __obj.updateDynamic("getScheme")(getScheme)
    __obj.updateDynamic("getSchemeSpecificPart")(getSchemeSpecificPart)
    __obj.updateDynamic("getUriReference")(getUriReference)
    __obj.updateDynamic("hasAuthority")(hasAuthority)
    __obj.updateDynamic("hasFragment")(hasFragment)
    __obj.updateDynamic("hasParameter")(hasParameter)
    __obj.updateDynamic("hasQuery")(hasQuery)
    __obj.updateDynamic("hasRelativePath")(hasRelativePath)
    __obj.updateDynamic("isAbsolute")(isAbsolute)
    __obj.updateDynamic("isHierarchical")(isHierarchical)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFragment")(setFragment)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParameter")(setParameter)
    __obj.asInstanceOf[XVndSunStarScriptUrlReference]
  }
}

