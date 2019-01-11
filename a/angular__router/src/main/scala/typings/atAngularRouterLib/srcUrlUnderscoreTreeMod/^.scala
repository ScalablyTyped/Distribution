package typings
package atAngularRouterLib.srcUrlUnderscoreTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/url_tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def containsTree(
    container: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    containee: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    exact: scala.Boolean
  ): scala.Boolean = js.native
  def createEmptyUrlTree(): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  def decode(s: java.lang.String): java.lang.String = js.native
  def decodeQuery(s: java.lang.String): java.lang.String = js.native
  def encodeUriFragment(s: java.lang.String): java.lang.String = js.native
  def encodeUriQuery(s: java.lang.String): java.lang.String = js.native
  def encodeUriSegment(s: java.lang.String): java.lang.String = js.native
  def equalPath(
    as: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment],
    bs: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]
  ): scala.Boolean = js.native
  def equalSegments(
    as: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment],
    bs: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]
  ): scala.Boolean = js.native
  def mapChildrenIntoArray[T](
    segment: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegmentGroup,
    fn: js.Function2[
      /* v */ atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegmentGroup, 
      /* k */ java.lang.String, 
      js.Array[T]
    ]
  ): js.Array[T] = js.native
  def serializePath(path: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment): java.lang.String = js.native
  def serializePaths(segment: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegmentGroup): java.lang.String = js.native
}

