package typings
package apolloDashLinkLib.libLinkUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/linkUtils", "LinkError")
@js.native
class LinkError ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, link: apolloDashLinkLib.libLinkMod.ApolloLink) = this()
  var link: apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

