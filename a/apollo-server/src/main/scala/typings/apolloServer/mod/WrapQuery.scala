package typings.apolloServer.mod

import typings.graphqlToolsWrap.wrapQueryMod.QueryWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "WrapQuery")
@js.native
class WrapQuery protected ()
  extends typings.apolloServer.exportsMod.WrapQuery {
  def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
}

